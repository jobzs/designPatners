/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderexemplo;


public class ExecutarBuilder {
     public static void main(String[] args) {
   
      BuilderExemplo builderExemplo = new BuilderExemplo();

      Combo grande = builderExemplo.criarComboAdulto();
      System.out.println("Combo Adulto");
      grande.showItens();
      System.out.println("Custo total: " + grande.getPreco());

      Combo pequeno = builderExemplo.criarComboInfantil();
      System.out.println("\n\nCombo Infantil");
      pequeno.showItens();
      System.out.println("Custo total: " + pequeno.getPreco());
   }
}
