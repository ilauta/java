
class MaxNubmerOfDecimars{
	public static void main (String [] arg) {
	
		int numberOfDecimars = 0; //kol-vo delitelej
		int maxNumberOfDecimars = 0; //max kol-vo delitelej
		int maxNumber = 0;

		for (int n=10000; n>=1; n=n-2) {
			for (int i=1; i<=n; i++) {
				if (n%i==0) {
					numberOfDecimars++;
				}

				if (numberOfDecimars>maxNumberOfDecimars) {
					maxNumberOfDecimars = numberOfDecimars;
					maxNumber = n;
				}
			}
			numberOfDecimars=0;
		}
		System.out.println("maxNumberOfDecimars = "+maxNumberOfDecimars);
		System.out.println("maxNumber = "+maxNumber);
	}
}