public class exercicio10 {
    public static void main(String[] args) {

//        Um palíndrome (ou palíndromo), segundo o dicionário Houaiss,
//        "diz-se de frase ou palavra que se pode ler, indiferentemente, da esquerda para direita ou vice-versa",
//        como por exemplo: osso, ana, radar.
//        Ou seja, é uma palavra que quando lida de trás pra frente tem o mesmo significado.
//
//        Implemente um código com o que aprendemos até agora que retorne se determinada palavra é um palíndromo.

        String palavra = "arara";
        int metade = palavra.length() / 2;
        boolean isPalandrome = true;

        for (int i=0; i< metade; i++) {
            if (palavra.charAt(i) != palavra.charAt( palavra.length()-1 - i )) {
                isPalandrome = false;
                break;
            }
        }
        String mensagem = isPalandrome? "é palíndromo" : "não é palíndromo";
        System.out.printf("A palavra '%s' %s", palavra, mensagem);
    }
}
