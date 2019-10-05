package DS_Session2_2018;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {

    private List<Document> documents = new ArrayList<>();

    public List<Document> getDocuments() {
        return documents;
    }

    public void addDocument(Document document) {
        getDocuments().add(document);
    }

    public List<Livre> getFromAutheur(String nomAuteur) {
        List<Livre> livres = new ArrayList<>();

        for(Document doc : getDocuments()) {
            if(((Livre) doc).getAuteur().equalsIgnoreCase(nomAuteur)) {
                livres.add((Livre) doc);
            }
        }

        return livres;
    }
}
