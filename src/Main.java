void main() {
    Scanner input = new Scanner(System.in);


    String[] noms = new String[5];

    noms[0] = "Marcel";
    noms[1] = "Oriol";
    noms[2] = "Eva";
    noms[3] = "Aitor";
    noms[4] = "Ruben";

    double[] notes = new double[5];

    System.out.print("Nota de Marcel ");
    notes[0] = input.nextDouble();

    System.out.print("Nota de Oriol ");
    notes[1] = input.nextDouble();

    System.out.print("Nota de Eva ");
    notes[2] = input.nextDouble();

    System.out.print("Nota de Aitor ");
    notes[3] = input.nextDouble();

    System.out.println("Nota Ruben");
    notes[4] = input.nextDouble();

    System.out.println("Els noms i les notes són");
    System.out.println(noms[0] + " " + notes[0]);
    System.out.println(noms[1] + " " + notes[1]);
    System.out.println(noms[2] + " " + notes[2]);
    System.out.println(noms[3] + " " + notes[3]);
    System.out.println(noms[4] + " " + notes[4]);

}





