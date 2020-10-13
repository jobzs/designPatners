package builderexemplo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class JrCheeseburgerDeluxe extends Hamburguer {

   @Override
   public float preco() {
      return 15.00f;
   }

   @Override
   public String nome() {
      return "Jr. Cheeseburger Deluxe";
   }
}
