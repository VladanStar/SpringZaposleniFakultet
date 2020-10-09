package com.vladancupric;
import java.util.Set;

import com.vladancupric.Profesor;

public class Zaposleni {
	private String univerzitet;
	private Set<Profesor> zaposleni;
	public Zaposleni() {
		super();
	}
	public Zaposleni(String univerzitet, Set<Profesor> zaposleni) {
		super();
		this.univerzitet = univerzitet;
		this.zaposleni = zaposleni;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Zaposleni na "
				+ "Univerzitetu:" + this.univerzitet+ " su: \n");
		for(Profesor p : zaposleni) {
			sb.append(p);
			sb.append("\n");
		}
		return sb.toString();
	}
	
	

}
