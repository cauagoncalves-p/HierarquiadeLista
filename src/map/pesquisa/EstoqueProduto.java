package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
    private Map<Long, Produto> estoqueProdutos;

    public EstoqueProduto() {
        this.estoqueProdutos = new HashMap<>();
    }

    public void adicionarProduto(Long id, String nome, double preco, int quantidade){
        estoqueProdutos.put(id, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutos);
    }

    public double calculaValorTotal(){
        double valorTotalEstoque = 0d;
        if(!estoqueProdutos.isEmpty()){
            for (Produto p : estoqueProdutos.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterMaiorvalor(){
        Produto produtoMaisCaro = null;
        double maisPreco = Double.MIN_VALUE;
        for (Produto p : estoqueProdutos.values()){
            if (p.getPreco() > maisPreco){
                produtoMaisCaro = p;
            }
        }
        return produtoMaisCaro;
    }


    public static void main(String[] args) {
        EstoqueProduto estoqueProduto = new EstoqueProduto();

        estoqueProduto.exibirProdutos();

        estoqueProduto.adicionarProduto(1L, "a", 10, 5);
        estoqueProduto.adicionarProduto(2L, "b", 20, 6);
        estoqueProduto.adicionarProduto(3L, "c", 30, 5);
        estoqueProduto.adicionarProduto(4L, "d", 5, 5);

        System.out.println(estoqueProduto.calculaValorTotal());
        System.out.println(estoqueProduto.obterMaiorvalor());
    }
}
