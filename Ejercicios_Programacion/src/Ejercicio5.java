void main() {

    boolean seguir = true;
    do {
        Scanner teclado = new Scanner(System.in);
        IO.println("Calculo de areas");
        IO.println("1. Cuadrado");
        IO.println("2. Circulo");
        IO.println("3. Rectangulo");
        IO.println("4. Triangulo");
        IO.println("x. Salir");
        IO.print("Opcion: ");
        String opcion = teclado.nextLine();
        switch (opcion) {
            case "1":
                IO.print("¿Cuanto mide el lado?: ");
                int lado = teclado.nextInt();
                int area = lado * lado;
                IO.println("El area es: " + area);
                break;
            case "2":
                IO.print("¿Cuanto mide de ancho?: ");
                int ancho = teclado.nextInt();
                IO.print("Cuanto mide el alto?: ");
                int alto = teclado.nextInt();
                area = ancho * alto;
                IO.println("El area es: " + area);
                break;
            case "3":
                IO.print("¿Cuanto mide el lado?");
                break;
            case "4":
                IO.print("¿Cuanto mide el lado?");
                break;
            case "x":
                seguir = false;
                break;
            default:
                IO.println("Opcion incorrecta");
                break;
        }
    } while (seguir);

}







