package com.exemplo.agenda.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Classe responsável por criar a interface gráfica da Agenda de Contatos.
 * Inclui campos de entrada, botões e uma tabela para exibição dos dados.
 * 
 * @author SeuNome
 * @version 1.0
 */
public class AgendaView extends JFrame {
    private JTextField nomeField;
    private JTextField telefoneField;
    private JButton adicionarButton;
    private JButton atualizarButton;
    private JButton deletarButton;
    private JButton listarButton;
    private JTable tabelaContatos;
    private DefaultTableModel tableModel;

    public AgendaView() {
        setTitle("Agenda de Contatos");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel painelSuperior = new JPanel();
        painelSuperior.setLayout(new GridLayout(2, 4, 10, 10));

        painelSuperior.add(new JLabel("Nome:"));
        nomeField = new JTextField();
        painelSuperior.add(nomeField);

        painelSuperior.add(new JLabel("Telefone:"));
        telefoneField = new JTextField();
        painelSuperior.add(telefoneField);

        adicionarButton = new JButton("Adicionar");
        painelSuperior.add(adicionarButton);

        atualizarButton = new JButton("Atualizar");
        painelSuperior.add(atualizarButton);

        deletarButton = new JButton("Deletar");
        painelSuperior.add(deletarButton);

        listarButton = new JButton("Listar");
        painelSuperior.add(listarButton);

        add(painelSuperior, BorderLayout.NORTH);

        tabelaContatos = new JTable();
        tableModel = new DefaultTableModel(new Object[]{"ID", "Nome", "Telefone"}, 0);
        tabelaContatos.setModel(tableModel);
        add(new JScrollPane(tabelaContatos), BorderLayout.CENTER);

        setVisible(true);
    }

    public String getNome() {
        return nomeField.getText();
    }

    public String getTelefone() {
        return telefoneField.getText();
    }

    public void setTableData(Object[][] data) {
        tableModel.setRowCount(0);
        for (Object[] row : data) {
            tableModel.addRow(row);
        }
    }

    public void addAdicionarListener(ActionListener listener) {
        adicionarButton.addActionListener(listener);
    }

    public void addAtualizarListener(ActionListener listener) {
        atualizarButton.addActionListener(listener);
    }

    public void addDeletarListener(ActionListener listener) {
        deletarButton.addActionListener(listener);
    }

    public void addListarListener(ActionListener listener) {
        listarButton.addActionListener(listener);
    }
}
