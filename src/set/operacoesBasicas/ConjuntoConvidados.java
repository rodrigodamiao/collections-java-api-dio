package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome,codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        for(Convidado convidado : convidadoSet){
            if(convidado.getCodigoConvite() == codigoConvite){
                convidadoSet.remove(convidado);
                break;
            }else{
                System.out.println("Não existe convidado com esse código");
            }
        }
    }

    public Integer contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Existem "+conjuntoConvidados.contarConvidados()+" convidado(s) na lista");
        conjuntoConvidados.exibirConvidados();


        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1236);

        System.out.println("Existem "+conjuntoConvidados.contarConvidados()+" convidado(s) na lista");
        conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);

        System.out.println("Existem "+conjuntoConvidados.contarConvidados()+" convidado(s) na lista");
        conjuntoConvidados.exibirConvidados();

    }
}
