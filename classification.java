package p1A;
import java.util.Arrays;

class classification {
	private int Finalistas;
	private double mediaF,mediaTotal;
	private double desvioF, desvioTotal;
	
	public classification() {
		Finalistas=0; mediaF=0; mediaTotal = 0; desvioTotal = 0; desvioF=0;
	}
	public int getFinalistas() {
		return Finalistas;
	}
	
	public double getMediaF() {
		return mediaF;
	}
	
	public double getMediaTotal() {
		return mediaTotal;
	}
	
	public double getDesvioF() {
		return desvioF;
	}
	
	public double getDesvioTotal() {
		return desvioTotal;
	}
	
	public void finals(int n, int k, int v[]) {
		Arrays.sort(v);
		int j=n-1;
		int va[] = new int[n];
		
		for(int i=0;i<n;i++) {
			va[j] = v[i];
			j--;
		}
		v=va;
		int i=0,x=0;
		Finalistas = 0;
		
		while(i<k || v[i] == x) {				
			x = v[i];
			Finalistas++;
			i++;
			if(i>=n) 
				break;
		}
		
		mediaTotal = media.getMedia(n,v);
		mediaF = media.getMedia(Finalistas,v);
		desvioF = desvio.getDesvio(mediaF, v, Finalistas);
		desvioTotal = desvio.getDesvio(mediaTotal, v, n);
	}

	
}
