package alpha;

import java.util.ArrayList;

/**
 * Classe que representa o Cofrinho, responsável por armazenar e gerenciar
 * as moedas adicionadas pelo usuário.
 * Ela permite adicionar, remover, listar moedas e calcular o total em Reais.
 */
public class Cofrinho {

    // Lista que armazena as moedas do cofrinho
    private ArrayList<Moeda> lista = new ArrayList<>();

    /**
     * Adiciona uma moeda ao cofrinho.
     *
     * @param moeda a moeda a ser adicionada
     */
    public void adicionar(Moeda moeda) {
        lista.add(moeda);
        System.out.println("Moeda adicionada!");
    }

    /**
     * Remove uma moeda do cofrinho.
     * Usa o método equals() da classe Moeda para encontrar a moeda correspondente
     * (mesmo tipo e mesmo valor).
     *
     * @param moeda a moeda a ser removida
     */
    public void remover(Moeda moeda) {
        // O método remove() da lista usa equals() para localizar o objeto
        if (lista.remove(moeda))
            System.out.println("Moeda removida!");
        else
            System.out.println("Moeda não encontrada!");
    }

    /**
     * Lista todas as moedas presentes no cofrinho.
     * Se o cofrinho estiver vazio, exibe uma mensagem informativa.
     */
    public void listar() {
        // Verifica se o cofrinho está vazio
        if (lista.isEmpty()) {
            System.out.println("Cofrinho vazio!");
            return;
        }

        System.out.println("\n===== MOEDAS =====");

        // Percorre todas as moedas e exibe suas informações
        for (Moeda moeda : lista) {
            moeda.info();
        }
    }

    /**
     * Calcula e exibe o total convertido de todas as moedas em Reais (R$).
     * Soma o resultado da conversão de cada moeda para a moeda nacional.
     */
    public void totalConvertido() {
        double soma = 0;

        // Soma a conversão de cada moeda para Reais
        for (Moeda moeda : lista) {
            soma += moeda.converter();
        }

        // Exibe o total formatado com duas casas decimais
        System.out.printf("\nTotal em Reais: R$ %.2f\n", soma);
    }
}
