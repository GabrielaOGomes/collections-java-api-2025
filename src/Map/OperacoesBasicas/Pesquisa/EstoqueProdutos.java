package Map.OperacoesBasicas.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    //atributo

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }


//métodos

    public void adicionarProdutos(long cod, String nome, double preco, int quantidade) {
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        //verifica se a coleção está vazia ou não
        double valorTotalEstoque = 0.0;
        if (!estoqueProdutosMap.isEmpty())
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
            for(Produto p : estoqueProdutosMap.values()){
            if(p.getPreco() > maiorPreco){
                produtoMaisCaro = p;
            maiorPreco = p.getPreco();
            }
        }

        return produtoMaisCaro;
}
    public Produto obterProdutoMaisBarato(){
    Produto produtoMaisBarato = null;
    double menorPreco = Double.MAX_VALUE;
        for(Produto p : estoqueProdutosMap.values()){
            if(p.getPreco() < menorPreco){
                produtoMaisBarato = p;
                menorPreco = p.getPreco();
            }
        }

    return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalEstoque() {
        Produto produtoMaiorQuantidadeValorTotalEstoque = null;
        double maiorValorTotalProdutoEstoque = 0.0;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Map.Entry<Long, Produto> entry : estoqueProdutosMap.entrySet()) {
                double valorProdutoEmEstoque = entry.getValue().getQuantidade() * entry.getValue().getPreco();
                if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
                    maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
                    produtoMaiorQuantidadeValorTotalEstoque = entry.getValue();
                }
            }
        }
        return produtoMaiorQuantidadeValorTotalEstoque;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.exibirProdutos();

        estoqueProdutos.adicionarProdutos(1L, "Produto 1", 5.0, 10);
        estoqueProdutos.adicionarProdutos(2L, "Produto 2", 10.0, 5);
        estoqueProdutos.adicionarProdutos(3L, "Produto 3", 15.0, 2);

        estoqueProdutos.exibirProdutos();

        System.out.println("Valor Total do Estoque: " + estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("Produto mais barato: " + estoqueProdutos.obterProdutoMaisBarato());
        System.out.println("Produto mais caro: " + estoqueProdutos.obterProdutoMaisCaro());
        System.out.println("Produto com maior quantidade e valor total: " + estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalEstoque());
    }

}