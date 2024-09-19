package fr.dampierre;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner clavier = new Scanner(System.in);

    System.out.print("Entrez le premier nom commun : ");
    String nomCommun1 = clavier.next();
    System.out.print("Entrez le deuxième nom commun : ");
    String nomCommun2 = clavier.next();
    System.out.print("Entrez l'adjectif : ");
    String adjectif = clavier.next();
    System.out.println("Il était une fois un " + nomCommun1 + " qui avait " + nomCommun2
        + ". Cela le rendait très " + adjectif + ".");
  }
}
