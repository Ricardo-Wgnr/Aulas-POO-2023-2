package engtelecom.poo;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.util.HashMap;

public class Telefone {

    private HashMap<String, String> dados;

    public Telefone() {
        this.dados = new HashMap<>();
    }

    public boolean add (String r, String n) {
        if (!dados.containsKey(r)) {
            String numeroFormatado = formatar(n);
            if (!numeroFormatado.equals(n)) {
                dados.put(r, numeroFormatado);
                return true;
            }
        }
        return false;
    }

    public boolean remove (String r) {

        if (dados.containsKey(r)) {
            dados.remove(r);
            return true;
        }
        return false;
    }

    public boolean update (String r, String n) {

        if (dados.containsKey(r)) {
            String numero = formatar(n);
            dados.put(r, numero);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "dados=" + dados +
                '}';
    }

    public String formatar (String n) {

        String numeroFormatado = n;

        try {
            MaskFormatter mask = new MaskFormatter("(##) #####-####");
            mask.setValueContainsLiteralCharacters(false);
            mask.setPlaceholderCharacter('_');
            numeroFormatado = mask.valueToString(n);
        } catch (ParseException e) {

        }
        return numeroFormatado;
    }
}
