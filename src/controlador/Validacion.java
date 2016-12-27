package controlador;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

public class Validacion {

    private static final char[] CONSTS_HEX = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
//static: sin declara objeto se utiliza la variable
//final: no camni CONTS_HEX

    public String encriptaEnMD5(String stringAEncriptar) {
        try {
            MessageDigest msgd = MessageDigest.getInstance("MD5");
            byte[] bytes = msgd.digest(stringAEncriptar.getBytes());
            StringBuilder strbCadenaMD5 = new StringBuilder(2 * bytes.length);
            for (int i = 0; i < bytes.length; i++) {
                int bajo = (int) (bytes[i] & 0x0f);
                int alto = (int) ((bytes[i] & 0xf0) >> 4);
                strbCadenaMD5.append(CONSTS_HEX[alto]);
                strbCadenaMD5.append(CONSTS_HEX[bajo]);
            }
            return strbCadenaMD5.toString();
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }

    public List<Integer> camposVacios(List<String> campos) {
        List<Integer> pos = new ArrayList<>();
        for (int i = 0; i < campos.size(); i++) {
            String campo = campos.get(i);
            if (campo.trim().equals("")) {
                pos.add(i);
            }
        }
        return pos;
    }

    public int validarClave(String clave) {
        int valorbarra = 0;
        if (clave.length() > 8) {
            valorbarra = 100;
        } else if (clave.length() > 0 && clave.length() < 5) {
            valorbarra = 25;
        } else if (clave.length() > 4 && clave.length() < 8) {
            valorbarra = 66;
        }

        return valorbarra;
    }
}
