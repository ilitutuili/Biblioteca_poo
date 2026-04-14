import java.util.ArrayList;

public abstract class Usuario {
  private String nome;
  private String telefone;
  private String email;
  private String cpf;
  private ArrayList<Emprestimo> emprestimos;

  public Usuario(String nome, String telefone, String email, String cpf) {
    this.nome = nome;
    this.telefone = telefone;
    this.email = email;
    this.cpf = cpf;
    this.emprestimos = new ArrayList<Emprestimo>();
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getTelefone() {
    return this.telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getCpf() {
    return this.cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public ArrayList<Emprestimo> getEmprestimos() {
    return this.emprestimos;
  }

  public void adicionarEmprestimo(Emprestimo emprestimo) {
    this.emprestimos.add(emprestimo);
  }

  public abstract boolean podeRealizarEmprestimo();
}