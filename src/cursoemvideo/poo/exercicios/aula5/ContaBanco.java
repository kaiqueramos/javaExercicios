package cursoemvideo.poo.exercicios.aula5;

public class ContaBanco {
    public String numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    protected boolean status;

    public ContaBanco(String numConta, String dono) {
        this.numConta = numConta;
        this.dono = dono;
        this.setSaldo(0);
        this.setStatus(false);
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getStatus() {
        if (this.status){
            return "A conta está aberta";
        }else{
            return "A conta está fechada";
        }
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(String tipoConta) {
        if (tipoConta.equals("CC")){
            this.setTipo(tipoConta);
            this.setStatus(true);
            this.setSaldo(50.0f);
            System.out.println("A conta corrente está aberta! ");
        }else if (tipoConta.equals("CP")){
            this.setTipo(tipoConta);
            this.setStatus(true);
            this.setSaldo(150.0f);
            System.out.println("A conta poupança aberta! ");
        }else {
            System.out.println("ERRO! Os tipos válidos de conta são CC e CP");
        }
    }

    public void fecharConta() {
        if (this.getSaldo() > 0){
            System.out.println("O seu saldo é " + this.getSaldo() + " . Por favor, zere a conta.");
        }else if(this.getSaldo() < 0){
            System.out.println("O seu saldo é " + this.getSaldo() + " . Por favor, acrescente saldo a sua conta até sair do negativo.");
        }else {
            this.status = false;
            System.out.println("A conta foi fechada! ");
        }
    }

    public void depositar(float valor){
        if (status){
            setSaldo(getSaldo() + valor);
        }else {
            System.out.println("A conta está fechada! ");
        }
    }

    public void sacar(float valor){
        if (this.status){
            if (saldo - valor >= 0){
                this.saldo -= valor;
                System.out.println("O valor " + valor + " foi sacado.");
            }else{
                System.out.println("Você não tem saldo suficiente. Saldo: " + this.getSaldo());
            }
        }else {
            System.out.println("Sua conta está fechada. Você precisa abrir sua conta para sacar.");
        }
    }
    public void pagarMensal(){
        if(this.tipo.equals("CC")){
            this.saldo -= 12.0f;
        }else if(this.tipo.equals("CP")){
            this.saldo -= 20.0f;
        }
    }
    public void status(){
        System.out.println("Conta numero: " + this.getNumConta());
        System.out.println("Nome do dono: " + this.getDono());
        System.out.println(this.getStatus());
        System.out.println("Tipo de conta: " + this.getTipo());
        System.out.println("Saldo: " + this.getSaldo());
    }


}
