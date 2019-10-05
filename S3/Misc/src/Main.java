import DS_Session2_2018.Bibliotheque;
import DS_Session2_2018.Livre;

import javax.swing.*;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Fenetre fenetre = new Fenetre();

        /* Bibliotheque bibliotheque = new Bibliotheque();
        bibliotheque.addDocument(new Livre(1, "Harry Potter 1", "JK Rowling", 500));
        bibliotheque.addDocument(new Livre(1, "Harry Potter 2", "JK Rowling", 600));
        bibliotheque.addDocument(new Livre(1, "Harry Potter 3", "JK Rowling", 745));
        bibliotheque.addDocument(new Livre(1, "Harry Potter 4", "JK Rowling", 1134));
        bibliotheque.addDocument(new Livre(1, "Harry Potter 5 ", "JK Rowling", 654));
        bibliotheque.addDocument(new Livre(1, "Si c'est un homme", "Primo Levi", 466));
        bibliotheque.addDocument(new Livre(1, "Guide muscu 2", "Frederic Delavier", 123));

        println("Entrez un nom d'auteur à afficher : ");
        String auteurName = sc.nextLine();

        if(auteurName != "") {
            List<Livre> livres = bibliotheque.getFromAutheur(auteurName);

            if(livres.size() > 0) {
                livres.forEach(livre -> {
                    println(livre);
                });
            }else {
                println("Aucun livre trouvé pour l'auteur : " + auteurName);
            }
        } */
    }

    private static void println(Object o) {
        System.out.println(o);
    }

}
