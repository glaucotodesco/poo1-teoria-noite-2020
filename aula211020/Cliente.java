package aula211020;

import java.util.ArrayList;

/**
 * Cliente
 */
public class Cliente {

    private int codigo;
    private String nome;
    private double saldo;
    private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();

    public Cliente(int codigo, String nome, double saldo) {
        this.codigo = codigo;
        this.nome = nome;
        this.saldo = saldo;
    }

    public Cliente() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public boolean addPedido(Pedido pedido) {
        return pedidos.add(pedido);
    }

    public boolean removePedido(Pedido pedido) {
        return pedidos.remove(pedido);
    }

    public double somaTotalPedidos() {
        double soma = 0;

        for (Pedido pedido : pedidos) {
            soma += pedido.totalPedido();
        }

        return soma;
    }

    public double somaTotalPedidosFechados() {
        double soma = 0;

        for (Pedido pedido : pedidos) {
            if (pedido.isPedidoFechado()) {
                soma += pedido.totalPedido();
            }
        }

        return soma;
    }

    @Override
    public String toString() {
        return "Cliente [codigo=" + codigo + ", nome=" + nome + ", saldo=" + saldo + "]";
    }

}