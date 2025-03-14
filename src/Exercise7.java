import methods.Conta;

import java.util.Scanner;

public class Exercise7 {

    public void exercise7(){
        Scanner sc = new Scanner(System.in);

        Conta conta1 = new Conta("João da Silva Santos", 500542, "Lapa - 0001", 2000.00);
        Conta conta2 = new Conta("Abvânio Martins Alfândego", 500697, "Lapa - 0001", 5000.00);
        Conta conta3 = new Conta("Meldica Marlin Hej", 500410, "Conceição - 0524", 10000.00);

        while (true){
            System.out.println(" ");
            System.out.println("***** Entre a numeração abaixo *****");
            System.out.println(" ");
            System.out.println(" ******* Você deseja ******* ");
            System.out.println("01 - Sacar algum valor");
            System.out.println("02 - Depositar algum valor");
            System.out.println("03 - Saber informações de rendimento");

            System.out.println(" ");
            System.out.println("00 - Sair");

            String exercise = sc.nextLine();

            int CExercise = Main.convertToIntInRange(exercise);

            if (CExercise == -1) {
                System.out.println("Número inválido" );
                continue;
            }
            System.out.println(" ");


            if (CExercise == 0) {
                break;
            }
            else if (CExercise == 1)
            {
                int identificador = Main.qualConta();

                System.out.print("Digite o valor que deseja sacar: ");

                try {
                    String valor = sc.nextLine();

                    if (!Main.validaDoublePositivo(valor)) {
                        System.out.println("Entrada inválida, operação cancelada!");
                        return;
                    }

                    double CValor = Double.parseDouble(valor);

                    switch (identificador)
                    {
                        case 1:
                            conta1.saca(CValor);
                            break;
                        case 2:
                            conta2.saca(CValor);
                            break;
                        case 3:
                            conta3.saca(CValor);
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }

                }
                catch(Exception ex)
                {
                    System.out.println("Entrada inválida, operação cancelada!");
                    return;

                }
            }
            else if(CExercise == 2)
            {
                int identificador = Main.qualConta();

                System.out.print("Digite o valor que deseja depositar: ");

                try {
                    String valor = sc.nextLine();

                    if (!Main.validaDoublePositivo(valor)) {
                        System.out.println("Entrada inválida, operação cancelada!");
                        return;
                    }

                    double CValor = Double.parseDouble(valor);

                    switch (identificador)
                    {
                        case 1:
                            conta1.deposita(CValor);
                            break;
                        case 2:
                            conta2.deposita(CValor);
                            break;
                        case 3:
                            conta3.deposita(CValor);
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }

                }
                catch(Exception ex)
                {
                    System.out.println("Entrada inválida, operação cancelada!");
                    return;

                }
            }
            else if (CExercise == 3)
            {
                int identificador = Main.qualConta();
                double rendimento;

                switch (identificador) {
                        case 1:
                            rendimento = conta1.calculaRendimento();
                            System.out.println("Seu dinheiro renderá R$" + rendimento + "em conta em até 30 dias");
                            break;
                        case 2:
                            rendimento = conta2.calculaRendimento();
                            System.out.println("Seu dinheiro renderá R$" + rendimento + "em conta em até 30 dias");
                            break;
                        case 3:
                            rendimento = conta3.calculaRendimento();
                            System.out.println("Seu dinheiro renderá R$" + rendimento + "em conta em até 30 dias");
                            break;
                        default:
                            System.out.println("Opção inválida.");
                }
            }
            else {
                System.out.println("Opção inválida!");
            }
        }
    }




}
