import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Vector<Homework> vh = new Vector<Homework>();
		Homework hw;
		
		int nCase = sc.nextInt();
		
		for(int i = 0; i < nCase; i++)
		{
			vh.clear();
			
			int nHomework = sc.nextInt();
			for(int j = 0; j < nHomework; j++)
			{
				String subject_name = sc.next();
				int time = sc.nextInt();
				hw = new Homework(subject_name, time);
				
				vh.add(hw);
			}
			
			int due_length = sc.nextInt();
			String due_subject = sc.next();
			
			boolean isFound = false;
			int k;
			for(k = 0; k < vh.size(); k++)
			{
				if(vh.get(k).getName().equals(due_subject))
				{
					isFound = true;
					break;
				}
			}
			
			
			System.out.print("Case "+Integer.toString(i+1)+": ");
			
			if(isFound)
			{
				if(vh.get(k).getTime() <= due_length)
				{
					System.out.println("Yesss");
				}
				else if(vh.get(k).getTime() <= due_length+5)
				{
					System.out.println("Late");
				}
				else
				{
					System.out.println("Do your own homework!");
				}
			}
			else
			{
				System.out.println("Do your own homework!");
			}
		}
		
		sc.close();
	}

}

class Homework {
	String _name;
	int _time;
	
	public Homework(String sub_name, int sub_time)
	{
		_name = sub_name;
		_time = sub_time;
	}
	
	public String getName()
	{
		return _name;
	}
	
	public void setName(String arg)
	{
		_name = arg;
	}
	
	public int getTime()
	{
		return _time;
	}
	
	public void setTime(int arg)
	{
		_time = arg;
	}
}