package br.com.gabriel.javabasics.challenges.four;

public class Main {
    public static void main(String[] args) {

        Ninja ninja = new NinjaBasico("naruto", 18, TipoHabilidade.TAIJUTSU);
        Ninja ninja2 = new NinjaAvancado("kakashi", 40, TipoHabilidade.RINNEGAN, "Raio");

        ninja.mostrarInformacoes();
        ninja.executarHabilidade();

        ninja2.mostrarInformacoes();
        ninja2.executarHabilidade();
    }
}
