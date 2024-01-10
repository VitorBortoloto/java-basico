package edu.vitor.primeirasemana;
public class MinhaClasse {
    
    public static void main(String[] args) {
        
        System.out.println("Algo digitado");

        final String BR = "Brasil"; // Variável em nome todo maiusculo ja recebe o atributo final (valor não pode ser alterado)
        double PI = 3.14;

        int ano = 2020; // Esse tipo de variavel pode ser alterada ao longo do codigo
        ano = 2024;

        String primeiroNome = "Vitor";
        String segundoNome = "Bortoloto";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }


    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método: " + primeiroNome.concat( " ").concat(segundoNome);

    }

}
