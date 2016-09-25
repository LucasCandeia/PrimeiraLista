/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio_316;

/**
 *
 * @author Lucas
 */
public class HeartRates {

    String nome;
    String sobrenome;
    int dia, mes, ano;

    public HeartRates(String name, String lastName, int day, int month, int year) {
        this.nome = name;
        this.sobrenome = lastName;
        this.dia = day;
        this.ano = year;
        this.mes = month;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int maxFrequencia(int idade) {
        int resultado;
        resultado = 220 - idade;
        return resultado;
    }

    public double freqAlvoMin(int idade) {
        double resultado;
        resultado = maxFrequencia(idade) * 0.5;
        return resultado;
    }

    public double freqAlvoMax(int idade) {
        double resultado;
        resultado = maxFrequencia(idade) * 0.85;
        return resultado;
    }
}
