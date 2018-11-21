import java.util.*;
import java.io.*;
class readfile{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
 String line = null;
 while ((line = br.readLine()) != null) {
   System.out.println(line);
 }
	}
}