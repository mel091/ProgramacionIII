package MVC;

public class AuthModel //logica. base de datos a modelo
{
	public AuthModel()
	{
		
	}
	
	public boolean login(String user, String psw)
	{
		if(user.equals("bro") && psw.equals("2112"))
			return true;
		return false;
	}

}
