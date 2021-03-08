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
public class LimpadorOperador extends Limpador{

    @Override
    public void executa(char c) {
        if (AnalizadorLexicoJoJo.operador.indexOf(c) != -1){
            AnalizadorLexicoJoJo.inputLimpo.append(c);
        }
        else{
            Classificador("Operador");
            AnalizadorLexicoJoJo.limpador = EnumLimpador.NORMAL.getEstado();
            AnalizadorLexicoJoJo.limpador.executa(c);
        }
    }
    
}
