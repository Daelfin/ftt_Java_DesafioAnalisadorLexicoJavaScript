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
public class LimpadorAspas extends Limpador{
    @Override
    public void executa(char c) {
        if (c == '\\'){
            AnalizadorLexicoJoJo.inputLimpo.append(c);
            AnalizadorLexicoJoJo.limpador = EnumLimpador.BACKSLASH.getEstado();
        }
        else if (c == '"'){
            AnalizadorLexicoJoJo.inputLimpo.append(c);
            Classificador("Literal");
            AnalizadorLexicoJoJo.limpador = EnumLimpador.NORMAL.getEstado();
        }
        else{
            AnalizadorLexicoJoJo.inputLimpo.append(c);
        }
    }
}
