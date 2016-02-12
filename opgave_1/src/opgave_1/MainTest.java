package opgave_1;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainTest {

	public static void main(String[] args) {

		
		Container_Juyoung container1 = new Container_Juyoung(0, LocalDate.now() , LocalDate.of(2016, 02, 11));		
		Container_Juyoung container2 = new Container_Juyoung(1, LocalDate.now() , LocalDate.of(2016, 02, 18));
		Container_Juyoung container3 = new Container_Juyoung(2, LocalDate.now() , LocalDate.of(2016, 02, 11));
		Container_Juyoung container4 = new Container_Juyoung(3, LocalDate.now() , LocalDate.of(2016, 02, 14));
		Container_Juyoung container5 = new Container_Juyoung(4, LocalDate.now() , LocalDate.of(2016, 02, 20));

		Container_Juyoung container6 = new Container_Juyoung(5, LocalDate.now() , LocalDate.of(2016, 02, 12));
		Container_Juyoung container7 = new Container_Juyoung(6, LocalDate.now() , LocalDate.of(2016, 02, 13));
		Container_Juyoung container8 = new Container_Juyoung(7, LocalDate.now() , LocalDate.of(2016, 02, 21));


		Lager lg = new Lager();
		
		System.out.println(lg.modtagContainer(container1));
		System.out.println(lg.modtagContainer(container2));

		System.out.println(lg.modtagContainer(container3));
		System.out.println(lg.modtagContainer(container4));


		System.out.println(lg.modtagContainer(container5));
		

		//lg.afsendContainer();

		System.out.println(lg.modtagContainer(container6));
		System.out.println(lg.modtagContainer(container7));
		
		

		System.out.println(lg.modtagContainer(container8));

		int i = 0;
		for(List<Container_Juyoung> l : lg.getLister()){
			System.out.println("Place"+i+" : " + l);
			i++;
		}
		
		
		

		System.out.println("Antal af Containere : " + lg.getPtAntalContainer());


		System.out.println("Max antal af container : " + lg.getMaxAntalContainer());
		
		
		System.out.println("Antal af place : " + lg.getPtAntalPlace());
		
		System.out.println("Max antal af place : " + lg.getMaxAntalPlace());
		
	}

	

}
