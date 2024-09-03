package map.ordenacao;

import java.time.LocalDate;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        eventosMap.put(data, new Evento(nome, atracao));
    }

    // Exibe a agenda de eventos em ordem crescente de data.
    public void exibirAgenda(){
        Map<LocalDate,Evento> eventosMapOrdenado = new TreeMap<>(eventosMap);
        System.out.println(eventosMapOrdenado);
    }

    public Evento obterProximoEvento(){
        Evento evento = null;
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate,Evento> eventosMapOrdenado = new TreeMap<>(eventosMap);

        if(!eventosMap.isEmpty()){
            for(Map.Entry<LocalDate, Evento> entry : eventosMapOrdenado.entrySet()){
                if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                    proximaData = entry.getKey();
                    proximoEvento = entry.getValue();
                    System.out.println("O proximo evento: "+proximaData+" acontecerá na data "+proximaData);
                    break;
                }
            }

        }
        return evento;
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
    }

}
