package ListaDeTarefas;

/*
Claro! Aqui está um exercício que pode ajudá-lo a praticar o uso de ArrayList e Map em Java:

Suponha que você esteja criando um programa para gerenciar uma lista de tarefas.
Cada tarefa tem um nome, uma descrição e uma data de conclusão. As tarefas podem ser organizadas em categorias.

Crie uma classe Tarefa com os atributos nome, descricao e dataConclusao. Adicione um construtor que inicialize esses atributos e métodos get para cada atributo.
Crie uma classe GerenciadorDeTarefas com um Map que mapeia o nome da categoria para uma lista de tarefas dessa categoria. Adicione um método adicionarTarefa que recebe o nome da categoria e um objeto Tarefa e adiciona a tarefa à lista de tarefas da categoria correspondente. Se a categoria não existir, ela deve ser criada.
Adicione um método exibirTarefas que recebe o nome da categoria e exibe todas as tarefas dessa categoria.
No método main, crie uma instância da classe GerenciadorDeTarefas e use os métodos adicionarTarefa e exibirTarefas para adicionar algumas tarefas e exibi-las.
 */

public class Main {
    public static void main(String[] args) throws InterruptedException{
        GerenciadorDeTarefas gerenciadorDeTarefas = new GerenciadorDeTarefas();
    }
}
