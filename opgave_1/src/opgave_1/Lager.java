package opgave_1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Lager {
	
	private List<Container> list = new ArrayList<>();

	private boolean placed = false;

	private List<List<Container>> lister = new ArrayList<List<Container>>();


	public boolean modtagContainer(Container container) {

		int i = 0;
		
		if(lister.isEmpty()){
		lister.add(new ArrayList<Container>());
		}
		
		while(!checkList(container, lister.get(i))){
			
			lister.add(new ArrayList<Container>());
			placed = checkList(container, lister.get(i++));
			
		}	
		
		
		return placed;	
	}	

	
	public List<List<Container>> getLister(){
		return lister;
	}

	
	private boolean checkList(Container container, List<Container> list) {
		int maxsize = 3;

		if(list.size()==maxsize){
			placed = false;		

		}

		if(list.isEmpty()){
			list.add(container);
			placed = true;

		} else if ((list.get(list.size()-1).getDagTilbage() >= container.getDagTilbage())){
			list.add(container);
			placed = true;
		} else {
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

}
