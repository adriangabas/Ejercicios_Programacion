void main() {
    Scanner teclado = new Scanner(System.in);
    IO.println("Ingresa numero de mes: ");
    int mes = teclado.nextInt();
    IO.println("Ingresa numero de año: ");
    int año = teclado.nextInt();
    int dias = 0;


    switch (mes) {
        case 1:

        case 3:

        case 5:

        case 7:

        case 8:

        case 10:

        case 12:
            dias = 31;
            break;

        case 2:
            if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
                dias = 29;
            } else {
                dias = 28;
            }
            break;
        case 4:
        case 6:

            case 9:

        case 11:
            dias =30;
            break;
            default:
                IO.println("Mes no es valido");
                break;
    }
    if (dias > 0) {
        IO.println("El mes " + mes + " del año " + año + " tiene " + dias + " días.");
    }

}