package exercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int contador = 0;
        List<String> respotas = new ArrayList<String>();
        
        System.out.println("Responda as questoes abaixo com 'S' para sim e 'N' para nao: ");

        System.out.println("Telefonou para a vitima? ");
        String reposta = sc.next();
        respotas.add(reposta);

        System.out.println("Esteve no local do crime? ");
        reposta = sc.next();
        respotas.add(reposta);

        System.out.println("Mora perto da vitima? ");
        reposta = sc.next();
        respotas.add(reposta);

        System.out.println("Devia para a vitima? ");
        reposta = sc.next();
        respotas.add(reposta);

        System.out.println("Ja trabalhou com a vitima? ");
        reposta = sc.next();
        respotas.add(reposta);

        for (int i = 0; i < respotas.size(); i++){
            if (respotas.get(i).equalsIgnoreCase("S")){
                contador++;
            }
        }

        System.out.println("");

        if(contador == 2){
            System.out.println("SUSPEITO");
        } else if (contador > 2 && contador < 5) {
            System.out.println("CUMPLICE");
        } else if (contador == 5) {
            System.out.println("ASSASSINO");
        } else System.out.println("INOCENTE");

    }

}
