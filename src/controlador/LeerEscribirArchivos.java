package controlador;

import java.io.*;

import java.util.*;
import java.util.logging.*;
import modelo.Edificio;

public class LeerEscribirArchivos {

    public void escribirArchivos(List lista, String nombreArchivo) {
        try {
            FileOutputStream fos = new FileOutputStream("src" + File.separatorChar + "archivos" + File.separatorChar + nombreArchivo + ".archivos");
            ObjectOutputStream ous = new ObjectOutputStream(fos); // lo que pondre en mi archivo
            ous.writeObject(lista);
            ous.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LeerEscribirArchivos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LeerEscribirArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Object leerArchivos(String nombreArchivo) {
        Object objeto = null;
        try {
            FileInputStream fis = new FileInputStream("src" + File.separatorChar + "archivos" + File.separatorChar + nombreArchivo + ".archivos");
            ObjectInputStream ois = new ObjectInputStream(fis);
            objeto = ois.readObject();
            ois.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LeerEscribirArchivos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(LeerEscribirArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return objeto;
    }
}
