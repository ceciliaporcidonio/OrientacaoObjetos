// src/Main.java
public class Main {
    public static void main(String[] args) {
        // Criando uma pessoa física
        PessoaFisica pf = new PessoaFisica("Ana", "Rua A, 123", "1234-5678", "111.222.333-44", "01/01/1990");
        pf.exibirDados();
        System.out.println();

        // Criando uma pessoa jurídica
        PessoaJuridica pj = new PessoaJuridica("Empresa XYZ", "Rua B, 456", "9876-5432", "12.345.678/0001-90", "XYZ Ltda.");
        pj.exibirDados();
    }
}
