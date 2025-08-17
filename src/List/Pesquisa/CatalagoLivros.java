package List.Pesquisa;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {
    private List<Livro> livrosList;

    public CatalagoLivros() {
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivros(String titulo, String autor, int ano){
        livrosList.add(new Livro(titulo, ano, autor));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for (Livro l : livrosList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervalos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervalodeAno = new ArrayList<>();
        if (!livrosList.isEmpty()){
            for (Livro l : livrosList){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervalodeAno.add(l);
                }
            }
        }
        return livrosPorIntervalodeAno;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;

        if(!livrosList.isEmpty()){
            for (Livro l : livrosList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalagoLivros catalagoLivros = new CatalagoLivros();
        catalagoLivros.adicionarLivros("Livro 1", "Autor 1", 2021);
        catalagoLivros.adicionarLivros("Livro 2", "Autor 2", 2022);
        catalagoLivros.adicionarLivros("Livro 3", "Autor 2", 2022);
        catalagoLivros.adicionarLivros("Livro 4", "Autor 4", 2025);
        catalagoLivros.adicionarLivros("Livro 5", "Autor 5", 2026);

        System.out.println(catalagoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalagoLivros.pesquisarPorIntervalos(2023,2026));
        System.out.println(catalagoLivros.pesquisarPorTitulo("Livro 3"));
    }
}

