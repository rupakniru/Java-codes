package Capgeminiday8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          List<Integer> l=new ArrayList<Integer>();
          l.add(10);
          l.add(14);
          l.add(1);
          l.add(20);
//          l.stream().forEach(System.out::println);
//          System.out.println("--------------------");
//          
//        	  List li=l.stream().filter(num->num>=10).collect(Collectors.toList());
//          li.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
//           IntSummaryStatistics s=l.stream().map(e->e*2);
          IntSummaryStatistics s=new IntSummaryStatistics();
          for(int i=0;i<4;i++)
          s.accept(l.get(i));
          System.out.println(s.toString());
           
//           System.out.println(s.getCount());
//           System.out.println(s);
          
	}

}
