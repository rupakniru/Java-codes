package Capgeminiday8;

//import CapgeminiDay8.N;

class N{
	private String name;
	private String game;
	public N(String name, String game) {
		super();
		this.name = name;
		this.game = game;
	}
	public N(N number) {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGame() {
		return game;
	}
	public void setGame(String game) {
		this.game = game;
	}
	public void num()
	{
		
	}
	
}
class K{
	 
  N n;
  public K(N num)
  {
	   n=num;
  }
  void print()
  {
	  String [] s=n.getName().split(" ");
	  for(String s1:s)
		  System.out.println(s1);
  }
}
public class Source {
       public static void main(String [] args)
       {
       	N p=new N("rupak dsfsd","sjdf");
       	p.setGame("lskdjf");
        K k=new K(p);
        k.print();
        System.out.println(p.getGame());
       }
}
