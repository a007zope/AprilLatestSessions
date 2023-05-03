package Strings;

public class StringManipulationAPril {

    public static void main(String[] args) {
    	
    	String str = "The rains have started here in india";
    	String str1 ="The rains Have started here in india";
    	
// Length method     	
    System.out.println(str.length()); //36
    
    // charAt() method
    System.out.println(str.charAt(5)); //a
    
    //indexOf method 
    System.out.println(str.indexOf('i'));//6
    
    System.out.println(str.indexOf('i',str.indexOf('i')+1)); //28
    
    // indexOf method for occuring 3 rd occurence of i
    System.out.println(str.indexOf('i', str.indexOf('i',str.indexOf('i')+1)+1)); //31
    
    // indexOf method for getting index of a word instead of a character
    System.out.println(str.indexOf("have"));//10
    
    // String Comparison
    
   System.out.println(str.equals(str1));// false 
   System.out.println(str.equalsIgnoreCase(str1));//true
   
   //substring  below including index position zero and excluding 35 position
   
   System.out.println(str.substring(0,35));  
   
   // Trim method
   
   String s ="      Hello World     ";
   System.out.println(s);
   System.out.println(s.trim());
   
   // Replace method
   System.out.println(s.replace(" ",""));
   String date ="01-02-2023";
   date =date.replace("-", "/");
   System.out.println(date);
   
   //split method
   String st ="hello_world_Aditya_Zope";
   String [] stArray =st.split("_");
   for(String r : stArray)
   {
	   System.out.println(r);  
   }
   
   //concat operator 
   
   String f = "Aditya";
   f = "Aditya"+" "+"Z";
 f=  f.concat("ope");
   System.out.println(f);
   
   
   /*
    * Interview Question 
    */
   String x = "Hello";
   String y ="World";
   int a =100;
   int b =20;
   System.out.println(x+y);//HelloWorld
   System.out.println(a+b);//120
   System.out.println(x+y+a+b);//HelloWorld10020
   System.out.println(a+b+x+y);//120HelloWorld
   System.out.println(x+y+(a+b));//HelloWorld120
   
   
   
   
   
   
   
   
   
   
   
   
   

   
    
    
    	
    	
    	


    }
}