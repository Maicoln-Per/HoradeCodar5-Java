
public class Main {
    public static void main(String[] args) {
        //15 - Uma Brincadeira Sobre Alturas
        //Anacleto tem 1,50 metro e cresce 2 centímetros por ano, enquanto Felisberto tem 1,1O metro e cresce 3 centímetros por ano. Construa um algoritmo que calcule e imprima quantos anos serão necessários para que Felisberto seja maior que Anacleto.
        double alturaAnacleto = 1.50;
        double alturaFelisberto = 1.10;

        //1 metro = 100 centímetros
        //Divida a quantidade de cada metro por 100 centímetros, porque a 100 centímetros equivale 1 metro.
        //Crescimento Anacleto em metros por ano: (quantidade de metros por ano) 2 / 100 = 0.02
        double crescimentoAnacleto = 0.02;
        //Crescimento Felisbertp em metros por ano: (quantidade de metros por ano) 3 / 100 = 0.03
        double crescimentoFelisberto = 0.03;

        int anos = 0;

        while (alturaFelisberto <= alturaAnacleto) {
            alturaAnacleto += crescimentoAnacleto;
            alturaFelisberto += crescimentoFelisberto;
            anos++;
        }
        System.out.printf("Serão necessários %d anos para que Felisberto seja maior que Anacleto.", anos);
    }
}