public class Main {
  public static void main(String[] args) {

    // --- Autores ---
    Autor autor1 = new Autor("João Silva", "Doutor");
    Autor autor2 = new Autor("Maria Souza", "Mestre");
    Autor autor3 = new Autor("Carlos Lima", "Especialista");

    // --- Publicações ---
    Livro livro1 = new Livro("Estruturas de Dados", "2020-03-10", 5.0, 3, "Editora Tech", "978-3-16-148410-0");
    livro1.adicionarAutor(autor1);
    livro1.adicionarAutor(autor2);

    Artigo artigo1 = new Artigo("Redes Neurais Aplicadas", "2022-07-15", 3.0, "Estudo sobre redes neurais em visão computacional.");
    artigo1.adicionarAutor(autor2);

    Tese tese1 = new Tese("Inteligência Artificial na Medicina", "2021-11-20", 7.0, 180,
        "Aplicações de IA no diagnóstico médico.", "2021-11-19", "USP");
    tese1.adicionarAutor(autor3);

    // Referência entre publicações
    livro1.adicionarReferencia(artigo1);

    // --- Biblioteca ---
    Biblioteca biblioteca = new Biblioteca("Biblioteca Central", "Rua das Flores, 100");
    biblioteca.adicionarPublicacao(livro1);
    biblioteca.adicionarPublicacao(artigo1);
    biblioteca.adicionarPublicacao(tese1);

    System.out.println("Biblioteca: " + biblioteca.getNome());
    System.out.println("Publicações cadastradas: " + biblioteca.getPublicacoes().size());

    // --- Usuários ---
    UsuarioComum usuario1 = new UsuarioComum("Ana Paula", "62999990001", "ana@email.com", "111.111.111-11");
    UsuarioEspecial usuario2 = new UsuarioEspecial("Bruno Rocha", "62999990002", "bruno@email.com", "222.222.222-22");

    // --- Empréstimos ---

    // usuario1 pega o livro emprestado
    if (usuario1.podeRealizarEmprestimo()) {
      Emprestimo emp1 = new Emprestimo(usuario1, livro1);
      usuario1.adicionarEmprestimo(emp1);
      System.out.println("\n" + usuario1.getNome() + " pegou emprestado: " + livro1.getTitulo());

      // Renova 4 vezes (multa começa após a 3ª)
      emp1.renovar();
      emp1.renovar();
      emp1.renovar();
      emp1.renovar();
      System.out.println("Renovações: " + emp1.getQtdRenovacoes());

      emp1.devolver();
      System.out.println("Multa gerada: R$ " + emp1.getMultaTotal());
    }

    // usuario2 (especial) pode pegar vários
    if (usuario2.podeRealizarEmprestimo()) {
      Emprestimo emp2 = new Emprestimo(usuario2, artigo1);
      usuario2.adicionarEmprestimo(emp2);
      System.out.println("\n" + usuario2.getNome() + " pegou emprestado: " + artigo1.getTitulo());
    }

    if (usuario2.podeRealizarEmprestimo()) {
      Emprestimo emp3 = new Emprestimo(usuario2, tese1);
      usuario2.adicionarEmprestimo(emp3);
      System.out.println(usuario2.getNome() + " pegou emprestado: " + tese1.getTitulo());
    }

    System.out.println("\nEmpréstimos ativos de " + usuario2.getNome() + ": " + usuario2.getEmprestimos().size());
  }
}