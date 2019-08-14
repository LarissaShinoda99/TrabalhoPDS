package Metodos2;

/**
 *
 * Objetivo: Essa classe tem o objetivo de imprimir na tela uma msg ao ser
 * executada.
 *
 * Autor: Joycilene R. Gomes (joice.gomes6@gmail.com); Larissa C. Santos
 * (Larissa.csantos991@gmail.com)
 *
 * Data de criação: 05/08/2019 ################################### ´Última
 * Alteração:
 *
 * Analista: Joycilene e Larissa Data: 14/08/2019 Alteração: Teste, apenas.
 *
 * ####################################
 *
 */
public class Metodos2 {

    /**
     * Objetivo: Executar os metodos na classe principal. ...
     */
    void PrimeiroMetodo() {
        // System: comando para exibir mensagem.
        System.out.println("Exemplo de método sem retorno");

    }

    String SegundoMetodo() {
        //System: comando para exibir mensagem.
        System.out.println("Exemplo de método com retorno");
        return "Método OK"; //retornando a mensagem.

    }

    String TerceiroMetodo(String nome, String sobrenome) {
        //System: comando para exibir mensagem.
        System.out.println("Exemplo de método com parâmetro e com retorno");

        return nome + " " + sobrenome; //rentornando mensagem com parametros.

    }

    public static void main(String[] args) {
        //ExMet: estancia a classe ExemplosMetodos para execução todos os metodos.
        Metodos2 ExMet = new Metodos2();

        ExMet.PrimeiroMetodo();//Imprimir o primeiro metodo.

        System.out.println(ExMet.SegundoMetodo());//Comando para imprimir o 
        //segundo metodo.

        System.out.println(ExMet.TerceiroMetodo("Larissa", "Joycilene"));
        //Comando para imprimir o terceiro metodo.
    } //fim do main()

}
