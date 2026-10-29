
package calculadora;

/**
 * Executa testes básicos da classe Calculadora.
 *
 * @author Isabelly Emilye Hoffmann Furquim
 * @version 1.0
 */
public class TesteCalculadora {

    /**
     * Executa os testes das operações matemáticas.
     *
     * @param args argumentos da linha de comando
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // Teste de soma: esperado 5
        calc.calcular(2, 3, "+");

        // Teste de subtração: esperado 6
        calc.calcular(10, 4, "-");

        // Teste de multiplicação: esperado 15
        calc.calcular(3, 5, "*");

        // Teste de divisão: esperado 4
        calc.calcular(8, 2, "/");

        // Teste de divisão por zero: esperado 0
        calc.calcular(8, 0, "/");

        // Teste de operação inválida
        try {
            calc.calcular(5, 5, "x");
        } catch (IllegalArgumentException e) {
            System.out.println(
                "Teste de operacao invalida: " + e.getMessage()
            );
        }
    }
}
