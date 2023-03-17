public class CountChar{
	public static void main(String[] args){
	String name="Akshata";
	int countNumber=0;
	
	char ch[]=name.toCharArray();
	for(int i=0;i<ch.length;i++){
		countNumber += 1;
	}
	System.out.println("Number of characters :"+countNumber);
	}
}