public class exercicio4 {
    public static void main(String[] args) {

//        Mike tem um nro da sorte: 25.
//        Ele conseguiu uma listagem do histórico dos resultados da loteria conforme arrays abaixo.
//        Escreva um código para percorrer os elementos de nros sorteados e contabilizar quantas vezes o nro da sorte dele foi sorteado.
//
//                Dica: Usar um for dentro do outro para percorrer os arrays internos.
        int sorteados[][] = {
                { 1, 44,  6,  2, 45, 60},
                {10, 21, 55, 25, 34, 44},
                { 8, 18, 28, 29, 55, 59},
                {60, 25, 11, 34,  6,  9},
                {55, 43, 25, 12,  7, 11}
        };

//        int qtd = 0;
//
//        for(int i=0; i<sorteados.length;i++) {
//
//            for(int j=0; j<sorteados.length;j++) {
//
//                if(sorteados[i][j] == 25)
//                    qtd++;
//
//            }
//        }
        int luckyNumberPicked = 0;
        final int luckyNumber = 25;

        for (int[] arr : sorteados) {
            for (int number : arr) {
                if (number == luckyNumber)
                    luckyNumberPicked++;
            }
        }

//        System.out.println("O número 25 repete "+ qtd + "vezes");
        System.out.printf("O número 25 aparece %d vezes", luckyNumberPicked);
    }
}
