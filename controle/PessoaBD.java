package controle;

import java.util.ArrayList;

import modelo.IPessoaBD;
import modelo.Pessoa;

public class PessoaBD implements IPessoaBD {

	private ArrayList<Pessoa> bdPessoa;

	public PessoaBD() {
		this.bdPessoa = new ArrayList<>();
	}

	@Override
	public boolean incluir(Pessoa p) {

		if (p != null) {
			this.bdPessoa.add(p);
		} else {
			return false;
		}

		return true;
	}

	@Override
	public ArrayList<Pessoa> listar() {
		return this.bdPessoa;
	}

	@Override
	public boolean atualizar(Pessoa p, int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remover(Pessoa p, int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
