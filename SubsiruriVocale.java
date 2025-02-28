import java.util.ArrayList;

public class SubsiruriVocale {
    public static void main(String[] args) {

        String alfabet = "abcdefghijklmnopqrstuvwxyz";
        ArrayList<String> subsiruri = new ArrayList<>();


        String vocale = "aeiou";
        int start = 0;


        for (int i = 1; i < alfabet.length(); i++) {
            if (vocale.indexOf(alfabet.charAt(i)) != -1) {

                subsiruri.add(alfabet.substring(start, Math.min(i + 3, alfabet.length())));
                start = i;
            }
        }


        String[] rezultatArray = subsiruri.toArray(new String[0]);


        for (int i = 0; i < rezultatArray.length; i++) {
            System.out.println("array[" + i + "] = \"" + rezultatArray[i] + "\";");
        }
    }
}