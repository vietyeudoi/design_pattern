package behavioural.Iterator;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class InStockIterator implements Iterator<Item> {
	private List<Item> inventoryList;
	private int currentIndex = 0;

	public InStockIterator(List<Item> inventoryList) {
		this.inventoryList = inventoryList;
	}

	@Override
	public boolean hasNext() {
		// Fast-forward over any items that are NOT in stock
		while (currentIndex < inventoryList.size() && !inventoryList.get(currentIndex).isInStock()) {
			currentIndex++;
		}

		// If we haven't hit the end of the list, we have a valid next item
		return currentIndex < inventoryList.size();
	}

	@Override
	public Item next() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		// Return the item and immediately increment the index
		return inventoryList.get(currentIndex++);
	}
}