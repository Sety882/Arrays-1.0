
    void main() {
        Scanner sc = new Scanner(System.in);
        int[] dades = new int[6];


        for (int i = 0; i <= 5; i++) {
            dades[i] = sc.nextInt();
        }


        for (int i = 5; i >= 0; i--) {
            System.out.println(dades[i]);
        }


        for (int i = 0; i <= 5; i++) {
            System.out.println(dades[i]);
        }
    }

