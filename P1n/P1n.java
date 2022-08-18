import java.io.*;
import java.lang.*;

public class P1n {
  private static double calcula(double a) {
    // Math.round(double*a)/100.0;
    double result = Math.round(a * 10.0) / 10.0;
    return result;
  }

  private static double calcula(double b, double a) {
    return a * b;
  }

  private static double calcula(double l1, double l2, double l3) {
    return l1 * l2 * l3;
  }

  public static void main(String[] args) {

    // Tratar os parametros de entrada
    switch (args.length) {
      case 1:
        double a = Double.parseDouble(args[0]);
        System.out.println(calcula(a));

        break;
      case 2:
        double an = Double.parseDouble(args[0]);
        double bn = Double.parseDouble(args[1]);

        System.out.println(calcula(an, bn));
        break;
      case 3:
        double al = Double.parseDouble(args[0]);
        double bl = Double.parseDouble(args[1]);
        double cl = Double.parseDouble(args[2]);
        System.out.println(calcula(al, bl, cl));
        break;

      default:
        System.out.println("Parametros não são válidos!");
        break;
    }
    // Limitar os parametros de entrada
    // Criar os métodos
    // Executar os métodos de acordo com a entrada
    // Retornar dados
    // Teste "unitário"
  }
}
