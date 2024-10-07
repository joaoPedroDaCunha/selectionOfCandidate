package Program;

import Entity.Candidete;

public class Program {
    public static void main(String[] args) throws Exception {

        
        System.out.println("Processo seletivo");
        Candidete.selectionOfCandidates();
        Candidete.print();
        Candidete.analyzeCandidate();
        Candidete.getInTouch();
       
    }
    
}