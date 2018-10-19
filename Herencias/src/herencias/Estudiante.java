package herencias;
public class Estudiante extends Persona{
    private double matricula;
    
    public Estudiante(String n, String a, int e, double mat){
        super(n, a, e);
        setMatricula(mat);
    }
    
    @Override
    public void setNombre(String n){
        nombre = n.toUpperCase();    
    }
    
    public void setMatricula(double mat){
        matricula = mat;
    }
    
    public double getMatricula(){
        return matricula;
    }
    @Override
    public String toString(){
    
        return String.format("%s - %.2f", super.toString(), getMatricula());
    }
}
