package com.sxt.commons;

import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

/*
 * ����
 * 
 * 
 */

public class CIOTest05 {

	public static void main(String[] args) throws IOException {
		
//    //�����ļ�
//     FileUtils.copyFile(new File("p.png"),new File("p-copy.png")); 
//   //�����ļ���Ŀ¼
//     FileUtils.copyFileToDirectory(new File("p.png"),new File("lib")); 
////   //����Ŀ¼��Ŀ¼
//     FileUtils.copyDirectoryToDirectory(new File("lib"),new File("lib2")); 
////   //����Ŀ¼
//     FileUtils.copyDirectory(new File("lib"),new File("lib2")); 

     
     //����URL����
//     String url ="http://tech.ifeng.com/a/20171128/44780894_0.shtml";
//     FileUtils.copyURLToFile(new URL(url), new File("marvel.jpg"));
     
//     
//     String datas = IOUtils.toString(new URL("http://www.baidu.com"),"UTF-8");
//     System.out.println(datas);
     
     String datas = IOUtils.toString(new URL("http://www.163.com"),"GBK");
     System.out.println(datas);
}
}