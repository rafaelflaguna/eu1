package alpha;

/**
 * Classe abstrata que representa uma Moeda genérica.
 * Serve como base (molde) para todas as moedas do sistema (Real, Dólar, Euro, etc.).
 * Contém o valor da moeda e métodos que cada moeda concreta deve implementar.
 */
public abstract class Moeda {

    // Valor da moeda (quantidade). Protegido para acessível pelas subclasses.
    protected double valor;

    /**
     * Construtor da classe Moeda.
     *
     * @param valor quantidade da moeda
     */
    public Moeda(double valor) {
        this.valor = valor;
    }

    /**
     * Retorna o valor da moeda.
     *
     * @return o valor da moeda
     */
    public double getValor() {
        return valor;
    }

    /**
     * Compara duas moedas para verificar se são iguais.
     * Duas moedas são consideradas iguais quando são da MESMA classe (mesmo tipo)
     * e possuem o MESMO valor. Isso garante que a remoção de moedas no cofrinho
     * funcione corretamente ao comparar objetos criados separadamente.
     *
     * @param obj objeto a ser comparado
     * @return true se as moedas forem do mesmo tipo e valor, false caso contrário
     */
    @Override
    public boolean equals(Object obj) {
        // Mesma referência (o mesmo objeto na memória)
        if (this == obj)
            return true;

        // Objeto nulo ou de outra classe (não é uma moeda comparável)
        if (obj == null || getClass() != obj.getClass())
            return false;

        // Converte para Moeda e compara os valores
        Moeda outra = (Moeda) obj;
        return Double.compare(valor, outra.valor) == 0;
    }

    /**
     * Gera o código hash da moeda combinando a classe (tipo) com o valor.
     * É obrigatório sobrescrever hashCode() junto com equals() para manter
     * a consistência exigida pelo Java.
     *
     * @return código hash calculado
     */
    @Override
    public int hashCode() {
        // Combina o hash da classe (tipo) com o hash do valor
        return 31 * getClass().hashCode() + Double.hashCode(valor);
    }

    /**
     * Método abstrato para exibir informações da moeda.
     * Cada moeda concreta deve implementar a sua forma de exibição.
     */
    public abstract void info();

    /**
     * Método abstrato para converter o valor da moeda para Reais (R$).
     * Cada moeda concreta deve implementar a sua conversão.
     *
     * @return valor convertido para Reais
     */
    public abstract double converter();
}
