package br.com.dio.desafio.dominio;

import java.time.LocalDate;

/**
 * Representa uma mentoria que é um tipo de conteúdo.
 */
public class Mentoria extends Conteudo {

    private LocalDate data;

    /**
     * Calcula o XP para a mentoria.
     *
     * @return XP calculado para a mentoria.
     */
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    /**
     * Obtém a data da mentoria.
     *
     * @return Data da mentoria.
     */
    public LocalDate getData() {
        return data;
    }

    /**
     * Define a data da mentoria.
     *
     * @param data Nova data da mentoria.
     */
    public void setData(LocalDate data) {
        this.data = data;
    }

    /**
     * Retorna uma representação textual da mentoria.
     *
     * @return String representando a mentoria.
     */
    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
