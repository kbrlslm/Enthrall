package oopExam;

/*
 Points: 70

1) What are the features of Interface you know? use multiple line comments here to describe it. you can use newline (\n) and tab(\t)
 answer: Every method inside the Interface is abstract by default, except default and static type. Static and default
 type method must be implemented inside Interface. If any class  implements any interface, All abstract method  must ve
 overritten. We cannot create instances without the help of other class
2) if Phone interface, inherit other Interface -- Pager and Wakitoki, use appropriate keywords to inherit them in line 11. if Phone interface can inherit regular class - LandPhone and one abstract class SatelitePhone, use appropriate keywords to inherit them. if not, then ignore it
 */

public interface Phone extends Pager, Wakitoki {

/*
 3) Create a variable and a constructor if possible, if not possible to create variable and constructor, use multiple line comments with explanation
 */
/*Answer: declared or initialized constructor is not allow inside the interface*/	
	
	
/*
4) Create four abstract method interfaceInfo (created below), call, message and camera 
*/
	public void interfaceInfo();
	
/*
5) Create 2 non-abstract method - battery and wireless which are implemented inside this interface. Inside sysout print example-- "battery is a --- method from Java --?--" and complete the wireless one
 */

	public static void battery() {
		System.out.println("battery is a Static method from Java Interface ");
	}
	
	public default void Wireless() {
		System.out.println("wireless is a default method from Java Interface ");
	}
	
}
