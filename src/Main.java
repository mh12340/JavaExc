import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Einfacher Taschenrechner");
        System.out.println("------------------------");

        System.out.println("Bitte gib die erste Zahl ein:");
        double zahl1 = scanner.nextDouble();

        System.out.println("Wähle die Rechenoperation (+, -, *, /):");
        char operation = scanner.next().charAt(0);

        System.out.println("Bitte gib die zweite Zahl ein:");
        double zahl2 = scanner.nextDouble();

        double ergebnis;

        switch(operation) {
            case '+':
                ergebnis = zahl1 + zahl2;
                break;
            case '-':
                ergebnis = zahl1 - zahl2;
                break;
            case '*':
                ergebnis = zahl1 * zahl2;
                break;
            case '/':
                if(zahl2 != 0) {
                    ergebnis = zahl1 / zahl2;
                } else {
                    System.out.println("Fehler: Division durch 0 nicht möglich!");
                    scanner.close();
                    return;
                }
                break;
            default:
                System.out.println("Ungültige Operation!");
                scanner.close();
                return;
        }

        System.out.println("Das Ergebnis von " + zahl1 + " " + operation + " " + zahl2 + " = " + ergebnis);

        scanner.close();
    }
}