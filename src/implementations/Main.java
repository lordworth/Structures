package implementations;

public class Main {
    public static void main(String[] args){
        List<Integer> list=new LinkedList<>();

        list.add(1);
        list.add(5);
        list.add(5);
        list.add(14);

        //list.traverse();

        list.remove(14);
        list.traverse();
    }
}
