package Exercicio_216;


import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aluno
 */
public class ComparaInt {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.print("Digite um número: ");
        int Numero1 = scan.nextInt();
        System.out.print("Digite mais um número: ");
        int Numero2 = scan.nextInt();

        if (Numero1 > Numero2) {
            System.out.println(Numero1 + " é o maior!");
        } else if (Numero1 < Numero2) {
            System.out.println(Numero2 + " é o maior!");
        } else {
            System.out.println("Os números são iguais!");
        }
    }
}
