public class UsuarioComum extends Usuario {

  public UsuarioComum(String nome, String telefone, String email, String cpf) {
    super(nome, telefone, email, cpf);
  }

  public boolean podeRealizarEmprestimo() {
    return false;
  }
}