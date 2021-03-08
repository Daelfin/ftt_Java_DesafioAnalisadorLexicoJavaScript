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
public enum EnumLimpador {
    NORMAL (new LimpadorNormal()),
    ASPAS(new LimpadorAspas()),
    BACKSLASH(new LimpadorBackslash()),
    SLASH(new LimpadorSlash()),
    SLASHES(new LimpadorSlashes()),
    ASTERISCOABRE(new LimpadorAsteriscoAbre()),
    ASTERISCOFECHA(new LimpadorAsteriscoFecha()),
    OPERADOR(new LimpadorOperador()),
    NUMERO(new LimpadorNumero()); 
    private final Limpador estadoAtual;
    EnumLimpador(Limpador l){
        estadoAtual = l;
    }
    public Limpador getEstado(){
        return estadoAtual;
    }
}
