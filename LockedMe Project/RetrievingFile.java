package lockerMe;


import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RetrievingFile {
	
	public static void AscendingOrder() {
		File findfile = new File("/home/madhurajogimpha/madhura_jfs/LockedMe Project/storage");
		List<String> arrange = Arrays.asList(findfile.list());
		Collections.sort(arrange);
		System.out.println("****************************************");
		System.out.println("Sorting and retrieving file in ascending order");
		for(String s:arrange){
			System.out.println(s);
		}
		System.out.println("****************************************");	
	}
}
