package assignment6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestStringConcordance {
	
	int[][] inputList= {{0,1,2},{5},{3},{6,7,8,9},{4}};
	char[] inputchar={'a','n','j','k','i'}; 
	@Before
	public void setUp() throws Exception {
	}

	public static List<Integer> convertIntoList(int[] input){
		List<Integer> tempList=new ArrayList<Integer>();
		for(int value:input){
			tempList.add(value);
		}
			return tempList;
	}
	
	@Test
	public void test() {
		StringConcordance sc = new StringConcordance();
		sc.concordanceString("aaajinkkkk");
		HashMap<Character, List<Integer>> expected = new HashMap<Character, List<Integer>>();
		for(int i=0;i<5;i++){
			expected.put(inputchar[i], new ArrayList<Integer>(TestStringConcordance.convertIntoList(inputList[i])));
		}
		assertEquals(expected,sc.concordanceTabel);
	}

}
