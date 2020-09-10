
package Cliente;

/**
 *
 * @author jorge malaver
 */
public class cliente {
    
    private String nom; // atributo tipo String
    
    public cliente(String nombre){ // contructor de clase
        
        this.nom=nombre;
    }
    
    public String getNom(){ // metodo get del atributo nom
     
        return nom;
    }
    
    public void setNom(String nombre){ // metodo set del atributo nom
        
        this.nom=nombre;
    }
            
}
