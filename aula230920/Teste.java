package aula230920;

import java.util.Scanner;

/**
 * Teste
 */
public class Teste {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        Cliente c = new Cliente();

        System.out.println("Digite seu nome: ");
        c.setNome(s.nextLine());

        System.out.println("Digite seu codigo: ");
        c.setCodigo(Integer.parseInt(s.nextLine()));

        System.out.println("Digite seu saldo: ");
        c.setSaldo(Double.parseDouble(s.nextLine()));

        System.out.println(c);
        s.close();


    }
}