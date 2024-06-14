package comspringboot;

public class Fixa extends LinhaTelefonica {
    public static final int FRANQUIA = 30;
    private static final float VALOR_ASSINATURA = 45.00f;
    private static final float CUSTO_MINUTO_EXCEDENTE = 0.05f;

    public Fixa(int qtdMinutosGastos, String numero) {
        super(qtdMinutosGastos, numero);
    }

    @Override
    public float calcular() {
        if (getQtdMinutosGastos() <= FRANQUIA) {
            return VALOR_ASSINATURA;
        } else {
            int minutosExcedentes = getQtdMinutosGastos() - FRANQUIA;
            return VALOR_ASSINATURA + calcular(minutosExcedentes);
        }
    }

    public float calcular(int minutosExcedentes) {
        return minutosExcedentes * CUSTO_MINUTO_EXCEDENTE;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo: Fixa, Valor Total: R$ " + calcular();
    }
}
