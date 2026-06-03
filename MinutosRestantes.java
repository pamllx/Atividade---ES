import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class MinutosRestantes {
    public static void main(String[] args) {
        // Pega a hora atual do sistema
        LocalTime agora = LocalTime.now();
        
        // Define o final do dia (23:59:59)
        LocalTime fimDoDia = LocalTime.MAX;

        // Calcula a diferença total em minutos
        long minutosFaltando = agora.until(fimDoDia, ChronoUnit.MINUTES);

        // [NOVA FUNÇÃO 1] Transforma o total de minutos em Horas e Minutos quebrados
        long horasFaltando = minutosFaltando / 60;
        long minutosFinais = minutosFaltando % 60;

        // [NOVA FUNÇÃO 2] Calcula a porcentagem do dia que já foi concluída
        long totalMinutosNoDia = 24 * 60; // 1440 minutos
        long minutosPassados = totalMinutosNoDia - minutosFaltando;
        double porcentagemDoDia = ((double) minutosPassados / totalMinutosNoDia) * 100;

        // Exibe o resultado formatado no console
        System.out.println("=========================================");
        System.out.println(" Hora atual: " + agora.toString().substring(0, 5));
        System.out.println(" Faltam " + minutosFaltando + " minutos para o dia terminar.");
        System.out.println(" Tempo restante: " + horasFaltando + "h e " + minutosFinais + "m.");
        System.out.println(String.format(" Seu dia está %.1f%% concluído!", porcentagemDoDia));
        System.out.println("=========================================");
    }
}