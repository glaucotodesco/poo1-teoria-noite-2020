package aula270820;

public class Teste3 {

    public static void main(String[] args) {
        
        Casa c1, c2, c3 , c4=null;

        c1 = new Casa();
        c1.valor = 1;
        c2 = c1;
        c1 = new Casa();
        c1.valor = 2;
        c2 = c1;
        c3 = c1;
        c1 = new Casa();
        c4 = c1;
        c4.valor = 3;
        
        

        System.out.println(c1.valor);
        System.out.println(c2.valor);
        System.out.println(c3.valor);
        System.out.println(c4.valor);

    }
    
}



