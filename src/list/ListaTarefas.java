package list;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefaList;

    public ListaTarefas(){
        this.tarefaList = new ArrayList<>();
    }

    // Adiciona uma nova tarefa à lista com a descrição fornecida.
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    // Remove uma tarefa da lista com base em sua descrição.
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        for(Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)) tarefasParaRemover.add(t);
        }

        tarefaList.removeAll(tarefasParaRemover);
    }

    // Retorna o número total de tarefas na lista.
    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    // Retorna uma lista contendo a descrição de todas as tarefas na lista.
    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        System.out.println(listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.adicionarTarefa("1");
        listaTarefas.adicionarTarefa("1");
        listaTarefas.adicionarTarefa("2");

        System.out.println(listaTarefas.obterNumeroTotalTarefas());



        listaTarefas.removerTarefa("1");
        System.out.println(listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.obterDescricoesTarefas();

    }
}
