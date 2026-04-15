/**
 * OOPSBannerApp UC3 - OOPS Banner Application (Use Case 3)
 * Uses String.join() instead of + operator for better readability and efficiency
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Each line represents O O P S

        System.out.println(String.join(" ",
                "  ***   ", "  ***   ", " *****  ", "  ****  "));

        System.out.println(String.join(" ",
                " ** **  ", " ** **  ", " **  ** ", " **     "));

        System.out.println(String.join(" ",
                "**   ** ", "**   ** ", " **  ** ", " **     "));

        System.out.println(String.join(" ",
                "**   ** ", "**   ** ", " *****  ", "  ****  "));

        System.out.println(String.join(" ",
                "**   ** ", "**   ** ", " **     ", "     ** "));

        System.out.println(String.join(" ",
                " ** **  ", " ** **  ", " **     ", "     ** "));

        System.out.println(String.join(" ",
                "  ***   ", "  ***   ", " **     ", " ****   "));
    }
}