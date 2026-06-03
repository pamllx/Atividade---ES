import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class MinutosRestantes {
    public static void main(String[] args) {
        // Pega a hora atual do sistema
        LocalTime agora = LocalTime.now();
        
        // Define o final do dia (23:59:59)
        LocalTime fimDoDia = LocalTime.MAX;

        // Calcula a diferença em minutos
        long minutosFaltando = agora.until(fimDoDia, ChronoUnit.MINUTES);

        // Exibe o resultado no console
        System.out.println("=========================================");
        System.out.println(" Hora atual: " + agora.toString().substring(0, 5));
        System.out.println(" Faltam " + minutosFaltando + " minutos para o dia terminar!");
        System.out.println("=========================================");
    }
}