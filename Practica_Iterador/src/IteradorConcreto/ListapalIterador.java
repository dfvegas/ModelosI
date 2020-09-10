
package IteradorConcreto;

/**
 *
 * @author jorge malaver
 */
import Iterador.iterador;
public class ListapalIterador implements iterador{
 
    private String pal1,pal2,pal3,pal4,pal5;
    private int pos;
    
    public ListapalIterador(String p1, String p2, String p3, String p4, String p5){
        this.pal1=p1;
        this.pal2=p2;
        this.pal3=p3;
        this.pal4=p4;
        this.pal5=p5;
        pos=0;
    }
    
    @Override
    public Object sig(){
       
        switch(pos++){
            case 0:
                return pal1;
            case 1:
                return pal2;
            case 2:
                return pal3;
            case 3:
                return pal4;
            case 4: 
                return pal5;
                                         
        }//fin switch
        return null;
    }
    
    @Override
    public boolean  tienesig(){
       
       if(pos < 5){
           return true;
       } else{
           return false;
       }
    }
    
}
