package br.com.zup;

import java.util.Scanner;

public class Ex_7_Lista6 {
    public static void main(String[] args) {
//        Faça um programa que receba dois números inteiros e gere os números inteiros que
//        estão no intervalo compreendido por eles.
        Scanner leitor = new Scanner(System.in);
        System.out.println(" Por favor digite o primeiro número: ");
        int num1 = leitor.nextInt();
        System.out.println("Por favor digite o segundo número: ");
        int num2 = leitor.nextInt();


        while (num1 <= num2){
            System.out.println(num1); // o meu contador vai ser o num1. O meu num1 vai fica rno loop até chegar no menor
            num1++;                   // igual ao num2. Aí meu loop para e me printa o intervalo desses numeros
                                    // Ex: Se o num1 = 5 e num2 = 10. Ele me printa o intervalo de 5 até 10.
        }
    }
}
