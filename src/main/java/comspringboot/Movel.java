package comspringboot;

public class Movel extends LinhaTelefonica {
    private boolean planoDeDadosHabilitado;
    private static final float CUSTO_MINUTO = 0.20f;
    private static final float CUSTO_PLANO_DE_DADOS = 40.00f;

    public Movel(int qtdMinutosGastos, String numero, boolean planoDeDadosHabilitado) {
        super(qtdMinutosGastos, numero);
        this.planoDeDadosHabilitado = planoDeDadosHabilitado;
    }

    @Override
    public float calcular() {
        float custo = qtdMinutosGastos * CUSTO_MINUTO;
        if (planoDeDadosHabilitado) {
            custo += CUSTO_PLANO_DE_DADOS;
        }
        return custo;
    }

    public boolean isPlanoDeDadosHabilitado() {
        return planoDeDadosHabilitado;
    }

    public void setPlanoDeDadosHabilitado(boolean planoDeDadosHabilitado) {
        this.planoDeDadosHabilitado = planoDeDadosHabilitado;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo: Movel, Plano de Dados: " + planoDeDadosHabilitado + ", Valor Total: R$ " + calcular();
    }
}
