package engtelecom.poo;

import java.util.HashMap;

public class Email {

    private HashMap<String, String> dados;

    public Email() {
        this.dados = new HashMap<>();
    }

    public boolean add (String r, String e) {

        String eR = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
        if (!dados.containsKey(r)) {
            if (e.matches(eR)) {
                dados.put(r, e);
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

    public boolean update (String r, String e) {

        if (dados.containsKey(r)) {
            dados.put(r, e);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return dados.toString();
    }
}
