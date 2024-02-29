package exercicio1;

import java.text.Format;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Double> listaTemperaturas = new ArrayList<>();

        receberTemperaturas(listaTemperaturas);

        calcularMedia(listaTemperaturas);  

        exibirTemperaturasAcima(listaTemperaturas, 10d );
        
    }

    public static void receberTemperaturas(List<Double> lista) {

        Scanner scanner = new Scanner(System.in);       

        System.out.println("Digite as temperaturas medias dos 6 primeiros meses do ano: ");

        for(int i = 1; i <= 6; i++) {
            Double temperatura = scanner.nextDouble();
            lista.add(temperatura);
        }

        System.out.println(lista);
        System.out.println(lista.size());
    }

    public static void calcularMedia(List<Double> conjunto) {

        Double soma = 0d;
        Double media = 0d;
        
        for (int i=0; i< conjunto.size(); i++){
            soma += conjunto.get(i);
        }

        media = soma/conjunto.size();

        System.out.println(String.format("A media das temperaturas dos ultimos 6 meses: %.2f", media));

    }

    public static void exibirTemperaturasAcima(List<Double> lista, Double media) {

        List<Double> temperaturasAcima = new ArrayList<>();
        List<String> mes = new ArrayList<>();
        Double valor = 0d;

        for (int i = 0; i < lista.size(); i++){
            valor = lista.get(i);

            if (valor > media){
                temperaturasAcima.add(valor);
                if (i == 0){
                    mes.add("Janeiro");
                }
                if (i == 1){
                    mes.add("Fevereiro");
                }
                if (i == 2) {
                    mes.add("Marco");
                }
                if (i == 3) {
                    mes.add("Abril");
                }
                if (i == 4) {
                    mes.add("Maio");
                }
                if (i == 5) {
                    mes.add("Junho");
                }
            }

        }        

        System.out.println("As temperaturas acima da media e seu respectivo mes sao: " + temperaturasAcima +", " + mes);  
        
        for (int i=0; i < temperaturasAcima.size(); i++){
            System.out.println(temperaturasAcima.get(i) + " / " + mes.get(i));
        }

    }

}