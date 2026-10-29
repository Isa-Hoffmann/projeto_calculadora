
package calculadora;

/**
 * Realiza operações matemáticas básicas com números inteiros.
 *
 * @author Isabelly Emilye Hoffmann Furquim
 * @version 1.0
 */
public class Calculadora {

    /**
     * Armazena o resultado da operação matemática.
     */
    public int r = 0;

    /**
     * Executa uma operação matemática entre dois números inteiros.
     *
     * @param a primeiro número da operação
     * @param b segundo número da operação
     * @param op operador matemático (+, -, * ou /)
     * @return resultado da operação, ou 0 em caso de divisão por zero
     * @throws IllegalArgumentException se a operação for inválida
     */
    public int calcular(int a, int b, String op) {

        if (op.equals("+")) {
            r = a + b;
        } else if (op.equals("-")) {
            r = a - b;
        } else if (op.equals("*")) {
            r = a * b;
        } else if (op.equals("/")) {
            r = dividir(a, b);
        } else {
            throw new IllegalArgumentException("Operacao invalida");
        }

        System.out.println("Resultado = " + r);
        return r;
    }

    /**
     * Realiza a divisão entre dois números inteiros.
     *
     * @param a dividendo
     * @param b divisor
     * @return resultado da divisão, ou 0 se o divisor for zero
     */
    private int dividir(int a, int b) {
        if (b == 0) {
            System.out.println(
                "Erro: divisao por zero, operacao irregular"
            );
            return 0;
        }

        return a / b;
    }
}
