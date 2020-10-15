package aula141020;

import java.util.ArrayList;

public class Teste3 {
    public static void main(String[] args) {
        
        ArrayList<Cliente> lista = new ArrayList<Cliente>();

        Cliente c1 = new Cliente(1,"Jose"); 
        lista.add(c1);
        lista.add(new Cliente(2,"Maria"));
        lista.add(c1);
        lista.add(0,new Cliente(3,"Ana"));
        lista.add(c1);
       
        for(Cliente c: lista){
            System.out.println(c);
        }
        

        System.out.println(lista.indexOf(c1));
        System.out.println(lista.lastIndexOf(c1));

        
        


    }
}
