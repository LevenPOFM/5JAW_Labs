/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
public class DoublyLinkedList<T> {
    
    Node<T> head;
    Node<T> tail;
    int count = 0;

    public Node<T> getHead() {
        return head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public int getCount() {
        return count;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public void setTail(Node<T> tail) {
        this.tail = tail;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    public void addFirst(Node<T> node){
        Node<T> temp = head;
        head = node;
        head.next = temp;
        if(count == 0)
        {
            // Empty list, should point to new node. 
            tail = head;
        } else {
            temp.previous = head;
        }
        count++;
    }
    
    // Used for converting an object to a node. 
    public void addFirst(T value){
        addFirst(new Node<T>(value));
    }
    
    public void addLast(Node<T> node){
        if (count ==0) {
            head = node;
        } else {
            tail.next = node;
            node.previous = tail;
        }
        tail = node;
        count++;
    }
    
    // Used for converting an object to a node. 
    public void addLast(T value){
        addLast(new Node<T>(value));
    }
    
    public void removeFirst(){
        if(count !=0){
            head = head.next;
            count--;
            if (count == 0) {
                tail = null;
            } else {
                head.previous = null;
            }
        }
    }
   
    
    public void removeLast(){
        if (count != 0) {
            if(count == 1) {
                head = null;
                tail = null;
            } else {
                tail.previous.next = null;
                tail = tail.previous;
            }
            count--;
         }
    }
    
    public boolean contains(T item) {
        Node<T> current = head;
        while(current != null)
        {
            if (current.value.equals(item)){
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
}
