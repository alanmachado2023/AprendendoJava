package aprendendoClassses;

import java.util.Arrays;
import java.util.Objects;

public class Disciplinas {

	//Essa classe disciplina servirá para todas as instâncias de notas e matérias
	
	private String disciplina;

	
	//Essa classe disciplina servirá para todas as instâncias de notas e matérias
	
			private double[] nota = new double[4];
	
	
				
	public double getMediaNotas() {
		
		double somaTotal = 0;
		
		for (int pos = 0; pos < nota.length; pos++) {
			somaTotal += nota[pos];
		}
		return somaTotal / 4;
	}
			
			
	public double[] getNota() {
				return nota;
			}


			public void setNota(double[] nota) {
				this.nota = nota;
			}


	public void setDisciplina(String disciplina) {
				this.disciplina = disciplina;
			}


	public String getDisciplina() {
		return disciplina;
	}
	

	// Equals e hashcode

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(nota);
		result = prime * result + Objects.hash(disciplina);
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplinas other = (Disciplinas) obj;
		return Objects.equals(disciplina, other.disciplina) && Arrays.equals(nota, other.nota);
	}

	// toString

	@Override
	public String toString() {
		return "Disciplinas [disciplina=" + disciplina + ", nota =" + nota + "]";
		
	}


	

}
