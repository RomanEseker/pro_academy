package home.work.HM2;

public class UpDownTransformer extends TextTransfotmer {

	public UpDownTransformer() {
		super();
	}

	@Override
	public String transform(String text) {
		String str = "";
		for (int i = 0; i < text.length(); i++) {
			if (i % 2 == 0) {
				str += text.toUpperCase().charAt(i);
			} else {
				str += text.toLowerCase().charAt(i);
			}
		}
		return str;
	}

}
