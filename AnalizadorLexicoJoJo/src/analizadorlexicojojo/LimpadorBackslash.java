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
public class LimpadorBackslash extends Limpador{
    @Override
    public void executa(char c) {
        AnalizadorLexicoJoJo.inputLimpo.append(c);
        AnalizadorLexicoJoJo.limpador = EnumLimpador.ASPAS.getEstado();
    }
}
