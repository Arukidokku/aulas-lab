public class App {
    Conta c = new Conta(1000);

    Cliente c1,c2,c3;
    c1 = new Cliente("Pai");
    c2 = new Cliente("Filho");
    c3 = new Cliente("Mãe");
    c1.Start();
    c2.Start();
    c3.Start();
}
