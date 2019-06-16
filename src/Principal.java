/*
 * Criado por Luciano Alexandre da Silva.
 * Objetivo: Estudar java para concursos.
 * Criado em: 16/06/2019.
 * */
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for (TipoDocumento doc : TipoDocumento.values()){
		System.out.println(doc + " - " + doc.geraNumeroTeste());
	}*/

	Pessoa pf = new Pessoa();
	pf.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CPF"));
	pf.setNumeroDocumento(pf.getTipoDocumento().geraNumeroTeste());
	System.out.println(pf);
	
	Pessoa pj = new Pessoa();
	pj.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CNPJ"));
	pj.setNumeroDocumento(pj.getTipoDocumento().geraNumeroTeste());
	System.out.println(pj);



	}
	
	
}

