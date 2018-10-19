
package herencias;

public class Herencias {

    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante e = new Estudiante("Juan", "Cevallos", 33, 100.2);
        System.out.println(e);
        
        Docente d = new Docente("Rene", "Elizalde", 33, 1000); 
        System.out.println(d);
        
        Policia p = new Policia("Isra", "Ortiz", 33, "Cabo"); 
        System.out.println(p);
        
    }
    
}