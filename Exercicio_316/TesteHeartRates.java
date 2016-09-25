/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio_316;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class TesteHeartRates {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome, sobrenome;
        nome = sobrenome = "";
        int dia, mes, ano;
        dia = mes = ano = 0;

        System.out.println("Informe seu nome: ");
        nome = scan.next();

        System.out.println("Informe seu sobrenome: ");
        sobrenome = scan.next();

        System.out.println("Informe o dia do seu nascimento: ");
        dia = scan.nextInt();

        System.out.println("Informe o mes do seu nascimento: ");
        mes = scan.nextInt();

        System.out.println("Informe o ano do seu nascimento: ");
        ano = scan.nextInt();

        HeartRates usuario = new HeartRates(nome, sobrenome, dia, mes, ano);

        Calendar c = Calendar.getInstance();
        int diaAtual = c.get(Calendar.DAY_OF_MONTH);
        int mesAtual = c.get(Calendar.MONTH) + 1;
        int anoAtual = c.get(Calendar.YEAR);

        int idade = anoAtual - ano;

        if (mes > mesAtual) {
            idade -= 1;
        }
        if (mes == mesAtual) {
            if (dia > diaAtual) {
                idade -= 1;
            }
        } else {
            idade = idade;
        }

        System.out.println("Olá " + usuario.getNome() + " " + usuario.getSobrenome()
                + "\n\nVocê nasceu em: " + usuario.getDia() + "/" + usuario.getMes() + "/" + usuario.getAno()
                + "\nSua idade é: " + idade + " anos."
                + "\nSua frequência cardíaca máxima é de " + usuario.maxFrequencia(idade) + " batimentos por minuto."
                + "\nE sua frequência cardíaca alvo varia entre " + usuario.freqAlvoMin(idade) + " - " + (float) usuario.freqAlvoMax(idade) + " batimentos por minuto.");

    }

}
