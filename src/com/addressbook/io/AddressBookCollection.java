package com.addressbook.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class AddressBookCollection {
	public static String ADDRESS_FILE = "C:\\Users\\basha\\eclipse-workspace\\AddressBookFileIo\\src\\AddressBookText\\Contacts.txt";
	File file = new File(ADDRESS_FILE);
	public void storeContactsInAddressBookFile() {
		try {
			FileOutputStream outputStream = new FileOutputStream(file);  
            Writer outputStreamWriter = new OutputStreamWriter(outputStream);  
            outputStreamWriter.write("First Name : Aravind\nLast Name  : Setty\nAddress :xyzstreet\nCity : Kurnool\nState :AndhraPradesh\nzip : 518222\nphone number :9858848448\nEmail : xyz@gmail.com\n");  
            System.out.println("your contacts sucessfully added");
            outputStreamWriter.close();  
        } catch (Exception e) {  
            System.out.println(e.getMessage());  
        }  	
		
	}
	
	
	public void ReadContactsInAddressBookFile() {
		try{  
            FileInputStream fileInput=new FileInputStream(ADDRESS_FILE);    
            int i=0;    
            while((i = fileInput.read())!= -1){    
             System.out.print((char)i);    
            }    
            fileInput.close();    
          }catch(Exception e){
        	  System.out.println(e.getMessage());
        	  }    
         }    
	public void CheckFileExists() {
		if(file.exists()) {
			System.out.println("file already exists");
		}
		else {
			System.out.println("it is new file");

		}
	}
}
