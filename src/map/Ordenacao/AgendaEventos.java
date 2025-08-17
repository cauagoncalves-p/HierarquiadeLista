package map.Ordenacao;

import map.OperacoesBasicas.AgendaContatos;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate, Eventos> eventosMap;

    public AgendaEventos(){
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atrasao){
        Eventos evento = new Eventos(nome, atrasao);
        eventosMap.put(data, evento);
    }

    public void exibrAgenda(){
        Map<LocalDate, Eventos> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        //Set<LocalDate> dataSet = eventosMap.keySet();
        //Collection<Eventos> values = eventosMap.values();

        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Eventos> eventosTreeMap = new TreeMap<>(eventosMap);

        for(Map.Entry<LocalDate, Eventos> entry : eventosTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("O próximo evento: " + entry.getValue() + " aconterá na data " + entry.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2026, Month.MAY, 15), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.SEPTEMBER, 20), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2027, Month.SEPTEMBER, 20), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.AUGUST, 17), "Evento 2", "Atração 2");

        agendaEventos.exibrAgenda();

        agendaEventos.obterProximoEvento();
    }
}
