package com.sxt.commons;

import java.io.File;

import org.apache.commons.io.FileUtils;

/*
 * 大小
 * 
 * 
 */

public class CIOTest01 {

	public static void main(String[] args) {
    //文件大小
    long len = FileUtils.sizeOf(new File("src/com/sxt/commons/CIOTest01.java"));
    System.out.println(len);
		
	//目录大小
	len = FileUtils.sizeOf(new File("C:/Users/A/eclipse-workspace/IO_study04"));
	System.out.println(len);
	
    
	}

}
