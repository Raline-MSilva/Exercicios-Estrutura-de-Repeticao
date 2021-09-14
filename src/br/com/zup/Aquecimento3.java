package br.com.zup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Aquecimento3 {
    /*Crie um programa para gerenciar o cardápio de um restaurante. Cada prato tem um nome e pode conter diversos
    ingredientes. No final do programa, o usuário deve decidir se irá adicionar mais de um prato, exibir todos os pratos
    cadastrados ou excluir um prato pelo nome.
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Map<String, String> cardapio = new HashMap<String, String>();

        System.out.println("Olá, bem vindo ao Restaurante Cactus!");

        int opcaoDesejada = 0;
        boolean chaveDesejada = true;

        while (chaveDesejada){
            System.out.println("Digite 1: Para cadastrar um prato");
            System.out.println("Digite 2: Para exibir a lista de pratos cadastrados");
            System.out.println("Digite 3: Para excluir um prato pelo nome");
            System.out.println("Digite 4: Para sair");
            opcaoDesejada = leitor.nextInt();
            leitor.nextLine();

            if (opcaoDesejada == 1){
                System.out.println("Digite o nome do prato: ");
                String nomePrato = leitor.nextLine();
                System.out.println("Escolha os ingredientes: ");
                System.out.println("Separe os ingridientes que deseja com uma vírgula");
                String ingridientes = leitor.nextLine();
                cardapio.put(nomePrato, ingridientes);
            }
            else if (opcaoDesejada == 2) {
                for (String listaPratos:cardapio.keySet()) {
                    System.out.println(listaPratos + ":\t\t" + cardapio.get(listaPratos));
                }
            }
            else if (opcaoDesejada == 3) {
                System.out.println("Digite o nome do prato que deseja deletar");
                String deletarPrato = leitor.nextLine();
                System.out.println("Prato deletado com sucesso!");
                cardapio.remove(deletarPrato);
            }
            else if (opcaoDesejada == 4){
                System.out.println("Você saiu do Programa");
                chaveDesejada = false;
            }
            else {
                System.out.println("Favor digite umas das opções do Menu!");
            }

        }
    }
}
