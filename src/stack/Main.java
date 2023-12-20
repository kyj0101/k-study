package stack;

public class Main {
    public static void main(String[] args) {

        // 기본 생성자
        // push
//        Stack stack = new Stack();
//        stack.push("1");
//        stack.push("2");
//        stack.push("3");
//        stack.push("4");
//        stack.push("5");
//        System.out.println(stack);
//
//        // pop
//        System.out.println("pop! " + stack.pop()); // 5
//        System.out.println(stack);
//        System.out.println("pop! " + stack.pop()); // 4
//        System.out.println(stack);
//
//        // peek
//        System.out.println("peek! " + stack.peek());
//        System.out.println(stack);

        // 사이즈 지정
//        Stack stack = new Stack(5);
//        System.out.println(stack);
//
//        // isEmpty
//        System.out.println("isEmpty " + stack.isEmpty());
//
//        // push
//        stack.push("1");
//        stack.push("2");
//        stack.push("3");
//        stack.push("4");
//        System.out.println(stack);
//
//        // isFull
//        System.out.println("is Full " + stack.isFull());
//        stack.push("5");
//        System.out.println(stack);
//        System.out.println("is Full " + stack.isFull());
//
//        // pop
//        System.out.println("pop " + stack.pop());
//        System.out.println(stack);
//        System.out.println("pop " + stack.pop());
//        System.out.println(stack);
//
//        // push
//        stack.push("4");
//        stack.push("5");
//        System.out.println(stack);
//
//        // peek
//        System.out.println("peek " + stack.peek());
//        System.out.println(stack);

        // 파라미터 생성자
        Stack stack = new Stack(new Object[]{"1", "2", "3", "4", "5"});
        System.out.println(stack);

        // isFull
        System.out.println("is Full " + stack.isFull());

        // max
        stack.push("6");
        stack.push("7");
        stack.push("8");
        stack.push("9");
        stack.push("10");
        System.out.println(stack);

        // error
        stack = new Stack(10);
        //stack.pop();
        System.out.println(stack);
    }
}
