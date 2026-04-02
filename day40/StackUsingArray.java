public class StackUsingArray {
    public static int push(int top,int [] stack,int n){
        System.out.println("Push: "+n);
        top += 1;
        stack[top]=n;

        return top;
    }
    public static int pop(int top,int [] stack){
        System.out.println("Pop: "+stack[top]);
        top = top-1;
        
        return top;
    }
    public static void peek(int top,int [] stack){
        System.out.println("Peek: "+stack[top]);
    }
    public static boolean isEmpty(int top){
        if(top==-1){return true;}
        else{return false;}
    }
    public static void main(String[] args) {
        int [] stack = new int[100];
        int top = -1;
        
        top =push(top,stack,1);
        top =push(top,stack,2);

        for(int i=0;i<=top;i++){
            System.out.print(stack[i]+" ");
        }System.out.println();

        peek(top,stack);
        top =pop(top,stack);
        top =pop(top,stack);
        boolean result = isEmpty(top);
        System.out.println("isEmpty: "+result);
        top =push(top,stack,3);

        for(int i=0;i<=top;i++){
            System.out.print(stack[i]+" ");
        }System.out.println();
    }
}
