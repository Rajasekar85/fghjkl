package org.com;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Samples {

	
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\vikash\\vimal\\arun.txt") ;
//		boolean mkdir=f.mkdir();
//		System.out.println(mkdir);
		
//		boolean createnewfile =f.createNewFile();
//		System.out.println(createnewfile);
		
		
//		boolean canread=f.canRead();
//		boolean canWrite=f.canWrite();
//		boolean exist=f.exists();
//		System.out.println(canread);
//		System.out.println(canWrite);
//		System.out.println(exist);
		
//		String[] list=f.list();
//		for (String kkk : list) {
//			System.out.println(kkk);
//		}
		
		//File[] listfile=f.listFiles();
//for (int i=0;i<listfile.length;i++)
//	
//{
//	System.out.println(listfile[i]);
//}
		
	FileUtils.write(f, "apple banana tomato", false);	
		
		List<String>readlines=FileUtils.readLines(f);
		System.out.println(readlines);
	}
}
