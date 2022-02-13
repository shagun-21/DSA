public class LinkedlistFirstProgram {
    public static class Node{
        int data;
        Node next;
    }

    public static void main(String[] args) {
        Node one =new Node();
        one.data=1;
        one.next=null;
        Node two=new Node();
        two.data=2;
        one.next=two;
        two.next=null;

        System.out.println(one.next.next);
        }

}
