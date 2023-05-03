public class Cliente extends Thread {
    private Banco b; 
    private Conta c;
    private String nome;
    public Cliente (String nome, Conta c){
        this.c = c;
        this.nome = nome;
        b = new Banco();
    }
    public void run(){
        while(Banco.Sacar(c, 100, nome)){
        {}
        }
    }
}
