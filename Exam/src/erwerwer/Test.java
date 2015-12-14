package erwerwer;

import java.util.HashMap;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		String aa=null;
		String bb="asdl";
		
		System.out.println(bb.equals(aa));
		Computer cm=new Computer("asdasd", "adasd", 10, 123,12.23);
		NoteBook nb=new NoteBook("ASUS", "Intel i7", 3056, 100,2.43, 15, 9,2, cm);
		Computer cm1=new Computer("asdasd", "adasd", 10, 123,12.23);
		NoteBook nb1=new NoteBook("ASUS", "Intel i7", 3056, 100,2.43, 15, 9,2, cm);
		System.out.println(nb.hashCode());
		NoteBook nn=nb.clone();
		System.out.println(nb1.hashCode());
		System.out.println(nb.equals(nb1));
	}

}
