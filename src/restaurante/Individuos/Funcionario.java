// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package restaurante.Individuos;

import restaurante.Administrativo.Cargo;
import restaurante.Restaurante.Pedido;

/************************************************************/
/**
 * 
 */
public class Funcionario extends Pessoa {
	/**
	 * 
	 */
	public Cargo cargo;
	/**
	 * 
	 */
	public Integer codCracha;
	/**
	 * 
	 */
	public Pedido pedido;
	
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	public Integer getCodCracha() {
		return codCracha;
	}
	public void setCodCracha(Integer codCracha) {
		this.codCracha = codCracha;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
}
