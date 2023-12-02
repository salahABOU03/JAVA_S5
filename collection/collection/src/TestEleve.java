import gestioneleves.*;

public class TestEleve {
    public static void main(String[] args) {
        
        Eleve eleve1 = new Eleve("John");
        Eleve eleve2 = new Eleve("Alice");
        Eleve eleve3 = new Eleve("Bob");

     
        eleve1.ajouternote(80);
        eleve1.ajouternote(90);

        eleve2.ajouternote(75);
        eleve2.ajouternote(85);

        eleve3.ajouternote(92);
        eleve3.ajouternote(88);

       
        int comparisonResult1to2 = eleve1.compareTo(eleve2);
        int comparisonResult2to3 = eleve2.compareTo(eleve3);

        // Display the results
        System.out.println(eleve1);
        System.out.println(eleve2);
        System.out.println(eleve3);

        System.out.println("Comparison result between " + eleve1.getNom() + " and " + eleve2.getNom() + ": " + comparisonResult1to2);
        System.out.println("Comparison result between " + eleve2.getNom() + " and " + eleve3.getNom() + ": " + comparisonResult2to3);
    }
}

