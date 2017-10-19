
public class AnaliSin {
	String[] argumentos = new String[10];
	public static void main(String[] args) {
		

	}

	public void DeclSequencia() {
		Declaracao();
		LinhaDeclSequencia();
	}

	private void LinhaDeclSequencia() {
		if(argumentos[0].equals(";")) {
			Declaracao();
			LinhaDeclSequencia();
		}else {
			//E
		}
		
	}

	private void Declaracao() {
		CondDecl();
		
		
	}


}
