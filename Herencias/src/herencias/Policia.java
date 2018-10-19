
package herencias;
//Creamos la clase Policia que hereda atributos de persona
public class Policia extends Persona{
     private String rango;//Declaramos el atributo nuevo de la clase
 //Creamos el constructor usando super para usar los atributos heredados y set del nuevo atributo
     public Policia(String n, String a, int e, String r){
        super(n,a,e);
        setRango(r);
     }
    public String getRango() {
        return rango;
    }
    public void setRango(String rango) {
        this.rango = rango;
    }
    //Sobreescribimos el metodo toString utilizando super.toString para obtener los atributos heredados e ingrasamos el nuevo atributo
    @Override
    public String toString(){
    
        return String.format("%s - %s", super.toString(), getRango());
    }
}
