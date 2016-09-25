/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio_230;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class SeparaDigitos {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um número de 5 dígitos: ");
        int num = scan.nextInt();
        int dig1, dig2, dig3, dig4, dig5;
        dig1 = dig2 = dig3 = dig4 = dig5 = 0;
        if ((num > 9999) && (num < 100000)) {

            dig1 = num / 10000;
            num = (num % 10000);
            dig2 = num / 1000;
            num = num % 1000;
            dig3 = num / 100;
            num = num % 100;
            dig4 = num / 10;
            num = num % 10;
            dig5 = num;
            System.out.println(dig1 + "   " + dig2 + "   " + dig3 + "   " + dig4 + "   " + dig5);
        } else {
            System.out.println("Número inválido!");
        }

    }

}
