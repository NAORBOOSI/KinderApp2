package com.example.MyWebApp.controler;

import java.io.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class CreateFile {

	public  void WriteToFile(String s, File f) throws IOException {

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

	public  void appendToFile(String string, Person parentType) {
		try {
			File f = new File("C:\\Temp\\text.txt");

			WriteToFile(string, f);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void appendToFile(String string, Kindergarten kinder) {
		// TODO Auto-generated method stub
		try {
			File f = new File("C:\\Temp\\text.txt");

			WriteToFile(string, f);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
