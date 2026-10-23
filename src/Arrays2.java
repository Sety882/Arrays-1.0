void main() {

float[] scores = new float[]{7.5f, 5.0f, 10.0f};
for (int i=0; i<scores.length-1;i++){
    for (int j=i+1;j<scores.length;j++){
        if (scores[i]<scores[j]){
            float cambio = scores[i];
            scores[i] = scores[j];
            scores[j]=cambio;
            }
        }
}
        System.out.println("El array ordenado es: ");
for (int i=0; i<scores.length;i++){
        System.out.print(scores[i]+" ");
}
        System.out.println();
}

