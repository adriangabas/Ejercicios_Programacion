void main() {
    Scanner teclado = new Scanner(System.in);
    IO.println("Introduce un numero: ");
    int numero = teclado.nextInt();

    boolean esPrimo = false;
    if (numero >= 2 ) {
        esPrimo = true;
    }else{
        esPrimo = false;
    }

    for (int i = 2; i < numero; i++) {
        if(numero % i == 0){
            esPrimo = false;
            break;
        }

    }
    if (esPrimo) {
        IO.println("El número " + numero + " es primo");
    } else {
        IO.println("El número " + numero + " no es primo");
    }

}