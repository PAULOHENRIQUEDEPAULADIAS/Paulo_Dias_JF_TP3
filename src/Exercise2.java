import methods.Product;

import java.util.Scanner;

public class Exercise2 {

    public void exercise2(Product product1, Product product2, Product product3) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("***** Entre a numeração abaixo *****");
            System.out.println(" ");
            System.out.println(" ******* Você deseja ******* ");
            System.out.println("01 - Atualizar o preço do produto?");
            System.out.println("02 - Atualizar a quantidade do produto em estoque?");
            System.out.println("03 - Exibir informações do produto?");
            System.out.println(" ");
            System.out.println("00 - Sair");

            String option = sc.nextLine();
            System.out.println(" ");

            int COption = Main.convertToIntInRange(option);


            if (COption == -1) {
                System.out.println("Número inválido");
                continue;
            }

            if (COption == 0) {
                break;
            } else if (COption == 1) {
                while (true) {
                    double preco;
                    int item;
                    while (true) {
                        try {
                            System.out.print("Digite o novo preço (Formato X.XX): ");
                            preco = sc.nextDouble();

                            System.out.println("Para qual produto deseja fazer a atualização? (1, 2, 3):");
                            item = sc.nextInt();
                            break;
                        } catch (Exception ex) {
                            System.out.println("Digite um preço válido!");
                            sc.nextLine();
                        }
                    }

                    switch (item) {
                        case 1:
                            product1.setPreco(preco);
                            System.out.println("Preço do Produto 1 atualizado para: " + preco);
                            break;
                        case 2:
                            product2.setPreco(preco);
                            System.out.println("Preço do Produto 2 atualizado para: " + preco);
                            break;
                        case 3:
                            product3.setPreco(preco);
                            System.out.println("Preço do Produto 3 atualizado para: " + preco);
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;
                }
                break;

            } else if (COption == 2) {
                while (true) {
                    int quantidade;
                    int item;
                    while (true) {
                        try {
                            System.out.print("Digite uma quantidade (Formato XX): ");
                            quantidade = sc.nextInt();

                            System.out.println("Para qual produto deseja fazer a atualização? (1, 2, 3):");
                            item = sc.nextInt();
                            break;
                        } catch (Exception ex) {
                            System.out.println("Digite uma quantidade válida!");
                            sc.nextLine();
                        }
                    }

                    switch (item) {
                        case 1:
                            product1.setQuantidadeEmEstoque(quantidade);
                            System.out.println("Quantidade do Produto 1 atualizado para: " + quantidade);
                            break;
                        case 2:
                            product1.setQuantidadeEmEstoque(quantidade);
                            System.out.println("Quantidade do Produto 2 atualizado para: " + quantidade);
                            break;
                        case 3:
                            product1.setQuantidadeEmEstoque(quantidade);
                            System.out.println("Quantidade do Produto 3 atualizado para: " + quantidade);
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;
                }
                break;
            } else if (COption == 3) {
                while (true) {
                    int item;
                    while (true) {
                        try {
                            System.out.print("Digite o número do produto que deseja visualizar(1, 2, 3): ");
                            item = sc.nextInt();

                            break;
                        } catch (Exception ex) {
                            System.out.println("Digite um produto válido!");
                            sc.nextLine();
                        }
                    }
                    switch (item) {
                        case 1:
                            System.out.println("Produto encontrado: " + product1.exibirInformacoes());
                            break;
                        case 2:
                            System.out.println("Produto encontrado: " + product2.exibirInformacoes());
                            break;
                        case 3:
                            System.out.println("Produto encontrado: " + product3.exibirInformacoes());
                            break;
                        default:
                            System.out.println("Produto com ID " + item + " não encontrado.");
                            break;
                    }
                    break;
                }
            } else {
                System.out.println("Opção não encontrada");
                break;
            }
        }
    }
}
