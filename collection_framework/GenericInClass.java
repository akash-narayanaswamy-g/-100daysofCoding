package Collection_framework;

class akash<t>{
	t value;
	
	public void show() {
		System.out.println(value.getClass());
	}
	
}

public class GenericInClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		akash<Integer> obj=new akash();
		obj.value=55;
		obj.show();
		

	}

}
