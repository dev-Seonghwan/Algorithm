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

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(twoPointer(arr, M));
    }

    static int twoPointer(int[] arr, int m) {
        int count = 0;
        int startPoint = 0, endPoint = 0;
        int len = arr.length;
        int sum = 0;

        while(true) {
            if(sum >= m) {
                sum -= arr[startPoint++];

            }
            else if(endPoint >= len) {
                break;
            }
            else {
                sum += arr[endPoint++];
            }

            if(sum == m) {
                count++;
            }
        }

        return count;
    }
}