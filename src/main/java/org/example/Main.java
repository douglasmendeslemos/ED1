package org.example;

import java.util.Scanner;

public class Main {
    static void main() {
        Console console = new Console();
        Validacao validacao = new Validacao();
        //console.principal();
        validacao.processarString("abc##a##");
    }
}

