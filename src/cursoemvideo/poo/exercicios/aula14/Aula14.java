package cursoemvideo.poo.exercicios.aula14;

public class Aula14 {
    public static void main(String[] args) {
        Video[] v = new Video[3];
        v[0] = new Video("Fervendo gelo");
        v[1] = new Video("Esplodindo milho");
        v[2] = new Video("Esquentando água");

        Gafanhoto[] g = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubilu", 15, "M", "Pipitchu");
        g[1] = new Gafanhoto("Marilu", 22, "F", "FliuFlau");


        Visualizacao visu = new Visualizacao(g[0], v[0]);

        visu.avaliar(80.0);

        System.out.println(visu.toString());

    }
}
