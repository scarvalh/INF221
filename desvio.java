package p1A;

class desvio {
	public static double getDesvio(double media, int v[], int n) {
		double d = 0;
		double soma=0;
		for(int i=0;i<n;i++) {
			soma += Math.pow((v[i] - media),2);
		}
		soma /= n;
		d = Math.sqrt(soma);
		return d;
	}
}
