package DS_Session2_2018;

public class Dictionnaire extends Document {

    private String langue;
    private int nbArticles;

    protected Dictionnaire(int num, String titre, String langue, int nbArticles) {
        super(num, titre);
        this.langue = langue;
        this.nbArticles = nbArticles;
    }

    public String getLangue() {
        return langue;
    }

    public int getNbArticles() {
        return nbArticles;
    }
}
