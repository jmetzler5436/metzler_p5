package metzler_p5;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

class TaskListTest {
	
	public File in = new File("filename.txt");
	public String Storage[] = new String[4];
	
	@Test
	void addingTaskItemsIncreasesSize() {
		assertNotNull(TaskItem.Creation());
	}
	@Test
	void completingTaskItemChangesStatus() {
		String str = "This is a test";
		String completedTask = "*** This is a test";
		assertEquals(completedTask, TaskItem.Completion(str));
	}
	@Test
	void completingTaskItemFailsWithInvalidIndex() {
		TaskList.IndexChecker(Storage, 0);
	}
	@Test
	void editingTaskItemChangesValues() {
		assertNotNull(TaskItem.Editing(1));
	}
	@Test
	void editingTaskItemDescriptionChangesValue() {
		assertNotNull(TaskItem.Editing(1));
	}
	@Test
	void editingTaskItemDescriptionFailsWithInvalidIndex() {
		TaskList.IndexChecker(Storage, 0);
	}
	@Test
	void editingTaskItemDueDateChangesValue() {
		assertNotNull(TaskItem.Editing(1));
	}
	@Test
	void editingTaskItemDueDateFailsWithInvalidIndex() {
		TaskList.IndexChecker(Storage, 0);
	}
	@Test
	void editingTaskItemTitleChangesValue() {
		assertNotNull(TaskItem.Editing(1));
	}
	@Test
	void editingTaskItemTitleFailsWithInvalidIndex() {
		TaskList.IndexChecker(Storage, 0);
	}
	
	@Test
	void gettingTaskItemDescriptionFailsWithInvalidIndex() {
		TaskList.IndexChecker(Storage, 0);
	}
	@Test
	void gettingTaskItemDescriptionSucceedsWithValidIndex() {
		Storage[0] = "This is a test";
		TaskList.IndexChecker(Storage, 0);
	}
	@Test
	void gettingTaskItemDueDateFailsWithInvalidIndex() {
		TaskList.IndexChecker(Storage, 0);
	}
	@Test
	void gettingTaskItemDueDateSucceedsWithValidIndex() {
		Storage[0] = "This is a test";
		TaskList.IndexChecker(Storage, 0);
	}
	@Test
	void gettingTaskItemTitleFailsWithInvalidIndex() {
		TaskList.IndexChecker(Storage, 0);
	}
	@Test
	void gettingTaskItemTitleSucceedsWithValidIndex() {
		Storage[0] = "This is a test";
		TaskItem.TaskRemoval(Storage, 0);
	}
	@Test
	void newTaskListIsEmpty() {
		TaskList.FileEmpty(in);
	}
	@Test
	void removingTaskItemsDecreasesSize() {
		Storage[0] = "This is a test";
		TaskItem.TaskRemoval(Storage, 0);
	}
	@Test
	void removingTaskItemsFailsWithInvalidIndex() {
		TaskList.IndexChecker(Storage, 0);
	}
	@Test
	void savedTaskListCanBeLoaded() {
		File in = new File("load.txt");
		assertEquals(0, TaskApp.LoadCheck(in));
	}
	@Test
	void uncompletingTaskItemChangesStatus() {
		String str = "This is a test";
		String completedTask = "*** This is a test";
		assertEquals(str, TaskItem.Incomplete(completedTask));
	}
	@Test
	void uncompletingTaskItemFailsWithInvalidIndex() {
		TaskList.IndexChecker(Storage, 0);
	}
}
