package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numberList;

    public OrdenacaoNumeros() {
        this.numberList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numberList.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numberListAscendente = new ArrayList<>(numberList);

        Collections.sort(numberListAscendente);

        return numberListAscendente;
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> numberListDescendente = new ArrayList<>(numberList);

        Collections.sort(numberListDescendente, Collections.reverseOrder());

        return numberListDescendente;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(4);
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(0);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(1);

        System.out.println("Lista Padrão:" + ordenacaoNumeros.numberList);

        ordenacaoNumeros.ordenarAscendente();
        System.out.println("Lista Ascendente:" + ordenacaoNumeros.ordenarAscendente());

        ordenacaoNumeros.ordenarDescendente();
        System.out.println("Lista Descendente:" + ordenacaoNumeros.ordenarDescendente());
    }
}
