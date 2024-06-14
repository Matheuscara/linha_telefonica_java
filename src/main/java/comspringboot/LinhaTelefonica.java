package comspringboot;

import comspringboot.entidades.Cliente;
import comspringboot.interfaces.Consumo;

public abstract class LinhaTelefonica implements Consumo {
    protected int qtdMinutosGastos;
    protected String numero;
    private Cliente cliente;

    public LinhaTelefonica(int qtdMinutosGastos, String numero) {
        setQtdMinutosGastos(qtdMinutosGastos);
        this.numero = numero;
    }

    public int getQtdMinutosGastos() {
        return qtdMinutosGastos;
    }

    public void setQtdMinutosGastos(int qtdMinutosGastos) {
        if (qtdMinutosGastos < 0) {
            throw new IllegalArgumentException("Quantidade de minutos gastos não pode ser negativa");
        }
        this.qtdMinutosGastos = qtdMinutosGastos;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public abstract float calcular();

    @Override
    public String toString() {
        return "Número: " + numero + ", Minutos Gastos: " + qtdMinutosGastos;
    }
}
