import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) throws InterruptedException {
        List<Computador> computadores = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            computadores.add(new Computador(i));
        }

        GestorCentroEstagiario gestor = new GestorCentroEstagiario(computadores);
        gestor.iniciarComputadores();

        for (int i = 0; i < 3; i++) {
            Thread.sleep(2000); // Espera 2 segundos antes de liberar os computadores
            gestor.monitorarEstadoComputadores();
            gestor.liberarComputadores();
            System.out.println("Liberando computadores para o próximo ciclo...");
        }

        Thread.sleep(15000); // Espera 15 segundos antes de encerrar
        gestor.encerrarComputadores();

        System.out.println("Centro de estágio da UM encerrado.");
    }
}