package org.example;

import java.util.ArrayDeque;

public class Validacao {
    /*Requisitos:
    Processar os comandos na ordem em que aparecem
    Ignorar '#'(Representa um backspace) quando não há caracteres para deletar
    Retornar o texto final como uma String
    Considerar qualquer caractere alfanumérico como válido para inserção
    Implemente uma solução que receba uma String contendo a sequência de comandos
    e retorne a String resultante após processar todos os comandos.*/


    public String processarString(String texto) {
        ArrayDeque<Character> comando = new ArrayDeque();

        for (char c : texto.toCharArray()) {
            if (c == '#') {
                if (!comando.isEmpty()) {
                    comando.pop(); // remove o último caractere inserido
                }
            } else if (Character.isLetterOrDigit(c)) {
                comando.push(c); // insere o caractere
            }
        }

        StringBuilder resultado = new StringBuilder();
        while (!comando.isEmpty()) {
            resultado.append(comando.removeLast()); // remove do fim para manter a ordem original
        }
        System.out.println(resultado);
        return resultado.toString();
    }

}
