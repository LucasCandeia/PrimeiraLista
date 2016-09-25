package Exercicio_315;


import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aluno
 */
public class DateTeste {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o dia: ");
        int dia = scan.nextInt();

        System.out.print("Digite o mês: ");
        int mes = scan.nextInt();

        System.out.print("Digite o ano: ");
        int ano = scan.nextInt();
        
        Date data = new Date(dia, mes, ano);
        
        data.mostraDada();
    }
}
