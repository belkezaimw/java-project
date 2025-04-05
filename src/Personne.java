import java.util.*;

public class Personne {
     String nom;
     int age ;
    ArrayList<Personne> enfants;

    // Constructeur
    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
        this.enfants = new ArrayList<>();
    }

    public void ajouterEnfant(Personne enfant) {
        enfants.add(enfant);
    }


    public int nombreEnfants() {
        return enfants.size();
    }


    public boolean estParent() {
        return !enfants.isEmpty();
    }


    public boolean estGrandParent() {
        for (Personne enfant : enfants) {
            if (enfant.estParent()) {
                return true;
            }
        }
        return false;
    }


    public int nombreTotalDescendants() {
        int total = enfants.size();
        for (Personne enfant : enfants) {
            total += enfant.nombreTotalDescendants();
        }
        return total;
    }


    public void afficherDescendance(String prefix) {
        System.out.println(prefix + nom);
        for (Personne enfant : enfants) {
            enfant.afficherDescendance(prefix + "  ");
        }
    }
}