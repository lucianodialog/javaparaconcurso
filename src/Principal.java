/*
 * Criado por Luciano Alexandre da Silva.
 * Objetivo: Estudar java para concursos.
 * Criado em: 16/06/2019.
 * */
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  usandoConstantes();
	  
	  System.out.println();
		
	  usandoEnum();

	}
	
	public static void usandoConstantes() {
		
		int segunda = DiaSemanaConstants.SEGUNDA;
		int terca   = DiaSemanaConstants.TERCA;
		int quarta  = DiaSemanaConstants.QUARTA;
		int quinta  = DiaSemanaConstants.QUINTA;
		int sexta   = DiaSemanaConstants.SEXTA;
		int sabado  = DiaSemanaConstants.SABADO;
		int domingo = DiaSemanaConstants.DOMINGO;
		
		System.out.println("Teste utilizando Constantes.");
		imprimeDiaSemana(segunda);
		imprimeDiaSemana(terca);
		imprimeDiaSemana(quarta);
		imprimeDiaSemana(quinta);
		imprimeDiaSemana(sexta);
		imprimeDiaSemana(sabado);
		imprimeDiaSemana(domingo);
		
	}
	
	public static void imprimeDiaSemana(int dia) {
		
		switch (dia) {
		case 1:
			System.out.println("Segunda-feira");
			break;

		case 2:
			System.out.println("Terça-feira");
			break;
			
		case 3:
		System.out.println("Quarta-feira");
			break;
			
		case 4:
			System.out.println("Quinta-feira");
			break;
			
		case 5:
			System.out.println("Sexta-feira");
			break;
			
		case 6:
			System.out.println("Sábado-feira");
			break;
			
		case 7:
			System.out.println("Domingo-feira");
			break;
			
		}
		
	}
	
	
private static void usandoEnum(){
		
		DiaSemana segunda = DiaSemana.SEGUNDA;
		DiaSemana terca = DiaSemana.TERCA;
		DiaSemana quarta = DiaSemana.QUARTA;
		DiaSemana quinta = DiaSemana.QUINTA;
		DiaSemana sexta = DiaSemana.SEXTA;
		DiaSemana sabado = DiaSemana.SABADO;
		DiaSemana domingo = DiaSemana.DOMINGO;
		
		System.out.println("Teste utilizando enum no Java");
		
		
		
		imprimeDiaSemana(segunda);
		imprimeDiaSemana(terca);
		imprimeDiaSemana(quarta);
		imprimeDiaSemana(quinta);
		imprimeDiaSemana(sexta);
		imprimeDiaSemana(sabado);
		imprimeDiaSemana(domingo);
	}

private static void imprimeDiaSemana(DiaSemana dia){
	switch (dia) {
	case SEGUNDA:
		System.out.println("Segunda-feira");
		break;
	case TERCA:
		System.out.println("Terça-feira");
		break;
	case QUARTA:
		System.out.println("Quarta-feira");
		break;
	case QUINTA:
		System.out.println("Quinta-feira");
		break;
	case SEXTA:
		System.out.println("Sexta-feira");
		break;
	case SABADO:
		System.out.println("Sábado");
		break;
	case DOMINGO:
		System.out.println("Domingo");
		break;
	}
}
	
	
	

}
