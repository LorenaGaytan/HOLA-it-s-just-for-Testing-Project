// Call by:
//     # of queries
//     Name
//     Phone ....
//     Name (to search)
// i.e. 2
//      Alma
//      3320
//      Armando
//      1100
//      Alma
//      Alex
// Result = 3320 + Not found
//
import java.util.HashMap;
import java.util.*;
import java.io.*;

class Map_NamePhone{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
        // Number of entries
		int n=in.nextInt();
		in.nextLine();
        HashMap<String, Integer> map = new HashMap<>();
        //save info into map
        for(int i=0;i<n;i++){
           String name=in.nextLine();
           int phone=in.nextInt();   
           map.put(name,phone);
           in.nextLine();
        }
        //get info requested by user
		while(in.hasNext())
		{
			String s=in.nextLine();
            if ( map.containsKey(s))
                System.out.println(s+"="+map.get(s));
            else
                System.out.println("Not found");
		}
	}
}

