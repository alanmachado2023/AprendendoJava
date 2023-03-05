package primeiraClasseJava;

import java.util.Arrays;
import java.util.List;

public class SplitArray {
	
	public static void main(String[] args) {
		
		
		String texto = "alan, curso java, 80, 70, 90, 89";
		
		//Split quebra os valores da variável em arrays
		String[] valoresArray = texto.split(","); 			//a vírgula está especificando onde ocorrerá a quebra. Poderia ser uma barra, traço, etc..
		
		System.out.println("Nome: " + valoresArray[0]);     //especifica a posição do valor após a quebra do parâmetro da variável em array
		System.out.println("Curso: " + valoresArray[1]);
		System.out.println("Nota 1: " + valoresArray[2]);
		System.out.println("Nota 2: " + valoresArray[3]);
		System.out.println("Nota 3: " + valoresArray[4]);
		System.out.println("Nota 4: " + valoresArray[5]);
		
		//covertendo array em list
		
		List<String> list = Arrays.asList(valoresArray); //aslist coverte a lista para array
		
		for (String valorString : list) {
			System.out.println(valorString); 
			
		//covnerter list em array
			
		String[] conversaoArray = list.toArray(new String[6]);
			
			for (int pos = 0; pos < conversaoArray.length; pos++) {
				System.out.println(conversaoArray[pos]);
			}
			
			
		}
		
	}

}
