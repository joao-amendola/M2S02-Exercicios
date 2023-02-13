public class exercicio3 {
    public static void main(String[] args) {
//        Percorra array com estrutura de repetição e faça operações com condicionais:
//
//        O array abaixo representa lançamentos na conta bancária do Luke.
//                Os valores negativos são débitos e os valores positivos são créditos.
//
//        Implemente um código copiando o array abaixo, e depois imprima no console o que se pede:
//
        int[] extrato = { 100, -35, -15, -5, 55, -20 };
//
//        a) Percorra o array (operador 'for') e imprima cada elemento do array na ordem;

//        for(int i=0; i<extrato.length;i++) { System.out.println(extrato[i]); }
//        System.out.println();
        for(int el : extrato){
            System.out.println(el);
        }
        System.out.println();
//        b) Percorra o array (operador 'for') e imprima os elementos de trás pra frente (do último para o primeiro);
        for(int i=extrato.length-1; i>=0; i--) {
            System.out.println(extrato[i]);
        }
//        c) Percorra o array (operador 'for') e calcule o saldo final da conta (valor inicial era zero),
//        imprima o resultado no console. (Dica: crie uma variável saldo inicializada com zero e vá atualizando seu valor);
        System.out.println();
        int somaExtrato = 0;
        for(int el : extrato){
            somaExtrato += el;
        }
        System.out.println("Soma do extrato: "+ somaExtrato);
//        d) Imprima no console a mensagem 'saldo positivo' ou 'saldo negativo', dependendo do resultado do saldo final calculado.
//        System.out.println();
//        if (somaExtrato > 0)
//            System.out.println("Saldo positivo");
//        else
//            System.out.println("Saldo negativo");
        System.out.println();
        String mensagem = somaExtrato >= 0 ? "Saldo positivo" : "Saldo negativo";
        System.out.println(mensagem);
    }
}
