/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioclase3;

/**
 *
 * @author Josue
 */
public class Trabajador {
     private String nombres;
    private double sueldo_mensual;
    private String apellidos;
    
    public void agregar_nombres(String n){
        nombres = n;
    }
    
    public void agregar_nombres(String n1, String n2){
        nombres = String.format("%s-%s", n1, n2);
    }
    
    
    public void agregar_sueldo(double sueldo){
        sueldo_mensual = sueldo;
    }
    
        
    public void agregar_apellidos(String n){
        apellidos = n;
    }
    public void agregar_sueldo(double sueldom[]){
        double s=0;
        for (int i = 0; i < 4; i++) {
            s=s+sueldom[i];
        }
        sueldo_mensual=s;
    }
    public String obtener_nombres(){
        return nombres;
    }
    
    public String obtener_apellidos(){
        return apellidos;
    }
    
    public double obtener_sueldo_mensual(){
        return sueldo_mensual;
    }
    
    public String presentar_datos(){
        return String.format("\n\tNombres: %s \n\tApellidos: %s\n\t"
                + "Sueldo: %.2f", obtener_nombres(), obtener_apellidos(),
                obtener_sueldo_mensual());
    }
}
