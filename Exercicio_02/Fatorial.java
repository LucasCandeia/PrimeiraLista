/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio_02;

/**
 *
 * @author Lucas
 */
public class Fatorial {

    public static void fatorial(int n) {

        if (n < 0) {
            System.out.println("Fatorial inválido!");

        } else {
            int fat = 1;
            int aux = n;
            while (aux >= 1) {
                fat *= aux;
                aux -= 1;
            }
            System.out.println("O fatorial de " + n + " é: " + fat);
        }

    }

    public static void main(String[] args) {
        fatorial(-2);

    }

}
