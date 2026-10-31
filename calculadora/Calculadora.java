package calculadora;

/**
 * Calculadora com operações matemáticas básicas.
 *
 * @author Isabelly Emilye Hoffmann Furquim
 * @version 1.0
 */
public class Calculadora {

    public int r = 0;

    /**
     * Realiza a operação escolhida.
     *
     * @param a primeiro número
     * @param b segundo número
     * @param op operação (+, -, * ou /)
     * @return resultado da operação
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
     * Realiza a divisão, verificando se o divisor é zero.
     *
     * @param a dividendo
     * @param b divisor
     * @return resultado da divisão ou zero
     */
    private int dividir(int a, int b) {
        if (b == 0) {
            System.out.println("Erro: divisao por zero, operacao irregular");
            return 0;
        }

        return a / b;
    }
}