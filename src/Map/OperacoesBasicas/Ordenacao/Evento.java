package Map.OperacoesBasicas.Ordenacao;

import java.time.LocalDate;

public class Evento {

    //atributos

    private String nome;
    private String Atracao;
    private LocalDate data;

    public Evento(String nome, String nomeAtracao) {
        this.nome = nome;
        this.Atracao = nomeAtracao;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public String getAtracao() {
        return Atracao;
    }

    public LocalDate getData() {
        return data;
    }

    @Override
    public String toString() {
        return
                 nome + '\'' +
                 Atracao + '\'' +
                '}';
    }
}
