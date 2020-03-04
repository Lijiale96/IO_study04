package com.sxt.commons;


import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.EmptyFileFilter;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.filefilter.SuffixFileFilter;

/*
 * ��ȡ����
 * 
 * 
 */

public class CIOTest03 {

	public static void main(String[] args) throws IOException {
		
  //��ȡ�ļ�
	String msg = FileUtils.readFileToString(new File("emp.txt"),"GBK");
	System.out.println(msg);
	byte[]  datas = FileUtils.readFileToByteArray(new File("emp.txt"));
	System.out.println(datas.length);
	
	
	//���ж�ȡ
	List<String> msgs=FileUtils.readLines(new File("emp.txt"),"GBK");
	for (String string : msgs) {
		System.out.println(string);
	}
	LineIterator it = FileUtils.lineIterator(new File("emp.txt"),"GBK");
	while (it.hasNext()) {
		System.out.println(it.nextLine());
		
		
	}
	
	}

}
