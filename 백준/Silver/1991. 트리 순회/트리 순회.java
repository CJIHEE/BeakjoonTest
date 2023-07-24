import java.util.*;

public class Main {
        static class Node{
        String value; //
        Node lt,rt;

        Node(String value) {
            this.value = value;
            lt= rt =null;
        }
    }
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args){
        Node root = new Node("A");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            String parent = sc.next();
            String leftNode = sc.next();
            String rightNode = sc.next();

            insert(root,parent,leftNode,rightNode);
        }

        dfsF(root);
        sb.append("\n");
        dfsS(root);
        sb.append("\n");
        dfsT(root);

        System.out.print(sb);

    }

    public static void insert(Node currentNode, String parent, String leftNode, String rightNode){
        if(currentNode.value.equals(parent)){
            if(!leftNode.equals(".")){
                currentNode.lt = new Node(leftNode);
            }
            if(!rightNode.equals(".")){
                currentNode.rt = new Node(rightNode);
            }
        }
        else{
            if(currentNode.lt != null){
                insert(currentNode.lt, parent, leftNode, rightNode);
            }
            if(currentNode.rt != null){
                insert(currentNode.rt, parent, leftNode, rightNode);
            }
        }
    }

    public static void dfsF(Node root){
        if(root == null ) return;
        sb.append(root.value);
        dfsF(root.lt);
        dfsF(root.rt);
    }
    public static void dfsS(Node root){
        if(root == null ) return;
        dfsS(root.lt);
        sb.append(root.value);
        dfsS(root.rt);
    }
    public static void dfsT(Node root){
        if(root == null ) return;
        dfsT(root.lt);
        dfsT(root.rt);
        sb.append(root.value);
    }
}
