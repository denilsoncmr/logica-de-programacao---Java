public class SequenciaS {
    public static void main(String[] args) {
        double S = 1;
        for(int aux = 2; aux <= 100; aux++){
            S += 1.0/aux;
        }
        System.out.printf("%.2f", S);
    }
}
