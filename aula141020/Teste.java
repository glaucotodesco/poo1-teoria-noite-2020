package aula141020;

import java.util.ArrayList;



public class Teste {
    
    public static void main(String[] args) {
        
        
        Cliente cliente1 = new Cliente(1010,"Jose");
        Cliente cliente2 = new Cliente(1011);
        Cliente cliente3 = new Cliente();
        Cliente cliente4 = Cliente.novoCliente();

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);

        ArrayList<Cliente> lista1 = new ArrayList<>(10);
        lista1.add(cliente1);
        lista1.add(cliente2);
        lista1.add(cliente3);

        ArrayList<Cliente> lista2 = new ArrayList<Cliente>(lista1);

        



    }
}