/* 
 * Solution to Project Euler problem 10
 * by Project Nayuki
 * 
 * https://www.nayuki.io/page/project-euler-solutions
 * https://github.com/nayuki/Project-Euler-solutions
 */


public final class p010 implements EulerSolution {
	
	public static void main(String[] args) {
		System.out.println(new p010().run());
	}
	
	
	/* 
	 * Call the sieve of Eratosthenes and sum the primes found.
	 */
	private static final int LIMIT = 2000000;
	
	public String run() {
		long sum = 0;
		for (int p : Library.listPrimes(LIMIT - 1))
			sum += p;
		return Long.toString(sum);
	}
	
}
