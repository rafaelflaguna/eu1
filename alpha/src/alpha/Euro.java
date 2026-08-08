package alpha;

/**
 * Classe que representa o Euro (EUR).
 * Estende a classe abstrata "Moeda" e define o comportamento
 * específico para o Euro: exibição de informações e conversão para Reais.
 */
public class Euro extends Moeda {

    // Cotação fixa: 1 Euro = R$ 6,20
    private final double cotacao = 6.20;

    /**
     * Construtor da classe Euro.
     *
     * @param valor quantidade de Euros
     */
    public Euro(double valor) {
        super(valor); // Chama o construtor da classe pai (Moeda)
    }

    /**
     * Exibe as informações da moeda (símbolo € e valor em Euros).
     */
    @Override
    public void info() {
        System.out.println("Euro: € " + valor);
    }

    /**
     * Converte o valor da moeda para Reais (R$).
     *
     * @return valor em Euros multiplicado pela cotação
     */
    @Override
    public double converter() {
        return valor * cotacao;
    }
}
