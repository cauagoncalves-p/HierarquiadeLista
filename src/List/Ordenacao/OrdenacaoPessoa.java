package List.Ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome,int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenadoPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }


    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new Pessoa.ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Caio", 20, 1.97);
        ordenacaoPessoa.adicionarPessoa("Pedro", 18, 1.87);
        ordenacaoPessoa.adicionarPessoa("Sara", 14, 1.45);
        ordenacaoPessoa.adicionarPessoa("Maria", 25, 1.98);
        ordenacaoPessoa.adicionarPessoa("Matheus", 19, 1.97);
        ordenacaoPessoa.adicionarPessoa("Elen", 15, 1.99);

        ordenacaoPessoa.pessoaList.stream().forEach(System.out::println);

        System.out.println("====================");
        ordenacaoPessoa.ordenadoPorIdade().stream().forEach(System.out::println);

        System.out.println("====================");
        ordenacaoPessoa.ordenarPorAltura().stream().forEach(System.out::println);
    }
}
