/*
 * Criado por Luciano Alexandre da Silva.
 * Objetivo: Estudar java para concursos.
 * Criado em: 16/06/2019.
 * */
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DiaSemana[] dias = DiaSemana.values();

		for (int i=0; i<dias.length; i++){
			System.out.println(dias[i]);
		}
		
		for (DiaSemana dia : DiaSemana.values()){
			System.out.println(dia);
		}

	}
	
	
}
