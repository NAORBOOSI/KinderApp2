package com.example.MyWebApp.controler;

import java.io.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CreateFile {

	public static void WriteToFile(String s, File f) throws IOException {

		FileWriter fwriter = new FileWriter("C:\\Temp\\text.txt", true);
		PrintWriter outPutFile = new PrintWriter(fwriter);
		fwriter.write(s);
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat(" dd/MM/YYYY  HH:mm:ss");
		System.out.println(sdf.format(date));

		outPutFile.println("    " + "The date is :" + sdf.format(date));

		outPutFile.close();
		fwriter.close();
	}

	public static void AppendToFile(String string, Parents parentType) {
		try {
			File f = new File("C:\\Temp\\text.txt");

			WriteToFile(string, f);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
