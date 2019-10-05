public class Etudiant extends Personne {

    private Formation formationSuivie;

    public Etudiant(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }

    public void setFormationSuivie(Formation formationSuivie) {
        this.formationSuivie = formationSuivie;
    }

    public Formation getFormationSuivie() {
        return formationSuivie;
    }
}
