package list.OpercoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itens;

    public CarrinhoDeCompras(List<Item> itens) {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for(Item i : itens){
            if (i.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }
        itens.removeAll(itensParaRemover);
    }

    public void calcularValorTotal(){
        double valorTotal = 0;
        for(Item i : itens){
            valorTotal += i.getPreco() * i.getQuantidade();
        }
        System.out.printf("Valor total do carrinho: %.2f%n", valorTotal);
    }
    public void exibirItens(){
        System.out.println(itens);
    }

    public static void main(String[] args) {

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras(new ArrayList<>());

        carrinho.adicionarItem("Coca-Cola", 2.50, 2);
        carrinho.adicionarItem("Pepsi", 3.50, 1);
        carrinho.adicionarItem("Fanta", 4.50, 3);
        carrinho.exibirItens();
        carrinho.calcularValorTotal();
        carrinho.removerItem("Pepsi");
        System.out.println("Itens no carrinho: ");
        carrinho.exibirItens();
    }
}


