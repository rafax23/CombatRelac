/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combatrelac;

import java.util.Random;

/**
 *
 * @author Rafael
 */
public class Luta {
    
    //atributos
    //aqui vai ter intância da classe lutador
    //vamos encapsular e tornar privados 
    //relação de agregação: uma luta(b) tem um lutador(a)
    //(A classe B tem um atributo que é da Classe A)
    //cada lutador pode particilar da zero até várias lutas
    //cada luta pode ter vários lutadores
    
    //atributo LUTADOR é um tipo abstrato. 
    //É um objeto de instância do tipo Lutador (da classe)
    
    private Lutador desafiado; 
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    //System.out.println()
    public void imp(String texto){
        System.out.println(texto);
    }
    
    
    //metodos
    
    public void marcaLuta(Lutador a1, Lutador b2){
        if (a1.getCategoria() == b2.getCategoria() && a1 != b2) {
            imp("Luta marcada (SIM)");
            this.setAprovada(true);
            this.setDesafiado(a1);
            this.setDesafiante(b2);
        }else{
            imp("ERRO - Luta não marcada (Categoria errada ou nome igual)");
        }
    }
    
    public void lutar(){
        if (getAprovada()) {
            imp(">>> Luta aprovada (SIM)");
            desafiado.apresentar(); //É do tipo LUTADOR que tem essa função
            desafiante.apresentar();
            /*
            Gerar código IF para o ganhador...
            */
            Random sorteio = new Random();
            int vencedor = sorteio.nextInt(2); // duas opções
            switch(vencedor){
                case 0: //desafiado vence
                    imp(">>> DESAFIADO Ganhou: " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 1: //desafiante vence
                    imp(">>> DESAFIANTE Ganhou: " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
        }else{
            imp(">>>Erro: Luta não aprovada (FALSE)");
        }
    
    }
    
    
    //getter e setter

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() { //Alterado de IS para GET
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
    

}
