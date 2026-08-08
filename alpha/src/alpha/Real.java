package alpha;

/**
 * Classe que representa o Real (moeda brasileira - BRL).
 * Estende a classe abstrata "Moeda" e define o comportamento
 * específico para o Real: exibição de informações e conversão para Reais.
 */
public class Real extends Moeda {

    /**
     * Construtor da classe Real.
     *
     * @param valor quantidade de Reais
     */
    public Real(double valor) {
        super(valor); // Chama o construtor da classe pai (Moeda)
    }

    /**
     * Exibe as informações da moeda (símbolo R$ e valor em Reais).
     */
    @Override
    public void info() {
        System.out.println("Real: R$ " + valor);
    }

    /**
     * Converte o valor da moeda para Reais (R$).
     * Como o Real já é a moeda nacional, o valor permanece o mesmo.
     *
     * @return o próprio valor em Reais
     */
    @Override
    public double converter() {
        return valor; // 1 Real = 1 Real (cotação 1:1)
    }
}
