package aula270820;

public class TesteCasa {
    
    public static void main(String[] args) {
        
        Casa c1 = new Casa();
        
        System.out.println(c1);
        System.out.println(c1.endereco);
        System.out.println(c1.valor);

        c1.endereco = "Rua X, 99";
        c1.valor    = 1200;
        
        System.out.println(c1.endereco);
        System.out.println(c1.valor);
    


    }
}