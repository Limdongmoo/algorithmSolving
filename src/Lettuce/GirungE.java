package Lettuce;

import java.util.Scanner;

public class GirungE {
    static int M; //가로길이
    static int N; //세로 길이
    static int k; //배추 개수

    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, 1, 1};

    static int[][] map; //배추밭
    static boolean[][] visit;   //방문여부

    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int tc = 1; tc <= t; tc++) {
            M = sc.nextInt();
            N = sc.nextInt();
            k = sc.nextInt();

            map = new int[M][N];
            visit = new boolean[M][N];


            for (int i = 0; i < k; i++) {
                map[sc.nextInt()][sc.nextInt()] = 1;
            }

            int count = 0;

            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if (map[i][j] == 1 && !visit[i][j]) {
                        dfs(i, j);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
    public static void dfs(int r,int c){

        visit[r][c]=true;

        for(int i=0;i<4;i++){
            int nr = r+dr[i];
            int nc = c+dc[i];

            if(nr>=0 && nc>=0 && nr<M && nc<N){
                if(map[nr][nc]==1&&!visit[nr][nc]){
                    dfs(nr,nc);
                }
            }
        }
    }

}
