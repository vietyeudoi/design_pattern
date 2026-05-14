package behavioural.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory implements Iterable<Item> {
	private List<Item> items = new ArrayList<>();

	public void addItem(Item item) {
		items.add(item);
	}

	// Overriding the default iterator to return our custom one
	@Override
	public Iterator<Item> iterator() {
		return new InStockIterator(items);
	}
}