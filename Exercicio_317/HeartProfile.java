/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio_317;

import java.util.Calendar;

/**
 *
 * @author Lucas
 */
public class HeartProfile {

    private String nome;
    private String sobrenome;
    private int dia;
    private int mes;
    private int ano;
    private String sexo;
    private double altura;
    private double peso;

    public HeartProfile(String nome, String sobrenome, int dia, int mes, int ano, String sexo, double altura, double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
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

    public int calcIdade() {

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

        return idade;
    }

    public double imc() {
        double valorImc = this.peso / (this.altura * this.altura);
        return valorImc;
    }

}
