import java.util.Scanner;
public class Main {
    static Scanner UA = new Scanner(System.in);
    public static void main(String[] args) {
        int i = 0;
        double valR, prom = 0;
        double[] vals = new double[5];
        System.out.println("Ingrese el valor real");
        valR = UA.nextDouble();
        System.out.println("Ingrese los valores");
        for (int j = 0; j < 5; j++) {
            vals[j] = UA.nextDouble();
            prom += vals[j];
        }
        prom = prom / 5;
        boolean check = false;
        for (int j = 0; j < 5; j++) {
            if ((vals[j] - valR) < 0.1 && (vals[i] - valR) > -0.1) {
                if (j == 4) {
                    check = true;
                }
            } else {
                break;
            }
        }
        if (check) {
            System.out.println("Es exacto");
        } else {
            System.out.println("No es exacto");
        }
        check = true;
        for (int j = 0; j < 5; j++){
            for (int k = 1; k < 5; k++){
                if ((vals[j] - vals[k]) > 0.1 || (vals[j] - vals[k]) < -0.1) {
                    check = false;
                    break;
                }
            }
            if (!check){
                break;
            }
        }
        if (check){
            System.out.println("Es preciso");
        } else {
            System.out.println("No es preciso");
        }
        /*
        if (exactitud(vals, valR, i)) {
            System.out.println("Es exacto");
        } else {
            System.out.println("No es exacto");
        }
        if (precision(vals, i, prom)) {
            System.out.println("Es preciso");
        } else {
            System.out.println("Es impreciso");
        }
    }
    public static boolean exactitud(double[] vals, double valR, int i) {
        if ((vals[i] - valR) < 0.1 && (vals[i] - valR) > -0.1){
            if (i == 4){
                return true;
            } else {
                return exactitud(vals, valR, i + 1);
            }
        } else {
            return false;
        }
    }
    public static boolean precision(double[] vals, int i, double prom){
        if ((vals[i] - prom) < 0.1 && (vals[i] - prom) > -0.1){
            if (i == 4){
                return true;
            } else {
                return precision(vals, i + 1, prom);
            }
        } else {
            return false;
        }
        */
    }
}
