import com.singularsys.jep.JepException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws JepException {
        Scanner UA = new Scanner(System.in);
        int a;
        do{
            System.out.println("1. Precision o exactitud");
            System.out.println("2. Punto Fijo");
            System.out.println("3. Metodo de Jacobi");
            System.out.println("4. Metodo de Simpson (1/3)");
            System.out.println("5. Interpolacion de Newton");
            System.out.println("6. Metodo de Euler (Ecuaciones Diferenciales)");
            System.out.println("7. Salir");
            a = UA.nextInt();
            switch (a){
                case 1:
                    PrecisionOExactitud.PrecisionOExactitud();
                    break;
                case 2:
                    PuntoFijo.PuntoFijo();
                    break;
                case 3:
                    Jacobi.Jacobi();
                    break;
                case 4:
                    MetodoSimpson.metodosimpson();
                    break;
                case 5:
                    NewtonInterpolacion.NewtonInterpolation();
                    break;
                case 6:
                    EulerAproxDiferencial.EulerAproxDiferencial();
                    break;
                case 7:
                    System.out.println("Gracias por usar nuestro programa");
                    break;
                default:
                    System.out.println("Ingreso una opcion incorrecta");
            }
        } while (a != 7);
    }
}
