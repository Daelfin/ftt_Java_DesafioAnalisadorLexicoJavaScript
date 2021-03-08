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
public class LimpadorSlash extends Limpador{
    @Override
    public void executa(char c){
        if (c == '/'){
            AnalizadorLexicoJoJo.limpador = EnumLimpador.SLASHES.getEstado();
        }
        else if (c == '*'){
            AnalizadorLexicoJoJo.limpador = EnumLimpador.ASTERISCOABRE.getEstado();
        }
        else{
            AnalizadorLexicoJoJo.inputLimpo.append("/" + c);
            AnalizadorLexicoJoJo.limpador = EnumLimpador.NORMAL.getEstado();
        }
        
    }
}
