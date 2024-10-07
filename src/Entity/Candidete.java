package Entity;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Candidete {

    protected static Double salaryBase = 2000.0;

    static String selectedCandidates [];
    static double selectedSalary [];

    public static void selectionOfCandidates(){
        String [] candidates = {"marcio","jose","marcos","felipe","monica","cebolina","cascão","magali","augusto","paulo"};
        int selectioncandidates = 0;
        int currentCandidate = 0;
        int count = 0;
        while(selectioncandidates < 5 && currentCandidate < candidates.length){
            String candidate = candidates [ currentCandidate ];
            double salaryWanted = valueWanted();
            System.out.println("O candidato :"+candidate+" Solicitou este valor de salario :"+salaryWanted);
            if(salaryBase >= salaryWanted  ){
                System.out.println("O candidato :"+candidates+"foi selecionando para vaga");
                selectioncandidates ++;
                selectedCandidates [count] = candidate;
                selectedSalary [count] = salaryWanted;
                count ++;
            }
            currentCandidate ++;
        }
    }

    public static void print(){
        System.out.println("Imprimindo a lista de candidatos selecionandos :");
        for(int i=0;i<=selectedCandidates.length;i++){
            System.out.println(selectedCandidates[i]);
        }
    }

    public static void analyzeCandidate(){
        
        for(int i=0;i <= selectedCandidates.length;i++){
            if(salaryBase < selectedSalary[i] ){
                System.out.println("Ligar para o candidato :"+selectedCandidates[i]);
            }else if(salaryBase == selectedSalary[i]){
                System.out.println("Ligar Para o candidato :"+selectedCandidates[i]+" com contra proposta");
            }else{
                System.out.println("Aguardando o resultado dos demais candidatos");
            }
        }

    }
    static public void getInTouch(String candidate){
        int attemptsMade = 1;
        boolean keepTrying = true;
        boolean answered = false;
        do {
            answered = answer();
            keepTrying = !answered;
            if (keepTrying) {
                attemptsMade ++;
            }else{
                System.out.println("Contato realizado com sucesso");
            }
        }while(answered == false && attemptsMade <= 3);

        if (answered) {
            System.out.println("Conseguimos contato com "+candidate+" Na "+attemptsMade+" tentativa realizada");
        }else{
            System.out.println("Não Conseguimos contato com "+candidate+", número maximo de tentativas realizadas");
        }
    }

   

    static double valueWanted(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }
    static boolean answer(){
        return new Random().nextInt(3)==1;
    }
    
}