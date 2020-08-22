package cursoemvideo.poo.exercicios.aula5;

public class Aula5 {
    public static void main(String[] args) {
        ContaBanco conta1 = new ContaBanco("54919-9", "Pedro Pedroso");
        conta1.status();

        conta1.abrirConta("CP");
        System.out.println(conta1.getSaldo());
        conta1.fecharConta();

    }
}
