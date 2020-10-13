/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderexemplo;

import java.util.ArrayList;
import java.util.List;

public class Combo {
   private List<Item> itens = new ArrayList<Item>();	

   public void addItem(Item item){
      itens.add(item);
   }

   public float getPreco(){
      float preco = 0.00f;
      
      for (Item item : itens) {
         preco += item.preco();
      }		
      return preco;
   }

   public void showItens(){
   
      for (Item item : itens) {
         System.out.print("Item : " + item.nome());
         System.out.print("; Embalagem : " + item.embalagem().receptaculo());
         System.out.println("; Preco : " + item.preco());
      }		
   }	
}