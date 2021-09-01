package br.com.zup;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // pedindo ao usuario o numero que deseja
        System.out.println("Olá, digite o número da tabuada que você deseja ver: ");
        int numeroEscolhido = leitor.nextInt();

        // criando variaveis
        int contador = 1;
        //num + " x " + contador + "=" + calculo
        // iniciando o while
        while (contador <= 10){
            System.out.println(numeroEscolhido+ " X " + contador + "=" + numeroEscolhido * contador);
            contador ++;
        }
    }
}
