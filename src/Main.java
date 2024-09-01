public class Main {
    /*
    Partie 1 : Méthode toMilesPerHour

	1.	Objectif :
	•	Vous devez écrire une méthode appelée toMilesPerHour qui prend un paramètre de type double nommé kilometersPerHour.
	2.	Fonctionnalité :
	•	Cette méthode doit retourner la valeur arrondie du calcul de la vitesse en miles par heure sous forme de long.
	•	Si la valeur du paramètre kilometersPerHour est inférieure à 0, la méthode doit retourner -1 pour indiquer une valeur invalide.
	•	Si la valeur est positive, il faut convertir les kilomètres par heure en miles par heure, arrondir cette valeur, et la retourner.
	3.	Exemples d’entrées/sorties :
	•	toMilesPerHour(1.5); → devrait retourner la valeur 1.
	•	toMilesPerHour(10.25); → devrait retourner la valeur 6.
	•	toMilesPerHour(-5.6); → devrait retourner la valeur -1.
	•	toMilesPerHour(25.42); → devrait retourner la valeur 16.
	•	toMilesPerHour(75.114); → devrait retourner la valeur 47.

     */
    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0){
            return -1;
        }
        else {
            double convertedMilesPerHour = kilometersPerHour / 1.609;
            long milesPerHour = Math.round(convertedMilesPerHour);
            return milesPerHour;
        }
    }
    /*
    Partie 2 : Méthode printConversion

	1.	Objectif :
	•	Vous devez écrire une autre méthode appelée printConversion qui prend un paramètre de type double nommé kilometersPerHour.
	2.	Fonctionnalité :
	•	Cette méthode ne doit rien retourner (elle est de type void).
	•	Elle doit calculer la vitesse en miles par heure à partir du paramètre kilometersPerHour en appelant la méthode toMilesPerHour.
	•	Ensuite, elle doit afficher un message au format "XX km/h = YY mi/h".
	•	XX représente la valeur d’origine kilometersPerHour.
	•	YY représente la valeur arrondie de milesPerHour.
	•	Si la valeur de kilometersPerHour est inférieure à 0, la méthode doit afficher “Invalid Value”.
	3.	Exemples d’entrées/sorties :
	•	printConversion(1.5); → devrait afficher le texte suivant : 1.5 km/h = 1 mi/h
	•	printConversion(10.25); → devrait afficher : 10.25 km/h = 6 mi/h
	•	printConversion(-5.6); → devrait afficher : Invalid Value
	•	printConversion(25.42); → devrait afficher : 25.42 km/h = 16 mi/h
	•	printConversion(75.114); → devrait afficher : 75.114 km/h = 47 mi/h

     */
    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }
        else {
            long conversion = toMilesPerHour(kilometersPerHour);
            System.out.printf("%.2f km/h = %d mi/h\n", kilometersPerHour, conversion);
        }
    }
    public static void main(String[] args) {
        printConversion(80);
        System.out.println(toMilesPerHour(20.9));
    }
}
