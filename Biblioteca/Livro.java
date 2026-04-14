public class Livro extends Publicacao {
  private int numeroEdicao;
  private String editora;
  private String isbn;

  public Livro(String titulo, String dataPublicacao, double valorMulta,
      int numeroEdicao, String editora, String isbn) {
    super(titulo, dataPublicacao, valorMulta);
    this.numeroEdicao = numeroEdicao;
    this.editora = editora;
    this.isbn = isbn;
  }

  public int getNumeroEdicao() {
    return this.numeroEdicao;
  }

  public void setNumeroEdicao(int numeroEdicao) {
    this.numeroEdicao = numeroEdicao;
  }

  public String getEditora() {
    return this.editora;
  }

  public void setEditora(String editora) {
    this.editora = editora;
  }

  public String getIsbn() {
    return this.isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }
}