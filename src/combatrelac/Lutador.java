/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combatrelac;

/**
 *
 * @author Rafael
 * Agregação ?
 * Um lutador disputa uma luta
 * Uma lua tem vários lutadores
 * (UML)
 */
public class Lutador {
    
    //atributos
    private String nome;
    private String categoria;
    private int vitorias;
    private int derrotas;
    
    //System.out.println()
    public void imp(String texto){
        System.out.println(texto);
    }
    
    //métodos públicos
    public void apresentar(){
        imp(">>> Apresentação: " + getNome()
            + " | Catgoria: " + getCategoria());
    }
    
    public void status(){
        imp(">>> Status: Vitórias: " + getVitorias()
            +" | Derrotas: " + getDerrotas());
    }
    
    public void ganharLuta(){
        imp(">>> Ganhou a Luta [FUNCAO]");
        setVitorias(getVitorias()+1);
    }
    
    public void perderLuta(){
        imp(">>> Perdeu a Luta [FUNCAO]");
        setDerrotas(getDerrotas()+1);
    }
    
    
    //métodos especiais
    
    //construtor
    // String nome, String categoria, int vitorias, int derrotas

    public Lutador(String oNome, String oCategoria, int oVitorias, int oDerrotas) {
        setNome(oNome);
        setCategoria(oCategoria);
        setVitorias(oVitorias);
        setDerrotas(oDerrotas);
    }
    
    
    //getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    private int getVitorias() {
        return vitorias;
    }

    private void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    private int getDerrotas() {
        return derrotas;
    }

    private void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    
    
}
