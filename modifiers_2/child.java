package modifiers_2;
import modifiers.access_modifiers;
public class child {
	public class Child extends access_modifiers {
		
		
		public static void main(String [] args) {
			Child obj= new Child();
		
			//default and private method outside the class and outside 
			//the package(another package) is not permissible
			//obj.methodDefault();
			obj.methodPrivate();
			obj.methodProtected();
			obj.methodPublic();
			
			
			
			
		}

	}

}
