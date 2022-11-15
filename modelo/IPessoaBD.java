package modelo;

import java.util.ArrayList;

public interface IPessoaBD {

	public boolean incluir(Pessoa p);

	public ArrayList<Pessoa> listar();

	public boolean atualizar(Pessoa p, int id);

	public boolean remover(Pessoa p, int id);

}
