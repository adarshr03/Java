package com.adarsh;

public class Main {
	public static void main(String args[]) {
		Parent parent = new Parent();
		Parent childAsParent = new Child();
		Child child = new Child();
/* static binding / compile-time / early binding starts here*/
		// Static method calls
		parent.staticMethod();        // Output: Static method in Parent 
		childAsParent.staticMethod(); // Output: Static method in Parent
		child.staticMethod();         // Output: Static method in Child

		/*Even though childAsParent refers to a Child object, the compiler binds staticMethod()
		 *  to the reference type (Parent)
		 *   at compile-time → static binding / static polymorphism.
		 *   Method overloading is also an example of static polymorphism*/
		
		/* static binding / compile-time / early binding ends here*/	
		
		
		
//		dynamic binding  /  run-time  /  late binding starts here
		// Instance method calls
		parent.instanceMethod();        // Output: Instance method in Parent
		childAsParent.instanceMethod(); // Output: Instance method in Child
		child.instanceMethod();         // Output: Instance method in Child
		
		
		/*For object childAsParent at runtime we will be checking if the method instanceMethod
		 *  is present in child ,if present it will call the child method.
		 *  Here, even though the reference type is Parent, the object is Child,
		 *   so at runtime, JVM chooses Child’s version.*/

	}

}
