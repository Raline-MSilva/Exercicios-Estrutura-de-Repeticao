package br.com.zup;

public class Ex_6_Lista6 {
    public static void main(String[] args) {
        for (int contador = 1; contador <= 50; contador++){
            if (contador % 2 != 0){
                System.out.println(contador);
            }
        }
    }
}

// Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.
// iniciei o for com a variavel contador iniciando em 1. Depois coloquei o contador menor igual a 50, e
// meu contador irá ficar no loop até chegar em 50
// mas como quero os números ímpares, se o resto da divisão for diferente igual a zero me mostre os ímpares no contador.