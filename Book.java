public class Book extends TangibleAsset{
	privateString isbn;
	public Book(String name,int price,Stirng color,String isbn){
		super(name,price,color);
		this.isbn=isbn;
	}
	public String getlsbn(){return this.isbn;}
}

