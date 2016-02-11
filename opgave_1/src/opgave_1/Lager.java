package opgave_1;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Lager {
	
	private List<Container> list = new ArrayList<>();
	private boolean placed = false;
	private List<List<Container>> lister = new ArrayList<List<Container>>();	
	private int maxAntalContainer = 0;
	private int maxAntalPlace = 0;

	
	
	public void modtagContainer(Container container) {
		int i = 0;
		
		if(lister.isEmpty()){
		lister.add(new ArrayList<Container>());
		}
				
		while(!checkList(container, lister.get(i))){			
			lister.add(new ArrayList<Container>());						
			placed = checkList(container, lister.get(i++));												
		}	
		
		lister.removeIf(e -> e.isEmpty());
		System.out.println(maxAntalContainer);
		
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

	public int getTotalAntalContainer (){
		
		int i = 0;
		
		for(List<Container> l : lister){
			i+=l.size();		
		}		
		return i;
	}

	
	public void afsendContainer(){
	
		
			
	}
		
	
	
	public int getMaxAntalContainer(){
		
		if(maxAntalContainer < getTotalAntalContainer()){
			maxAntalContainer = getTotalAntalContainer();
		}				
		return maxAntalContainer;
		
	}
	
	public int getTotalPlace(){		
		return lister.size();
	}

	
	public int getMaxAntalPlace(){
		if(maxAntalPlace < getTotalPlace()){
			maxAntalPlace = getTotalPlace();
		}		
		return maxAntalPlace;
	}


	}
