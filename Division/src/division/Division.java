package division;

/**
 *
 * @author JonathanLizama
 */
public class Division {

      public int division[];

      // constructor
      public Division() {
            this.division = new int[3];
            llenado();
      }
      //  llenamos el arreglo division (resultado)
      private void llenado() {
            division[0] = 3;     // representa la division 18/6
            division[1] = 5;     // representa la division de 25/5
            division[2] = -1;    // representa la division de 20/0
      }

      public static int division(int num1, int num2) {
            try {
                  return num1 / num2;
            } catch (ArithmeticException e) {
                  System.out.println(e);
                  System.out.println("!!! No se puede dividir por cero!!!");
                  return -1;
            }
      }

}
