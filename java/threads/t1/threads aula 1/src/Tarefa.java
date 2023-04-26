public class Tarefa implements Runnable {
    int soma = 0;
    String nome;

    public void run() {
        for(int i = 1; i < 10000; i++){
        soma = soma + 1;
        System.out.println(nome + "-" + i + "-" + soma);
        }
    }
}
