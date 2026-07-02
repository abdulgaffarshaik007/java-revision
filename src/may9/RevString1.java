package may9;

public class RevString1 {

	public static void main(String[] args) {
		 String Str1 = "Hello world";
		    String Str2 = "";
		    System.out.println("Original string: " + Str1);
		        
		    for (int i = 0; i < Str1.length(); i++) {
		      Str2 = Str1.charAt(i) + Str2;
		    }
		    
		    System.out.println("Reversed string: "+ Str2);
		    //op:dlrow olleH
		    
	//------rev string words----------------------
		    System.out.println("-------------------------------------------");
		    String str="This is Reversing String";
	        String[] arr=str.split(" ");

	        StringBuilder builder=new StringBuilder("");
	        for(int i=arr.length-1; i>=0;i--){
	            builder.append(arr[i]+" ");
	        }
	        System.out.println(builder.toString());		    
		    //op: String Reversing is This
		    
	//----------------------------count of words-----------------		      
		    
		    System.out.println("-------------------------------------");
		    String words = "One Two Three Four";
		    int countWords = words.split("\\s").length;
		    System.out.println(countWords);
	//swaping 2 num without using 3rd variable
		    System.out.println("----------------------------------");
		    int i=10;
		    int j=20;
		    System.out.println("before swap");
		    System.out.println(i);
		    System.out.println(j);
		    i=i+j;//10+20=30
		    j=i-j;//30-20=10		    
		    i=i-j;//30-10=20
		    System.out.println("after swap");
		    System.out.println(i);
		    System.out.println(j);
	
	
	}


	

}
