package study.algorith.datastructure;

import java.util.*;

/**
 * 큐 구조
 * 줄을 서는 행위와 유사
 *
 * 가장 먼저 넣은 데이터를 가장 먼저 꺼낼 수 있는 구조.
 * -음식점에서 가장 먼저 주을 선 사람이 제일 먼저 음식점에 입장하는 것과 동일
 * -FIFO(First-In, First-Out) 또는 LILO(Last-In, Last-Out) 방식으로 스택과 꺼내는 순서가 반대
 *
 * 알아둘 용어
 * - Enqueue : 큐에 데이터를 넣는 기능
 * - Dequeue : 큐에서 데이터를 꺼내는 기능
 * - Visualgo 사이트에서 시연해보며 이해하기 (enqueue/dequeue 만 클릭해보기)
 * https://visualgo.net/en/list
 *
 * 큐의 활용분야
 * - 멀티 태스킹을 위한 프로세스 스케쥴링 방식을 구현하기 위해 많이 사용됨 (운영체제 참조)
 *      | 큐의 경우에는 장단점 보다는 (특별히 언급되는 장단점이 없음),
 *      | 큐의 활용 예로 프로세스 스케쥴링 방식을 함께 이해해두는 것이 좋음
 *
 */
public class QueueData implements Comparable<QueueData> {
    int idx;
    int data;

    public QueueData() {
    }

    public QueueData(int idx, int data) {
        this.idx = idx;
        this.data = data;
    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "QueueData{" +
                "idx=" + idx +
                ", data=" + data +
                '}';
    }

    @Override
    public int compareTo(QueueData o) {
//        return this.idx - o.idx;
        return this.data - o.data;
    }
}

class QueueTest{
    public static void main(String[] args) {
//        Queue<QueueData> q1 = new ArrayDeque<>();
        Queue<QueueData> q1 = new LinkedList<>();
        List<String> testArList = new ArrayList<>();
        testArList.add(0, "1");
        for (int i = 0; i < 10; i++){
            // ArrayList의 add와 같은 기능을 가졌다.
            // 하지만, 자료구조의 특성상, 특정 인덱스에 add하는 메소드는 없다.
            q1.add(new QueueData(i, (int) (Math.random() * 1000)));
        }
        System.out.println(q1);
        // peek() : 0번째 인덱스 즉 head에 해당하는 데이터를 살펴본다. 해당 데이터가 없을 경우
        // null이 출력된다. 검색된 데이터는 삭제되지 않고 그대로 남는다.
        System.out.println(q1.peek());
        System.out.println("peek");
        System.out.println(q1);

        // element() : peek과 동일한 기능을 가졌지만, 차이점은 해당 데이터가 없을때,
        // 예외처리를 해준다.
        System.out.println(q1.element());
        System.out.println("element");
        System.out.println(q1);

        // Enqueue : 추가
        q1.offer(new QueueData(q1.size(), (int) (Math.random() * 1000))); // 실패시 예외발생
        System.out.println("offer");
        System.out.println(q1);
        q1.add(new QueueData(q1.size(), (int) (Math.random() * 1000))); // 실패시 false 리턴
        System.out.println("add");
        System.out.println(q1);

        // Dequeue : 삭제
        q1.remove(); // 삭제 실패시, 예외 발생
        System.out.println("remove");
        System.out.println(q1);
        System.out.println("poll");
        q1.poll(); // 실패시 false 리턴
        System.out.println(q1);
        
        // 조건부 삭제
        System.out.println("remove if idx % 10 == 0");
        q1.removeIf(queueData -> queueData.idx % 10 == 0);
        System.out.println(q1);

        // priority Queue(우선순위 큐)
        // 가장 가중치가 낮은 순서로 poll, peek()을 할 수 있는 자료구조다.
        // Min Heap로 데이터를 sort 시켜놓고 출력하는 자료구조.
        // 데이터의 크기를 뒤죽박죽 아무렇게 넣어도 의도에 따라 오름차순 혹은 내림차순으로
        // poll(), peek() 할 수 있다.
        Queue<QueueData> pQueue = new PriorityQueue<>();
        pQueue.add(new QueueData(0,  (int) (Math.random() * 1000)));
        pQueue.add(new QueueData(9,  (int) (Math.random() * 1000)));
        pQueue.add(new QueueData(2,  (int) (Math.random() * 1000)));
        pQueue.add(new QueueData(5,  (int) (Math.random() * 1000)));
        pQueue.add(new QueueData(4,  (int) (Math.random() * 1000)));

        System.out.println(pQueue.poll());
        System.out.println(pQueue.poll());
        System.out.println(pQueue.poll());
        System.out.println(pQueue.poll());
        System.out.println(pQueue.remove()); // 더이상 삭제할 수 없을 때, 예외처리(프로그램 종료)
        System.out.println(pQueue.poll()); // 더이상 삭제할 수 없을 때, null 출력
        System.out.println(pQueue.size());
    }
}