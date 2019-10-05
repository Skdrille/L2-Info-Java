import java.util.ArrayList;
import java.util.List;

public class Formation {

    private List<Etudiant> etudiantsInscrits = new ArrayList<>();
    private String nom;
    private final int nbPlaces;

    public Formation(String nom, int nbPlaces) {
        this.nom = nom;
        this.nbPlaces = nbPlaces;
    }

    public String getNom() {
        return nom;
    }

    public int getNbPlaces() {
        return nbPlaces;
    }

    public List<Etudiant> getEtudiantsInscrits() {
        return etudiantsInscrits;
    }

    public boolean isInscrit(Etudiant etudiant) {
        for(Etudiant etu : getEtudiantsInscrits()) {
            if(etu.equals(etudiant)) {
                return true;
            }
        }
        return false;
    }

    public void inscrire(Etudiant etudiant) {
        if(!isInscrit(etudiant) && getNbPlaces() != getEtudiantsInscrits().size()) {
            getEtudiantsInscrits().add(etudiant);
            etudiant.setFormationSuivie(this);
        }
    }
}
