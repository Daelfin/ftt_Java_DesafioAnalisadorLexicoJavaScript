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
public abstract class Limpador {

    public abstract void executa(char c);

    public void Classificador(String tipo) {
        if (AnalizadorLexicoJoJo.inputLimpo.length() > 0) {
            String nome = AnalizadorLexicoJoJo.inputLimpo.toString();
            if (tipo == "Resto"){
                if (AnalizadorLexicoJoJo.reservadas.contains(nome))
                    tipo = "Palava Reservada";
                else if (nome.indexOf(".") != -1)
                    tipo = "Método";
                else
                    tipo = "Variável";
            }
            Token t = new Token(nome, tipo);
            AnalizadorLexicoJoJo.tabelaTokens.add(t);
            AnalizadorLexicoJoJo.inputLimpo.setLength(0);
        }
    }
}
