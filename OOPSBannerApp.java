import java.util.HashMap;
import java.util.Map;

/**
 * UC8 - Using Map for Character Patterns
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        Map<Character, String[]> map = new HashMap<>();

        // O pattern
        map.put('O', new String[]{
                "  ***   ",
                " ** **  ",
                "**   ** ",
                "**   ** ",
                "**   ** ",
                " ** **  ",
                "  ***   "
        });

        // P pattern
        map.put('P', new String[]{
                " *****  ",
                " **  ** ",
                " **  ** ",
                " *****  ",
                " **     ",
                " **     ",
                " **     "
        });

        // S pattern
        map.put('S', new String[]{
                "  ****  ",
                " **     ",
                " **     ",
                "  ****  ",
                "     ** ",
                "     ** ",
                " ****   "
        });

        String word = "OOPS";

        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                line.append(map.get(ch)[i]).append(" ");
            }

            System.out.println(line);
        }
    }
}