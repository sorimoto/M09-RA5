import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Monoalfabetic {
    public static char[] alfabet = "AÀÁBCÇDEÈÉFGHIÍÏJKLMNÑOÒÓPQRSTUÚÜVWXYZ".toCharArray();
    static char[] permutacio = permutaAlfabet(alfabet);
    public static char[] permutaAlfabet(char[] alfabet) {
        char[] permutat = new char[alfabet.length];
        List<Integer> perm = new ArrayList<>();
        for (int i = 0; i < alfabet.length; i++) {
            perm.add(alfabet[i]);
        }
        perm = Collections.shuffle(perm);

        for (int i = 0; i < perm.size(); i++) {
            permutat[i] = perm.get(i);
        }
        return permutat;
    }

    public static char[] xifraMonoAlfa(String cadena) {
        char[] resultat = new char[cadena.length()];

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            boolean majuscula = Character.isUpperCase(c);
            char base = Character.toUpperCase(c);
            if (!majuscula) {
                
            }
    }

    public static void desxifraMonoAlfa(String cadena) {

    }

    public static void main(String[] args) {
        
    }
}