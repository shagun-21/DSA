public class LinkedlistFirstProgram{
    public static class Node {
        int data;
        Node next;
    }

   public static class ll{
        Node head;
        Node tail;
        int size;
    }


        public static void main(String[] args) {
            ll list=new ll();
            Node temp=new Node();
            temp.data=1;
            temp.next=null;
            temp.next=list.head;
            temp.next=list.tail;

            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;

            }


        }
      public  static void insertAtFirst(int val){


        }


}
