public class Main {
    public static void main(String [] args)throws Exception {
        Tarefa t = new Tarefa();
        t.nome = "thread 1 portanto A";
        Thread tr = new Thread(t);
        tr.start();
        Tarefa t2 = new Tarefa();
        t2.nome = "thread 2 portanto B";
        Thread tr2 = new Thread(t2);
        tr2.start();
    }

}
