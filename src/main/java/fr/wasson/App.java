package fr.wasson;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {

        // Demander le salaire
        System.out.print("Quel est votre salaire annuel ? ");
        Scanner scan = new Scanner(System.in);
        int salaireAnnuel =  scan.nextInt();

        // Demander les années le nombre d'années travaillées
        System.out.print("Combien d'annèes avez vous travaillées ? ");
        int anneeTravallees = scan.nextInt();
        scan.close();

        // Conditions
        if (salaireAnnuel >= 30000 && anneeTravallees >= 2) { // Si le salaire est supérieur ou égal à 30000€ par an et que le nombre d'années travaillées est supérieur à 2, le prêt est accepté
            System.out.println("Félicitation ! Votre prêt est accepté !");
        } else { // Sinon, le prêt n'est pas accepté
            System.out.println("Votre prêt n'est pas accepté.");
        }
    }
}
