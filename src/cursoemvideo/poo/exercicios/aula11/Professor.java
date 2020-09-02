package cursoemvideo.poo.exercicios.aula11;

public class Professor extends Pessoa {
    private String especialidade;
    private double salario;

    public void receberAumento(double valor){
        salario += valor;
    }
}
