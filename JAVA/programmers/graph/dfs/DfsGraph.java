package algorithm.graph.dfs;

import java.util.Arrays;
import java.util.Scanner;

public class DfsGraph {
    // 정점의 갯수
    private int nV;
    // 그래프
    private int[][] dfsGraph;
    // 정점 방문 여부 확인 배열
    private boolean[] visitArr;

    public DfsGraph(int nV) {
        this.nV = nV;
        this.dfsGraph = new int[this.nV+1][this.nV+1];
        this.visitArr = new boolean[this.nV+1];
    }

    // 그래프 return
    public int[][] getGraph() {
        return this.dfsGraph;
    }

    // 그래프 추가 (양방향)
    public void put(int x, int y) {
        // 정점 x와 y가 연결되어있음을 의미
        this.dfsGraph[x][y] = this.dfsGraph[y][x] = 1;
    }

    // 그래프 추가 (단방향)
    public void putSingle(int x, int y) {
        this.dfsGraph[x][y] = 1;
    }

    // 그래프 출력 (인접행렬)
    public void printGraphToAdjArr() {
        for (int[] ints : this.dfsGraph) {
            for (int anInt : ints) {
                System.out.print(" " + anInt);
            }
            System.out.println();
        }
    }

    // 정점 방문 여부 확인 배열 초기화
    public void clearVisitArr() {
        Arrays.fill(this.visitArr, false);
    }

    // 그래프 탐색 (재귀호출)
    public void dfs(int vIdx) {
        // dfs()에 들어온 vIdx는 방문한 것이므로
        // 방문배열의 해당 index값을 true로 바꿔주고 값을 출력함.
        this.visitArr[vIdx] = true;
        System.out.print(vIdx + " ");

        // 인접 행렬로 구현된 그래프에서
        // 정점의 개수(nV) 만큼 탐색
        for(int i=1; i<=this.nV; i++) {

            // dfsGraph[][]의 해당 정점이 연결되어있는 것으로 표시되어 있으나 (연결은 1로 표시)
            // 방문 배열에서 방문하지 않은 상태(false)인 경우
            if(dfsGraph[vIdx][i] == 1 && !visitArr[i]) {
                dfs(i);    // dfs() 재귀호출
            }
        }
    }

}

class DFSAdjArr {
    public static void main(String[] args) {
        // int v = 0;    // 정점 (수동입력에 사용되는 변수)
        // int e = 0;    // 간선 (수동입력에 사용되는 변수)
        int nV = 0;    // 정점의 개수
        int nE = 0;    // 간선의 개수

        Scanner sc = new Scanner(System.in);
        nV = sc.nextInt();    // 정점
        nE = sc.nextInt();    // 간선

        // 입력받은 정점의 개수로 그래프 초기화
        DfsGraph dfsGraph = new DfsGraph(nV);

        // 그래프에 정점과 간선 입력
        // 입력받은 간선의 개수만큼 반복
        // ex) 정점 8, 간선 10
        dfsGraph.put(1, 2);
        dfsGraph.put(1, 3);
        dfsGraph.put(2, 4);
        dfsGraph.put(2, 5);
        dfsGraph.put(3, 6);
        dfsGraph.put(3, 7);
        dfsGraph.put(4, 8);
        dfsGraph.put(5, 8);
        dfsGraph.put(6, 8);
        dfsGraph.put(7, 8);

        // 정점과 간선 수동 입력
        /*for(int i=0; i<nE; i++) {
            v = sc.nextInt();
            e = sc.nextInt();
            dfsGraph.put(v, e);
        }*/

        sc.close();

        // 입력한 정점과 간선으로 구성된 인접행렬 출력
        dfsGraph.printGraphToAdjArr();

        // 정점 순서대로 그래프 탐색
        System.out.println();
        System.out.print("정점 1부터 탐색 : ");
        dfsGraph.dfs(1);

        System.out.println();
        System.out.print("정점 2부터 탐색 : ");
        dfsGraph.clearVisitArr();
        dfsGraph.dfs(2);

        System.out.println();
        System.out.print("정점 3부터 탐색 : ");
        dfsGraph.clearVisitArr();
        dfsGraph.dfs(3);

        System.out.println();
        System.out.print("정점 4부터 탐색 : ");
        dfsGraph.clearVisitArr();
        dfsGraph.dfs(4);

        System.out.println();
        System.out.print("정점 5부터 탐색 : ");
        dfsGraph.clearVisitArr();
        dfsGraph.dfs(5);

        System.out.println();
        System.out.print("정점 6부터 탐색 : ");
        dfsGraph.clearVisitArr();
        dfsGraph.dfs(6);

        System.out.println();
        System.out.print("정점 7부터 탐색 : ");
        dfsGraph.clearVisitArr();
        dfsGraph.dfs(7);

        System.out.println();
        System.out.print("정점 8부터 탐색 : ");
        dfsGraph.clearVisitArr();
        dfsGraph.dfs(8);
    }
}
