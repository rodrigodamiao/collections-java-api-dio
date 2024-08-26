package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> listPessoas;

    public OrdenacaoPessoas(){
        this.listPessoas = new ArrayList<>();
    }

    //Adiciona uma pessoa à lista.
    public void adicionarPessoa(String nome, int idade, double altura){
        listPessoas.add(new Pessoa(nome,idade,altura));
    }


    //Ordena as pessoas da lista por idade usando a interface Comparable.
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> listPessoasPorIdade = new ArrayList<>(listPessoas);

        Collections.sort(listPessoasPorIdade);

        return listPessoasPorIdade;
    }

   //Ordena as pessoas da lista por altura usando um Comparator personalizado.
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> listPessoasPorAltura = new ArrayList<>(listPessoas);

        Collections.sort(listPessoasPorAltura, new ComparatorPorAltura());


        return listPessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("Nome 1", 20, 1.56);
        ordenacaoPessoas.adicionarPessoa("Nome 2", 30, 1.80);
        ordenacaoPessoas.adicionarPessoa("Nome 3", 25, 1.64);
        ordenacaoPessoas.adicionarPessoa("Nome 4", 17, 1.72);
        ordenacaoPessoas.adicionarPessoa("Nome 5", 15, 1.75);

        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
}
