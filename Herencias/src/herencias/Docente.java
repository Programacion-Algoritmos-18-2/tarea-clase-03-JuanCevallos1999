
package herencias;
//Creamos la clase docente que hereda atributos de persona
public class Docente extends Persona {
    private double sueldo;
    //Creamos el constructor usando super para usar los atributos heredados y set del nuevo atributo
    public Docente(String n, String a, int e, double sueldo){    
        super(n, a, e);
        setSueldo(sueldo);
    }

     @Override
    public void setNombre(String n){
        nombre = n.toUpperCase();    
    }
    public void setSueldo(double sueldo){
        sueldo = sueldo;
    }
    
    public double getSueldo(){
        return sueldo;        
    }
    //Sobreescribimos el metodo toString utilizando super.toString para obtener los atributos heredados e ingrasamos el nuevo atributo
    @Override
    public String toString(){
        return String.format("%s - %f", super.toString(), getSueldo());
    
}
}