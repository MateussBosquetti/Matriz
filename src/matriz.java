import java.util.Scanner;
public class matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int matriz [][] = new int [4][4];
			Scanner sc = new Scanner (System.in);
			
			for (int linha = 0; linha < 4; linha++) {
				for (int coluna = 0; coluna < 4; coluna++ ) {
					System.out.println("Digite o valor: ");
					matriz[linha][coluna] = sc.nextInt();
								 	if (matriz[linha][coluna] < 0) {
								 	matriz[linha][coluna] = 0;
								 	}
								 	}
			}
			for (int fim = 0; fim < 4; fim++) {
				for (int fimCo = 0; fimCo < 4; fimCo++ ) {
					System.out.println(matriz[fim][fimCo]);
			}
			}
	}

}
