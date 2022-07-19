package modifiers;


public class test_methods {

	//accessing Accessmodifier methods in different class with samepackage name
	public static void main(String [] args) {
		
		access_modifiers obj= new  access_modifiers();
		
		obj.methodDefault();
		obj.methodPrivate(); //private method we can't access out side of class, its scope is within the class
		obj.methodProtected();
		obj.methodPublic();
	}
}