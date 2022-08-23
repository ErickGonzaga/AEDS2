import java.io.*;
import java.net.*;

public class html {

    public static void main(String[] args) {
        String endereco = new String();
        String entrada = new String();
        String html = new String();

        while (true) {
            entrada = MyIO.readLine();
            if (isFim(entrada) == true) {
                break;
            }

            endereco = MyIO.readLine();
            html = getHtml(endereco);
            MyIO.print("a" +"(" + isVogalA(html) + ") ");
            MyIO.print("e" +"(" + isVogalE(html) + ") ");
            MyIO.print("i" +"(" + isVogalI(html) + ") ");
            MyIO.print("o" +"(" + isVogalO(html) + ") ");
            MyIO.print("u" +"(" + isVogalU(html) + ") ");
        }

    }

    public static int isVogalA(String srt) {
        int contador = 0;
        for (int i = 0; i < srt.length(); i++) {
            if ((int) srt.charAt(i) == 97){
                contador++;
            }
        }
        return contador;
    }

    public static int isVogalE(String srt) {
        int contador = 0;
        for (int i = 0; i < srt.length(); i++) {
            if ((int) srt.charAt(i) == 101){
                contador++;
            }
        }
        return contador;
    }

    public static int isVogalI(String srt) {
        int contador = 0;
        for (int i = 0; i < srt.length(); i++) {
            if ((int) srt.charAt(i) == 105){
                contador++;
            }
        }
        return contador;
    }

    public static int isVogalO(String srt) {
        int contador = 0;
        for (int i = 0; i < srt.length(); i++) {
            if ((int) srt.charAt(i) == 111){
                contador++;
            }
        }
        return contador;
    }

    public static int isVogalU(String srt) {
        int contador = 0;
        for (int i = 0; i < srt.length(); i++) {
            if ((int) srt.charAt(i) == 117 ){
                contador++;
            }
        }
        return contador;
    }

    public static String getHtml(String endereco) {
        URL url;
        InputStream is = null;
        BufferedReader br;
        String resp = "", line;

        try {
            url = new URL(endereco);
            is = url.openStream(); // throws an IOException
            br = new BufferedReader(new InputStreamReader(is));

            while ((line = br.readLine()) != null) {
                resp += line + "\n";
            }
        } catch (MalformedURLException mue) {
            mue.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        try {
            is.close();
        } catch (IOException ioe) {
            // nothing to see here

        }

        return resp;
    }

    public static boolean isFim(String str) {
        return (str.length() == 3 && str.charAt(0) == 'F' && str.charAt(1) == 'I' && str.charAt(2) == 'M');
    }
}
