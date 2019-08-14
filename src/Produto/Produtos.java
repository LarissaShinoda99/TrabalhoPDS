package Produto;

/**
 *
 * Objetivo: Essa classe tem o objetivo de listar produtos e imprimir na tela os
 * produtos listados.
 *
 * Autor: Joycilene R. Gomes (joice.gomes6@gmail.com); Larissa C. Santos
 * (Larissa.csantos991@gmail.com)
 *
 * Data de criação: 05/08/2019 ################################### ´Última
 * Alteração:
 *
 * Analista: Joycilene e Larissa Data: 14/08/2019 Alteração: Tratamento de
 * exceções.
 *
 * ####################################
 *
 */
public class Produtos {

    /**
     * Objetivo: Executar os metodos na classe principal. ...
     */
    String PrimeiroMetodo() {
        // retorna uma lista de alimentos
        System.out.println("Listar Alimentos:");
        return "Carne, Arroz, feijão";

    }

    String SegundoMetodo() {
        // retorna uma lista de alimentos
        System.out.println("Listar Alimentos:");
        return "Batata doce, Frango, Requeijão";

    }

    String TerceiroMetodo() {
        // retorna uma lista de alimentos
        System.out.println("Listar Alimentos:");
        return "Bife, Cuscuz, Salame";

    }

    public static void main(String[] args) {
        //ExMet: estancia a classe Produtos para execução todos os metodos.
        Produtos ExMet = new Produtos();

        ExMet.PrimeiroMetodo(); //Imprimir o primeiro metodo.

        System.out.println(ExMet.SegundoMetodo()); //Comando para imprimir o 
        //segundo metodo. 

        System.out.println(ExMet.TerceiroMetodo());
        //Comando para imprimir o terceiro metodo.

    } //fim do main

    private boolean TerceiroMetodo(String larissa, String joycilene) {
        //tratamento de execeção
        throw new UnsupportedOperationException("Not supported yet."); //To 
                                             //change body of generated methods, 
                                            //choose Tools | Templates.
    } //fim do tratamento de exceções de operação.
}
