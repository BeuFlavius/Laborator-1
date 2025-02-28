
public class LitereAlfabet {
    public static void main(String[]args) {
        String alfabet = "";
        for (char c = 'a'; c <= 'z'; c++) {
            //System.out.println();
            alfabet += String.valueOf(c);
        }
        System.out.println(alfabet);
        System.out.println(alfabet.toUpperCase());

        System.out.println();
    }

}
