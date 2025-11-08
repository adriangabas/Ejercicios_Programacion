void main() {
    Scanner teclado = new Scanner(System.in);
    IO.println("Introduce un numero:");
    int numero = teclado.nextInt();

    int contador = 0;
    String divisores = "";
    for (int i = 1; i <= numero; i++) {
        if (numero % i == 0) {
            contador++;
            divisores = divisores + i + "";

        }
    }
    IO.println("El número " + numero + " tiene " + contador + " divisores:");
    IO.println(divisores);


}