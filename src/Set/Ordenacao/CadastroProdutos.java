package Set.Ordenacao;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produtos> produtosSet;

    public CadastroProdutos() {
        this.produtosSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade){
        produtosSet.add(new Produtos(codigo, nome, preco, quantidade));
    }

    public Set<Produtos> exibirProdutosPorNome(){
        Set<Produtos> produtosPorNome = new TreeSet<>(produtosSet);
        return produtosPorNome;
    }

    public Set<Produtos> exibirProdutosPorPreco(){
        Set<Produtos> produtosPorPreco = new TreeSet<>(new Produtos.ComparatorPorPreco());
        produtosPorPreco.addAll(produtosSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto(1, "Produto 1", 15d, 5 );
        cadastroProdutos.adicionarProduto(2, "Produto 2", 4d, 5 );
        cadastroProdutos.adicionarProduto(3, "Produto 3", 13d, 5 );
        cadastroProdutos.adicionarProduto(4, "Produto 4", 12d, 5 );
        cadastroProdutos.adicionarProduto(1, "Produto 5", 15d, 5 );

        System.out.println(cadastroProdutos.produtosSet);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }

}
