package set.pesquisa;

import java.util.Objects;

public class Tarefa {
    private String descricao;
    private Boolean tarefaConcluida;

    public Tarefa(String descricao, Boolean tarefaConcluida) {
        this.descricao = descricao;
        this.tarefaConcluida = tarefaConcluida;
    }

    public String getDescricao() {
        return descricao;
    }

    public Boolean getTarefaConcluida() {
        return tarefaConcluida;
    }

    public void setTarefaConcluida(Boolean tarefaConcluida) {
        this.tarefaConcluida = tarefaConcluida;
    }

    @Override
    public String toString() {
        return '{'+descricao + '\'' + tarefaConcluida +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarefa tarefa = (Tarefa) o;
        return Objects.equals(descricao, tarefa.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(descricao);
    }
}
