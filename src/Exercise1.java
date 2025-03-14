import methods.Garrafa;

import java.util.Scanner;

public class Exercise1 {

    public void exercise1() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a cor da garrafa: ");
        String cor = sc.nextLine();

        System.out.print("Digite a capacidade da garrafa (em ml): ");
        int capacidade = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o material da garrafa: ");
        String material = sc.nextLine();


        Garrafa garrafa = new Garrafa(cor, capacidade, material);

        String example = garrafa.aguaDoce();

        System.out.println(example);

    }

}
