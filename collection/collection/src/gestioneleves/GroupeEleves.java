package gestioneleves;

import java.util.ArrayList;
import java.util.Iterator;

import javax.lang.model.type.NullType; 


public class GroupeEleves {

   
    private ArrayList<Eleve> listeEleves   ;


    public int nombre(){
       return listeEleves.size(); 
    };
    
    public ArrayList<Eleve> getListe() {
        return listeEleves ; 
    }

    public Eleve chercher(String nom) {
        Iterator it = listeEleves.iterator() ; 
        while (it.hasNext()) {
            Eleve eleve = (Eleve) it.next();
            if(eleve.getNom().equals(nom)){
                return eleve ;
            }
        }
        return null   ; 
    }

    public void lister(){
        Iterator it  = listeEleves.iterator()  ; 
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
    
}