public class Tese extends Publicacao {
  private int numeroPaginas;
  private String resumo;
  private String dataDefesa;
  private String instituicao;

  public Tese(String titulo, String dataPublicacao, double valorMulta,
      int numeroPaginas, String resumo, String dataDefesa, String instituicao) {
    super(titulo, dataPublicacao, valorMulta);
    this.numeroPaginas = numeroPaginas;
    this.resumo = resumo;
    this.dataDefesa = dataDefesa;
    this.instituicao = instituicao;
  }

  public int getNumeroPaginas() {
    return this.numeroPaginas;
  }

  public void setNumeroPaginas(int numeroPaginas) {
    this.numeroPaginas = numeroPaginas;
  }

  public String getResumo() {
    return this.resumo;
  }

  public void setResumo(String resumo) {
    this.resumo = resumo;
  }

  public String getDataDefesa() {
    return this.dataDefesa;
  }

  public void setDataDefesa(String dataDefesa) {
    this.dataDefesa = dataDefesa;
  }

  public String getInstituicao() {
    return this.instituicao;
  }

  public void setInstituicao(String instituicao) {
    this.instituicao = instituicao;
  }
}