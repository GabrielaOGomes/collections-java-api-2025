package list.OpercoesBasicas;

public class Tarefa {

    //atributo

    private String descricao;

    //construtor
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }
    //metodo que vai retornar o valor da descricao
    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return  descricao;

    }
}
