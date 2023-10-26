package Exceptions;

import java.io.Serial;

public class ItemNotFoundException extends Exception {
    @Serial
    private static final long serialVersionUID = 1L;

    public ItemNotFoundException() {
        super("Could not find item ID");
    }

    public ItemNotFoundException(int itemId) {
        super("Could not find item ID " + itemId);
    }
}
