void main() {
    Scanner sc= new Scanner(System.in);
    int[] dades = new int[8];
    int positius = 0;
    int negatius = 0;
    int zeros = 0;
    for (int i = 0; i <= 7; i++){
        System.out.println("Introdueix un num");
        dades[i] = sc.nextInt();
    }
    int i =0;
  for ( i = 0; i < 8; i++) {

        if (dades[i] > 0) {
            positius++;
        }
        else if (dades[i] < 0) {
            negatius++;
        }
        else {
            zeros++;
        }
  }
      System.out.println( "Positius: " + positius);
      System.out.println( "Negatius: " + negatius);
      System.out.println("Zeros: " + zeros);
  }


