package DataStructure;
import java.util.*;

public class MyDoubleLinkedList<T> {
    public Node<T> head = null;
    public Node<T> tail = null;

    public class Node<T> {
        public T data;
        Node<T> prev = null;
        Node<T> next = null;

        // 생성자 함수 만들것
        public Node(T data) {
            this.data = data;
        }
    }


    // 특정 값을 지닌 노드 참조객체 리턴
    public Node<T> search(T data){
        Node<T> cursor = this.head;
        while(cursor.data != data) {
            if(cursor.next == null) {
                System.out.println("search result: "+data+ " does not exist");
                return null;
            }
            cursor = cursor.next;
        }
        return cursor;
    }

    // 링크드리스트에 데이터 추가하기
    public void addNode(T data){
        if(this.head == null) {
            this.head = new Node<T>(data);
            this.tail = this.head;
        } else {
            Node cursor = this.tail;
            cursor.next = new Node<T>(data);
            cursor.next.prev = cursor;
            this.tail = cursor.next;
        }
    }

    // target데이터 노드 뒤에 새로운 데이터 노드 삽입
    public void addNode(T newData, T target){
        if(this.head == null) {
            System.out.println("List is empty");
        } else {
            Node<T> cursor = this.search(target);
            if(cursor.next == null) {
                this.addNode(newData);
            } else {
                Node<T> newNode = new Node<T>(newData);
                newNode.prev = cursor;
                newNode.next = cursor.next;
                cursor.next.prev = newNode;
                cursor.next = newNode;
            }
        }
    }

    // 특정 값을 지닌 노드 삭제. 해당 노드가 존재하지 않으면 false, 삭제성공 시 true 반환
    public boolean delNode(T data) {
        if(this.head == null) {
            System.out.println("list is empty");
            return false;
        }

        if(this.head.data == data) {
            this.head = this.head.next;
            this.head.prev = null;
            return true;
        }

        Node<T> cursor = this.search(data);
        if(cursor.next == null) {
            cursor.prev.next = null;
            cursor.prev = null;
            return true;
        }
        cursor.prev.next = cursor.next;
        cursor.next.prev = cursor.prev;
        return true;
    }

    // 리스트 전체 출력
    public void printAll(){
        if(this.head == null) {
            System.out.println("This list is empty");
        } else {
            Node cursor = head;
            while(cursor!=null){
                System.out.print(cursor.data);
                if(cursor.next == null) {
                    System.out.print("\n");
                } else {
                    System.out.print(", ");
                }
                cursor = cursor.next;
            }
            System.out.println("\n");
        }
    }
}
