package duke;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import duke.todo.Task;
import duke.todo.Todo;

public class TaskTest {
    @Test
    public void markAsDoneTest() {
        Task task = new Todo("borrow book");
        assertEquals("\u2718", task.getStatusIcon()); // cross
        task.markAsDone();
        assertEquals("\u2713", task.getStatusIcon()); // tick
    }
}
