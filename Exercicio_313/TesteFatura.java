package Exercicio_313;


import Exercicio_313.Fatura;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class TesteFatura {
    public static void main(String[] args){
        Fatura f = new Fatura("1", "dfasdfadsfasdf", 5, 50.0);
        System.out.println("Número: " + f.getNumero());
        System.out.println("Descrição: " + f.getDescricao());
        System.out.println("Preço: " + f.getPreco());
        System.out.println("Quantidade: " + f.getQuantidade());
        System.out.println("Total da fatura: " + f.total());
        
        f.setNumero("2");
        f.setDescricao("abc");
        f.setPreco(100.0);
        f.setQuantidade(5);
        
        System.out.println("\n\n\n\n\n");
        
        System.out.println("Número: " + f.getNumero());
        System.out.println("Descrição: " + f.getDescricao());
        System.out.println("Preço: " + f.getPreco());
        System.out.println("Quantidade: " + f.getQuantidade());
        System.out.println("Total da fatura: " + f.total());
        
    }
    
}
