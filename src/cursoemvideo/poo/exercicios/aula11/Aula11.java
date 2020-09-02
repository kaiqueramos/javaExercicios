package cursoemvideo.poo.exercicios.aula11;

public class Aula11 {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.pagarMensalidade();

        Professor p1 = new Professor();
        p1.receberAumento(123.00);

        Tecnico t1 = new Tecnico();
        t1.praticar();
    }
}
