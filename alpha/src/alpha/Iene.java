package alpha;

/**
 * Classe que representa o Iene Japonês (JPY).
 * Estende a classe abstrata "Moeda" e define o comportamento
 * específico para o Iene: exibição de informações e conversão para Reais.
 */
public class Iene extends Moeda {

    // Cotação fixa: 1 Iene Japonês = R$ 0,033
    private final double cotacao = 0.033;

    /**
     * Construtor da classe Iene.
     *
     * @param valor quantidade de Ienes Japonês
     */
    public Iene(double valor) {
        super(valor);
    }

    /**
     * Exibe as informações da moeda (símbolo ¥ e valor em Ienes).
     */
    @Override
    public void info() {
        System.out.println("Iene Japonês: ¥ " + valor);
    }

    /**
     * Converte o valor da moeda para Reais (R$).
     *
     * @return valor em Ienes multiplicado pela cotação
     */
    @Override
    public double converter() {
        return valor * cotacao;
    }
}
