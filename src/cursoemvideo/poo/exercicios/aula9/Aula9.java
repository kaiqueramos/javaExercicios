package cursoemvideo.poo.exercicios.aula9;

public class Aula9 {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("João", 25, "Masculino");
        Livro l = new Livro("Sandman", "Neil Gayman", 120, p);
        l.abrir();
        l.detalhes();
    }
}
