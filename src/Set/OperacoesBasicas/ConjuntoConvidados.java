package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    //atributo

    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
         Convidado convidadoParaRemover = null;
         for(Convidado c : convidadosSet){
             if(c.getCodigoConvite() == codigoConvite){
                 convidadoParaRemover = c;
                 break;
             }
         }
         convidadosSet.remove(convidadoParaRemover);
    }
    public int contarConvidados(){
        return convidadosSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        conjuntoConvidados.adicionarConvidado("Convidado 1", 12345);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 67890);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 12345);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 67890);


        System.out.println("Total de convidados: " + conjuntoConvidados.contarConvidados());
        conjuntoConvidados.exibirConvidados();
        System.out.println("Avaliando convites duplicados...");
    }
}
