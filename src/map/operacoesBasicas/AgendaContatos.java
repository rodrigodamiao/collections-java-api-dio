package map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    Map<String,Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome,telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();
        agendaContatos.adicionarContato("Rodrigo",4002);
        agendaContatos.adicionarContato("Rodrigo2",4005);
        agendaContatos.adicionarContato("Rodrigo3",4008);
        agendaContatos.adicionarContato("Rodrigo",4004);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Rodrigo3");
        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Rodrigo"));

    }
}
