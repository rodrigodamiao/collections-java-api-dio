package set.ordenacao;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(cod,nome,preco,quantidade));
    }

    // Exibir conjunto padrao
    public void exibirProdutos(){
        double valorTotal = 0;
        for(Produto p : produtoSet){
            valorTotal += p.getPreco() * p.getQuantidade();
        }

        System.out.println(produtoSet);
        System.out.println("Valor total da compra: R$ " + valorTotal);
    }

    // Ordem alfabetica
    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosSetPorNome = new TreeSet<>(produtoSet);

        return produtosSetPorNome;
    }

    // Ordem por preço crescente
    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosSetPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosSetPorPreco.addAll(produtoSet);
        return produtosSetPorPreco;
    }

    // Ordem por quantidade de produtos
    public Set<Produto> exibirProdutosPorQuantidade(){
        Set<Produto> produtosSetPorQuantidade = new TreeSet<>(new ComparatorPorQuantidade());
        produtosSetPorQuantidade.addAll(produtoSet);
        return produtosSetPorQuantidade;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.exibirProdutos();

        cadastroProdutos.adicionarProduto(123,"Banana", 3.0, 6);
        cadastroProdutos.adicionarProduto(124,"Danone", 3.5, 5);
        cadastroProdutos.adicionarProduto(125,"Batata", 2.0, 12);
        cadastroProdutos.exibirProdutos();

        System.out.println("Nome"+cadastroProdutos.exibirProdutosPorNome());
        System.out.println("Preco"+cadastroProdutos.exibirProdutosPorPreco());
        System.out.println("Quantidade"+cadastroProdutos.exibirProdutosPorQuantidade());



    }
}
