package metzler_p5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CreationTests {
	
	@Test
	void creationFailsWithAllBlankValues() {
		assertNull(ContactItem.Creation());
	}
	@Test
	void creationSucceedsWithBlankEmail() {
		assertNotNull(ContactItem.Creation());
	}
	@Test
	void creationSucceedsWithBlankFirstName() {
		assertNotNull(ContactItem.Creation());
	}
	@Test
	void creationSucceedsWithBlankLastName() {
		assertNotNull(ContactItem.Creation());
	}
	@Test
	void creationSucceedsWithBlankPhone() {
		assertNotNull(ContactItem.Creation());
	}
	@Test
	void creationSucceedsWithNonBlankValues() {
		assertNotNull(ContactItem.Creation());
	}
	
}

class EditingTests {		
	@Test
	void editingFailsWithAllBlankValues() {
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
	void testToString() {
		fail("Not yet implemented");
	}	
}

