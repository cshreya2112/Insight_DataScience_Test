import java.io.*;
import java.util.*;
import java.util.stream.*;
public class Try
{
  public static void main(String[] args) throws Exception
  {
    // pass the path to the file as a parameter
   
    FileReader fr = new FileReader("C:\\Users/yalav/Desktop/Lakshmi/Insight_Test/sample.txt");
    BufferedReader read = new BufferedReader(fr);
    File f = new File("C:\\Users/yalav/Desktop/Lakshmi/Insight_Test/sample.txt");
    Scanner sc = new Scanner(f);
    int i,b;

    List<String> temps=new ArrayList<String>();
    List<String> total=new ArrayList<String>();
    List<String> last=new ArrayList<String>();

   
     int count=0,count1=-1,o,l;
    while ((i=fr.read()) != -1)
      
    while (sc.hasNextLine()) 
    {
   
    String line = sc.nextLine();
    String[] words = line.split(",");
    
     
    
     temps.add(words[3]);
      last.add(words[1]);
     
     total.add(words[4]);
     
     
    
    }

    for(int k=1;k<temps.size()-1;k++)
    {
    for(int m=k+1;m<temps.size();m++)
    {

     if(Objects.equals(temps.get(k), temps.get(m)) && last.get(k)!=last.get(m))
     {
     o=Integer.parseInt(total.get(k));
     l=Integer.parseInt(total.get(m));
     b=o+l;
     count++;
     System.out.print(temps.get(k)+" ");
     System.out.print(b+" ");
     System.out.print(count+1);
     System.out.print("\n");
     }
     

     }
     
           
     count=0;

     }

     for(int p=0;p<temps.size()-2;p++)
      {
       if(temps.get(temps.size()-1)==temps.get(p))
	{
        o=Integer.parseInt(total.get(p));
     l=Integer.parseInt(total.get(temps.size()-1));
     b=o+l;
     count++;
     System.out.print(temps.get(temps.size()-1)+" ");
     System.out.print(b+" ");
     System.out.print(count+1);
     System.out.print("\n");
         }
      }
      System.out.print(temps.get(temps.size()-1)+" ");
     System.out.print(total.get(temps.size()-1)+" ");
     System.out.print(count+1);
     System.out.print("\n");

      
      
      
  }
}