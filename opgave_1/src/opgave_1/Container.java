package opgave_1;

import java.time.LocalDate;
import java.time.Period;

public class Container {

	int id;
	LocalDate ankomstdato;
	LocalDate afhentningsdato;
	int dagTilbage;
	
	public Container(int id, LocalDate ankomstdato, LocalDate afhentningsdato) {
		this.id = id;
		this.ankomstdato = ankomstdato;
		this.afhentningsdato = afhentningsdato;
	}
	
	public int getId(){
		return id;
	}
	
	

	public LocalDate getAnkomstdato() {
		return ankomstdato;
	}

	
	public LocalDate getAfhentningsdato() {
		return afhentningsdato;
	}
	
	public int getDagTilbage(){
		
		dagTilbage=Period.between(LocalDate.now(), afhentningsdato).getDays();
		
		return dagTilbage;
		
	}


	public void setDagTilbage(int dagTilbage) {
		this.dagTilbage = dagTilbage;
	}

	@Override
	public String toString() {
		return "Container [id=" + id + ", ankomstdato=" + ankomstdato + ", afhentningsdato=" + afhentningsdato
				+ ", dagTilbage=" + dagTilbage + "]";
	}

	
	
	
	
}
