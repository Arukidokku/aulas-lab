public class Cliente extends Thread {
    private Banco b; 
    private Conta c;
    private String nome;
    Object ID;
    public Cliente (String nome, Conta c, String ID){
        this.c = c;
        this.nome = nome;
        b = new Banco();
    }
    public void run(){
        
    
        while(b.Sacar(100, ID)){
        {   
            try{Thread.sleep(200);}
            catch () {
                
            }
        }
        
        }
    }
    
}
