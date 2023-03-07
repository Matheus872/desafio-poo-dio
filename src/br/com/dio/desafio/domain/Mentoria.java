package br.com.dio.desafio.domain;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    LocalDate data;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "Titulo" + getTitulo() + "/" +
                "Descrição" + getDescricao() + "/" +
                "Carga Horária" + getCargaHoraria() + "/" +
                "data=" + data +
                "} " + super.toString();
    }
}
