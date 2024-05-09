import com.singularsys.jep.JepException;
import org.nfunk.jep.JEP;

import java.util.Scanner;

public class MetodoSimpson {
    static Scanner in = new Scanner(System.in);

    public static void metodosimpson() throws JepException{
        JEP func = new JEP();
        double a, b, x=0;
        int n;

        System.out.println("Ingrese la función inicial:");
        String funcion = in.nextLine();
        func.addVariable("x", x);
        func.parseExpression(funcion);

        System.out.println("Ingrese el límite inferior del intervalo:");
        a = in.nextDouble();
        System.out.println("Ingrese el límite superior del intervalo:");
        b = in.nextDouble();
        System.out.println("Ingrese el número de subintervalos (debe ser par):");
        n = in.nextInt();

        if (n % 2 != 0) {
            throw new IllegalArgumentException("El número de subintervalos debe ser par.");
        }

        double h = (b - a) / n;
        double sumaInpar = 0;
        double sumaPar = 0;
        x = a;

        for (int i = 1; i < n; i++) {
            double p = a + i * h;
            if (i % 2 == 0) {
                x += h;
                func.addVariable("x", x);
                sumaPar += func.getValue();
            } else {
                x += h;
                func.addVariable("x", x);
                sumaInpar += func.getValue();
            }
        }
        double x0=a,x1=b;
        func.addVariable("x",x0);
        x0=func.getValue();
        func.addVariable("x",x1);
        x1=func.getValue();

        // Fórmula del método de Simpson
        System.out.println("El resultado de la integral es: " + (h / 3) * (x0 + 4 * sumaInpar + 2 * sumaPar + x1));

    }

}
