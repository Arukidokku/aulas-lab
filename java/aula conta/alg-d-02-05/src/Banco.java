public class Banco {
    public boolean Saca(Conta c, double Valor, String ID){
        if (Valor > Saldo){
            System.out.println("Saldo ins");
            return false;
        }
        double Saldo = Conta.getSaldo();
        double Sa = Saldo - Valor;
        Conta.setSaldo(Sa);

    }
    System.out.println(ID + "Sacou:100,00 - Saldo at" + Sa);
    return true;
}

