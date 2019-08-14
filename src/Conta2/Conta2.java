package Conta2;

/**
 *
 * Objetivo: Essa classe tem o objetivo de imprimir o saldo;
 *
 * Autor: Joycilene R. Gomes (joice.gomes6@gmail.com); Larissa C. Santos
 * (Larissa.csantos991@gmail.com)
 *
 * Data de criação: 05/08/2019 ################################### ´Última
 * Alteração:14/08/2019 as 14:22
 *
 * Analista: Joycilene e Larissa Data: 14/08/2019 Alteração: Teste, apenas.
 *
 * ####################################
 *
 */
public class Conta2 {

    /**
     * Objetivo: Executar os metodos na classe principal. ...
     */
    public static void main(String[] args) {
        System.out.println("Conta:");
    }

    private float saldo; // atributo privado da classe ContaCorrente.
    // metodo usado para resgatar o valor da variavel "saldo".

    public float getSaldo() {
        return saldo; //retornando o saldo
    }

    // metodo usado para setar(modificar) o valor da variavel "saldo".
    public float setSaldo(float novoSaldo) {
        saldo = novoSaldo; // saldo recebe um novo saldo.
        return novoSaldo; // imprime um novo saldo.
    }

}
