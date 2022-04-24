import java.util.ArrayList;
import java.util.Collections;

public class ArralistCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList l=new  ArrayList();
        l.add("hi");
        l.add("himam");
       
	  ArrayList l1=new  ArrayList(l);
      l1.add("helo");
      l1.add("gnani");
     
      System.out.println(l);
      System.out.println(l1);
      
     
	}

}
