package com.exemplo.agenda.view;

import java.util.List;
import java.util.Scanner;

/**
 * Classe responsável por exibir informações e interagir com o usuário.
 * Gerencia a entrada e saída de dados.
 * 
 * @author SeuNome
 * @version 1.0
 */
public class ContatoView {
    private Scanner scanner;

    public ContatoView() {
        this.scanner = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Adicionar Contato");
        System.out.println("2. Listar Contatos");
        System.out.println("3. Remover Contato");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    public String lerNome() {
        System.out.print("Digite o nome: ");
        scanner.nextLine(); // Consumir nova linha
        return scanner.nextLine();
    }

    public String lerTelefone() {
        System.out.print("Digite o telefone: ");
        return scanner.nextLine();
    }

    public void mostrarContatos(List<String> contatos) {
        System.out.println("\nLista de Contatos:");
        for (String contato : contatos) {
            System.out.println(contato);
        }
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
