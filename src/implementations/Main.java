package implementations;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
//        List<Integer> list=new LinkedList<>();
//
//        list.add(1);
//        list.add(5);
//        list.add(5);
//        list.add(14);
//
//        //list.traverse();
//
//        list.remove(14);
//        list.traverse();
//        Stack<Integer> stack=new Stac<>();
//
//        stack.push(2);
//        stack.push(5);
//        stack.push(89);
//
//        //stack.pop();
//        //stack.pop();
//
//        //System.out.println(stack.peek());
//
////        stack.traverse();
//        Tree<Integer> binaryTree=new BinarySearchTree<>();
//
//        binaryTree.addNode(8);
//        binaryTree.addNode(5);
//        binaryTree.addNode(10);
//        binaryTree.addNode(9);
//        binaryTree.addNode(12);
//        binaryTree.addNode(2);
//        binaryTree.addNode(2);
//
//        binaryTree.traverse();

        String[] qn={"A","B","C","D","E","F","G","H","J"};

        String part1=qn[0];

        //String part2=remove()

        //printarray(remove(qn,5));

        rephrase(qn);


    }

    //Printarray takes a string array, and returns the string
    public static String printarray(String[] obj){
        StringBuilder response=new StringBuilder();
        if(obj==null){return null;};

        for(int p=0;p<obj.length;p++){
            System.out.print(obj[p].toString()+" ===");
            response.append(obj[p]);
        }

        return response.toString();
    }
    // Remove takes a string array and an index and returns a string array without the element in that position.
    public static String[] remove(String[] toEdit, int index){

        if(index>toEdit.length-1){
            return null;
        }

        ArrayList<String> array=new ArrayList<>();

        for(int w=0;w<toEdit.length;w++){
            if(w==index){
                continue;
            }

            array.add(toEdit[w]);
        }

        String[] response=new String[array.size()];
        int position=0;

        for(String str:array){
            response[position]=str;
            position++;
        }

        return response;
    }

//Rephrase takes a string array question and returns pairs of inputs for first iteration
    public static StringBuilder rephrase(String[] ask){
        StringBuilder part1=new StringBuilder();
        StringBuilder part2=new StringBuilder();
       // Object[] question=new

        //String[][] newQn;

        for(int i=0;i<ask.length;i++){
            part1.append(ask[i]);
            part2.append(printarray(remove(ask,i)));

            //ask=part2;

            String[][] newQn={new String[]{part1.toString()},remove(ask,i)};

            //System.out.print

            //System.out.print(part1+" -> ");
            //System.out.println(part2);
            printarray(computer(newQn));

            newQn=null;

            part1.delete(0,part1.length());
            part2.delete(0,part2.length());

        }


        return part1;
    }

    public static String[] computer(String[][] input){

        ArrayList resp=new ArrayList();

        String parts=printarray(input[1]);

        for(int j=0;j<parts.length();j++){
            resp.add(input[0][0]+parts.charAt(j));
        }

        String[] compString=new String[resp.size()];
        int count=0;
        for(Object obj:resp){
            compString[count]=(String)obj;
            count++;

        }

        return compString;
    }
}
