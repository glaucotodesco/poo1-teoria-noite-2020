package aula071020ac1;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteContaCorrente {

    public static void main(String[] args) {

        ArrayList<ContaCorrente> contas = new ArrayList<ContaCorrente>();

        int op, numeroConta;
        Scanner s = new Scanner(System.in);

        do {
            System.out.println("Digite a opcao do menu:");
            System.out.println("1. Cadastrar ContaCorrente");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Ver Saldo");
            System.out.println("5. Mostrar somatorio positivo");
            System.out.println("6. Sair");

            op = Integer.parseInt(s.nextLine());

            switch (op) {

                case 1:
                    ContaCorrente novaConta = new ContaCorrente();
                    System.out.println("Digite o nome do cliente");
                    novaConta.setNomeCliente(s.nextLine());
                    System.out.println("Digite o valor do especial do cliente");
                    novaConta.definirLimiteEspecial(Double.parseDouble(s.nextLine()));
                    novaConta.setNumeroConta(contas.size() + 1);
                    contas.add(novaConta);
                    break;

                case 2:
                    System.out.println("Digite o numero da conta");
                    numeroConta = Integer.parseInt(s.nextLine());

                    if (numeroConta > 0 && numeroConta <= contas.size()) {
                        ContaCorrente contaDeposito = contas.get(numeroConta - 1);
                        System.out.println("Digite o valor do deposito: ");
                        double valorDeposito = Double.parseDouble(s.nextLine());
                        System.out.println(contaDeposito.depositar(valorDeposito));
                    } else {
                        System.out.println("Numero conta nao existente!");
                    }
                    break;

                case 3:
                    System.out.println("Digite o numero da conta");
                    numeroConta = Integer.parseInt(s.nextLine());

                    if (numeroConta > 0 && numeroConta <= contas.size()) {
                        ContaCorrente contaDeposito = contas.get(numeroConta - 1);
                        System.out.println("Digite o valor do saque: ");
                        double valorSaque = Double.parseDouble(s.nextLine());
                        System.out.println(contaDeposito.sacar(valorSaque));
                    } else {
                        System.out.println("Numero conta nao existente!");
                    }
                    break;
                case 4:
                    System.out.println("Digite o numero da conta: ");
                    numeroConta = Integer.parseInt(s.nextLine());

                    if (numeroConta > 0 && numeroConta <= contas.size()) {
                        ContaCorrente conta = contas.get(numeroConta - 1);
                        System.out.println("Saldo da conta " + conta.getNumeroConta()+
                                           " = "             + conta.getSaldo() 
                                          );
                    } else {
                        System.out.println("Numero conta nao existente!");
                    }
                    break;

                case 5: double total = 0;
                        for(ContaCorrente c: contas){
                            if(c.getSaldo() > 0)
                                total += c.getSaldo();
                        }    
                        System.out.println("Somatorio Positivo = " + total);
                        break;

            }

         

        } while (op != 6);

        s.close();
    }
}
