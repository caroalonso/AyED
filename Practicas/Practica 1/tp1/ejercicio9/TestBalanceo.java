package tp1.ejercicio9;

import java.util.Stack;

public class TestBalanceo {
    // Método principal para verificar si un string está balanceado
    public static boolean esBalanceado(String s) {

        Stack<Character> pila = new Stack<>();

        for (char c : s.toCharArray()) {
            switch (c) {
                case '(':
                case '[':
                case '{':
                    pila.push(c);
                    break;
                case ')':
                    if (pila.isEmpty() || pila.pop() != '(') {
                        return false;
                    }
                    break;
                case ']':
                    if (pila.isEmpty() || pila.pop() != '[') {
                        return false;
                    }
                    break;
                case '}':
                    if (pila.isEmpty() || pila.pop() != '{') {
                        return false;
                    }
                    break;
                default:
                    // Si el carácter no es un paréntesis, podemos ignorarlo o devolver false.
                    // Depende de si se esperan otros caracteres.
                    return false;
            }
        }

        return pila.isEmpty();
    }
}
