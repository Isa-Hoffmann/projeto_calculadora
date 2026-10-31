package calculadora;

/**
 * Testa as operações da calculadora.
 *
 * @author Isabelly Emilye Hoffmann Furquim
 * @version 1.0
 */
public class TesteCalculadora {

    /**
     * Executa os testes.
     *
     * @param args argumentos da linha de comando
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        calc.calcular(2, 3, "+");  // Esperado: 5

        calc.calcular(10, 4, "-"); // Esperado: 6

        calc.calcular(3, 5, "*");  // Esperado: 15

        calc.calcular(8, 2, "/");  // Esperado: 4

        calc.calcular(8, 0, "/");  // Esperado: 0

        try {
            calc.calcular(5, 5, "x");
        } catch (IllegalArgumentException e) {
            System.out.println("Operacao invalida: " + e.getMessage());
        }
    }
}
