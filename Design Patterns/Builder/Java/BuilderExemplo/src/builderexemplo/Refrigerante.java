/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderexemplo;


public abstract class Refrigerante implements Item {

	@Override
        public Embalagem embalagem() {
            return new Garrafa();
	}

	@Override
	public abstract float preco();
}