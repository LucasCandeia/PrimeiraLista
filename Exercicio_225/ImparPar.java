package Exercicio_225;


import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aluno
 */
public class ImparPar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scan.nextInt();

        if (num % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O númro é ímpar");
        }
    }
}
