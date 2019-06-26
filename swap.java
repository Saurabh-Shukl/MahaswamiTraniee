import java.io.*;
class swap {
   public static  void main(String[]args) {
        String str = "";
        String str2 = "";
        try {
            FileReader fr = new FileReader("Swap.txt");
            int i;
            char c;
            while ((i = fr.read()) != -1) 
            {
                c = (char) i;
                str = str + c;
            }
            }catch(IOException e) {
                System.out.println("File Not Found");
            }catch(Exception e){
				e.printStackTrace();		
			}
            System.out.println(str);
            for(int i=0;i<str.length();i++){
            String str1 = str.charAt(i) +"";
				  if (str.charAt(i) >= 97 && str.charAt(i) <= 122){
                      str1 = str1.toUpperCase();
                      str2 = str2 + str1;
				  }else if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                    str1 = str1.toLowerCase();
                    str2 = str2 + str1;
				  }else{
                    str2 = str2+str1;
				}
             }
             System.out.println(str2);
        }
    }
