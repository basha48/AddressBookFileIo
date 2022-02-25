package com.addressbook.io;

public class AddressBookMain {

	public static void main(String[] args) {
	 AddressBookCollection ad = new AddressBookCollection();
	 ad.storeContactsInAddressBookFile();
	 ad.ReadContactsInAddressBookFile();
	 ad.CheckFileExists();
	}

}
