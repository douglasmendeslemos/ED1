package org.example;

import java.util.Scanner;
import java.util.Stack;

public class Console {

    Scanner leia = new Scanner(System.in);
    Stack<String> pilhaDeLivros = new Stack<>();

    boolean opcaoEscolhida = true;
    int opcao = -1;

    public void menuOpcoes(){
        System.out.println("1. Colocar livro ");
        System.out.println("2. Retirar livro");
        System.out.println("3. Ver título do livro do topo da pilha ");
        System.out.println("4. Quantidade de livros que estão empilhados ");
        System.out.println("5. Mostrar todos os títulos de livros que estão empilhados. ");
        System.out.print("Para sair digite 0: ");
        opcao = leia.nextInt();
    }

    public int principal(){
        do{
            menuOpcoes();
            switch (opcao) {
                case 0:
                    System.out.println("Saindo do programa. Até mais!");
                    break;
                case 1:
                    colocarLivro();
                    break;
                case 2:
                    retirarLivro();
                    break;
                case 3:
                    verificarTopo();
                    break;
                case 4:
                    verificarQTDeLivro();
                    break;
                case 5:
                    mostrarObjetos();
                    break;
                default:
                    System.out.println("!! ERRO: Opção inválida. Informe novamente!!");
                    break;
            }
        }while(opcao != 0);
        return opcao;
    }

    public void colocarLivro() {
        System.out.println("Digite o nome do livro: ");
        String nomeLivro = leia.next();
        pilhaDeLivros.push(nomeLivro);
        System.out.println("Livro \"" + nomeLivro + "\" adicionado com sucesso!");
    }

    public void retirarLivro() {
        System.out.println("\"" + pilhaDeLivros.peek() + " saiu da pilha.");
        pilhaDeLivros.pop();
    }
    public void verificarTopo(){
        System.out.println("O livro" + pilhaDeLivros.peek() + "está no TOPO da pilha.");
    }

    public boolean verificarVazia(){
        return pilhaDeLivros.isEmpty();
    }

    public int verificarQTDeLivro(){
        if (verificarVazia()) {
            System.out.println(">> A pilha está vazia.");
        } else {
            return pilhaDeLivros.size();
        }
        return 0;
    }

    public void mostrarObjetos(){
        System.out.println("--- Livros Empilhados (do topo para a base) ---");
        for (String livro : pilhaDeLivros) {
            System.out.println("- " + livro);
        }
        System.out.println("----------------------------------------------");
    }
}
