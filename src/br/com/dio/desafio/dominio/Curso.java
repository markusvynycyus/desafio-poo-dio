package br.com.dio.desafio.dominio;

/**
 * Representa um curso que é um tipo de conteúdo.
 */
public class Curso extends Conteudo {

    private int cargaHoraria;

    /**
     * Calcula o XP para o curso baseado na carga horária.
     *
     * @return XP calculado para o curso.
     */
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    /**
     * Obtém a carga horária do curso.
     *
     * @return Carga horária do curso.
     */
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    /**
     * Define a carga horária do curso.
     *
     * @param cargaHoraria Nova carga horária do curso.
     */
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    /**
     * Retorna uma representação textual do curso.
     *
     * @return String representando o curso.
     */
    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
