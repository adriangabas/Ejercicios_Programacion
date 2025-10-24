void main() {
    Scanner teclado = new Scanner (System.in);
    IO.println("Introduce tres numeros");
    int numero1 = teclado.nextInt();
    int numero2 = teclado.nextInt();
    int numero3 = teclado.nextInt();
    int[] numeros = new int[3];
    numeros[0] = numero1;
    numeros[1] = numero2;
    numeros[2] = numero3;
    Arrays.sort(numeros);
    IO.println(numeros[0]);
    IO.println(numeros[1]);
    IO.println(numeros[2]);






}
