import java.util.List;
import java.util.ArrayList;

public class exam2 {

	public static void main(String[] args) {
	List<String> last_name = new ArrayList<String>();
	List<String> first_name = new ArrayList<String>();
	
	last_name.add("����");
	last_name.add("�c��");
	last_name.add("���");
	last_name.add("�R�c");
	first_name.add("���Y");
	first_name.add("�Ԏq");
	first_name.add("���Y");
	first_name.add("�O�Y");
	
	System.out.println("last name =" + last_name);
	System.out.println("first name =" + first_name);
	
	for (int i = 0; i < last_name.size(); i++) {
		System.out.println(last_name.get(i) + first_name.get(i));
	}
	}

}
