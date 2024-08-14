class over{

	
	String add(){
	return "No parameters passed";
	}
	int add(int a,int b){
	return a+b;
	} 
	double add(double a,double b){
	return a+b;
	}
	
	double add(double a){
	return a;
	}
	
}
class overload{
	public static void main(String[] args){
	over ob=new over();
	System.out.println(ob.add());
	System.out.println(ob.add(8,9));
	System.out.println(ob.add(5));
	System.out.println(ob.add(5,5.0));
	
	
	}
}
