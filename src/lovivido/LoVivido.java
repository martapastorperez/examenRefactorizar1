/*
 * Examen Refactorizacion
 * 
 */
package lovivido;

import javax.swing.JOptionPane;

public class LoVivido {

public static void main(String[] args) {
//Poner todas las variables juntas
//Renombrar los nombres de las variables para que sea mas entendible el codigo
String nombre,edad;
int meses,dias,horas,a;


nombre = JOptionPane.showInputDialog ("Escriba su nombre: ");
edad = JOptionPane.showInputDialog ("Escriba su edad: ");
 
a =Integer.parseInt(edad);
 
meses = (a*12);
dias = (a*365);
horas = (dias*24);
 
Persona pers=new Persona();
pers.mostrar();

 //Paso la parte de lo que se va a visualizar a una clase y lo llamo en la main para hacer el codigo mas legible

}
   

}
