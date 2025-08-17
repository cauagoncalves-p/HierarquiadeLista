package Set.pesquisa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AgendaContato {
    private Set<Contato> contatoList;

    public AgendaContato() {
        this.contatoList = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoList.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(contatoList);
    }

    public Set<Contato> exibirContato(String contato){
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato contatos : contatoList){
            if(contatos.getNome().startsWith(contato)){
                contatosPorNome.add(contatos);
            }
        }
        return contatosPorNome;
    }

    public Contato contatoAtualizado(String nome, int numero){
        Contato contatoAtualizado = null;
        for (Contato c : contatoList){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(numero);
            }
            contatoAtualizado = c;
            break;
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContato agendaContato = new AgendaContato();

        agendaContato.exibirContato();

        agendaContato.adicionarContato("Camila", 123456);
        agendaContato.adicionarContato("Camila", 123456);
        agendaContato.adicionarContato("CamilaDTHO", 123456);
        agendaContato.adicionarContato("João", 123456);
        agendaContato.adicionarContato("Carlos", 123456);

        agendaContato.exibirContato();

        System.out.println(agendaContato.exibirContato("João"));

        agendaContato.contatoAtualizado("João", 000000);
        agendaContato.exibirContato();
    }
}
