package opgave_1;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainTest {

	public static void main(String[] args) {

		
		Container container1 = new Container(0, LocalDate.now() , LocalDate.of(2016, 02, 12));		
		Container container2 = new Container(1, LocalDate.now() , LocalDate.of(2016, 02, 18));
		Container container3 = new Container(2, LocalDate.now() , LocalDate.of(2016, 02, 13));
		Container container4 = new Container(3, LocalDate.now() , LocalDate.of(2016, 02, 14));
		Container container5 = new Container(4, LocalDate.now() , LocalDate.of(2016, 02, 20));

		Container container6 = new Container(5, LocalDate.now() , LocalDate.of(2016, 02, 12));
		Container container7 = new Container(6, LocalDate.now() , LocalDate.of(2016, 02, 13));
		Container container8 = new Container(7, LocalDate.now() , LocalDate.of(2016, 02, 21));


		Lager lg = new Lager();
		
		System.out.println(lg.modtagContainer(container1));
		System.out.println(lg.modtagContainer(container2));
		System.out.println(lg.modtagContainer(container3));
		System.out.println(lg.modtagContainer(container4));
		System.out.println(lg.modtagContainer(container5));
		System.out.println(lg.modtagContainer(container6));
		System.out.println(lg.modtagContainer(container7));
		System.out.println(lg.modtagContainer(container8));

		int i = 0;
		for(List<Container> l : lg.getLister()){
			System.out.println("Place"+i+" : " + l);
			i++;
		}
		
		
		

		System.out.println("Antal af Containere : " + lg.getTotalAntalContainer());


		System.out.println("Max antal af container : " + lg.getMaxAntalContainer());
		
		
		System.out.println("Antal af place : " + lg.getTotalPlace());
		
		System.out.println("Max antal af place : " + lg.getMaxAntalPlace());
		
	}

	

}
