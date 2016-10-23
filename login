  

public ArrayList<String> userName = new ArrayList<String>(5);
public ArrayList<String> userPass = new ArrayList<String>(5);

public String usrnm, pswd, pswdTest;
public int userIndex, pswdIndex;
int i = 0;

userName.add("Megan");
userName.add("Mary");
userName.add("Matt");
userName.add("Charles");

userPass.add("Pass1");
userPass.add("Pass2");
userPass.add("Pass3");
userPass.add("Pass4");

usrnm.getText();
pswd.getText();

while (i == 0)
{
	pswdIndex = userName.indexOf(usrnm);
	pswdTest = userPass.get(pswdIndex);
	if (usrnm == pswdTest)
	{
		System.out.print("Welcome");
		i = 1; 
	}
	else
	{
		System.out.print("Invalid Login");
		i = 0; 
	}
}
