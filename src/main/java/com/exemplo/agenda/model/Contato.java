package com.exemplo.agenda.model;

/**
 * Classe que representa um contato da agenda.
 * Contém os atributos nome e telefone.
 * 
 * @author SeuNome
 * @version 1.0
 */
public class Contato {
    private String nome;
    private String telefone;

    public Contato() {}

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
