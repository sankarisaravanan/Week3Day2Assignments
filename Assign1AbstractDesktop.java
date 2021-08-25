package week3.Day2Assignments;

public abstract class Assign1AbstractDesktop{
	
	public static void softwareResources(String str3) {
		System.out.println("Method SWResource from own Method of Abstract class with additional software : "+ str3);
		
	}
	
	public static void main(String[] args) {
		Assign1Desktop desk1 = new Assign1Desktop();
		desk1.desktopModel();
		desk1.hardwareresources("Keyboard", "Mouse");
		desk1.softwareResources("Windows 10", 2, "Office365");
		softwareResources("Java");
	}

}
