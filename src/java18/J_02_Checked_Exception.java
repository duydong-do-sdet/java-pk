package java18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

public class J_02_Checked_Exception {

	public static void main(String[] args) throws InterruptedException, IOException {
		// #1
		try {
			Thread.sleep(Duration.ofSeconds(3));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// #2
		Thread.sleep(Duration.ofSeconds(3));

		// *
		String fileName = "FileName";
		File file = new File(fileName);

		// #3
		try {
			FileInputStream stream = new FileInputStream(file);
			stream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// #4
		FileInputStream stream = new FileInputStream(file);
		stream.close();
	}

}
