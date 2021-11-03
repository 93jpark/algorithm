package DataStructure;

import java.lang.management.GarbageCollectorMXBean;

public class MySingleLinkedList<T> {
    public Node<T> head = null;
    public class Node<T> {
        public T data;
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
        } else {
            Node cursor = this.head;
            while(cursor.next!=null){
                cursor = cursor.next;
            }
            cursor.next = new Node<T>(data);
        }
    }

    // target데이터 전에 새로운 데이터 삽입
    public void addNodeBefore(T newData, T target){
        if(this.head == null) {
            System.out.println("List is empty");
        } else {
            if(this.head.data == target) {
                Node<T> newNode = new Node<T>(newData);
                newNode.next = this.head;
                this.head = newNode;
            } else {
                Node cursor = this.head;
                while(cursor.next.data != target) {
                    cursor.next = cursor;
                }
                Node<T> newNode = new Node<T>(newData);
                newNode.next = cursor.next;
                cursor.next = newNode;
            }
        }
    }


    // target데이터 노드 뒤에 새로운 데이터 노드 삽입
    public void addNodeAfter(T newData, T target){
        if(this.head == null) {
            System.out.println("List is empty");
        } else {
            Node<T> newNode = new Node<T>(newData);
            Node<T> cursor = this.search(target);
            newNode.next = cursor.next;
            cursor.next = newNode;
        }

    }



    // 특정 값을 지닌 노드 삭제. 해당 노드가 존재하지 않으면 false, 삭제성공 시 true 반환
    public boolean delNode(T data) {
        if(this.head == null) {
            System.out.println("list is empty");
            return false;
        }

        if (this.head.data == data) {
            this.head = this.head.next;
            return true;
        }

        Node<T> cursor = this.head;
        while(cursor.next.data != data) {
            cursor = cursor.next;
        }
        cursor.next = cursor.next.next;
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
