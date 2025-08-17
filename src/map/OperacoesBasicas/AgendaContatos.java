package map.OperacoesBasicas;

import Set.pesquisa.AgendaContato;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatosMap;

    public AgendaContatos() {
        this.agendaContatosMap = new HashMap<>();
    }

    public void adicionarContatos(String nome, Integer telefone){
        agendaContatosMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!agendaContatosMap.isEmpty()){
            agendaContatosMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatosMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatosMap.isEmpty()){
            numeroPorNome = agendaContatosMap.get(nome);
        }
        return numeroPorNome;
    }


    public static void main(String[] args) {
      AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContatos("Camila", 123456);
        agendaContatos.adicionarContatos("Camila", 44444);
        agendaContatos.adicionarContatos("CamilaDTHO", 123456);
        agendaContatos.adicionarContatos("João", 123456);
        agendaContatos.adicionarContatos("Carlos", 123456);

        agendaContatos.exibirContatos();


        agendaContatos.removerContato("Camila");
        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Carlos"));
    }
}
