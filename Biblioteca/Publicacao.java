import java.util.ArrayList;

public abstract class Publicacao {
  private String titulo;
  private String dataPublicacao;
  private ArrayList<Publicacao> referencias;
  private ArrayList<Autor> autores;
  private double valorMulta;

  public Publicacao(String titulo, String dataPublicacao, double valorMulta) {
    this.titulo = titulo;
    this.dataPublicacao = dataPublicacao;
    this.valorMulta = valorMulta;
    this.referencias = new ArrayList<Publicacao>();
    this.autores = new ArrayList<Autor>();
  }

  public String getTitulo() {
    return this.titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getDataPublicacao() {
    return this.dataPublicacao;
  }

  public void setDataPublicacao(String dataPublicacao) {
    this.dataPublicacao = dataPublicacao;
  }

  public ArrayList<Publicacao> getReferencias() {
    return this.referencias;
  }

  public void adicionarReferencia(Publicacao publicacao) {
    this.referencias.add(publicacao);
  }

  public ArrayList<Autor> getAutores() {
    return this.autores;
  }

  public void adicionarAutor(Autor autor) {
    this.autores.add(autor);
  }

  public double getValorMulta() {
    return this.valorMulta;
  }

  public void setValorMulta(double valorMulta) {
    this.valorMulta = valorMulta;
  }
}