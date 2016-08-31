package tiy.io;

import java.io.Serializable;

/**
 * Created by bearden-tellez on 8/31/16.
 */



public class ToDoItem implements Serializable {
    private String todoText;
    private boolean done;

    public ToDoItem(String todoText, boolean done) {
        this.todoText = todoText;
        this.done = done;
    }

    public ToDoItem() {
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public String getTodoText() {

        return todoText;
    }

    public void setTodoText(String todoText) {
        this.todoText = todoText;
    }

    public String toString() {
        if (isDone()) {
            return todoText + " (done)";
        } else {
            return todoText;
        }
    }
}
