package ListaDeTarefas;

import java.time.LocalDate;

public class Tarefa {
    private String name;
    private String descricao;
    public LocalDate dataConclusao;

    public Tarefa (
            String name,
            String descricao,
            LocalDate dataConclusao) {

        this.name = name;
        this.descricao = descricao;
        this.dataConclusao = dataConclusao;

    }
    public String getName() {
        return name;
    }
    public String getDescricao() {
        return descricao;
    }

    public LocalDate getDataConclusao() {
        return dataConclusao;
    }
}
