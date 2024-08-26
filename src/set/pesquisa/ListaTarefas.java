package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao){
        if(tarefaSet.contains(descricao)){
            for(Tarefa t : tarefaSet){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaSet.remove(t);
                }
            }
        }else{
            System.out.println("Não há nenhuma tarefa com essa descrição");
        }
    }

    public void exibirTarefas(){
        System.out.println(tarefaSet);
    }

    public void contarTarefas() {
        System.out.println("Quantidade de tarefas na lista " + tarefaSet.size());
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();

        for(Tarefa t : tarefaSet){
            if(t.getTarefaConcluida())
                tarefasConcluidas.add(t);
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();

        for(Tarefa t : tarefaSet){
            if(!t.getTarefaConcluida()){
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        for(Tarefa t : tarefaSet){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setTarefaConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        for(Tarefa t : tarefaSet){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setTarefaConcluida(false);
            }
        }
    }

    public void limparListaTarefas(){
        tarefaSet.clear();
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.exibirTarefas();

        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.exibirTarefas();
        listaTarefas.contarTarefas();

        listaTarefas.adicionarTarefa("Tarefa 2");
        listaTarefas.adicionarTarefa("Tarefa 3");
        listaTarefas.adicionarTarefa("Tarefa 4");
        listaTarefas.exibirTarefas();
        listaTarefas.contarTarefas();
        System.out.println("Tarefas concluidas:" + listaTarefas.obterTarefasConcluidas());
        System.out.println("Tarefas pendentes:" + listaTarefas.obterTarefasPendentes());

        listaTarefas.marcarTarefaConcluida("Tarefa 1");
        listaTarefas.marcarTarefaConcluida("Tarefa 2");
        System.out.println("Tarefas concluidas:" + listaTarefas.obterTarefasConcluidas());
        System.out.println("Tarefas pendentes:" + listaTarefas.obterTarefasPendentes());

        listaTarefas.marcarTarefaPendente("Tarefa 1");
        System.out.println("Tarefas concluidas:" + listaTarefas.obterTarefasConcluidas());
        System.out.println("Tarefas pendentes:" + listaTarefas.obterTarefasPendentes());

        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }
}
