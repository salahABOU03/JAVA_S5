package gestioneleves;

import java.util.ArrayList;
import java.lang.Comparable;

public class Eleve implements Comparable<Eleve> {
    private String nom;
    private ArrayList<Integer> listeNotes;
    private double moyenne;

    public Eleve(String nom) {
        this.nom = nom;
        this.listeNotes = new ArrayList<>();
        this.moyenne = 0.0;
    }

    public double getMoyenne() {
        if (listeNotes.isEmpty()) {
            return 0.0;
        }

        int total = 0;
        for (int note : listeNotes) {
            total += note;
        }

        moyenne = (double) total / listeNotes.size();
        return moyenne;
    }

    public void ajouternote(int note) {
        this.listeNotes.add(note);
    }

    public String getNom() {
        return nom;
    }

    @Override
    public int compareTo(Eleve autreEleve) {
        // Comparaison basée sur la moyenne
        return Double.compare(this.moyenne, autreEleve.getMoyenne());
    }


    public ArrayList<Integer> getListeNotes(){
        return this.listeNotes;
    };

    @Override
    public String toString() {
        return "Élève: " + nom + "\nNotes: " + listeNotes + "\nMoyenne: " + moyenne;
    }

   

    
}
