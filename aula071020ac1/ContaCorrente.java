package aula071020ac1;

public class ContaCorrente {
    private int numeroConta;
    private double saldo;
    private double limiteEspecial;
    private String nomeCliente;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean depositar(double valor){
        if(valor > 0){
            saldo += valor;
            return true;
        }   
        else{
            return false;
        }
    }

    public boolean sacar(double valor){
        if(valor < 0)
        {
            return false;
        }    
        else{
            if(saldo - valor >= -limiteEspecial )
            {
                saldo -= valor;
                return true;
            }
            else{
                return false;
            }
        }
    }

    

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void definirLimiteEspecial(double limiteEspecial) {
        if(limiteEspecial >= 0){
            this.limiteEspecial = limiteEspecial;
        }
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    @Override
    public String toString() {
        return "ContaCorrente [limiteEspecial=" + limiteEspecial + ", nomeCliente=" + nomeCliente + ", numeroConta="
                + numeroConta + ", saldo=" + saldo + "]";
    }

    
}
