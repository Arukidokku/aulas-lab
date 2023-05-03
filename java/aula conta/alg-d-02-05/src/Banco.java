public class Banco {
    public boolean Sacar(Conta c, double Valor, String ID){
        double Saldo = c.getSaldo();
        if (Valor > Saldo){
            System.out.println("Saldo ins");
            return false;
        }
        
        double Sa = Saldo - Valor;
        c.setSaldo(Sa);

    }

	public boolean Sacar(int i, Object iD) {
		return false;
	}
    System.out.println(ID + "Sacou:100,00 - Saldo at" + Sa);
    return true;
}

