import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LamdaThreads {
    public static void main(String[] args) {
        ExecutorService thrpool = Executors.newFixedThreadPool(2);

        Runnable run = () ->
        {
            Random ran = new SecureRandom();
            for(Integer j=0; j<10; j++)
            {
                System.out.printf("[%d]: %d\n", j, ran.nextInt(100));
            }
        };
        
        for(Integer i=0; i<3; i++)
        {
            thrpool.submit(run);
            // thrpool.submit(
            // // Runnable - public void run()
            // () -> {
            //     Random ran = new SecureRandom();
            //     for(Integer j=0; j<10; j++)
            //     {
            //         System.out.printf("[%d]: %d\n", j, ran.nextInt(100));
            //     }
            // }
            
            // );
        }
    }
    
}
