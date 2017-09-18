package classWork1;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Testing {

	private static final String FILENAME = "C:\\Users\\the_r\\Desktop\\test.txt";

	public static void main(String[] args) {

		Append("Hello");

	}
static void Append (String content){
	BufferedWriter bw = null;
	FileWriter fw = null;

	try {

		

		File file = new File(FILENAME);

		// if file doesnt exists, then create it
		if (!file.exists()) {
			file.createNewFile();
		}

		// true = append file
		fw = new FileWriter(file.getAbsoluteFile(), true);
		bw = new BufferedWriter(fw);

		bw.write(content);

		System.out.println("Done");

	} catch (IOException e) {

		e.printStackTrace();

	} finally {

		try {

			if (bw != null)
				bw.close();

			if (fw != null)
				fw.close();

		} catch (IOException ex) {

			ex.printStackTrace();

		}
	}
}
}