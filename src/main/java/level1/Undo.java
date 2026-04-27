package level1;

import java.util.ArrayList;
import java.util.List;

public class Undo {

    private static Undo instance;
    private List<String> undoList;

    private Undo() {
        undoList = new ArrayList<>();
    }

    public static Undo getInstance() {
        if (instance == null) {
            instance = new Undo();

        }
        return instance;
    }

    public void addCommand(String command){
        undoList.add(command);
    }

    public String undoCommand() {
        if (undoList.isEmpty()) {
            throw new IllegalStateException("No commands to undo");
        }

        return undoList.removeLast();
    }

    public void showHistory (){
        if (undoList.isEmpty()) {
            throw new IllegalStateException("No commands in history");
        }
        for (String u : undoList) {
            System.out.println(u);
        }
    }
}
