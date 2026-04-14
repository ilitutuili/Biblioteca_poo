import java.util.ArrayList;

public class Biblioteca {
  private String nome;
  private String endereco;
  private ArrayList<Publicacao> publicacoes;

  public Biblioteca(String nome, String endereco) {
    this.nome = nome;
    this.endereco = endereco;
    this.publicacoes = new ArrayList<Publicacao>();
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEndereco() {
    return this.endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public ArrayList<Publicacao> getPublicacoes() {
    return this.publicacoes;
  }

  public void adicionarPublicacao(Publicacao publicacao) {
    this.publicacoes.add(publicacao);
  }

  public void removerPublicacao(Publicacao publicacao) {
  }
}