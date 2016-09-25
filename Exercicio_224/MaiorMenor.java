package Exercicio_224;


import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aluno
 */
public class MaiorMenor {

    public static void Metodo1() {
        Scanner scan = new Scanner(System.in);
        int maior = 0;
        int menor = 0;

        System.out.print("Digite um número: ");
        int N1 = scan.nextInt();

        System.out.print("Digite um número: ");
        int N2 = scan.nextInt();

        System.out.print("Digite um número: ");
        int N3 = scan.nextInt();

        System.out.print("Digite um número: ");
        int N4 = scan.nextInt();

        System.out.print("Digite um número: ");
        int N5 = scan.nextInt();

        maior = N1;
        menor = N1;

        if (maior < N2) {
            maior = N2;
        }
        if (maior < N3) {
            maior = N3;
        }
        if (maior < N4) {
            maior = N4;
        }
        if (maior < N5) {
            maior = N5;
        }

        if (menor > N2) {
            menor = N2;
        }
        if (menor > N3) {
            menor = N3;
        }
        if (menor > N4) {
            menor = N4;
        }
        if (menor > N5) {
            menor = N5;
        }

        System.out.println("O maior é: " + maior);
        System.out.println("O menor é: " + menor);
    }

    public static void Metodo2() {
        int[] numeros = new int[5];
        Scanner scan = new Scanner(System.in);
        int maior = 0;
        int menor = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = scan.nextInt();
        }
        maior = numeros[0];
        menor = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (maior < numeros[i]) {
                maior = numeros[i];
            }
            if (menor > numeros[i]) {
                menor = numeros[i];
            }
        }
        System.out.println("O maior é: " + maior);
        System.out.println("O menor é: " + menor);
    }

    public static void main(String[] args) {
        Metodo2();
    }
}
