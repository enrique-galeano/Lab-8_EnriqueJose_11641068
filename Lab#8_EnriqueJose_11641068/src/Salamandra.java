/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author enriquejosegaleanotalavera
 */
public class Salamandra extends Hada{
	private int alas;
	private int fenix = 71;

	public Salamandra(int alas, String nombre, String altura, int edad, double salud, double poder) {
		super(nombre, altura, edad, salud, poder);
		this.alas = alas;
	}

	public int getAlas() {
		return alas;
	}

	public void setAlas(int alas) {
		this.alas = alas;
	}

	public int getFenix() {
		return fenix;
	}

	public void setFenix(int fenix) {
		this.fenix = fenix;
	}
	
	
}
