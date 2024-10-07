package Entity;

import java.util.concurrent.ThreadLocalRandom;

public class Candidete {

    protected static Double salaryBase = 2000.0;

    public static void selectionOfCandidates(){
        String [] candidates = {"marcio","jose","marcos","felipe","monica","cebolina","cascão","magali","augusto","paulo"};
        int selectioncandidates = 0;
        int currentCandidate = 0;
        while(selectioncandidates < 5 && currentCandidate < candidates.length){
            String candidate = candidates [ currentCandidate ];
            double salaryWanted = valueWanted();
            System.out.println("O candidato :"+candidate+" Solicitou este valor de salario :"+salaryWanted);
            if(salaryBase >= salaryWanted  ){
                System.out.println("O candidato :"+candidates+"foi selecionando para vaga");
                selectioncandidates ++;
            }
            currentCandidate ++;
        }
    }

    public static void analyzeCandidate(Double salaryWanted){
        if(salaryBase < salaryBase ){
            System.out.println("Ligar para o candidato");
        }else if(salaryBase == salaryWanted){
            System.out.println("Ligar Para o candidato com contra proposta");
        }else{
            System.out.println("Aguardando o resultado dos demais candidatos");
        }

    }

    static double valueWanted(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }
}