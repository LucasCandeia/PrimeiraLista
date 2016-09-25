package Exercicio_317;


import Exercicio_317.HeartProfile;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lucas
 */
public class TesteHeartProfile {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        String sobrenome;
        int dia;
        int mes;
        int ano;
        String sexo;
        double altura;
        double peso;

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

        System.out.println("Informe o sexo: ");
        sexo = scan.next();
        
        System.out.println("Informe a altura: ");
        altura = scan.nextDouble();
        
        System.out.println("Informe o peso: ");
        peso = scan.nextDouble();


        HeartProfile usuario = new HeartProfile(nome, sobrenome, dia, mes, ano, sexo, altura, peso);

        System.out.println("\n\nOlá " + usuario.getNome() + " " + usuario.getSobrenome()
                + "\nSeu sexo é: " + usuario.getSexo()
                + "\nVocê nasceu em: " + usuario.getDia() + "/" + usuario.getMes() + "/" + usuario.getAno()
                + "\nSua altura é: " + usuario.getAltura()
                + "\nSeu peso é: " + usuario.getPeso()
                + "\nSua idade é: " + usuario.calcIdade() + " anos"
                + "\nO seu IMC é: " + usuario.imc()
                + "\nSua frequência cardíaca máxima é de " + usuario.maxFrequencia(usuario.calcIdade()) + " batimentos por minuto."
                + "\nSua sua frequência cardíaca alvo varia entre " + usuario.freqAlvoMin(usuario.calcIdade()) + " - " + (float) usuario.freqAlvoMax(usuario.calcIdade()) + " batimentos por minuto."
                + "\n\n"
                + " _____________________________"
                + "\n|Tabela IMC                   |"  
                + "\n|Baixo - menor que 18,5       |"
                + "\n|Normal - entre 18,5 e 24,9   |" 
                + "\n|Alto - entre 25 e 29,9       |"
                + "\n|Obeso - maior que 30         |\n"
                + " _____________________________");

    }

}
