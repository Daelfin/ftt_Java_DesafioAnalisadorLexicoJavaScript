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
public class Token {
    private int numero;
    private String nome;
    private String tipo;
    static int contador = 1;
    public int getNumero(){return numero;}
    public String getNome(){return nome;}
    public String getTipo(){return tipo;}
    public Token (String nome, String tipo){
        this.nome = nome;
        this.tipo = tipo;
        this.numero = contador;
        contador++;
    }
}
