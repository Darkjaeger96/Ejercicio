import java.util.Scanner;
public class TipoDiasF2 {
		public static void main(String[] args){
		System.out.println("Introduce un dia de la semana: ");
		Scanner sc = new Scanner (System.in);
		String diaLeido = sc.next().toLowerCase();
		sc.close();
		
		String mensaje="";
		switch(diaLeido){
			case "lunes" : 
			mensaje = "es laborable";
			break;
			case "martes" : 
			mensaje = "es laborable";
			break;
			case "miercoles" : 
			mensaje = "es laborable";
			break;
			case "jueves" : 
			mensaje = "es laborable";
			break;
			case "viertnes" : 
			mensaje = "es laborable";
			break;
			case "sabado" : 
			mensaje = "no es laborable";
			break;
			case "domingo" : 
			mensaje = "no es laborable";
			break;
					
			default	 :
			System.out.println(diaLeido + " no es un dia de la semana");
			break;						
		}
		System.out.printf("%s %s%n",diaLeido,mensaje);
	}
}
