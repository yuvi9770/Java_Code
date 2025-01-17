package P_C_80_82_inherit.c_80;

public class Books extends LibraryItem{
    private String ISBN;


    public Books(String title, String author, String itemID, String iSBN) {
        super(title, author, itemID);
        ISBN = iSBN;
    }


    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    
}
