package Exercice1;

import java.util.Scanner;

public class Eq2Degre {

    private final Scanner sc = new Scanner(System.in);

    public double r1, r2, delta, a, b, c;

    public void saisieCoefficients() {
        this.a = inputCoef("Valeur coef a : ");
        this.b = inputCoef("Valeur coef b : ");
        this.c = inputCoef("Valeur coef c : ");
        this.delta = -b / 2 * a;
    }

    public void afficheDiscriminant() {
        System.out.println(delta);
    }

    public void resoudreEquation() {
        this.r1 = (-b - Math.sqrt(delta) / 2 * a);
        this.r2 = (-b + Math.sqrt(delta) / 2 * a);
    }

    public void afficheSolutions() {
        System.out.println(String.format("Les solutions de l'équation sont : %f et %f", r1, r2));
    }

    private double inputCoef(String message) {
        System.out.println(message);
        return sc.nextDouble();
    }

}
