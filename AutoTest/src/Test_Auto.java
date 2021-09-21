
import static org.junit.Assert.*;
import java.io.FileReader;
import java.io.IOException;
import au.com.bytecode.opencsv.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;  
import org.junit.runners.Parameterized;  
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;  
import java.util.Collection;
@RunWith(Parameterized.class)
public class Test_Auto {  
		private String expeted;  
	    private String input1,input2;
	    private static int count=0;
	    @BeforeClass
		public static void setUpBeforeClass() throws Exception {
			System.out.println("用例执行即将开始！");
		}

		@AfterClass
		public static void tearDownAfterClass() throws Exception {
			System.out.println("所有用例已执行完毕！");
		}

		@Before
		public void setUp() throws Exception {
			count++;
			System.out.println("第"+count+"个用例开始执行！");
		}

		@After
		public void tearDown() throws Exception {
			System.out.println("第"+count+"个用例执行完毕！");
		}
		@Parameters  
	    public static Collection<String[]> perpareData() throws IOException {  
			CSVReader reader = new CSVReader(new FileReader("文件地址"));
			String [] nextLine;
			String[][] str=new String[12][3];
			int i=0;
			while ((nextLine = reader.readNext())!= null) {
				str[i]=nextLine;
				i++;
			}
			reader.close();
			System.out.println(str.toString());
	        return Arrays.asList(str);  
	    }  
	      
	    public Test_Auto(String expected, String input1,String input2){  
	        this.expeted = expected;  
	        this.input1 = input1;    
	        this.input2 = input2; 

	    }  
	    @Test 
	    public void testAdd() throws InterruptedException {  
	        Auto au = new Auto();  
	        assertEquals(expeted,au.signUp(input1,input2));  
	    }  
}
