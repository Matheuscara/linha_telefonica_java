package comspringboot.entidades;

import comspringboot.LinhaTelefonica;

import java.util.List;
import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String endereco;
    private List<LinhaTelefonica> linhasTelefonicas;

    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.linhasTelefonicas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<LinhaTelefonica> getLinhasTelefonicas() {
        return linhasTelefonicas;
    }

    public void adicionarLinhaTelefonica(LinhaTelefonica linhaTelefonica) {
        linhaTelefonica.setCliente(this);
        this.linhasTelefonicas.add(linhaTelefonica);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente: ").append(nome)
                .append("\nEndereço: ").append(endereco)
                .append("\nLinhas Telefônicas:\n");
        for (LinhaTelefonica linha : linhasTelefonicas) {
            sb.append(linha).append("\n");
        }
        return sb.toString();
    }
}