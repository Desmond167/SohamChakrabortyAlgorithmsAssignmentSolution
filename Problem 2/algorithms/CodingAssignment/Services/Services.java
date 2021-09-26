package algorithms.CodingAssignment.Services;

//import algorithms.CodingAssignment.Services.*;

public class Services {
	
	double[] price;
	Boolean[] status;
	
	public Services(double[] price, Boolean[] status) {
		this.price=price;
		this.status=status;
	}
	
	public double[] getAscending() {
		MergeSort obj = new MergeSort();
		double[] sortedArray = obj.getSortedArray(price, false);
		return sortedArray;
	}
	public double[] getDescending() {
		MergeSort obj = new MergeSort();
		double[] sortedArray = obj.getSortedArray(price, true);
		return sortedArray;
	}
	
	public int getRisedCompanyCount() {
		int rise_count = 0;
		for(int i=0; i<this.status.length; i++) {
			if(this.status[i] == true)
				rise_count++;
		}
		return rise_count;
	}
	
	public int getDeclinedCompanyCount() {
		int decline_count = 0;
		for(int i=0; i<this.status.length; i++) {
			if(this.status[i] == false)
				decline_count++;
		}
		return decline_count;
	}
	
	public void search(double element) {
		for(int i=0; i<this.price.length; i++) {
			if(this.price[i] == element) {
				System.out.println("Found");
				break;
			}
		}
	}

}
