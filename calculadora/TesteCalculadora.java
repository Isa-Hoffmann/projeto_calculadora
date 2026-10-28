
package calculadora;

public class TesteCalculadora {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // Testes rápidos
        calc.calcular(2, 3, "+"); // esperado: 5
        calc.calcular(10, 4, "-"); // esperado: 6
        calc.calcular(3, 5, "*"); // esperado: 15
        calc.calcular(8, 2, "/"); // esperado: 4
        calc.calcular(8, 0, "/"); // divisao por zero
            try {
        calc.calcular(5, 5, "x");
    } catch (IllegalArgumentException e) {
        System.out.println("Teste de operacao invalida: " + e.getMessage());
    }
    }
}
