public class MyLinkedList{
     
    private class ListNode{
        int val; 
        ListNode next;

        public ListNode(int val){
            this.val=val;
        }

        @Override
        public String toString(){
            return "" + this.val;
        }
    }

    ListNode head;

    public MyLinkedList(){
        head = new ListNode((Integer) null);
    }    

    public MyLinkedList(int val){
        head = new ListNode(val);
    }

    public void add(int newVal){
        if(this.head==null){
            head = new ListNode(newVal);
        }
        else{

        }
           
    }


}