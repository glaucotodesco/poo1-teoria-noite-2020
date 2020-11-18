package aula181120;

import java.time.LocalDateTime;
import java.time.DayOfWeek;

public class Teste {
    public static void main(String[] args) {

            LocalDateTime inicio = LocalDateTime.now();

            LocalDateTime fim = inicio.plusDays(4);

            System.out.println(inicio);
            System.out.println(fim);

            if(fim.getDayOfWeek().equals(DayOfWeek.SUNDAY))
                 System.out.println("Domingo");


           if(fim.isAfter(inicio))
           {
               System.out.println("Data de fim maior que a data de início");
               System.out.println("Dias corridos: " + fim.compareTo(inicio));
           }
    }
}
