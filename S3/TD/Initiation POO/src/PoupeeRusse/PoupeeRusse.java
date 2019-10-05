package PoupeeRusse;

public class PoupeeRusse {

    private PoupeeRusse contenu, contenant;
    private int taille;
    private boolean estOuvert = false;

    public PoupeeRusse(int taille) {
        this.taille = taille;
    }

    /*
    Méthode récursive
     */
    public int getNbPoupeesContenuesRecu() {
        if(contenu == null) return 0;
        return 1 + contenu.getNbPoupeesContenuesRecu();
    }

    public int getNbPoupeesContenuesIte() {
        int i = 0;
        PoupeeRusse p = this.contenu;

        while(p != null) {
            i++;
            p = p.contenu;
        }

        return i;
    }

    public void ouvrir() {
        if(!estOuvert && contenant == null) estOuvert = true;
    }

    public void fermer() {
        estOuvert = false;
    }

    public void placerDans(PoupeeRusse p) {
        if(contenant == null && p.contenu == null && !estOuvert && p.estOuvert && p.taille > taille) {
            p.contenu = this;
            contenant = p;

            System.out.println("Placement effectué !");
        }
    }

    public void sortirDe() {
        if(contenant != null && contenant.estOuvert) {
            contenant.contenu = null;
            this.contenant = null;

            System.out.println("Sortie effectuée !");
        }
    }
}
