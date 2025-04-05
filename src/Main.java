import java.util.*;
public class Main {
    public static void main(String[] args) {
        Personne ahmed = new Personne("Ahmed", 60);
        Personne ali = new Personne("Ali", 35);
        Personne amine = new Personne("Amine", 32);
        Personne sara = new Personne("Sara", 10);
        Personne lina = new Personne("Lina", 8);
        Personne ryad = new Personne("ryad",23);
        Personne haron = new Personne("haron",23);
        Personne kami = new Personne("kami",18);
        Personne wael = new Personne("wael",22);
        ahmed.ajouterEnfant(ali);
        haron.ajouterEnfant(ryad);
        haron.ajouterEnfant(wael);
        ahmed.ajouterEnfant(amine);
        ryad.ajouterEnfant(kami);
        ali.ajouterEnfant(sara);
        ali.ajouterEnfant(lina);
        System.out.println("Nombre total de descendants d'Ahmed : " + haron.nombreTotalDescendants());
        System.out.println("Descendance harron :");
        haron.afficherDescendance("");
    }
}