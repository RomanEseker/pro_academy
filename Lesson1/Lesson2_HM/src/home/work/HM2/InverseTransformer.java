package home.work.HM2;

public class InverseTransformer extends TextTransfotmer {

	public InverseTransformer() {
		super();
	}
	
	@Override
	public String transform(String text) {
		String str = "";
		for(int i = text.length() - 1; i >= 0; i--) {
			str+= text.charAt(i);
		}
		return str;
	}

}
