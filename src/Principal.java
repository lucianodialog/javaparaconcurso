/*
 * Criado por Luciano Alexandre da Silva.
 * Objetivo: Estudar java para concursos.
 * Criado em: 16/06/2019.
 * */
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        DiaSemana dia = DiaSemana.SEGUNDA;
		
		System.out.println(dia.toString() + " - " + dia.getValor());

		
		Data data = new Data(1, 4, 2016, DiaSemana.SEXTA);

	}
	
	
}
