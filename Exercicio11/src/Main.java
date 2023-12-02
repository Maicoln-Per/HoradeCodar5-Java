public class Main {
    public static void main(String[] args) {
        //11 - BOOOOMMM
        //Crie uma bomba relógio (usando somente código - para deixar claro!) cuja contagem regressiva vá de 30 a 0. Escreva a contagem em tela e no final da repetição escreva "EXPLOSÃO".
        for (int bomba = 30; bomba >= 0; bomba--) {
            System.out.println("Contagem regressiva: " + bomba);
        }
        System.out.println("\nEXPLOSÃOOOOO");
    }
}