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
public class LimpadorNormal extends Limpador{
    @Override
    public void executa(char c) {
        if (c == '"'){
            Classificador("Resto");
            AnalizadorLexicoJoJo.inputLimpo.append(c);            
            AnalizadorLexicoJoJo.limpador = EnumLimpador.ASPAS.getEstado();
        }
        else if (c == '/'){
            AnalizadorLexicoJoJo.limpador = EnumLimpador.SLASH.getEstado();
        }
        else if (c == '╚'){
            Classificador("Resto");
        }
        else if (AnalizadorLexicoJoJo.separador.indexOf(c) != -1){
            Classificador("Resto");
            AnalizadorLexicoJoJo.inputLimpo.append(c);
            Classificador("Separador");
        }
        else if (c == ' '){
            Classificador("Resto");
        }
        else if (AnalizadorLexicoJoJo.operador.indexOf(c) != -1){
            Classificador("Resto");
            AnalizadorLexicoJoJo.inputLimpo.append(c);
            AnalizadorLexicoJoJo.limpador = EnumLimpador.OPERADOR.getEstado();
        }
        else if (AnalizadorLexicoJoJo.numero.indexOf(c) != -1){
            Classificador("Resto");
            AnalizadorLexicoJoJo.inputLimpo.append(c);
            AnalizadorLexicoJoJo.limpador = EnumLimpador.NUMERO.getEstado();
        }
        else{
            AnalizadorLexicoJoJo.inputLimpo.append(c);
        }
    }
    
}
