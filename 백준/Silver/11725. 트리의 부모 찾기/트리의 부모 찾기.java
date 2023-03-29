import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 노드의 개수
        int n = Integer.parseInt(br.readLine());

        // 트리 인접리스트 생성 초기화
        ArrayList<Integer>[] tree = new ArrayList[n+1];
        for(int i = 1; i <= n; i++) {
            tree[i] = new ArrayList<Integer>();
        }

        //정점
        int a, b;

        // 리스트 연결
        for(int i = 0; i < n-1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            tree[a].add(b);
            tree[b].add(a);
        }

        // 인덱스:부모
        int[] parents = new int[n+1];

        // dfs
        dfs(tree, parents, n, 1, 0);

        // 결과 출력
        for(int j = 2; j <= n; j++) {
            System.out.println(parents[j]);
        }
    }

    private static void dfs(ArrayList<Integer>[] list, int[] parents, int n, int start, int parent) {
        parents[start] = parent;
        for(int item : list[start]) {
            if(item != parent) dfs(list, parents, n, item, start);
        }
    }

}
