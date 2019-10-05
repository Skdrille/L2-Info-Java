package DS_Session2_2018;

public class Document {

    private final int num;
    private String titre;

    protected Document(final int num, String titre) {
        this.num = num;
        this.titre = titre;
    }

    public int getNum() {
        return num;
    }

    public String getTitre() {
        return titre;
    }
}
