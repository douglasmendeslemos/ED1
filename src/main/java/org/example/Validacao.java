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
        StringBuilder resultado = new StringBuilder();
        for (char c : texto.toCharArray()) {
            if (c == '#') {
                if (!comando.isEmpty())
                    comando.pop(); // remove o último caractere inserido
            } else if (Character.isLetterOrDigit(c))
                comando.push(c); // insere o caractere
            //System.out.println(c); para verificar se tem algo do texto zerando tudo e saindo branco
        }
        while (!comando.isEmpty())
            resultado.append(comando.removeLast()); // remove do fim para manter a ordem original
        System.out.println(resultado);
        return resultado.toString();
    }


    public void ApagarHashtag(String texto) {
        //String entrada = "abc#d#12#x";
        StringBuilder sb = new StringBuilder();
        for (char c : texto.toCharArray()) {
            if (c == '#') {// Se houver # deve apagar o último caracterer inserido
                if (!sb.isEmpty())
                    sb.deleteCharAt(sb.length() - 1);
            } else
                sb.append(c); // adiciona caractere normal
        }
        System.out.println(sb.toString());
    }

}
