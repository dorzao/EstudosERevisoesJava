package Familia;

import Main.Main;
import Menus.Cabecalho;
import Menus.Divisoria;
import Pessoa.CadastrarPessoa;
import Pessoa.Pessoa;

public final class AdicionarMembro extends EditorGeral {
	private String nis;
	public AdicionarMembro () {
		this.receberNis("Qual o nis da familia a adicionar novos membros? ");
		for (Familia familia : Familias.familias) {
			if (familia.getNis().equals(this.nis)) {
				print("familia encontrada! NIS pertence a familia "+familia.getApelido()+"\n");
				this.novoCadastro(familia);
				break;
			}

		}
		print("\nFamília não encontrada. Voltando ao menu principal.");
		Main.main(null);
	}

	@Override
	public void receberNis(String msg) {
		// TODO Auto-generated method stub
		print(msg);
		this.nis = niscpf.nextLine();
	}

	public void novoCadastro(Familia familia) {
		familia.setMembros(familia.getMembros() + 1);
		new Cabecalho("Novo membro", "-", 18);
		familia.familia.add(new CadastrarPessoa().novoCadastro(new Pessoa(), familia.getMembros()));
		new Divisoria("-", 18);
		familia = new CadastrarFamilia().calculoFamilia(familia);
		print("Adição de "+familia.familia.get(familia.getMembros() - 1).getNome()+" à familia "+familia.getApelido()+" Realizada com sucesso! Voltando ao menu inicial. \n");
		Main.main(null);
	}

}
