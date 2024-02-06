/*
1. 모든 데이터 출력/printAll()
2. 모든 데이터 제거/clear()
3. 인덱스 삽입/insertAt(index, data)
4. 마지막 삽입/insertLast(data)
5. 인덱스 삭제/deleteAt(index)
6. 마지막 삭제/deleteLast()
7. 인덱스 읽기/getNodeAt()
 */

public class LinkedList<T> {

    private Node<T> head;
    private int count;

    LinkedList() {
        this.head = null;
    }

    public void printAll() {
        Node<T> currentNode = this.head;

        while(currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    public void insertAt(int index, T data) {

        if(index > this.count || index < 0) {
            System.out.println("범위를 넘어 갔습니다.");
            return;
        }

        Node<T> node = new Node<>(data);

        if (index == 0) {
            node.next = this.head;
            this.head = node;
        } else {
            Node<T> currentNode = this.head;

            for (int i=0; i<index-1; i++) {
                currentNode = currentNode.next;
            }

            node.next = currentNode.next;
            currentNode.next = node;
        }
        this.count++;
    }

    public void insertLast(T data) {
        this.insertAt(this.count, data);
    }

    public T deleteAt(int index) {
        if (index >= this.count || index < 0) {
            System.out.println("제거할 수 없습니다.");
            return null;
        }

        Node<T> currentNode = this.head;

        if (index == 0) {
            Node<T> deleteNode = this.head;
            this.head = this.head.next;
            this.count--;
            return deleteNode.data;
        } else {
            for (int i=0; i< index-1; i++) {
                currentNode = currentNode.next;
            }
            Node<T> deleteNode = currentNode.next;
            currentNode.next = currentNode.next.next;
            this.count--;
            return deleteNode.data;
        }
    }

    public void deleteLast() {
        this.deleteAt(this.count-1);
    }

    public void clear() {
        this.head = null;
        this.count = 0;
    }
}

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }
}