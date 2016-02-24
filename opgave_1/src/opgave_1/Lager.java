package opgave_1;

import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Lager {

	private List<Container> list = new ArrayList<>();
	private boolean placed = false;
	private List<List<Container>> lister = new ArrayList<List<Container>>();	
	private int maxAntalContainer = 0;
	private int maxAntalPlace = 0;
	private boolean receiveBeforePickup = false;

	public void modtagContainer(Container container) {


		int i = 0;

		if(lister.isEmpty()){
			
			lister.add(new ArrayList<Container>());
			
		}else if(!receiveBeforePickup ){
			
			for(List<Container> l : lister){

				l.removeIf(e -> e.getPickupDate().isEqual(container.getDateOfArrival()));

			}
			
			lister.removeIf(e -> e.isEmpty());
		}
		

		while(!checkList(container, lister.get(i))){

			lister.add(new ArrayList<Container>());						
			placed = checkList(container, lister.get(i++));												
		}	
		
		lister.removeIf(e -> e.isEmpty());


		if(receiveBeforePickup){
			for(List<Container> l : lister){	

				l.removeIf(e -> e.getPickupDate().isEqual(container.getDateOfArrival()));	

			}
			lister.removeIf(e -> e.isEmpty());
		}


		getMaxAntalContainer();
		getMaxAntalPlace();


	}	





	public List<List<Container>> getLister(){
		return lister;
	}


	private boolean checkList(Container container, List<Container> list) {
		int maxsize = 3;



		if(list.size()==maxsize){
			placed = false;		

		} else if(list.isEmpty()){
			list.add(container);
			placed = true;		

		} else if (Period.between (list.get(list.size()-1).getPickupDate() , container.getPickupDate()).isNegative()){
			list.add(container);
			placed = true;
		} else if (Period.between (list.get(list.size()-1).getPickupDate() , container.getPickupDate()).isZero()){
			list.add(container);
			placed = true;
		} 		
		else {
			placed = false;
		}



		return placed;

	}


	public List<Container> getList(){
		return list;
	}

	public int getPtAntalContainer (){

		int i = 0;

		for(List<Container> l : lister){
			i+=l.size();		
		}		
		return i;
	}


	public int getMaxAntalContainer(){

		if(maxAntalContainer < getPtAntalContainer()){
			maxAntalContainer = getPtAntalContainer();
		}				
		return maxAntalContainer;

	}

	public int getPtAntalPlace(){		
		return lister.size();
	}


	public int getMaxAntalPlace(){
		if(maxAntalPlace < getPtAntalPlace()){
			maxAntalPlace = getPtAntalPlace();
		}		
		return maxAntalPlace;
	}

}
