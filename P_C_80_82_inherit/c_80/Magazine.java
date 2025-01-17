package P_C_80_82_inherit.c_80;

public class Magazine extends LibraryItem {
    
    private String issueNumber;


    public Magazine(String issueNumber) {
        this.issueNumber = issueNumber;
    }


    public Magazine(String title, String author, String itemID, String issueNumber) {
        super(title, author, itemID);
        this.issueNumber = issueNumber;
    }


    public String getIssueNumber() {
        return issueNumber;
    }


    public void setIssueNumber(String issueNumber) {
        this.issueNumber = issueNumber;
    }

    
}
