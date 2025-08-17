package List;

public class Tarefa {
    //atribuito
    private String descricao;

    public Tarefa(String descricao){
        this.descricao = descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
