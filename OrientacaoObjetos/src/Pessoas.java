// src/Pessoas.java
public abstract class Pessoas {
    protected String nome;
    protected String endereco;
    protected String telefone;

    public Pessoas(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public abstract void exibirDados();
}
