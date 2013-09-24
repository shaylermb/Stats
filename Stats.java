public class Stats {
	public static void main(String[] args) {
		int[] a = {1,2,3};
		// System.out.println(max(a));
		// System.out.println(min(a));
		// System.out.println(median(a));
		// System.out.println(mean(a));
		// System.out.println(standardDev(a));
		//System.out.println(mode(a));
		//System.out.println(quartile1(a));
		//System.out.println(quartile3(a));
		//done
	}
	public static int max(int[] a){
		int m = 0;
		for (int i=0; i<a.length-1; i++) {
			if (m<a[i]) {
				m = a[i];	
			}	
		}
		return m;

	}
	public static int min(int[] a){
		int mi = a[0];
		for (int i = 0; i<a.length-1; i++) {
			if(mi>a[i]){
				mi=a[i];
			}
		}
		return mi;
	}
	public static double median(int[] a) {
			return medianRange(a, 0 , a.length-1);
		}
	public static double medianRange(int[] a, int start, int end) {
			int length = (end - start) + 1;
			if (length % 2 == 0) {
				return ((a[start + (length / 2) - 1] + a[start + (length / 2)]) / 2.0);
			} else {
				return a[start + (length / 2)];
			}
		}
	public static double mean(int[] a){
		double mn = 0;
		for (int i = 0; i<a.length; i++) {
			mn += a[i];
		}
		mn /= a.length;
		return mn;
	}
	public static double quartile1(int[] a) {
		return medianRange(a, 0, (a.length / 4));
	}

	public static double quartile3(int[] a) {
		if(a.length%2 == 0){
			return medianRange(a, (a.length / 2), (a.length-1));
		} else {
			return medianRange(a, a.length/2, (a.length));
		}
		

	}
	public static double standardDeviation(int[] a) {
		double sum = 0;
		double mean = mean(a);

		for (int i = 0 ; i < a.length ; i++) {
			sum += Math.pow(mean - a[i], 2);
		}

		sum /= a.length - 1;

		return Math.sqrt(sum);
	}
	public static int mode(int[] a){
		int mode = a[0];
		//sets mode to initial index value
		int lastCount = 0;
		for (int i=0; i<a.length; i++) {
			int count = 0;
			for (int j = 0; j<a.length; j++) {
				if (a[i] == a[j]) {
					count++;
					
				}
			}
			if (count > lastCount) {
				lastCount = count;
				mode = a[i];
				
			}
		}
		return mode;
	}

}

// max

// min

//median