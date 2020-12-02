package metzler_p5;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;



@SuppressWarnings("unused")
class ContactListTest {
	
	public File in = new File("filename.txt");
	public String Storage[] = new String[4];
	
	
	@Test
	void addingItemsIncreasesSize() {
		assertNotNull(ContactItem.Creation());
	}
	@Test
	void editingItemsFailsWithInvalidIndex() {
		ContactList.IndexChecker(Storage, 1);
	}
	@Test
	void editingItemsFailsWithAllBlankValues() {
		assertNull(ContactItem.Editing(1));
	}
	@Test
	void editingSucceedsWithBlankEmail() {
		assertNotNull(ContactItem.Editing(1));
	}
	@Test
	void editingSucceedsWithBlankFirstName() {
		assertNotNull(ContactItem.Editing(1));
	}
	@Test
	void editingSucceedsWithBlankLastName() {
		assertNotNull(ContactItem.Editing(1));
	}
	@Test
	void editingSucceedsWithBlankPhone() {
		assertNotNull(ContactItem.Editing(1));
	}
	@Test
	void editingSucceedsWithNonBlankValues() {
		assertNotNull(ContactItem.Editing(1));
	}
	@Test
	void newListIsEmpty() {
		ContactList.FileEmpty(in);
	}
	@Test
	void removingItemsDecreasesSize() {
		Storage[0] = "This is a test";
		ContactItem.ContactRemoval(Storage, 0);
	}
	@Test
	void removingItemsFailsWithInvalidIndex() {
		ContactItem.ContactRemoval(Storage, 1);
	}
	@Test
	void savedContactListCanBeLoaded() {
		File in = new File("load.txt");
		assertEquals(0, ContactApp.LoadCheck(in));
	}
}
