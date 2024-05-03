package MVC;

import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AuthModel //logica. base de datos a modelo
{
	public AuthModel()
	{
		
	}
	
	public void login(String user, String psw)
	{
		try 
		{
			String filePath = "C:\\Users\\lachi\\OneDrive\\Documentos\\Documentos\\json\\users.json";
			FileReader reader = new FileReader(filePath); //leer archivo
			
			StringBuilder jsonString = new StringBuilder(); //guarda el contenido del json
			int p;
			
			while((p = reader.read()) != -1)
			{
				jsonString.append((char) p);//convierte a char
			}
			
			reader.close();
			
			JSONObject jsonObj = new JSONObject(jsonString.toString()); //objeto a partir del contenido de json
			JSONArray usersArray = jsonObj.getJSONArray("users"); //array de usuarios json
			
			String user1 = null;
			String psw1 = null;
			//String getPsw = new String(passwordField_1.getPassword());
			boolean encontrado = false;
			
			for(int i = 0 ; i < usersArray.length() ; i++) //recorremos todos los usuarios jissetts  ePawWgrnZR8L
			{
				JSONObject userObj =  usersArray.getJSONObject(i);
				user1 = userObj.getString("username");
				psw1 = userObj.getString("password");
				
				if (user1.equals(user) && psw1.equals(psw)) 
				{
			        encontrado = true;
			        break; 
			    }
				
				System.out.println("User: " + user1);
				System.out.println("Password: " + psw1);
//				System.out.println();	9uQFF1Lh	
				
			}
			
			if(encontrado)
			{
				JOptionPane.showMessageDialog(null, "Bienvenido de nuevo");
						
			}
			else 
			{
				JOptionPane.showMessageDialog(null, "Usuario o contraseña no válidos, intente de nuevo.");
			}

		} 
		
		catch (IOException | JSONException e1) 
		{
			e1.printStackTrace();
		}
		
	}
	

}
