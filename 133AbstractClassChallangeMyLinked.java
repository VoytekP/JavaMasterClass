package academy.learnprogramming;

public class MyLinkedList implements NodeList {

    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null) {
            // The list was empty, so this item becomes the head of the list
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = (currentItem.compareTo(newItem));
            if (comparison <0) {
                // newItem is greater, move right if possible
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    // there is no next, so insert at end of the list
                    currentItem.setNext(newItem).setPreviews(currentItem);
                    return true;
                }
            } else if (comparison > 0) {
                // newItem is less, insert before
                if (currentItem.previews() != null) {
                    currentItem.previews().setNext(newItem).setPreviews(currentItem.previews());
                    newItem.setNext(currentItem).setPreviews(newItem);
                } else {
                    // the node with a previous is the root
                    newItem.setNext(this.root).setPreviews(newItem);
                    this.root = newItem;
                }
                return true;
            } else {
                // equal
                System.out.println(newItem.getValue() + " is already present, not added.");
                return false;
            }
        }

        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison == 0) {
                // found the item to delete
                if (currentItem == this.root) {
                    this.root = currentItem.next();
                    } else {
                        currentItem.previews().setNext(currentItem.next());
                        if (currentItem.next() != null) {
                            currentItem.next().setPreviews(currentItem.previews());
                        }
                    }
                    return true;
                } else if (comparison < 0) {
                currentItem = currentItem.next();
                } else { // comparison > 0
                    // We are at an item greater then the one to be deleted
                // so the item is not in the list
                return false;
                }
            }

        // We have reached the end of the list
        // Without finding the item to delete
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}
