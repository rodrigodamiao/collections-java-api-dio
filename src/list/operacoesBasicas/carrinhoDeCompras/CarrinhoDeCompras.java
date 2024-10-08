package list.operacoesBasicas.carrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    // Adiciona um item ao carrinho com o nome, preço e quantidade especificados.
    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome,preco,quantidade);
        itemList.add(item);
    }

    // Remove um item do carrinho com base no seu nome.
    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();

        for(Item item : itemList){
            if(item.getNome().equalsIgnoreCase(nome)) itensParaRemover.add(item);
        }
        itemList.removeAll(itensParaRemover);
    }

    //Calcula e retorna o valor total do carrinho, levando em consideração o preço e a quantidade de cada item.
    public double calcularValorTotal(){
        double valorTotal = 0d;

        for(Item item : itemList){
            valorTotal += item.getPreco() * item.getQuantidade();
        }
        return valorTotal;
    }

    //  Exibe todos os itens presentes no carrinho, mostrando seus nomes, preços e quantidades.
    public void exibirItens(){
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Queijo", 5.50, 3);
        carrinho.adicionarItem("Leite", 9.35, 7);
        carrinho.adicionarItem("Biscoito", 2.50, 3);
        carrinho.exibirItens();
        System.out.println(carrinho.calcularValorTotal());

        carrinho.removerItem("Queijo");
        carrinho.exibirItens();
        System.out.println(carrinho.calcularValorTotal());
    }
}
