import org.pmw.tinylog.Logger;
import org.pmw.tinylog.Configurator;
import org.pmw.tinylog.writers.FileWriter;

public class AssignmentMain
{
    public static void main(String[] args) {
        Configurator.defaultConfig().writer(new FileWriter("log.txt")).activate();
        System.out.format("%s%n", "お前はもう死んでる");
        System.out.format("%x%n", (int)'お');   

        String s = "お前はもう死んでる";
        for (char c : s.toCharArray()) {
            System.out.print((int)c + " ");
        }
        System.out.println();
        for (char c : s.toCharArray()) {
            System.out.format("%x ", (int)c);
            Logger.info(String.format("%x ", (int)c));
        }
        System.out.println();
        System.out.print('\u304a');
        System.out.format("%c%c%c%c%c%c%c%c%c%n",12362, 21069, 12399, 12418, 12358, 27515, 12435, 12391, 12427);
    }
}
