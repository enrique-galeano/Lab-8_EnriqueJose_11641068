/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author enriquejosegaleanotalavera
 */
public class Hamadriades extends Hada{
	private int arbol =  173;

	public Hamadriades(String nombre, String altura, int edad, double salud, double poder) {
		super(nombre, altura, edad, salud, poder);
	}

	public int getArbol() {
		return arbol;
	}

	public void setArbol(int arbol) {
		this.arbol = arbol;
	}

	
	
}
