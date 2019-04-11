import java.util.Scanner;

public class abcd {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lectura = new Scanner(System.in);
		char[] abecd= {'A','B','C','D','E','F','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','X','Y','Z'};
		char[] dceba ={'T','U','V','X','Y','Z','A','B','C','D','E','F','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S'};
		
		String captura;
		String b;
		String cifrar="";
			 
		System.out.println("Introduce un MNS :");			
		captura = lectura.nextLine().toUpperCase().trim();
		
		for(char letra:captura.toCharArray()) {
		 for (int i = 0; i < abecd.length; i++) {
			 if(letra==abecd[i]) {
				 cifrar+=String.valueOf(dceba[i]);
			 
				 if(letra==dceba[i]) {
					 
					 captura+=String.valueOf(abecd[i]);	 
				 }
				 
			 }		
		}
		 
		}
		System.out.println("Mensaje Encriptado");
		System.out.println(cifrar);
		System.out.println("Mensaje para el destinatario:  ");
		System.out.println(captura);
		
		
		

	
		
		
	
		 
	
	
		
	}
		
	}





