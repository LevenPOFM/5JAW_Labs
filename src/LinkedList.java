/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
public class LinkedList<T> {
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
        
        // Save the current head node for later use.
        Node<T> temp = head;
        
        // Set the pointer to the current node.
        head = node;
        
        // Add the rest of the list behind the current head.
        head.next = temp;
        count++;
        
        // If the list was empty then the head and tail now point to the new node.
        if(count ==1)
        {
            tail = head;
        }
    }
    
    public void addFirst(T value){
        addFirst(new Node<T>(value));
    }
    
    public void addLast(Node<T> node) {
        // If there are no nodes
        if(count == 0){
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
        count++;
    }
    
    public void addLast(T value){
        addLast(new Node<T>(value));
    }
    
    public void removeFirst(){
        // If anything has beened added
        if(count != 0) {
            head = head.next;
            count--;
            if(count == 0) {
                tail = null;
            }
        }
    }
    
    public void removeLast() {
        if(count !=0) {
            if(count==1) {
                head = null;
                tail = null;
            } else  {
                Node<T> current = head;
                while(current.next != tail) {
                    current = current.next;
                }
                current.next = null;
                tail = current;
            }
            count--;
        }
    }
    
    public boolean contains(T item) {
        Node<T> current = head;
        while(current != null)
        {
            if(current.value.equals(item)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
}
