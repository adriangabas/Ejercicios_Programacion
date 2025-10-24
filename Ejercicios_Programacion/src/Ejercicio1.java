import java.util.Scanner;
    void main() {
        Scanner teclado = new Scanner(System.in);
        IO.println("Introduce dos numeros para comparar:");
        int numero1 = teclado.nextInt();
        int numero2 = teclado.nextInt();

        if (numero1 != numero2) {
            IO.println("Los dos numeros son distintos");
        } else {
            IO.println("Los dos numeros son iguales");
        }
    }
