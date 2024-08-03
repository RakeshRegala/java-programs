class book{
    String title;
    String author;
    int price;
    int pages;


public book(String title,String author,int price,int pages){
    this.author=author;
    this.title=title;
    this.price=price;
    this.pages=pages;
}

public String getTitle(){                                   
    return title;
}

public String getAuthor(){
    return author;
}

public int getPrice(){
    return price;
}
public int getPages(){
    return pages;
}
public void displayInfo() {
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
    System.out.println("Price: $" + price);
    System.out.println("Pages: " + pages);
}
}
public class Library{
    public static void main(String[] args){
        book obj1=new book("The angel","Rakesh",143,985);
        book obj2=new book("xyz","abc",42,42);
        book obj3=new book("aaa","bbb",32,53);


        obj1.displayInfo();
        System.out.println();
        obj2.displayInfo();
        System.out.println();
        obj3.displayInfo();
        System.out.println();

        double totalPrice = obj1.getPrice() + obj2.getPrice() + obj3.getPrice();
        System.out.println("Total Price of all books: $" + totalPrice);
    


    }
}