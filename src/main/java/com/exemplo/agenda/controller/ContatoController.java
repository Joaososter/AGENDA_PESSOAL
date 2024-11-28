package com.exemplo.agenda.controller;

import com.exemplo.agenda.model.ContatoModel;
import com.exemplo.agenda.view.AgendaView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Classe responsável pelo controle das operações entre a View e o Model.
 * Integra a interface gráfica e a lógica do programa.
 * 
 * @author SeuNome
 * @version 1.0
 */
public class ContatoController {
    private ContatoModel model;
    private AgendaView view;

    public ContatoController() {
        this.model = new ContatoModel();
        this.view = new AgendaView();

        // Adicionar listeners aos botões
        view.addAdicionarListener(new AdicionarContatoListener());
        view.addListarListener(new ListarContatoListener());
        view.addDeletarListener(new DeletarContatoListener());
    }

    // Listener para adicionar contato
    class AdicionarContatoListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String nome = view.getNome();
            String telefone = view.getTelefone();
            if (!nome.isEmpty() && !telefone.isEmpty()) {
                model.adicionarContato(nome, telefone);
                JOptionPane.showMessageDialog(view, "Contato adicionado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(view, "Por favor, preencha todos os campos.");
            }
        }
    }

    // Listener para listar contatos
    class ListarContatoListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Object[][] data = model.obterContatos().stream()
                .map(contato -> new Object[]{contato.hashCode(), contato.split(" - ")[0], contato.split(" - ")[1]})
                .toArray(Object[][]::new);

            view.setTableData(data);
        }
    }

    // Listener para deletar contato
    class DeletarContatoListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String nome = view.getNome();
            if (!nome.isEmpty()) {
                model.removerContato(nome);
                JOptionPane.showMessageDialog(view, "Contato removido com sucesso!");
            } else {
                JOptionPane.showMessageDialog(view, "Por favor, informe o nome do contato a ser removido.");
            }
        }
    }
}
