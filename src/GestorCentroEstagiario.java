import java.util.List;

public class GestorCentroEstagiario {
    private final List<Computador> computadores; // Lista de threads que representam os computadores

    // Construtor que inicializa o gestor com uma lista de threads
    public GestorCentroEstagiario(List<Computador> computadores) {
        this.computadores = computadores;
    }

    // Método para iniciar todas as threads dos computadores
    public void iniciarComputadores() {
        for (Computador computador : computadores) { // Inicia a execução da thread
            new Thread(computador, "Thread-" + computador).start();
        }
    }

    // Método para liberar as threads que estão no estado WAITING
    public void liberarComputadores() {
        for (Computador computador : computadores) {
            computador.liberar(); // Chama o método liberar() da classe Computador
        }
    }

    // Método para encerrar todas as threads de forma segura
    public void encerrarComputadores() {
        for (Computador computador : computadores) {
            computador.terminate();
        }
    }

    // Método para monitorar e exibir o estado atual de cada thread
    public void monitorarEstadoComputadores() {
        for (Computador computador : computadores) {
            // Exibe o estado atual da thread no console
            System.out.println("Estado de computador " + Thread.currentThread().getName() + ": " + Thread.currentThread().getState());
        }
    }
}
