public class Emprestimo {
  private Usuario usuario;
  private Publicacao publicacao;
  private int qtdRenovacoes;
  private double multaTotal;

  public Emprestimo(Usuario usuario, Publicacao publicacao) {
    this.usuario = usuario;
    this.publicacao = publicacao;
    this.qtdRenovacoes = 0;
    this.multaTotal = 0;
  }

  public Usuario getUsuario() {
    return this.usuario;
  }

  public Publicacao getPublicacao() {
    return this.publicacao;
  }

  public int getQtdRenovacoes() {
    return this.qtdRenovacoes;
  }

  public double getMultaTotal() {
    return this.multaTotal;
  }

  public void renovar() {
  }

  public void devolver() {
  }

  public void calcularMulta() {
  }
}