import java.util.*;

public class List_InsertDelete{
    public static void InsertDelete() {
        //Get info from STDIN
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for(int i= 0; i < n; i++){
            list.add( sc.nextInt());
        }
        int q = sc.nextInt();
        while(q-- > 0){
            String action = sc.next();
            String insert = "Insert";
            String delete = "Delete";
            if ( action.equals(insert)){
                int x = sc.nextInt();
                int y = sc.nextInt();
                list.add(x, y);
            }
            else if ( action.equals(delete)){
                int index = sc.nextInt();
                list.remove(index);
            }
        }
        System.out.println(list.toString());
        sc.close();
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        InsertDelete();
    }
}
