package week3.Day2Assignments;

public class Assign1Desktop extends Assign1AbstractClass implements Assign1Hardware, Assign1Software {

	void Method1(){
		System.out.println("Abstract Method 'Method1' definition");
	}
	
	public void desktopModel() {
		System.out.println("Own Method named 'desktopModel' of class 'Desktop' ");
	}
	
	public static void main(String[] args) {
		Assign1Desktop desk1 = new Assign1Desktop();
		desk1.desktopModel();
		desk1.hardwareresources("Keyboard", "Mouse");
		desk1.softwareResources("Windows 10", 2, "Office365");
		desk1.Method1();
		desk1.Method2();
	}

	public void softwareResources(String str1, int softwares, String str2) {
		System.out.println("Method SWResource from Interface Software with "+softwares+" SWs : "+str1+", "+str2);
		
	}

	public void hardwareresources(String str1, String str2) {
		System.out.println("Method HWResource from Interface Hardware with HWs : "+str1+" , "+str2);
		
	}

}
