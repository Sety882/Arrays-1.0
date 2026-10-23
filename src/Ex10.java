void main() {


    Scanner sc = new Scanner(System.in);

    int[] dades = new int[5];
    for (int i = 0; i <= 4; i++) {
        dades[i] = sc.nextInt();
    }

    int[] dadesb = new int[5];
    for (int i = 0; i <= 4; i++) {
        dadesb[i] = sc.nextInt();
    }

    int[] suma = new int[dades.length];
    for (int i = 0; i < dades.length; i++) {
        suma[i] = dades[i] + dadesb[i];
    }
    System.out.println(Arrays.toString(dades));
    System.out.println(Arrays.toString(dadesb));
    System.out.println(Arrays.toString(suma));
}


