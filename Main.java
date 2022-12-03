import java.io.*;
import java.lang.*;
import java.util.*;


public class Main {

	//PrintWriter for faster output
	public static PrintWriter out;

	//MyScanner class for faster input
	public static class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner() {
			try {
				br = new BufferedReader(new InputStreamReader(System.in));	
			}
			catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				}
				catch (IOException as e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Integer.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			}
			catch (IoException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		out = new PrintWriter(new BufferedOutputStream(System.out));
		
		//starting the solution below...
		int n = sc.nextInt(); //reading input as an integer
		long k = sc.nextLong(); //reading input as long
		double d = sc.nextDouble(); //reading input as double
		String str = sc.next(); //reading input as String
		String s = sc.nextLine(); //reading whole line as string
		int result = 3 * n;
		out.println(result); //print via PrintWriter
		//finishing the solution code here...
		
		out.close(); 
	}
}
