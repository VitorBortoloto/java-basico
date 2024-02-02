package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo2 {
    public static void main(String[] args) {

        selecaoCandidatos();  
        imprimirSelecionados();    
        
        String[] candidatos = { "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE" };

        for (String candidato : candidatos) {
            entrarEmContato(candidato);
        }

    }

    static void selecaoCandidatos () {

        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }        
            candidatoAtual++;
        }

    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1500, 2500);
    }

    static void imprimirSelecionados() {

        String[] candidatos = { "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE" };

        System.out.println("Lista de candidatos selecionados: ");

        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println((indice + 1)+"º candidato: " + candidatos[indice]);
        }
    }

    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void entrarEmContato(String candidato) {

        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {

            atendeu = atender();
            continuarTentando = !atendeu;

            if (continuarTentando) {
                tentativasRealizadas++;                
            } else {System.out.println("Contato realizado com sucesso!");}
            
        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("Conseguimos contato com " + candidato + " Na " + tentativasRealizadas + "ª tentativa");
        } else { System.out.println("Não conseguimos contato com " + candidato + ". Numero maximo de tentativas realizadas! " + tentativasRealizadas + " tentativas realizadas"); }

    }


}
