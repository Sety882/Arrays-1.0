void main() {


    Scanner sc = new Scanner(System.in);

int[] dades = new int[5];
    for (int i = 0; i <= 4; i++) {
         dades[i] = sc.nextInt();
}
    for (int i = 0; i <= 4; i++) {
        System.out.println(i + ":" + dades[i]);
    }

    System.out.println("Longitud: " + dades.length);
    System.out.println("Primer valor: " + dades[0]);
    System.out.println("Ultim valor: " + dades[4]);
}
