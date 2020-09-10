/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Profesionales;
/**
 *
 * @author jorge malaver
 */
public class MedicoAdapter  extends Target_Profesionales{
     Medico medico;// referencia a la clase adaptada medico
    
     public MedicoAdapter(){ // constructor de clase MedicoAdapter
         super();
         this.medico = new Medico(); // crea instancia de la clase Medico
     }
     
    @Override
    public void Leer_planos(){ // metodo para adaptar la especialidad y la entidad a la funcion Leer_planos de la clase abstracta
        
        System.out.println("Especialidades de medicas"); // imprime en pantalla 
        this.medico.especialidad(); // trae las especialidades del medico adaptadas a las funciones de los otros profesionales
        this.medico.Entidades(); // trae las entedidades del medico adaptadas a las funciones de los otros profesionales
    }
    
    @Override
    public void contratos(){ // metodo para adaptar la nacionalidad a la funcion contratos de la clase abstracta
        System.out.println("Nacionalidades"); // imprime en pantalla
        this.medico.nacionalidad(); // trae la nacionalidad del medico adaptadas a las funciones de los otros profesionales
    }
    
    @Override
    public void supervision(){ // metodo para adaptar la investigacion a la funcion supervision de la clase abstracta
        System.out.println("Campos de investigacion"); // imprime en pantalla
        this.medico.Investigacion(); // trae las investigaciones del medico adaptadas a las funciones de los otros profesionales
    }
}
