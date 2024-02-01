package home.work.HM2;

public class Main {
	public static void main(String[] args) {
		TextTransfotmer transfotmer1 = new TextTransfotmer();
		System.out.println(transfotmer1.transform("HellO"));
		
		InverseTransformer inverseTransformer1 = new InverseTransformer();
		System.out.println(inverseTransformer1.transform("Hello"));
		
		UpDownTransformer upDownTransformer1 = new UpDownTransformer();
		System.out.println(upDownTransformer1.transform("hello"));
		
		TextSaver textSaver = new TextSaver();
		
		textSaver.saveTextToFile(upDownTransformer1.transform("hello"));

	}
	
	
}
