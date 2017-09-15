/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author enriquejosegaleanotalavera
 */
public class hilo extends Thread{
	private Hada uno;
	private Hada dos;

	public hilo(Hada uno, Hada dos) {
		this.uno = uno;
		this.dos = dos;
	}

	public Hada getUno() {
		return uno;
	}

	public void setUno(Hada uno) {
		this.uno = uno;
	}

	public Hada getDos() {
		return dos;
	}

	public void setDos(Hada dos) {
		this.dos = dos;
	}
	
	@Override
	public void run(){
		double vida1, vida2;
		while(uno.getSalud()>0&&dos.getSalud()>0){
			vida1 = uno.getSalud()-dos.getPoder();
			uno.setSalud(vida1);
			vida2 = dos.getSalud()-uno.getPoder();
			dos.setSalud(vida2);
			System.out.println("hada" + uno + "vida = " + vida1  +" " +  "hada 2 " + dos + "vida2 = " + vida2);
			try{
			Thread.sleep(2000);
			}catch(Exception e){
			}
        }
		if (uno.getSalud()>0) {
			System.out.println("ganador");
		}else{
			System.out.println("perdio puto");
		}
	}
	
}
