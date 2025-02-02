class MinStack {
    private Node head;


    public void push(int val){
        if(head == null){
            head = new Node (val, val, null);
        }else{
            head = new Node(val, Math.min(val, head.min), head);
        }
    }

    public void pop(){
        head = head.next;
    }

    public int top(){
        return head.val;
    }

    public int min(){
        return head.min;
    }

    private class Node{
        int val;
        int min;
        Node next;

        Node(int val, int min, Node next){
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }
}

class Aain{
    public static void main(String[] args) {
       MinStack stack = new MinStack();
       stack.push(2);
        stack.push(5);
        stack.push(7);
        stack.push(8);

        System.out.println(stack.top());
        stack.pop();
        stack.pop();
        System.out.println(stack.top());

    }
}
