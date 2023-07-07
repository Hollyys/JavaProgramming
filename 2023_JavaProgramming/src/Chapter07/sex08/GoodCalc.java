package Chapter07.sex08;

public class GoodCalc extends Calculator{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double average(int[] a) {
		// TODO Auto-generated method stub
		double sum = 0;
		for(int i=0; i<a.length; i++)
			sum += a[i];
		
		return sum / a.length;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoodCalc calc = new GoodCalc();
		System.out.println(calc.add(2, 3));
		System.out.println(calc.subtract(2, 3));
		System.out.println(calc.average(new int[] {1, 2, 3, 4, 5}));

	}

}
