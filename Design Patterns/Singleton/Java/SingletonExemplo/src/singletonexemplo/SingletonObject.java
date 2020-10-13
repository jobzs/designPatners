/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonexemplo;


public class SingletonObject {
    //Cria um objeto de SingletonObject
   private static final SingletonObject instancia = new SingletonObject();

   /*Faz com que o contrutor seja privado, para que esta classe
   não possa ser instanciada extarnamente*/
   private SingletonObject(){}

   //Retorna o único objeto disponível
   public static SingletonObject retornatInstancia(){
      return instancia;
   }

   public void retornaFrase(){
      System.out.println("Beep, Singleton sendo executado, beep.");
   }
}
