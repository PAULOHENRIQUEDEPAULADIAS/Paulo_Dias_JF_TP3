import methods.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Laranja", 0.50, 30);
        Product product2 = new Product("Pêra", 1.00, 50);
        Product product3 = new Product("Cachos de uva", 3.00, 40);

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println(" ");
            System.out.println("***** Entre a numeração abaixo *****");
            System.out.println(" ");
            System.out.println(" ******* Você deseja ******* ");
            System.out.println("01 - Exercício 1?");
            System.out.println("02 - Exercício 2 (De exercício 2 até 6)");
            System.out.println("03 - Exercício 7 (De exercício 7 até 9)");
            System.out.println("04 - Exercício 10 (De exercício 10 até 12)");


            System.out.println(" ");
            System.out.println("00 - Sair");

            String exercise = sc.nextLine();

            int CExercise = convertToIntInRange(exercise);


            if (CExercise == -1) {
                System.out.println("Número inválido");
                continue;
            }


            if (CExercise == 0) {
                break;
            }
            else if (CExercise == 1)
            {
                Exercise1 exercise1 = new Exercise1();

                exercise1.exercise1();
            }
            else if (CExercise == 2)
            {
                Exercise2 exercise2 = new Exercise2();

                exercise2.exercise2(product1, product2, product3);
            }
            else if (CExercise == 3)
            {
                Exercise7 exercise7 = new Exercise7();

                exercise7.exercise7();
            }
            else if (CExercise == 4)
            {
                Exercise10 exercise10 = new Exercise10();

                exercise10.exercise10();
            }
            else
            {
                System.out.println("Digite uma opção válida!");
            }
        }
        sc.close();
    }

    public static int convertToIntInRange(String input) {
        if (input.matches("^(?:[0-9]|[0-9][0-9]|100)$")) {
            return Integer.parseInt(input);
        } else {
            return -1;
        }
    }

    public static int qualConta() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecione qual conta:  1, 2 ou 3?");

        String ID = sc.nextLine();
        int CID = Main.convertToIntInRange(ID);

        if (CID == -1) {
            System.out.println("Número inválido");

        }
        return CID;
    }

    public static boolean validaDoublePositivo(String entrada) {
        String regex = "^[0-9]+(\\.[0-9]+)?$";

        return entrada.matches(regex);
    }

}