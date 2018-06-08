package builder;
/**构造器的this使用*/
public class Platypus {
	String name;
	 Platypus() {
		//this不放第一行会报错
		 this("John/Mary Doe!",521);
	}

	 Platypus(String input) {
		name = input;
		System.out.println(name);
	}
	 Platypus(String input,int ints) {
			name = input;
			System.out.println(name+ints);
		}
	 public static void main(String[] args) {
		 Platypus p1 =new Platypus(" digger");
		 Platypus p2 =new Platypus();
	}

	
	 
}
