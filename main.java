package p1A;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		classification c = new classification();
		
		int n,k;
		
		System.out.printf("Informe o número de competidores:\n");
	    n = ler.nextInt();
	    
	    System.out.printf("Informe o número mínimo de competidores que devem se classificar:\n");
	    k = ler.nextInt();
	    
	    
	    int v[] = new int[n];
	    
	    System.out.printf("Informe as pontuações:\n");
	    
	    for(int i=0;i<n;i++) {
	        v[i] = ler.nextInt();
	    }
	    
		c.finals(n, k, v);
		
		System.out.printf("%d\n%.2f\n%.2f\n%.2f\n%.2f\n", c.getFinalistas(),c.getDesvioF(),c.getMediaF(),c.getDesvioTotal(),c.getMediaTotal());
		
	}

}
