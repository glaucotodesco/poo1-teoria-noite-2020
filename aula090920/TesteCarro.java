package aula090920;

public class TesteCarro {
    
    public static void main(String[] args) {
        Carro c1 = new Carro();

        c1.velocidadeKmPorHora = 1;
        c1.mover(3600);

        System.out.println(c1.distanciaPercorridaEmMetros);

    }
}
