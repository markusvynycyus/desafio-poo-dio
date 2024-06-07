package br.com.dio.desafio.dominio;

import java.util.*;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverEmConteudo(Conteudo conteudo) {
        this.conteudosInscritos.add(conteudo);
    }

    public void progredirNoConteudo(Conteudo conteudo) {
        if (conteudosInscritos.contains(conteudo)) {
            this.conteudosConcluidos.add(conteudo);
            this.conteudosInscritos.remove(conteudo);
        } else {
            System.err.println("Você não está matriculado neste conteúdo!");
        }
    }

    public double calcularTotalXp() {
        double soma = 0.0;
        for (Conteudo conteudo : this.conteudosConcluidos) {
            soma += conteudo.calcularXp();
        }
        return soma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return Collections.unmodifiableSet(conteudosInscritos);
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return Collections.unmodifiableSet(conteudosConcluidos);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) &&
                Objects.equals(conteudosInscritos, dev.conteudosInscritos) &&
                Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }

    public void inscreverBootcamp(Bootcamp bootcamp) {
    }

    public void progredir() {
    }
}
