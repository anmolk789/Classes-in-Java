class Book{
    private String bookName;
    private int bookPrice;
    private String authorName;
    
    public Book()
    {}
    public String getBookName(){
        return this.bookName;
    }
    public int getBookPrice(){
        return this.bookPrice;
    }
    public String getAuthorName(){
        return this.authorName;
    }
    public void setBookName(String s){
        this.bookName=s;
    }
    public void setBookPrice(int a){
        this.bookPrice=a;
    }
    public void setAuthorName(String g){
        this.authorName=g;
    }
    
}