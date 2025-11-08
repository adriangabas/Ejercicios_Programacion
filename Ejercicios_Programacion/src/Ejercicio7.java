void main() {
    Scanner teclado = new Scanner(System.in);
    boolean esValida = false;
    do {
        IO.println("Introduce una hora: ");
        int hora = teclado.nextInt();
        IO.println("Introduce minutos: ");
        int minutos = teclado.nextInt();
        IO.println("Introduce segundos: ");
        int segundos = teclado.nextInt();

        //TODO comprobar si la hora es correcta

        //SI LA HORA ESTA ENTRE 0 Y 23 Y LOS MINUTOS ENTRE 0 Y 59 Y LOS SEGUNDOS ENTRE 0 Y 59 ENTONCES...
        if ((hora >= 0 && hora <= 23) && (minutos >= 0 && minutos <= 59) && (segundos >= 0 && segundos <= 59)) {
            esValida = true;
            IO.println("La hora es correcta");
            String horaFormateada = String.format("%02d:%02d:%02d", hora, minutos, segundos);
            IO.println("La hora es: " + horaFormateada);
        } else {
            esValida = false;
            IO.println("La hora no es correcta");
        }

    } while (!esValida);
}

        //TODO cuando sea valido debe mostrar la hora correcta


