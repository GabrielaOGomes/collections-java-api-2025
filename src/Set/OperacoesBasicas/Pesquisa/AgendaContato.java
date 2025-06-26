package Set.OperacoesBasicas.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {

    private Set<Contato> contatosSet;

    public AgendaContato() {
        this.contatosSet = new HashSet<>();

    }

    public void adicionarContato(String nome, int numero){
        contatosSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatosSet);
    }

    public Set<Contato> pesquisarContatoPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatosSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoParaAtualizar = null;
        //for para iterar por todo o set
        for(Contato c : contatosSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoParaAtualizar = c;
                break;
            }
        }
        return contatoParaAtualizar;
    }

    public static void main(String[] args) {
        //instanciação do obj AgendaContato
        AgendaContato agendaContato = new AgendaContato();

        agendaContato.exibirContatos();
        //quando adiciona em HashSet a ordem é aleatória
        agendaContato.adicionarContato("Gabriela", 123456);
        agendaContato.adicionarContato("Gabriela", 56789);
        agendaContato.adicionarContato("Gabriela Oliveira", 1111111);
        agendaContato.adicionarContato("Gabriela Dev", 678900);
        agendaContato.adicionarContato("Jhony Rehem", 1111111);

        agendaContato.exibirContatos();

        System.out.println(agendaContato.pesquisarContatoPorNome("Gabriela"));

        System.out.println("Contato atualizado: " + agendaContato.atualizarNumeroContato("Jhony Rehem", 2222222));
    }

}
