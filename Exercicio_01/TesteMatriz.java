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
public class TesteMatriz {
    public static void main(String[] args) {
        int[][] a = new int[2][2];
        a[0][0] = 5;
        a[0][1] = 1;
        a[1][0] = 3;
        a[1][1] = 2;



        int[][] b = new int[2][4];

        b[0][0] = 0;
        b[0][1] = 5;
        b[0][2] = 1;
        b[0][3] = 6;

        b[1][0] = 2;
        b[1][1] = -1;
        b[1][2] = 4;
        b[1][3] = -3;


        Matriz.multMatriz(a, b);
    }
}
