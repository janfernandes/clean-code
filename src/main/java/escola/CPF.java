package escola;

public class CPF {
    private static final String regex = "\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}";

    private String numero;

    public CPF(String cpf) {
        if (cpf == null || !cpf.matches(regex)) {
            throw new IllegalArgumentException("CPF inválido!");
        }
        this.numero = cpf;
    }

    public String getNumero() {
        return numero;
    }
}
