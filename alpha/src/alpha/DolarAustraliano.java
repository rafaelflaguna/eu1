package alpha;

/**
 * Classe que representa o Dólar Australiano (AUD).
 * Estende a classe abstrata "Moeda" e define o comportamento
 * específico para o Dólar Australiano: exibição de informações e conversão para Reais.
 */
public class DolarAustraliano extends Moeda {

    // Cotação fixa: 1 Dólar Australiano = R$ 3,60
    private final double cotacao = 3.60;

    /**
     * Construtor da classe DolarAustraliano.
     *
     * @param valor quantidade de Dólares Australianos
     */
    public DolarAustraliano(double valor) {
        super(valor);
    }

    /**
     * Exibe as informações da moeda (símbolo A$ e valor em Dólares Australianos).
     */
    @Override
    public void info() {
        System.out.println("Dólar Australiano: A$ " + valor);
    }

    /**
     * Converte o valor da moeda para Reais (R$).
     *
     * @return valor em Dólares Australianos multiplicado pela cotação
     */
    @Override
    public double converter() {
        return valor * cotacao;
    }
}
