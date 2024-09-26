// src/PessoaFisica.java
public class PessoaFisica extends Pessoas {
    private String cpf;
    private String dataNascimento;

    public PessoaFisica(String nome, String endereco, String telefone, String cpf, String dataNascimento) {
        super(nome, endereco, telefone);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("CPF: " + cpf);
        System.out.println("Data de Nascimento: " + dataNascimento);
    }
}
