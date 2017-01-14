import java.util.ArrayList;

public class Circle implements Shape {
	
	String kind;
	String details;
	int ID;

	@Override
	public String getKind(String kind) {
		return kind;
	}

	@Override
	public String getDetailString(String details) {
		return details;
	}

	@Override
	public int getID(int ID) {
		return ID;
	}
	
	public void toString(String kind, int ID)
	{
		
	}
	


}
