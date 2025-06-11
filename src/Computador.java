public class Computador implements Runnable {
    private final int id;
    private volatile boolean running = true;
    private final Object lock = new Object(); // Objeto usado para sincronização

    public Computador(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        while (running) {
            System.out.println("Computador " + id + " está operando...");
            try {
                Thread.sleep(1000); // Simula tempo de operação
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Computador " + id + " aguardando liberação para o próximo ciclo.");
            synchronized (lock) {
                try {
                    lock.wait(); // Aguarda liberação para o próximo ciclo
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        System.out.println("Computador " + id + " foi encerrado.");
    }

    public void liberar() {
        synchronized (lock) {
            lock.notify(); // Libera a thread para continuar o ciclo
        }
    }

    public void terminate() {
        running = false; // Define o estado de execução como falso
        liberar(); // Libera a thread caso esteja bloqueada em wait()
    }
}
