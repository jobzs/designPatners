/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderexemplo;


public class BuilderExemplo {

    public Combo criarComboAdulto (){
      Combo combo = new Combo();
      combo.addItem(new BigBaconClassicTriple());
      combo.addItem(new CocaCola());
      return combo;
   }   

   public Combo criarComboInfantil (){
      Combo combo = new Combo();
      combo.addItem(new JrCheeseburgerDeluxe());
      combo.addItem(new Pepsi());
      return combo;
   }
    
}
