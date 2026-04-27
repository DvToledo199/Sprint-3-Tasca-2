package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UndoTest {

    @Test
    void shouldReturnSameInstance() {
        Undo u1 = Undo.getInstance();
        Undo u2 = Undo.getInstance();

        assertSame(u1, u2);
    }

    @Test
    void shouldAddAndUndoCommand() {
        Undo undo = Undo.getInstance();

        undo.addCommand("A");
        undo.addCommand("B");

        String result = undo.undoCommand();

        assertEquals("B", result);
    }

    @Test
    void shouldThrowExceptionWhenUndoEmpty() {
        Undo undo = Undo.getInstance();

        while (true) {
            try {
                undo.undoCommand();
            } catch (Exception e) {
                break;
            }
        }

        assertThrows(IllegalStateException.class, undo::undoCommand);
    }

    @Test
    void shouldThrowExceptionWhenShowHistoryEmpty() {
        Undo undo = Undo.getInstance();

        while (true) {
            try {
                undo.undoCommand();
            } catch (Exception e) {
                break;
            }
        }

        assertThrows(IllegalStateException.class, undo::showHistory);
    }
}