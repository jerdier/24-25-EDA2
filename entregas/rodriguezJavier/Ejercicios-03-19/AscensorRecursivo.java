import java.util.Scanner;

public class AscensorRecursivo {
    public static void moverAscensor(int actual, int destino) {
        if (actual == destino) {
            System.out.println("Llegaste al piso " + destino);
            return;
        }
        System.out.println((actual < destino ? "Subiendo" : "Bajando") + " al piso " + (actual + (actual < destino ? 1 : -1)));
        moverAscensor(actual + (actual < destino ? 1 : -1), destino);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el piso actual: ");
        int actual = scanner.nextInt();
        System.out.print("Ingresa el piso destino: ");
        int destino = scanner.nextInt();
        moverAscensor(actual, destino);
        scanner.close();
    }
}