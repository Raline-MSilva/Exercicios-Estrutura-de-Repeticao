package br.com.zup;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Aquecimento1 {
    public static void main(String[] args) {
        /*Crie um programa para gerenciar uma lista de produtos de um estabelecimento, cada produto tem um nome e um preço.
        No final do programa, o usuário deve decidir se irá adicionar mais de um produto, exibir todos os produtos
        cadastrados ou excluir um produto pelo nome.
         */

        Scanner leitor = new Scanner(System.in);
        Map<String, Double> produtos = new HashMap<String, Double>();

        System.out.println("Olá, seja bem vindo ao sistema de casdastro de produtos!");

        int chaveDesejada = 0;
        int opcaoDesejada = 0;

// criando o menu
        while (chaveDesejada == 0) {
            System.out.println("Digite 1: Para cadastrar um novo produto e o seu preço");
            System.out.println("Digite 2: Para mostrar a lista de produtos já cadastrados");
            System.out.println("Digite 3: Para excluir um produto");
            System.out.println("Digite 4: Para sair do sistema");
            opcaoDesejada = leitor.nextInt();
            leitor.nextLine();

            switch (opcaoDesejada) {
                case 1: {
                    System.out.println("Digite o nome do produto:");
                    String nome = leitor.nextLine();
                    System.out.println("Digite o preço do produto:");
                    Double preco = leitor.nextDouble();
                    produtos.put(nome, preco);
                    break;
                }
                case 2: {
                    for (String lista:produtos.keySet()) {
                        System.out.println(lista + "\t" + produtos.get(lista));
                    }
                    break;
                }
                case 3: {
                    System.out.println("Digite o nome do produto que deseja excluir do cadastro");
                    String deletarProduto = leitor.nextLine();
                    System.out.println("Produto deletado com sucesso");
                    produtos.remove(deletarProduto);
                    break;
                }
                case 4: {
                    chaveDesejada = 4;
                    System.out.println("Você saiu do sistema com sucesso");
                    break;
                }
                default: {
                    System.out.println("Por favor digite um das opções mostradas no menu");
                    break;
                }
            }

        }


    }
}
