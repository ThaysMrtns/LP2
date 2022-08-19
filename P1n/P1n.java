import java.io.*;
import java.lang.*;

public class P1n {
  private static double calcula(double a) {
    double area = Math.PI * a * a;
    double result = Math.round(area * 100.00) / 100.00;
    System.out.printf("A area do circulo é %,.2f unidades de area \n", area);
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
    // Validar se não é letra
    switch (args.length) {
      case 1:
        double a = Double.parseDouble(args[0]);
        calcula(a);

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
