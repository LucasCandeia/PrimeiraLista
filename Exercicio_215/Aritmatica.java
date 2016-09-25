/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio_215;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Aritmatica {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float a, b;

        System.out.println("Informe o primeiro número: ");
        a = scan.nextInt();

        System.out.println("Informe o segundo número: ");
        b = scan.nextInt();

        System.out.println("O resultado de " + a + " + " + b + " é: " + (a + b));
        System.out.println("O resultado de " + a + " - " + b + " é: " + (a - b));
        System.out.println("O resultado de " + a + " * " + b + " é: " + (a * b));
        System.out.println("O resultado de " + a + " / " + b + " é: " + (a / b));

    }
}
