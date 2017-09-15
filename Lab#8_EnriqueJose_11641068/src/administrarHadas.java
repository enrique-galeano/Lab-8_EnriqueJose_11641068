
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enriquejosegaleanotalavera
 */
public class administrarHadas implements Serializable {

	private long UID = 366l;
	private ArrayList<Hada> listaHada= new ArrayList();
	private File archivo = null;
	
	
	public administrarHadas(String path){
		archivo = new File(path);
	}
	public ArrayList<Hada> getListaHada() {
		return listaHada;
	}

	public void setListaHada(ArrayList<Hada> listaHada) {
		this.listaHada = listaHada;
	}

	public File getArchivo() {
		return archivo;
	}

	public void setArchivo(File archivo) {
		this.archivo = archivo;
	}

	
	public ArrayList<Hada> cargarArchivo() {
		try {
			listaHada = new ArrayList();
			Hada temp;
			if (archivo.exists()) {
				FileInputStream entrada = new FileInputStream(archivo);
				ObjectInputStream objeto = new ObjectInputStream(entrada);
				try {
					while ((temp = (Hada) objeto.readObject()) != null) {
						listaHada.add(temp);
					}
				} catch (EOFException e) {
				}
				objeto.close();
				entrada.close();
			}//End if
		} catch (Exception e) {
		}
		return listaHada;
	}

	public void escribirArchivo() {
		FileOutputStream fw = null;
		ObjectOutputStream bw = null;
		try {
			fw = new FileOutputStream(archivo);
			bw = new ObjectOutputStream(fw);
			for (Hada t : listaHada) {
				bw.writeObject(t);
			}
			bw.flush();
		} catch (Exception e) {

		} finally {
			try {
				bw.close();
				fw.close();
			} catch (Exception e) {
			}
		}
	}

}
