void main() {
    Scanner sc = new Scanner(System.in);
    int[] dades = new int[5];
    int suma = 0;
    double mitjana;
    for (int i = 0; i < 5; i++) {
        System.out.println("Introdueix un número");
        dades[i] = sc.nextInt();
    }

    for (int i = 0; i < 5; i++) {
        System.out.println(i + dades[i]);
        suma = suma + dades[i];
    }
    mitjana = suma*1.0/5;
    System.out.println("La suma és:" + suma);
    System.out.println("La mitjana és" + mitjana);

}
