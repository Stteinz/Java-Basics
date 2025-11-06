package br.com.gabriel.javabasics.challenges.four;

public class NinjaBasico implements Ninja{

    String nome;
    int idade;
    TipoHabilidade habilidade;

    public NinjaBasico(){}

    public NinjaBasico(String nome, int idade, TipoHabilidade habilidade){
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    @Override
    public void mostrarInformacoes(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Habilidade: "+this.habilidade);
    }

    @Override
    public void executarHabilidade(){
        System.out.println("Executando habilidade");
    }
}
