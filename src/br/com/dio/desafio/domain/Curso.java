package br.com.dio.desafio.domain;

public class Curso extends Conteudo{

    @Override
    public double calcularXP() {
        return XP_PADRAO * getCargaHoraria();
    }

    @Override
    public String toString() {
        return "Curso{" +
                "Título" + getTitulo() + "/" +
                "Descrição" + getDescricao() + "/" +
                "Carga Horária" + getCargaHoraria() + "/" +
                "} " + super.toString();
    }
}
