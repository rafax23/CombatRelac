/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combatrelac;

/**
 *
 * @author Rafael
 */
public class CombatRelac {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Lutador // String nome, String categoria, int vitorias, int derrotas      
        //Dois lutadores criados
        Lutador a1 = new Lutador("Rafa","Ninja",23,5);
        Lutador b2 = new Lutador("Paz","Ninja",10,3);
        
        System.out.println("============ Lutador A");
        a1.apresentar();
        a1.status();
        a1.ganharLuta();
        a1.status();
        System.out.println("============ Lutador B");
        b2.apresentar();
        b2.status();
        b2.ganharLuta();
        b2.status();
        
        System.out.println("============ Luta 1");
        //instância da classe Luta
        Luta luta1 = new Luta();
        luta1.marcaLuta(a1, b2);
        luta1.lutar();
        System.out.println("============ Luta 2");
        Luta luta2 = new Luta();
        luta2.marcaLuta(a1, a1);
        luta2.lutar();
        
        System.out.println("============ Lutador A");
        a1.status();
        System.out.println("============ Lutador B");
        b2.status();
    }
    
}
