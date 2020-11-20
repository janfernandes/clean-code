package escola;

public class Indicacao {
    // eh boa pratica usar os mesmos termos do mundo real
    private Aluno indicado;
    private Aluno indicante;

    public Indicacao(Aluno indicado, Aluno indicante) {
        this.indicado = indicado;
        this.indicante = indicante;
    }
}
