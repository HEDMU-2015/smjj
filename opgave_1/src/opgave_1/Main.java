package opgave_1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
		Main main = new Main();
		
		Lager lg = new Lager();
		
		
		for(Container c : main.lavContainers()){
			lg.modtagContainer(c);		
		}
		
		int i = 0;
		
		for(List<Container> l : lg.getLister()){
			System.out.println("Place"+i+" : " + l);
			i++;
		}
		
		System.out.println("Max Container : " + lg.getMaxAntalContainer());
		System.out.println("Actual Container : " + lg.getPtAntalContainer());
		System.out.println("Max Place : " + lg.getMaxAntalPlace());
		System.out.println("Actual Place : " + lg.getPtAntalPlace());

		

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

		System.out.println(containers);
		
		return containers;
		
	}

}
