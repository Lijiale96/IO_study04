package com.sxt.commons;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;


/*
 * д������
 * 
 * 
 */

public class CIOTest04 {

	public static void main(String[] args) throws IOException {
		
  //д���ļ�
	FileUtils.write(new File("happy.sxt"), "ѧϰ��һ��ΰ�����ҵ\r\n","GBK",true);
	FileUtils.writeStringToFile(new File("happy.sxt"), "ѧϰ��һ���������ҵ\r\n","GBK",true);
	FileUtils.writeByteArrayToFile(new File("happy.sxt"), "ѧϰ��һ���Ҹ�����ҵ\r\n".getBytes("GBK"),true);
	

  //д���б�
     List<String> datas = new ArrayList<String>();
   
	datas.add("����");
	datas.add("����");
	datas.add("������");
     
	FileUtils.writeLines(new File("happy.sxt"),datas,".....",true);
	}
}
