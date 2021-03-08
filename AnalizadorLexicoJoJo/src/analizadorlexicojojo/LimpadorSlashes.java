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
public class LimpadorSlashes extends Limpador{
    @Override
    public void executa(char c) {
        if (c == '╚'){
            AnalizadorLexicoJoJo.limpador = EnumLimpador.NORMAL.getEstado();
            AnalizadorLexicoJoJo.inputLimpo.append(' ');
        }
    }
}
