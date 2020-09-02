package cursoemvideo.poo.exercicios.aula12;

public class Aula12 {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Cachorro c = new Cachorro();
        Canguru k = new Canguru();

        m.setPeso(35.3f);
        m.setCorDoPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();

        a.locomover();
        p.locomover();
        r.locomover();

        c.emitirSom();
        k.locomover();
    }
}
