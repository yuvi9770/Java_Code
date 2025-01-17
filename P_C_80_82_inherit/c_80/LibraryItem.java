package P_C_80_82_inherit.c_80;

public class LibraryItem {
    private String title;

    private String author;

    private String itemID;

    public void checkout() {
        System.out.println("Checkout");
    }

    public void returnItem() {
        System.out.println("Return the Items");
    }

    public LibraryItem() {
        // Constructor code, if needed
    }

    public LibraryItem(String title, String author, String itemID) {
        this.title = title;
        this.author = author;
        this.itemID = itemID;
    }

    @Override
    public String toString() {
        return "LibraryItem [title=" + title + ", author=" + author + ", itemID=" + itemID + "]";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }
}
