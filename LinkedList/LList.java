package com.datastructs;

import java.util.Scanner;

//Node class to define Node Structure
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

//LinkedList Structure Class
class LinkedList {
    public Node head = null;

    //initialize LinkedList with user given numbers
    public void initialize(){
        int value;
        Scanner sc = new Scanner(System.in);

        value = sc.nextInt();
        while(value != -1){
            Node newNode = new Node(value);
            if(this.head == null){
                this.head = newNode;
            }
            else{
                Node ptr = this.head;
                while(ptr.next != null) {
                    ptr = ptr.next;
                }
                ptr.next = newNode;
            }
            value = sc.nextInt();
        }
    }

    //Add element at first position
    public void addFirst(int value){
        Node n = new Node(value);
        if (this.head != null) {
            n.next = this.head;
        }
        this.head = n;
    }

    //Add element at ith position (linkedlist starts with i = 1.)
    public void addAt(int value, int i){
        Node ptr = this.head;
        Node newNode = new Node(value);
        if(i == 1){
            newNode.next = this.head;
            this.head = newNode;
            return;
        }
        for(int index = 0; index < i - 2; index++){
            ptr = ptr.next;
        }
        newNode.next = ptr.next;
        ptr.next = newNode;
    }

    //Add element at last position
    public void addLast(int value){
        Node ptr = this.head;
        Node newNode = new Node(value);
        while(ptr.next != null){
            ptr = ptr.next;
        }
        ptr.next = newNode;
    }

    //delete element at ith position (linkedlist starts with i = 1.)
    public void delete(int i){

    }

    //Print the LinkedList
    public void printList() {
        Node ptr = this.head;
        while(ptr != null){
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
    }
}

//Main Class
public class LList{
    public static void main(String[] args){
        LinkedList l = new LinkedList();
        l.initialize();
        l.printList();
        l.addAt(9,1);
        l.printList();
    }
}
