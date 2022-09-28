/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicapilasnombres2;
import java.util.ArrayList;
/**
 *
 * @author julis
 */
public class PracticaPilasNombres2 {

    private ArrayList<Object> PracticaPilasNombres2 = new ArrayList();
    public void push(Object o){
        PracticaPilasNombres2.add(o); //agregamos el valora la pila
        //GREGA VALORES A LA PILA
        }
    public Object pop(){
        //MOSTRAR EL ULTIMO VALOR Y LO ELIMINA
        if(!(PracticaPilasNombres2.isEmpty())){
            Object o = PracticaPilasNombres2.get(PracticaPilasNombres2.size()-1);
            PracticaPilasNombres2.remove(PracticaPilasNombres2.size()-1);
            return o;
        }else{
            return null;
        }
        }
    public Object peek(){
         //MOSTRAR EL ULTIMO VALOR  
         if(PracticaPilasNombres2.isEmpty()){
             return PracticaPilasNombres2.get(PracticaPilasNombres2.size()-1);
         }else{
             return null;
         }
        }
    public Boolean empty(){
        //LA PILA ESTA LLENA
        return PracticaPilasNombres2.isEmpty();
            
        }
    
    public static void main(String[] args) {
        PracticaPilasNombres2 pila = new PracticaPilasNombres2();
        
        pila.push("antonio");
        pila.push("pedro");
        pila.push("jose");
        pila.push("maria");
        pila.push("carlos");
        pila.push("guadalupe");
        pila.pop();
        System.out.println("El ultimo valor de pila es: " + pila.pop());
        pila.push("juan");
        pila.pop();
        System.out.println("El ultimo valor de pila es: " + pila.pop());
    }
    
}
