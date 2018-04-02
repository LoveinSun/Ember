//copy/b E:\temps\*.ts E:\temps\hebing.ts。
import java.io.*;

public class pangdehebingdafa {
	
	
	
	//wqnml
	public static void main(String []args) {
		int a = 1;
		for(a = 1;a<100;a++) {
			if(a<=9) {
				String str = String.format("G:\\2\\%d.ts",a);
				String str2 = String.format("G:\\2\\00%d.ts",a);
				File file=new File(str); 
				if(file.exists())
				{
				file.renameTo(new File(str2));
				}
			}else if(a <= 99) {
				String str3 = String.format("G:\\2\\%d.ts",a);
				String str4 = String.format("G:\\2\\0%d.ts",a);
				File file=new File(str3); 
				if(file.exists())
				{
				file.renameTo(new File(str4));
				}
			}
		}
	}
}
