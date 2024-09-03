package map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private String palavra;
    private String definicao;

    Map<String,String> palavrasDefinicaoMap;

    public Dicionario() {
        this.palavrasDefinicaoMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        palavrasDefinicaoMap.put(palavra,definicao);
    }

    public void removerPalavra(String palavra){
        if(!palavrasDefinicaoMap.isEmpty()) palavrasDefinicaoMap.remove(palavra);
    }

    public void exibirPalavras(){
        System.out.println(palavrasDefinicaoMap);
    }

    public String pesquisarPorPalavra(String palavra){

        String definicao = null;

        if(!palavrasDefinicaoMap.isEmpty()){
            if(palavrasDefinicaoMap.containsKey(palavra)){
                definicao = palavrasDefinicaoMap.get(palavra);
            }
        }
        return definicao;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.exibirPalavras();
        dicionario.adicionarPalavra("Perserverança", "Qualidade da pessoa persistente, de quem não desiste jamais: conseguiu o trabalho pelo seu excesso de perseverança.");
        dicionario.adicionarPalavra("Respeito", "Sentimento que impede uma pessoa de tratar alguém mal, de ser malcriada ou de agir com falta de consideração na maneira como se comporta com os outros; estima.");
        dicionario.exibirPalavras();
        System.out.println(dicionario.pesquisarPorPalavra("Respeito"));
        dicionario.removerPalavra("Perserverança");
        dicionario.exibirPalavras();
    }
}
