package br.com.zup;

import java.util.Scanner;

public class Ex_4_Lista7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
//        Faça um programa que leia n números inteiros positivos e calcule a soma desses números.

        //pegando os numeros do usuario
        System.out.println("Por favor digite os numeros que deseja: ");
        int numerosEscolhidos = leitor.nextInt();

        // variaveis
        int soma = 0;
        int numerosUsuario = 0;
        int contador = 1;

//      iniciando o while com uma estrutura de condição
        while (contador <= numerosEscolhidos){
            System.out.println("Digite o número" +contador+ ": ");
            numerosUsuario = leitor.nextInt();

            if (numerosUsuario < 0){
                System.out.println("Valor inválido, favor digite um número válido" + contador + " : ");
            }
            else {
                soma = soma + numerosUsuario;
                contador++;
            }
        }
        System.out.println("A soma dos seus números é de: " + soma);
    }
}
