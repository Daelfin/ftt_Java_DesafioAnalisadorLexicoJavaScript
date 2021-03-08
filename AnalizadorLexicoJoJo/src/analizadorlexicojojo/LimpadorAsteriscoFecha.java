/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizadorlexicojojo;

/**
 *
 * @author Administrador
 */
public class LimpadorAsteriscoFecha extends Limpador{
    @Override
    public void executa(char c) {
        if (c == '/'){
            AnalizadorLexicoJoJo.limpador = EnumLimpador.NORMAL.getEstado();
        }
        else{
            AnalizadorLexicoJoJo.limpador = EnumLimpador.ASTERISCOABRE.getEstado();
        }
    }
}
