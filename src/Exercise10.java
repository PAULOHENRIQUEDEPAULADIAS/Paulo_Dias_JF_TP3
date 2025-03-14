import methods.Cirgulo;
import methods.Conta;
import methods.Esfera;

import java.util.Scanner;

public class Exercise10 {

    public void exercise10(){
        Scanner sc = new Scanner(System.in);

        Cirgulo circulo = new Cirgulo(3.0);
        Esfera esfera = new Esfera(5.0);

        while (true) {
            System.out.println(" ");
            System.out.println("***** Entre a numeração abaixo *****");
            System.out.println(" ");
            System.out.println(" ******* Você deseja ******* ");
            System.out.println("01 - Calcular a área do círculo");
            System.out.println("02 - Calcular o volume da esfera");

            System.out.println(" ");
            System.out.println("00 - Sair");

            String exercise = sc.nextLine();

            int CExercise = Main.convertToIntInRange(exercise);

            if (CExercise == -1) {
                System.out.println("Número inválido");
                continue;
            }
            System.out.println(" ");


            if (CExercise == 0)
            {
                break;
            }
            else if (CExercise == 1)
            {
                System.out.println(circulo.getRaio() + " equivale ao raio do círculo, com área de " + String.format("%.4f", circulo.calcularArea()));
                System.out.println(" ");
            }
            else if(CExercise == 2)
            {
                System.out.println(esfera.getRaio() + " equivale ao raio da esfera, com volume de " + String.format("%.4f", esfera.calcularVolume()));
                System.out.println(" ");
            }
            else {
                System.out.println("Opção inválida!");
            }
        }
    }
}
