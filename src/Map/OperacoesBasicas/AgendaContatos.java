package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    //Atributos
    private Map<String, Integer> agendaContatoMap;

    //construtor
    public AgendaContatos() {
        this.agendaContatoMap  = new HashMap<>();

    }
    //Métodos

    public void adicionarContato(String nome, Integer telefone){
        this.agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        //verificar a coleção
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContato = new AgendaContatos();

        agendaContato.adicionarContato("Gabriela", 123456);
        agendaContato.adicionarContato("Gabriela", 56789);
        agendaContato.adicionarContato("Gabriela Oliveira", 1111111);
        agendaContato.adicionarContato("Gabriela Dev", 678900);
        agendaContato.adicionarContato("Jhony Rehem", 1111111);
        agendaContato.adicionarContato("Gabriela", 4444444);

        agendaContato.exibirContatos();

        agendaContato.removerContato("Jhony Rehem");

        agendaContato.exibirContatos();

        System.out.println("O número é: " + agendaContato.pesquisarPorNome("Gabriela Dev"));
    }
}

