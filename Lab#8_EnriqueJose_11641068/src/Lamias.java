/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author enriquejosegaleanotalavera
 */
public class Lamias extends Hada{
	private int aleta;
	private int branquias;


	public Lamias(int aleta, int branquias, String nombre,int altura, int edad, double salud, double poder) {
		super(nombre, altura, edad, salud, poder);
		this.aleta = aleta;
		this.branquias = branquias;
	}

	public int getAleta() {
		return aleta;
	}

	public void setAleta(int aleta) {
		this.aleta = aleta;
	}

	public int getBranquias() {
		return branquias;
	}

	public void setBranquias(int branquias) {
		this.branquias = branquias;
	}
	@Override
	public String toString() {
		return "Lamias{" + "aleta=" + aleta + ", branquias=" + branquias + '}';
	}
}
