
package javaapplication3;

import java.util.ArrayList;
import java.util.List;

public class JavaApplication3 {

    
    public static void main(String[] args) {
       List<Integer> numeros = new ArrayList<>();
       numeros.add(1);
       numeros.add(2);
       numeros.add(3);
       
       numeros.forEach((x)->{
           System.out.println(x);
       
       
       });
       
       for(int i=0;i<numeros.size();i++){
           System.out.println(numeros.get(i));
           
       }
       
       ModificarCadena mensaje =(t)->"¿"+t+"?";
       visualizar ("Cual es tu nombre",mensaje);
       
        System.out.println();
        ModificarCadena mensaje1 =(t)->t;
        visualizar("David",mensaje1);
        System.out.println();
        
       
       
      
    }
    private static void visualizar (String texto, ModificarCadena formato){
        String resultado = formato.ejecutar(texto);
        System.out.println(resultado);
    }
    
}


interface ModificarCadena {
    String ejecutar (String texto);
    
}