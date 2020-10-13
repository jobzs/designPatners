/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderexemplo;


public class CocaCola extends Refrigerante {

   @Override
   public float preco() {
      return 10.00f;
   }

   @Override
   public String nome() {
      return "Coca Cola";
   }
}