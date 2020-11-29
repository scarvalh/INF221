package p1A;

class media {
	
	public static double getMedia(int n, int v[]){
		double media = 0;
		
		for(int i=0;i<n;i++){
			media += v[i];
		}
		 media /= n;
		 
		 return media;
	}
}
