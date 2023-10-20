package Exceptions;

public class ItemNotFoundException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ItemNotFoundException() {
		super("Could not find item ID");
	}

	public ItemNotFoundException(int itemId) {
		super("Could not find item ID " + itemId);
	}
}
