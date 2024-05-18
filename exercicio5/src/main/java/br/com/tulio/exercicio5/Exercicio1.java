package br.com.tulio.exercicio5;

public class Exercicio1 {

    public static void main(String[] args) {
        System.out.println(somaDosValores(3));
        
    }
    public static int somaDosValores(int n){
        
      String n1 = String.valueOf(n);
        
      String nn2 = String.valueOf(n+n);
        
      String nnn3 = String.valueOf(n+n+n);
        
      
      int soma = Integer.parseInt(n1+nn2+nnn3);
      
     return soma; 
     
    }

}