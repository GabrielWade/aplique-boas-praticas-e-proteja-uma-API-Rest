package med.voll.api.domain;

public class ValidacaoPaciente extends RuntimeException {
    public ValidacaoPaciente(String mensagem) {
        super(mensagem);
    }
}
