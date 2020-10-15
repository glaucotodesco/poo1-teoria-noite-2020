package aula141020;

import java.time.LocalDate;

public class Cliente {
    
    private int codigo;
    private String nome;
    private double saldo;
    private LocalDate dataCadastro;

    public static Cliente novoCliente(){
       return new Cliente();
    }

    public Cliente(int codigo, String nome){
        this.codigo = codigo;
        this.nome   = nome;
        dataCadastro = LocalDate.now();
    } 

    public Cliente(int codigo){
        this.codigo = codigo;
        dataCadastro = LocalDate.now();
    } 

    public Cliente(){
        dataCadastro = LocalDate.now();
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

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    @Override
    public String toString() {
        return "Cliente [codigo=" + codigo + ", dataCadastro=" + dataCadastro + ", nome=" + nome + ", saldo=" + saldo
                + "]";
    }

  


   

    

}
