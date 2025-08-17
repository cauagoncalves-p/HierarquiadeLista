package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List<Tarefa> tarefas;

    public ListaTarefa() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }

        tarefas.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotaldeTarefas(){
        return tarefas.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefas);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefas = new ListaTarefa();
        System.out.println("O número total de elementos na lista é: " + listaTarefas.obterNumeroTotaldeTarefas());

        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");
        System.out.println("O número total de elementos na lista é: " + listaTarefas.obterNumeroTotaldeTarefas());

        listaTarefas.removerTarefa("Tarefa 2");
        System.out.println("O número total de elementos na lista é: " + listaTarefas.obterNumeroTotaldeTarefas());

        listaTarefas.obterDescricoesTarefas();
    }
}
