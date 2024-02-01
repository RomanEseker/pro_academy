package home.work.HM2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TextSaver {
	private TextTransfotmer textTransfotmer = new TextTransfotmer();
	private File file = new File("./text.txt");

	public TextSaver() {
		super();
	}

	public TextTransfotmer getTextTransfotmer() {
		return textTransfotmer;
	}

	public void setTextTransfotmer(TextTransfotmer textTransfotmer) {
		this.textTransfotmer = textTransfotmer;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}
	
	public void saveTextToFile(String text) {
		try(PrintWriter pw = new PrintWriter(file)) {
				pw.print(text);
			}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "TextSaver [textTransfotmer=" + textTransfotmer + ", file=" + file + "]";
	}

}
