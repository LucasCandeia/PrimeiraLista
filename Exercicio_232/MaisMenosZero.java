package Exercicio_232;


import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aluno
 */
public class MaisMenosZero {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maior = 0;
        int menor = 0;
        int zero = 0;


        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            int num = scan.nextInt();

            if (num == 0) {
                zero++;
            } else if (num > 0) {
                maior++;
            } else {
                menor++;
            }
        }
        System.out.println("A quantidade de números maiores que zero é: " + maior);
        System.out.println("A quantidade de números menores que zero é: " + menor);
        System.out.println("A quantidade de números zero é: " + zero);
    }
}
