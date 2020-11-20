package escola;

public class Email {
//    nao eh entidade , mas sim um value object (VO)

    private static final String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    private String endereco;

    public Email(String endereco) {
        if (endereco == null || !endereco.matches(regex)) {
            throw new IllegalArgumentException("E-mail inválido!");
        }
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }
}
