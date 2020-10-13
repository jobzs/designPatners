/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonexemplo;


public class SingletonExemplo {

    public static void main(String[] args) {
      //Chama o único objeto disponível
      SingletonObject objeto = SingletonObject.retornatInstancia();

      //Mostra a frase preparada
      objeto.retornaFrase();
    }
}
