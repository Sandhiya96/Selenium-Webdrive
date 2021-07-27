package org.excersise;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class ReadWrite {
public static void main(String[] args) throws IOException {
	File f=new File("E:\\FolderNo1\\Fol1\\Fol2\\NewFile.txt");
	FileUtils.write(f, "java class");
	FileUtils.write(f, "python class");//override
	FileUtils.write(f, "python class", false);
	FileUtils.write(f, "\nselenium class", true);//append
	List<String> li = FileUtils.readLines(f);
	for (String l : li) {
		System.out.println(l);
	}
	
	System.out.println("done");

}
}

