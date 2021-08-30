package br.com.zup;

import java.util.Scanner;

public class Ex3_ER {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // pedindo os numeros aos usuarios
        System.out.println("Por favor digite a quantidade de número desejado: ");
        double qntNumerosUsuario = leitor.nextDouble();

        //criando as variaveis
        double numeroDesejados;
        double soma = 0;
        int contador = 1;

        //iniciando o while
        while (contador <= qntNumerosUsuario){
            System.out.println("Digite o número " + contador);
            numeroDesejados = leitor.nextDouble();

            soma = soma + numeroDesejados;
            contador ++;
        }
        System.out.println("Soma dos números escolhidos é de: " + soma);

    }
}
