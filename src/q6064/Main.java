package q6064;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	static int T, M, N, x, y;

	public static void main(String[] args) throws IOException {
		int i,k;

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		T = Integer.parseInt(in.readLine());

		StringTokenizer st;

		for (i = 0; i < T; i++) {
			st = new StringTokenizer(in.readLine());
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());

			k = x;
			while (true) {
				if (k > M * N) {
					k = -1;
					break;
				}
				if (k % N == y % N) {
					break;
				}
				k += M;
			}

			out.write(k + "\n");
		}
		out.flush();

		in.close();
		out.close();
	}
}
