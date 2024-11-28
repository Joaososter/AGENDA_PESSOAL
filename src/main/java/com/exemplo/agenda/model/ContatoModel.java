package com.exemplo.agenda.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsável por gerenciar os dados dos contatos.
 * Armazena e manipula as informações.
 * 
 * @author SeuNome
 * @version 1.0
 */
public class ContatoModel {
    private List<String> contatos;

    public ContatoModel() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(String nome, String telefone) {
        contatos.add(nome + " - " + telefone);
    }

    public List<String> obterContatos() {
        return contatos;
    }

    public void removerContato(String nome) {
        contatos.removeIf(contato -> contato.startsWith(nome + " -"));
    }
}
