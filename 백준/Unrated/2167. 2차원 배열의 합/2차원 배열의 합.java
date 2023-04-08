import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {




    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j]= Integer.parseInt(st.nextToken());
            }
        }

        int count = Integer.parseInt(br.readLine());

        while (count > 0) {
            int answer = 0;

            st = new StringTokenizer(br.readLine());

            int idxI = Integer.parseInt(st.nextToken());
            int idxJ = Integer.parseInt(st.nextToken());
            int idxX = Integer.parseInt(st.nextToken());
            int idxY = Integer.parseInt(st.nextToken());

            for (int i = idxI-1; i < idxX; i++) {
                for (int j = idxJ-1; j < idxY; j++) {
                    answer += arr[i][j];
                }
            }

            System.out.println(answer);
            count--;
        }

    }
}