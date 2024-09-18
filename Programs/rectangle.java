class Rectangle{
	double length;
	double width;
	
	public double Rectanle(double Length,double Width){                    //constructor
		this.Length=Length;
		this.Width=Width;
	}
	
	void setLength(double Length){
		this.Length=Length;
	}
	
	void setWidth(double Width){
		this.Width=Width;
	}
	
	double getLength(){
		return Length;
		}
	double getWidth(){
		return Width;
		}
	
	void resizeRectangle(Rectangle rect,double newLength, double newWidth){
		 rect.newLength(newLength);
		 rect.newWidth(newWidth);
	}
}	
public class Resize extends Rectangle{
	public static void main(String[] args){
		Rectangle rect=new Rectangle(200.0,100.0);
		
		System.out.println("Before resizing: :"+rect.getLength()+" " +rect.getWidth());
		
	//	rect.resizeRectangle(rect,1000.0,500.0);
//	System.out.println("After resizing: :"+rect.length()+" " +rect.width());
		
	}
 }
