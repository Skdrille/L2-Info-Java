package DS_Session2_2018;

public class Livre extends Document {

    private String auteur;
    private int nbPages;

    public Livre(int num, String titre, String auteur, int nbPages) {
        super(num, titre);
        this.auteur = auteur;
        this.nbPages = nbPages;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getNbPages() {
        return nbPages;
    }

    @Override
    public String toString() {
        return getTitre() + " | " + getAuteur() + " | " + "Pages(" + getNbPages() + ")";
    }
}
