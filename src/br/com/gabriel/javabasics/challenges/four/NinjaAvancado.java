package br.com.gabriel.javabasics.challenges.four;

public class NinjaAvancado implements Ninja{

    String nome;
    int idade;
    TipoHabilidade habilidade;
    String especialidade;

    public NinjaAvancado(){}

    public NinjaAvancado(String nome, int idade, TipoHabilidade habilidade, String especialidade){
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
        System.out.println("Especialidade: " + especialidade);
    }

    @Override
    public void executarHabilidade(){
        System.out.println("Executando habilidade");
    }
}
