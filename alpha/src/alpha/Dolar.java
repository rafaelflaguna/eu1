package alpha;

/**
 * Classe que representa o Dólar Americano (USD).
 * Estende a classe abstrata "Moeda" e define o comportamento
 * específico para o Dólar: exibição de informações e conversão para Reais.
 */
public class Dolar extends Moeda {

    // Cotação fixa: 1 Dólar Americano = R$ 5,50
    private final double cotacao = 5.50;

    /**
     * Construtor da classe Dolar.
     *
     * @param valor quantidade de Dólares Americanos
     */
    public Dolar(double valor) {
        super(valor); // Chama o construtor da classe pai (Moeda)
    }

    /**
     * Exibe as informações da moeda (símbolo US$ e valor em Dólares).
     */
    @Override
    public void info() {
        System.out.println("Dólar: US$ " + valor);
    }

    /**
     * Converte o valor da moeda para Reais (R$).
     *
     * @return valor em Dólares multiplicado pela cotação
     */
    @Override
    public double converter() {
        return valor * cotacao;
    }
}
