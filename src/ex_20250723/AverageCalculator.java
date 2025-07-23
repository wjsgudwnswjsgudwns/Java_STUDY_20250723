package ex_20250723;

public class AverageCalculator {

	public double total(int[] numbers) {
		int total = 0;
		for (int num : numbers) {
			total += num;
		}
		double avg = (double) total / numbers.length;
		return avg;
	}
}
