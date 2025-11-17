/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.pkg8;

/**
 *
 * @author juamp
 */
public class ConversionNumero {
    public static void main(String[] args) {

        try {
            String texto = "abc";
            int numero = Integer.parseInt(texto);
            System.out.println("Número: " + numero);

        } catch (NumberFormatException e) {
            System.out.println("Error: el texto no es un número válido.");
        }
    }
}
