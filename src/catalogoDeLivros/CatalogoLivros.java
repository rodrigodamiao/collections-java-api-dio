package catalogoDeLivros;


import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributo
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    //Adiciona um livro ao catálogo
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo,autor,anoPublicacao));
    }

    //Pesquisa livros por autor e retorna uma lista com os livros encontrados
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livroAutorList = new ArrayList<>();

        if(!livroList.isEmpty()){
            for(Livro livro : livroList){
                if(livro.getAutor().equalsIgnoreCase(autor)) livroAutorList.add(livro);
            }
        }
        return livroAutorList;
    }

    // Pesquisa livros publicados em um determinado intervalo de anos e retorna uma lista com os livros encontrados.
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livroIntervaloAnos = new ArrayList<>();

        if(!livroList.isEmpty()){
            for(Livro livro : livroList){
                if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) livroIntervaloAnos.add(livro);
            }
        }

        return livroIntervaloAnos;
    }

    // Pesquisa livros por título e retorna o primeiro livro encontrado.
    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;

        if(!livroList.isEmpty()){
            for(Livro livro : livroList){
                if(livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = livro;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 1994);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020,2022));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
    }
}

