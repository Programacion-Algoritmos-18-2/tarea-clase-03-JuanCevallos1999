
package clase3;
import java.util.Scanner;
public class Trabajador {
    private double sueldototal;
    private String nombres;
    private double sueldo_mensual;
    private String apellidos;
    //Creamos los set y get de las variables.
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
    
    public String obtener_nombres(){
        return nombres;
    }
    
    public String obtener_apellidos(){
        return apellidos;
    }
    
    public double obtener_sueldo_mensual(){
        return sueldo_mensual;
    }
    public void agregar_sueldo(double s, double s1, double s2, double s3){    
        sueldo_mensual = s+s1+s2+s3;       
    }
    public void agregar_sueldo(){
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese semana "+i+1);          
        }
    }
    public void agregar_sueldo(double [] sueldos){
        for (int i = 0; i < sueldos.length; i++) {
            sueldo_mensual +=sueldos[i];
        }
    }
    //Sobreescribimos el método toString para presentar los datos
    @Override
    public String toString(){
        return String.format("\n\tNombres: %s \n\tApellidos: %s\n\t"
                + "Sueldo: %.2f", obtener_nombres(), obtener_apellidos(),
                obtener_sueldo_mensual());
    }
    
    
}
