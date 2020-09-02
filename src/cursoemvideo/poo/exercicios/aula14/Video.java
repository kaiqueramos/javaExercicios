package cursoemvideo.poo.exercicios.aula14;

public class Video implements AcoesVideo {
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reprodizindo;

    public Video(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;

        nova = (this.avaliacao + avaliacao) / this.views;

        this.avaliacao = nova;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReprodizindo() {
        return reprodizindo;
    }

    public void setReprodizindo(boolean reprodizindo) {
        this.reprodizindo = reprodizindo;
    }

    @Override
    public void play() {
        this.setReprodizindo(true);
    }

    @Override
    public void pause() {
        this.setReprodizindo(false);
    }

    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas() + 1);
    }

    @Override
    public String toString() {
        return "Video{" +
                "titulo='" + titulo + '\'' +
                ", avaliacao=" + avaliacao +
                ", views=" + views +
                ", curtidas=" + curtidas +
                ", reprodizindo=" + reprodizindo +
                '}';
    }
}
