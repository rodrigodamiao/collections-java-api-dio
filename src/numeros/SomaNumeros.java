package numeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    List<Integer> numberList = new ArrayList<>();

    //Adiciona um número à lista de números.
    public void adicionarNumero(int numero){
        numberList.add(numero);
    }

    //Calcula a soma de todos os números na lista e retorna o resultado.
    public int calcularSoma(){
        int soma = 0;
        for(int number : numberList){
          soma+=number;
        }
        return soma;
    }

    //Encontra o maior número na lista e retorna o valor.
    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        for(int numero : numberList){
            if(numero > maiorNumero) maiorNumero = numero;
        }
        return maiorNumero;
    }

    //Encontra o menor número na lista e retorna o valor.
    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        for(int numero : numberList){
            if(numero < menorNumero) menorNumero = numero;
        }
        return menorNumero;
    }

    //Retorna uma lista contendo todos os números presentes na lista.
    public List<Integer> exibirNumeros(){
      return numberList;
    }

    public static void main(String[] args) {
        SomaNumeros numberList = new SomaNumeros();

        System.out.println(numberList.exibirNumeros());
        numberList.adicionarNumero(5);
        numberList.adicionarNumero(3);
        numberList.adicionarNumero(2);
        System.out.println(numberList.exibirNumeros());
        System.out.println(numberList.calcularSoma());
        System.out.println(numberList.encontrarMaiorNumero());
        System.out.println(numberList.encontrarMenorNumero());
    }
}
