import java.util.List;
import java.util.ArrayList;

public class exam2 {

	public static void main(String[] args) {
	List<String> last_name = new ArrayList<String>();
	List<String> first_name = new ArrayList<String>();
	
	last_name.add("佐藤");
	last_name.add("田中");
	last_name.add("鈴木");
	last_name.add("山田");
	first_name.add("太郎");
	first_name.add("花子");
	first_name.add("次郎");
	first_name.add("三郎");
	
	System.out.println("last name =" + last_name);
	System.out.println("first name =" + first_name);
	
	for (int i = 0; i < last_name.size(); i++) {
		System.out.println(last_name.get(i) + first_name.get(i));
	}
	}

}
