package academico.ifs.edu.br.patterns.prototype;

public class bookPrototype implements Prototype{
    private String titulo = "Capitaes de Areia" , nomeDedicatoria,
            categoria = "Romance", autor = "Jorge Amado", editora = "Jose Olympio";
    private int qtdPaginas = 392;

    public bookPrototype(){
        setNomeDedicatoria(null);
    }
    public bookPrototype(bookPrototype livro){
        livro.getNomeDedicatoria();
    }
    @Override
    public String exibirImpressao() {
        return "Titulo do livro: " + getTitulo()+ "\nAutor: " + getAutor() + "\nEditora: "+getEditora() + "\nCategoria: " +getCategoria()
                + "\nQuantidade de Paginas: " + getQtdPaginas() + "\nDedicatoria: " + getNomeDedicatoria()+"\n";
    }

    @Override
    public Prototype clone() {
        return new bookPrototype(this);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getNomeDedicatoria() {
        return nomeDedicatoria;
    }

    public void setNomeDedicatoria(String nomeDedicatoria) {
        this.nomeDedicatoria = nomeDedicatoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public int getQtdPaginas() {
        return qtdPaginas;
    }
}
