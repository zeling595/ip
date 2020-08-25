package main.java.seedu.duke.commands;

import main.java.seedu.duke.DukeException;
import main.java.seedu.duke.TaskList;
import main.java.seedu.duke.Ui;
import main.java.seedu.duke.Storage;

public class DeleteCommand extends Command {
    private int taskNo;

    public DeleteCommand(int taskNo) {
        super("delete");
        this.taskNo = taskNo;
    }

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) throws DukeException {
        tasks.deleteTask(taskNo);
        // ui.showDeleteMessage();
    }

    @Override
    public boolean isExit() {
        return false;
    }
}