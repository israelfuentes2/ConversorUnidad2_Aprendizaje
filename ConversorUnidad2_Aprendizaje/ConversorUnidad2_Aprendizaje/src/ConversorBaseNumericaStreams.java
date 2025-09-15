import java.util.*;
import java.util.stream.*;

public class ConversorBaseNumericaStreams {

    public static int[] convertirBase(int numero, int base) {
        if (numero == 0) return new int[]{0};
        int[] digitos = new int[32];
        int idx = 0;
        while (numero > 0) {
            digitos[idx++] = numero % base;
            numero /= base;
        }
        int[] resultado = new int[idx];
        for (int i = 0; i < idx; i++) {
            resultado[i] = digitos[idx - i - 1];
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número en base 10: ");
        int numero = sc.nextInt();

        int[] binario = convertirBase(numero, 2);
        int[] octal = convertirBase(numero, 8);
        int[] hex = convertirBase(numero, 16);

        System.out.println("Binario: " + Arrays.toString(binario));
        System.out.println("Octal: " + Arrays.toString(octal));
        System.out.println("Hexadecimal: " + Arrays.toString(hex));

        List<Integer> listaBinario = Arrays.stream(binario).boxed().toList();

        List<Integer> ordenado = listaBinario.stream().sorted().toList();
        System.out.println("Binario ordenado (Stream.sorted): " + ordenado);

        List<Integer> soloUnos = listaBinario.stream().filter(d -> d == 1).toList();
        System.out.println("Solo dígitos 1: " + soloUnos);

        List<Integer> multiplicados = listaBinario.stream().map(d -> d * 2).toList();
        System.out.println("Dígitos multiplicados por 2: " + multiplicados);

        int suma = listaBinario.stream().reduce(0, Integer::sum);
        System.out.println("Suma de dígitos binarios: " + suma);

        long cantidad = listaBinario.stream().count();
        System.out.println("Cantidad de dígitos: " + cantidad);

        sc.close();
    }
}
