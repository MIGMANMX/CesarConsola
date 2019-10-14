/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cesarconsola;

/**
 *
 * @author MiltonOrtega
 */
public class CesarConsola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // TODO add your handling code here:
        //Texto representa al mensaje cifrado
        String texto = "UXBVJ UXBYA XWXBC RLXBM NUJBN WLDNB CJBMR ORLDU CJWJA RENAJ UJNUJ KXAJL RXWMN UJBLJ WMRMJ CDAJB NUNLC XAJUN BNWM";
        //Arreglo de pruebas
        String arreglo[][] = new String[26][1];
        //Cofigo representa a la clave o los numeros de dezplazamientos
        int clave;
        //Este ciclo hace un recorrido de los primeros 26 movimientos tomandolo como clave
        for(clave= 0 ;clave<26;clave++)
        {
            StringBuilder cifrado = new StringBuilder();
            clave = clave % 26;
            //Este ciclo toma las cadenas de caracteres asignada en la variable Texto
            //Hace lectura y va separando cada caracter para identidifcarlo individualmente 
            
            for (int i = 0; i < texto.length(); i++) {
                //Una vez separados hace una comparacion para tomar si es mayuscula o minuscula el caracter
                if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
                    if ((texto.charAt(i) - clave) < 'a') {
                        //Se forma una nueva cadena de texto acumulando el resultado de los movimientos segun la clave
                        cifrado.append((char) (texto.charAt(i) - clave + 26));
                    } else {
                        //Se forma una nueva cadena de texto acumulando el resultado de los movimientos segun la clave
                        cifrado.append((char) (texto.charAt(i) - clave));
                    }
                } 
                //Una vez separados hace una comparacion para tomar si es mayuscula o minuscula el caracter
                else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
                    if ((texto.charAt(i) - clave) < 'A') {
                        //Se forma una nueva cadena de texto acumulando el resultado de los movimientos segun la clave
                        cifrado.append((char) (texto.charAt(i) - clave + 26));
                    } else {
                        //Se forma una nueva cadena de texto acumulando el resultado de los movimientos segun la clave
                        cifrado.append((char) (texto.charAt(i) - clave));
                    }
                }
                //Se forma un arreglo tomando como inducador la clave y la cadena
                arreglo[clave][0]=cifrado.toString();
            }
        }
        //Ciclo para recorrer las filas y columnas registradas en el arreglo
        for (int fila =0; fila<arreglo.length;fila++)
        {
            for(int columna=0; columna<arreglo[fila].length;columna++)
            {
                //Imprimir los primeros 26 movimientos
                System.out.print(fila+" - "+arreglo[fila][columna]+"\n");
            }
        }
    }
    
}
