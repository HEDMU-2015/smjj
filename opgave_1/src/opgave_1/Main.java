package opgave_1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
		Main main = new Main();
		
		Lager lg1 = new Lager();
		
		
		for(Container c : main.lavContainers()){
			lg1.setMaxsize(2);
			lg1.setReceiveBeforePickup(true);
			lg1.modtagContainer(c);		
		}
		System.out.println("*** New Store, maxheight = "+lg1.getMaxsize() + ", receiveBeforePickup = " + lg1.isReceiveBeforePickup());
		System.out.println("Max Containers = " + lg1.getMaxAntalContainer() + ", Actual Containers = "+lg1.getPtAntalContainer() + ", Max places = " + lg1.getMaxAntalPlace() + ", Actual places = " + lg1.getPtAntalPlace());
		System.out.println("");
		
		Lager lg2 = new Lager();

		for(Container c : main.lavContainers()){
			lg2.setMaxsize(2);
			lg2.setReceiveBeforePickup(false);
			lg2.modtagContainer(c);		
		}
		System.out.println("*** New Store, maxheight = "+lg2.getMaxsize() + ", receiveBeforePickup = " + lg2.isReceiveBeforePickup());
		System.out.println("Max Containers = " + lg2.getMaxAntalContainer() + ", Actual Containers = "+lg2.getPtAntalContainer() + ", Max places = " + lg2.getMaxAntalPlace() + ", Actual places = " + lg2.getPtAntalPlace());
		System.out.println("");

		Lager lg3 = new Lager();

		
		for(Container c : main.lavContainers()){
			lg3.setMaxsize(3);
			lg3.setReceiveBeforePickup(true);
			lg3.modtagContainer(c);		
		}
		System.out.println("*** New Store, maxheight = "+lg3.getMaxsize() + ", receiveBeforePickup = " + lg3.isReceiveBeforePickup());
		System.out.println("Max Containers = " + lg3.getMaxAntalContainer() + ", Actual Containers = "+lg3.getPtAntalContainer() + ", Max places = " + lg3.getMaxAntalPlace() + ", Actual places = " + lg3.getPtAntalPlace());
		System.out.println("");

		
		Lager lg4 = new Lager();

		
		for(Container c : main.lavContainers()){
			lg4.setMaxsize(3);
			lg4.setReceiveBeforePickup(false);
			lg4.modtagContainer(c);		
		}
		System.out.println("*** New Store, maxheight = "+lg4.getMaxsize() + ", receiveBeforePickup = " + lg4.isReceiveBeforePickup());
		System.out.println("Max Containers = " + lg4.getMaxAntalContainer() + ", Actual Containers = "+lg4.getPtAntalContainer() + ", Max places = " + lg4.getMaxAntalPlace() + ", Actual places = " + lg4.getPtAntalPlace());
		System.out.println("");

		
		
		/*int i = 0;
		
		for(List<Container> l : lg.getLister()){
			System.out.println("Place"+i+" : " + l);
			i++;
		}*/
		
		
		

	}
	
	
	
	
	
	private List<Container> lavContainers(){
		List<Container> containers = new ArrayList<>();
		int i = 0;
		
		containers.add(new Container(i++, LocalDate.of(2016, 3, 1), LocalDate.of(2016, 3, 10)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 1), LocalDate.of(2016, 3, 15)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 1), LocalDate.of(2016, 3, 25)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 1), LocalDate.of(2016, 3, 10)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 1), LocalDate.of(2016, 3, 15)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 1), LocalDate.of(2016, 3, 5)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 1), LocalDate.of(2016, 3, 10)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 1), LocalDate.of(2016, 3, 5)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 1), LocalDate.of(2016, 3, 15)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 1), LocalDate.of(2016, 3, 5)));

		containers.add(new Container(i++, LocalDate.of(2016, 3, 2), LocalDate.of(2016, 3, 10)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 2), LocalDate.of(2016, 3, 15)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 2), LocalDate.of(2016, 3, 25)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 2), LocalDate.of(2016, 3, 10)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 2), LocalDate.of(2016, 3, 15)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 2), LocalDate.of(2016, 3, 5)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 2), LocalDate.of(2016, 3, 10)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 2), LocalDate.of(2016, 3, 5)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 2), LocalDate.of(2016, 3, 15)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 2), LocalDate.of(2016, 3, 5)));

		containers.add(new Container(i++, LocalDate.of(2016, 3, 3), LocalDate.of(2016, 3, 10)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 3), LocalDate.of(2016, 3, 15)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 3), LocalDate.of(2016, 3, 25)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 3), LocalDate.of(2016, 3, 10)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 3), LocalDate.of(2016, 3, 15)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 3), LocalDate.of(2016, 3, 5)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 3), LocalDate.of(2016, 3, 10)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 3), LocalDate.of(2016, 3, 5)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 3), LocalDate.of(2016, 3, 15)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 3), LocalDate.of(2016, 3, 5)));

		containers.add(new Container(i++, LocalDate.of(2016, 3, 4), LocalDate.of(2016, 3, 10)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 4), LocalDate.of(2016, 3, 15)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 4), LocalDate.of(2016, 3, 25)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 4), LocalDate.of(2016, 3, 10)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 4), LocalDate.of(2016, 3, 15)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 4), LocalDate.of(2016, 3, 5)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 4), LocalDate.of(2016, 3, 10)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 4), LocalDate.of(2016, 3, 5)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 4), LocalDate.of(2016, 3, 15)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 4), LocalDate.of(2016, 3, 5)));

		containers.add(new Container(i++, LocalDate.of(2016, 3, 5), LocalDate.of(2016, 3, 10)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 5), LocalDate.of(2016, 3, 15)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 5), LocalDate.of(2016, 3, 25)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 5), LocalDate.of(2016, 3, 10)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 5), LocalDate.of(2016, 3, 15)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 5), LocalDate.of(2016, 3, 6)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 5), LocalDate.of(2016, 3, 10)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 5), LocalDate.of(2016, 3, 6)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 5), LocalDate.of(2016, 3, 15)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 5), LocalDate.of(2016, 3, 6)));

		containers.add(new Container(i++, LocalDate.of(2016, 3, 6), LocalDate.of(2016, 3, 10)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 6), LocalDate.of(2016, 3, 15)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 6), LocalDate.of(2016, 3, 25)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 6), LocalDate.of(2016, 3, 10)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 6), LocalDate.of(2016, 3, 15)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 6), LocalDate.of(2016, 3, 7)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 6), LocalDate.of(2016, 3, 10)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 6), LocalDate.of(2016, 3, 7)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 6), LocalDate.of(2016, 3, 15)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 6), LocalDate.of(2016, 3, 7)));

		containers.add(new Container(i++, LocalDate.of(2016, 3, 7), LocalDate.of(2016, 3, 10)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 7), LocalDate.of(2016, 3, 15)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 7), LocalDate.of(2016, 3, 25)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 7), LocalDate.of(2016, 3, 10)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 7), LocalDate.of(2016, 3, 15)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 7), LocalDate.of(2016, 3, 8)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 7), LocalDate.of(2016, 3, 10)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 7), LocalDate.of(2016, 3, 8)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 7), LocalDate.of(2016, 3, 15)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 7), LocalDate.of(2016, 3, 8)));
		
		containers.add(new Container(i++, LocalDate.of(2016, 3, 8), LocalDate.of(2016, 3, 10)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 8), LocalDate.of(2016, 3, 15)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 8), LocalDate.of(2016, 3, 25)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 8), LocalDate.of(2016, 3, 10)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 8), LocalDate.of(2016, 3, 15)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 8), LocalDate.of(2016, 3, 9)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 8), LocalDate.of(2016, 3, 10)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 8), LocalDate.of(2016, 3, 9)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 8), LocalDate.of(2016, 3, 15)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 8), LocalDate.of(2016, 3, 9)));

		containers.add(new Container(i++, LocalDate.of(2016, 3, 9), LocalDate.of(2016, 3, 10)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 9), LocalDate.of(2016, 3, 15)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 9), LocalDate.of(2016, 3, 25)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 9), LocalDate.of(2016, 3, 10)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 9), LocalDate.of(2016, 3, 15)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 9), LocalDate.of(2016, 3, 10)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 9), LocalDate.of(2016, 3, 10)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 9), LocalDate.of(2016, 3, 10)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 9), LocalDate.of(2016, 3, 15)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 9), LocalDate.of(2016, 3, 10)));

		containers.add(new Container(i++, LocalDate.of(2016, 3, 10), LocalDate.of(2016, 3, 11)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 10), LocalDate.of(2016, 3, 15)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 10), LocalDate.of(2016, 3, 25)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 10), LocalDate.of(2016, 3, 11)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 10), LocalDate.of(2016, 3, 15)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 10), LocalDate.of(2016, 3, 11)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 10), LocalDate.of(2016, 3, 10)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 10), LocalDate.of(2016, 3, 11)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 10), LocalDate.of(2016, 3, 15)));
		containers.add(new Container(i++, LocalDate.of(2016, 3, 10), LocalDate.of(2016, 3, 11)));

		//System.out.println(containers);
		
		return containers;
		
	}

}
