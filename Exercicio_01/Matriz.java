/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio_01;

/**
 *
 * @author Lucas
 */
public class Matriz {

    public static void multMatriz(int[][] a, int[][] b) {
        int linhaB = a.length;
        int colunaA = b[0].length;
        int[][] mSaida = new int[linhaB][colunaA];

        for (int linha = 0; linha < linhaB; linha++) {
            for (int coluna = 0; coluna < colunaA; coluna++) {
                for (int i = 0; i < mSaida.length; i++) {
                    mSaida[linha][coluna] += a[linha][i] * b[i][coluna];
                }
            }
        }
        printMatriz(mSaida);
    }

    public static void printMatriz(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + "   ");
            }
            System.out.println("");
        }
    }

}
