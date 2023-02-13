public class exercicio5 {
    public static void main(String[] args) {

//        Implemente uma função 'calcular' que receba como parâmetro um array (numérico) e
//        identifique o maior e menor valor do mesmo. Imprima no console estes valores ou
//        "Não é possível calcular" qdo não for possível.
//
//         Teste a função com as seguintes entradas:

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

//        boolean calculado = true;

        int[] arr = {56, 65, 64, -3, 23, 42, -15, 65, 14, 32, 78, 70, 47};
//        int[] arr = {1};
//        int[] arr = {1, -1};
//        int[] arr = null;
//        int[] arr = {-2,-2,-2,-2};
//        int[] arr = {20,10, 30};

        if (arr == null || arr.length == 0) {
            System.out.println("Não é possível calcular");
            return;
        }

        for (int el : arr) {
            if (el > maior) {
                maior = el;
            }
            if (el < menor) {
                menor = el;
            }
        }

        System.out.printf("Maior valor: %d, Menor valor: %d",maior, menor);
    }
}
