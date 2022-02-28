package com.addressbook.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.*;
import com.opencsv.CSVWriter;

public class AddressBookCollection {
	public static String ADDRESS_FILE = "C:\\Users\\basha\\eclipse-workspace\\AddressBookFileIo\\src\\AddressBookText\\Contacts.txt";
	public static String ADDRESS_CONTACT_FILE = "C:\\Users\\basha\\eclipse-workspace\\AddressBookFileIo\\src\\com\\csv\\file\\reader\\AddressContacts.csv";
	public static String ADDRESS_CONTACT_JSON_FILE = "C:\\Users\\basha\\eclipse-workspace\\AddressBookFileIo\\src\\com\\json\\file\\AddressContact.json";
	File file = new File(ADDRESS_FILE);
	public void storeContactsInAddressBookFile() {
		try {
			FileOutputStream outputStream = new FileOutputStream(file);  
            Writer outputStreamWriter = new OutputStreamWriter(outputStream);  
            outputStreamWriter.write("First Name : Arun\nLast Name  : Setty\nAddress :xyzstreet\nCity : Kurnool\nState :AndhraPradesh\nzip : 518222\nphone number :9858848448\nEmail : xyz@gmail.com\n");  
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
	
	public void writeCsvFileLineByLine(){
		
		File file = new File(ADDRESS_CONTACT_FILE);
		try {
			// create FileWriter object with file as parameter
			FileWriter outputfile = new FileWriter(file);

			// create CSVWriter object filewriter object as parameter
			CSVWriter writer = new CSVWriter(outputfile);

			// adding header to csv
			String[] header = { "First Name", "Last Name", "Address","City","State","zip","phone number","Email"};
			writer.writeNext(header);

			// add data to csv
			String[] contactOne = { "Kiran", "Reddy", "13-60-1,xyz street,kurnool","Andhra Pradesh" ,"518222","Kirangmail.com"};
			writer.writeNext(contactOne);
			String[] contactTwo = { "Arun", "Bhai", "14-60-3,Madhura street,Gandhi nagar","Telangana" ,"518222","Arun@gamil.com"};
			writer.writeNext(contactTwo);
			
			// closing writer connection
			writer.close();
			System.out.println("sucessfully written csv file");
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void writeJsonData() {
		JSONObject jsonObject = new JSONObject();
	      //Inserting key-value pairs into the json object
	      jsonObject.put("First_Name", "Aravid");
	      jsonObject.put("Last_Name", "Reddy");
	      jsonObject.put("Address", "13-60-1,xyz street,kurnool");
	      jsonObject.put("City", "hyd");
	      jsonObject.put("Place_Of_Birth", "Delhi");
	      jsonObject.put("Country", "India");
	      try {
	         FileWriter file = new FileWriter(ADDRESS_CONTACT_JSON_FILE);
	         file.write(jsonObject.toString());
	         file.close();
	      } catch (IOException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }
	      System.out.println("JSON file created: "+jsonObject);
	   }
	
	
	}
	


