package domain;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private String cpf;
    private int idade;

    public Pessoa(String nome, String sobrenome, String cpf, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf.substring(0, 3) + "." + cpf.substring(2, 5) + "." + cpf.substring(5, 8) + "-" + cpf.charAt(9) + cpf.charAt(10);
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
