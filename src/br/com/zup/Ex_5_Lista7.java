package br.com.zup;

public class Ex_5_Lista7 {
    public static void main(String[] args) {
//        Escreva um programa que declare um inteiro, inicialize-o com 0, e incremente-o de 1000 em 1000,
//            imprimindo seu valor na tela, até que seu valor seja 100000 (cem mil).

        // criando variavel contador
        int contador = 0;

        // iniciando o while
        while (contador <= 100000) {
            System.out.println(contador);
            contador = contador + 1000;
            //contador inicia com 0, depois passa a iniciar com 1000 + 1000, até chegar 100000.
        }

    }
}
