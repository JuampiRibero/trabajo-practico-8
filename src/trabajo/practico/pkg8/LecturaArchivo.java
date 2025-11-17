/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.pkg8;

import java.io.*;

/**
 *
 * @author juamp
 */
public class LecturaArchivo {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("archivo.txt"));
            String linea;

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe.");
        } catch (IOException e) {
            System.out.println("Error al leer.");
        }
    }
}
