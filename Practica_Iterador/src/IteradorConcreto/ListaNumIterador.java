
package IteradorConcreto;

/**
 *
 * @author jorge malaver
 */

import Iterador.iterador;
public class ListaNumIterador implements iterador{
    
    private int num[];
    private int pos;
    
    public ListaNumIterador(int Num[]){//recibe el array de la listsa
     
        this.num=Num;
        this.pos=0;
    }
    //devuelve el numero de la posicion donde se encuentra en un momento
    @Override
    public Object sig(){
        return num[pos++];
    }
    // para determinar si tiene mas datos a partir del sitio donde se encuentra
    @Override
    public boolean tienesig(){
      if(pos < num.length && num[pos] != 0){
          return true;
      }  else{
          return false;
      }
    }
}
