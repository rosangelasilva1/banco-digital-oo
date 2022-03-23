package br.com.desafios.dominio;

public class Cliente {
    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    private String nome;
}

