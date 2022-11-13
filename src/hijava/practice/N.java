package hijava.practice;

public class N {
	int x = 10;
	int y = 20;
	
	public void swap() {
		int temp =  this.x;
		this.x = this.y;
		this.y = temp;
		System.out.println();
	}

	public static void main(String[] args) {
		 // TODO Auto-generated method stub
		N n = new N();
		System.out.println(n.x);
		System.out.println(n.y);
		
		n.swap();
		
		System.out.println(n.x);
		System.out.println(n.y);

	}

}
