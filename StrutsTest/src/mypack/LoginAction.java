package mypack;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport//showing error because jar file is required
	{
	private static final long serialVersionUID = 1L;	
//	Define variable
	private String name, password; 
		//validation
		public void validate(){
			if(name.length()==0)
				this.addFieldError("name","Name is required");
			if(password.length()==0)
				this.addFieldError("password","Password is required");
			else if(password.length()<4)
				this.addFieldError("password","Password Should be of atleast 4 character.");
			
		}
//Getter Setter methods of variables		
		public String getName(){
			return name;
		}
		
		public void setName(String name){
			this.name = name;
		}
		public String getPassword(){
			return password;
		}
		
		public void setPassword(String password){
			this.password = password;
		}
	}
	

