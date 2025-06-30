package Map.OperacoesBasicas.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos()  {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate date, String nome, String atracao){
            eventosMap.put(date,new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        //O treeMap organiza as datas em ordem crescente
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventoTreeMap);
    }

    public void obterProximoEvento(){
//        //retorna um set com todas as keys
//        Set<LocalDate> dataSet = eventoMap.keySet();
//        //retorna coleção com tdos os valores
//        Collection<Evento> values = eventoMap.values();
//        Porém são independentes e não iteram entre si

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventosMap);
        //permite retornar um set da ligação desses elementos
        for(Map.Entry<LocalDate, Evento> entry : eventoTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo Evento: " + proximoEvento + " acontecerá na data: " + proximaData);
                break;
            }
        }


    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.JULY, 15), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2025, 7, 9), "Evento 2", "Atração 2" );
        agendaEventos.adicionarEvento(LocalDate.of(2026, 3, 10), "Evento 3", "Atração 3");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();

    }
    
}
