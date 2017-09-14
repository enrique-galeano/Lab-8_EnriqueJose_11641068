/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author enriquejosegaleanotalavera
 */
public class Sifides extends Hada{
	
	private int alas;
	private int tornados = 67;

	public Sifides(int alas, String nombre, String altura, int edad, double salud, double poder) {
		super(nombre, altura, edad, salud, poder);
		this.alas = alas;
	}

	public int getAlas() {
		return alas;
	}

	public void setAlas(int alas) {
		this.alas = alas;
	}

	public int getTornados() {
		return tornados;
	}

	public void setTornados(int tornados) {
		this.tornados = tornados;
	}
	
	
}

