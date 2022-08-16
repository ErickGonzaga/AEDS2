
public class isjava {

    public static void main(String[] args) {
        String entrada = new String();

        while (true) {
            entrada = MyIO.readLine();
            entrada.toLowerCase();

            if (isFim(entrada)) {
                break;
            }

            MyIO.println(isVogal(entrada) + " " + isConsoante(entrada));
        }
    }

    public static boolean isConsoante(String s) {
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != 'a' || s.charAt(i) != 'e' || s.charAt(i) != 'i' || s.charAt(i) != 'o'
                    || s.charAt(i) != 'u') {
                return true;
            }

        }
        return false;
    }

    public static boolean isVogal(String s) {
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u') {
                return true;
            }

        }
        return false;
    }

    public static boolean isFim(String s) {
        return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
    }
}
