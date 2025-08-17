package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidados> convidadosset;

    public ConjuntoConvidados() {
        this.convidadosset = new HashSet<>();
    }

    public void adicionar(String nome, int codigo){
        convidadosset.add(new Convidados(nome, codigo));
    }

    public void removerConvidado(int codigoConvite){
        Convidados convidados = null;

        for (Convidados convi : convidadosset){
            if(convi.getCodigo() == codigoConvite){
                convidados = convi;
                break;
            }
        }
        convidadosset.remove(convidados);
    }

    public int contarConvidados(){
        return convidadosset.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadosset);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do set de convidados");

        conjuntoConvidados.adicionar("Convidado 1", 1234);
        conjuntoConvidados.adicionar("Convidado 2", 1235);
        conjuntoConvidados.adicionar("Convidado 3", 1236);
        conjuntoConvidados.adicionar("Convidado 4", 1232);
        conjuntoConvidados.adicionar("Convidado 5", 1236);

        conjuntoConvidados.exibirConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do set de convidados");

        conjuntoConvidados.removerConvidado(1236);
        conjuntoConvidados.exibirConvidados();
    }
}
