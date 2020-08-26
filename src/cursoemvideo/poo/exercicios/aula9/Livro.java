package cursoemvideo.poo.exercicios.aula9;

import java.util.Random;

public class Livro implements LivroInterface {

    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;

    }

    public void detalhes(){
        System.out.println("O nome do livro é " + this.getTitulo());
        System.out.println("Escrito por " + this.getAutor());
        System.out.println("Tem " + this.getTotPaginas() + " páginas");
        System.out.println("O livro está aberto? " + this.isAberto());
        System.out.println(this.getLeitor().getNome() + " está na página " + this.getPagAtual());

    }

    @Override
    public void abrir() {
        this.setAberto(true);
        this.setPagAtual(1);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
        this.setPagAtual(0);
    }

    @Override
    public void folhear() {
        Random rand = new Random();
        this.setPagAtual(rand.nextInt(this.getTotPaginas()));
        System.out.println("Você caiu na página " + this.getPagAtual());
        this.setAberto(true);
    }

    @Override
    public void avancarPag() {
        if (this.isAberto()){
            this.setPagAtual(this.getPagAtual() + 1);
        }else{
            System.out.println("O livro está fechado");
        }
    }

    @Override
    public void voltarPag() {
        this.setPagAtual(this.getPagAtual() - 1);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
}
