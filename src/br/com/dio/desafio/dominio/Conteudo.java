package br.com.dio.desafio.dominio;

/**
 * Classe abstrata que representa um conteúdo genérico.
 */
public abstract class Conteudo {

    /**
     * XP padrão atribuído a um conteúdo.
     */
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    /**
     * Método abstrato que deve ser implementado pelas subclasses para calcular o XP do conteúdo.
     *
     * @return XP calculado para o conteúdo.
     */
    public abstract double calcularXp();

    /**
     * Obtém o título do conteúdo.
     *
     * @return Título do conteúdo.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Define o título do conteúdo.
     *
     * @param titulo Novo título do conteúdo.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtém a descrição do conteúdo.
     *
     * @return Descrição do conteúdo.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define a descrição do conteúdo.
     *
     * @param descricao Nova descrição do conteúdo.
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Retorna uma representação textual do conteúdo.
     *
     * @return String representando o conteúdo.
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
