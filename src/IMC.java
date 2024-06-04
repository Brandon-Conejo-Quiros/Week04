import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la calculadora de IMC!");
        System.out.println("Ponga su pesp en kilogramos:");
        int peso = scanner.nextInt();

        System.out.println("Ponga su altura en centimetros:");
        int altura = scanner.nextInt();
        altura = altura / 100;

        int imc = IMCcalc(peso, altura);

        System.out.println("Su IMC es: " + imc);
        System.out.println("Diagnóstico:");

        if (imc < 16) {
            System.out.println("Necesita ingresar a un hospital urgentemente");
        } else if (imc < 17) {
            System.out.println("Usted tiene infra peso");
        } else if (imc < 18) {
            System.out.println("Usted tiene bajo peso");
        } else if (imc < 26) {
            System.out.println("Usted tiene un peso saludable");
        } else if (imc < 30) {
            System.out.println("Tiene sobrepeso de grado I");
        } else if (imc < 35) {
            System.out.println("Tiene obesidad de grado II");
        } else if (imc < 40) {
            System.out.println("Tiene obesidad pre mórbida (III)");
        } else {
            System.out.println("Tiene obesidad mórbida o de grado IV");
        }

        scanner.close();
    }

    public static int IMCcalc(int peso, int altura) {
        return peso / (altura * altura);
    }
}