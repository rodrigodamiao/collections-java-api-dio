package set.operacoesBasicas;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas{
    private Set<String> stringSet;

    public ConjuntoPalavrasUnicas() {
        this.stringSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        stringSet.add(palavra);
    }

    public void removerPalavra(String palavra){
        stringSet.remove(palavra);
    }

    public void verificarPalavra(String palavra){
        if(stringSet.contains(palavra)){
            System.out.println("A palavra "+palavra+" está presente no conjunto");
        }else{
            System.out.println("A palavra "+palavra+" não está presente no conjunto");
        }
    }

    public void exibirPalavrasUnicas(){
        System.out.println(stringSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 1");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 2");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 3");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.verificarPalavra("Palavra 2");

        conjuntoPalavrasUnicas.removerPalavra("Palavra 2");

        conjuntoPalavrasUnicas.verificarPalavra("Palavra 2");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }
}
