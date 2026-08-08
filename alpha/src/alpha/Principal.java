package alpha;

import java.util.Scanner;

/**
 * Classe principal do sistema Cofrinho.
 * Contém o menu interativo que permite ao usuário adicionar, remover,
 * listar moedas e calcular o total convertido em Reais.
 */
public class Principal {

    /**
     * Método principal - ponto de entrada do programa.
     *
     * @param args argumentos da linha de comando (não utilizados)
     */
    public static void main(String[] args) {

        // Scanner para ler a entrada do usuário no teclado
        Scanner sc = new Scanner(System.in);

        // Cria o cofrinho que armazenará as moedas
        Cofrinho cofrinho = new Cofrinho();

        // Variável que armazena a opção escolhida no menu
        int opcao;

        // Loop principal do menu - executa até o usuário escolher sair (opção 0)
        do {
            // Exibe o menu principal
            System.out.println("\n========== COFRINHO ==========");
            System.out.println("1 - Adicionar moeda");
            System.out.println("2 - Remover moeda");
            System.out.println("3 - Listar moedas");
            System.out.println("4 - Total convertido");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            // Lê a opção escolhida
            opcao = sc.nextInt();

            // Processa a opção escolhida
            switch (opcao) {

                // Caso 1: Adicionar moeda
                case 1:
                    // Exibe as opções de moedas disponíveis
                    System.out.println("\n1-Real");
                    System.out.println("2-Dólar");
                    System.out.println("3-Euro");
                    System.out.println("4-Iene Japonês");
                    System.out.println("5-Dólar Australiano");
                    System.out.print("Escolha: ");

                    // Lê o tipo de moeda
                    int tipo = sc.nextInt();

                    // Lê o valor da moeda
                    System.out.print("Valor: ");
                    double valor = sc.nextDouble();

                    // Cria a moeda conforme o tipo escolhido e adiciona ao cofrinho
                    switch (tipo) {
                        case 1:
                            cofrinho.adicionar(new Real(valor));
                            break;
                        case 2:
                            cofrinho.adicionar(new Dolar(valor));
                            break;
                        case 3:
                            cofrinho.adicionar(new Euro(valor));
                            break;
                        case 4:
                            cofrinho.adicionar(new Iene(valor));
                            break;
                        case 5:
                            cofrinho.adicionar(new DolarAustraliano(valor));
                            break;
                        default:
                            System.out.println("Tipo inválido.");
                    }
                    break;

                // Caso 2: Remover moeda
                case 2:
                    // Exibe as opções de moedas disponíveis
                    System.out.println("\nQual moeda deseja remover?");
                    System.out.println("1-Real");
                    System.out.println("2-Dólar");
                    System.out.println("3-Euro");
                    System.out.println("4-Iene Japonês");
                    System.out.println("5-Dólar Australiano");

                    // Lê o tipo de moeda a remover
                    int tipoRemover = sc.nextInt();

                    // Lê o valor da moeda a remover
                    System.out.print("Valor: ");
                    double valorRemover = sc.nextDouble();

                    // Cria a moeda conforme o tipo escolhido e remove do cofrinho
                    switch (tipoRemover) {
                        case 1:
                            cofrinho.remover(new Real(valorRemover));
                            break;
                        case 2:
                            cofrinho.remover(new Dolar(valorRemover));
                            break;
                        case 3:
                            cofrinho.remover(new Euro(valorRemover));
                            break;
                        case 4:
                            cofrinho.remover(new Iene(valorRemover));
                            break;
                        case 5:
                            cofrinho.remover(new DolarAustraliano(valorRemover));
                            break;
                        default:
                            System.out.println("Tipo inválido.");
                    }
                    break;

                // Caso 3: Listar moedas
                case 3:
                    cofrinho.listar();
                    break;

                // Caso 4: Total convertido em Reais
                case 4:
                    cofrinho.totalConvertido();
                    break;

                // Caso 0: Sair do programa
                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                // Caso padrão: opção inválida
                default:
                    System.out.println("Opção inválida.");
            }

            // Continua o loop enquanto o usuário não escolher a opção 0 (sair)
        } while (opcao != 0);

        // Fecha o Scanner para liberar recursos
        sc.close();
    }
}
