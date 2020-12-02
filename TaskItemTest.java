package metzler_p5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TaskCreationTest {
	@Test
	void constructorFailsWithInvalidDueDate() {
		assertNull(TaskItem.Creation());
	}
	@Test
	void constructorFailsWithInvalidTitle() {
		assertNull(TaskItem.Creation());
	}
	@Test
	void constructorSucceedsWithValidDueDate() {
		assertNotNull(TaskItem.Creation());
	}
	@Test
	void constructorSucceedsWithValidTitle() {
		assertNotNull(TaskItem.Creation());
	}
}

class TaskEditingTest{
	@Test
	void editingDescriptionSucceedsWithExpectedValue() {
		assertNotNull(TaskItem.Editing(1));
	}
	@Test
	void editingDueDateFailsWithInvalidDateFormat() {
		assertNull(TaskItem.Editing(1));
	}
	@Test
	void editingDueDateFailsWithInvalidYYYMMDD() {
		assertNull(TaskItem.Editing(1));
	}
	@Test
	void editingDueDateSucceedsWithExpectedValue() {
		assertNotNull(TaskItem.Editing(1));
	}
	@Test
	void editingTitleFailsWithEmptyString() {
		assertNull(TaskItem.Editing(1));
	}
	@Test
	void editingTitleSucceedsWithExpectedValue() {
		assertNotNull(TaskItem.Editing(1));
	}
}
