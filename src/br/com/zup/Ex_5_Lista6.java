package br.com.zup;

import java.util.Scanner;

public class Ex_5_Lista6 {
    public static void main(String[] args) {
        //Faça um programa que leia 5 números e informe o maior número.
        Scanner leitor = new Scanner(System.in);

        int qntNumeros = 5;
        int contador = 1;
        int maiorValor = 0;
        int numerosUsuario = 0;

        while (contador <= qntNumeros) {
            System.out.println("Digite um número" + contador + ":");
             numerosUsuario = leitor.nextInt();
            contador++;

            if (numerosUsuario >= maiorValor){ // se os numeros que irei receber do usuario for maior igual ao meu maior valor
                maiorValor = numerosUsuario; // o meu maior valor agora será igual aos números recebidos do usúario
            }                               // pois agora o meu maior valor será um dos números que o usuario digitar
        } System.out.println("O numéro maior é: " + maiorValor);
    }
}
