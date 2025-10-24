void main(){
    Scanner teclado = new Scanner(System.in);
    IO.println("Introduce un numero entre 1 y 1000:");
    String input = teclado.nextLine();
    int numero = Integer.parseInt(input);
    if ((numero<1) || (numero>1000)) {
        IO.println("El numero esta fuera de rango");
        return;
    }
    int digitos = input.length();
    IO.println("El numero tiene " + digitos + " digitos:");
}

