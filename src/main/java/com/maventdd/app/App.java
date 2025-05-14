package com.maventdd.app;

public class App {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Erreur : vous devez fournir exactement deux entiers.");
            System.out.println("Usage : java -cp target/maSuperAppJava-1.0-SNAPSHOT.jar com.maventdd.app.App <entier1> <entier2>");
            System.exit(1);
        }

        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            Calculatrice calc = new Calculatrice();
            int resultat = calc.additionner(a, b);
            System.out.println("Résultat : " + a + " + " + b + " = " + resultat);
        } catch (NumberFormatException e) {
            System.out.println("Erreur : les arguments doivent être des entiers.");
            System.exit(1);
        }
    }
}
