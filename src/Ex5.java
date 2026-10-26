


    static void main() {

    {

        Scanner sc = new Scanner(System.in);

        int[] dades = new int[7];
        int max, min, posMax, posMin;

        // Primer for: introduir els 7 números
        for (int i = 0; i < 7; i++) {
            System.out.println("Introdueix un número:");
            dades[i] = sc.nextInt();
        }

        // Inicialitzar màxim, mínim i posicions
        max = dades[0];
        min = dades[0];
        posMax = 0;
        posMin = 0;

        // Segon for: buscar màxim i mínim
        for (int i = 1; i < 7; i++) {

            if (dades[i] > max) {
                max = dades[i];
                posMax = i;
            }

            if (dades[i] < min) {
                min = dades[i];
                posMin = i;
            }
        }

        // Mostrar resultats
        System.out.println("Màxim: " + max + " a l'índex " + posMax);
        System.out.println("Mínim: " + min + " a l'índex " + posMin);

        sc.close();
    }
}





