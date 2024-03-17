package example;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateFinder {
	public static void main(String[] args) {
		String arr[]= {"a","b","c","a","b","c","a","e","c"};
		int count=0;
		Map<String,Object> map=new HashMap<String,Object>();
		for(int i=0;i<arr.length;i++) {
			count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]==arr[i]) {
					count++;
			    if(arr[j]==arr[i]&&count%2!=0)
				 map.put(arr[i],count);

				}

			}
		}
		for(Entry<String, Object> res:map.entrySet()) {
			System.out.println(res.getKey()+" "+res.getValue()+" odd");

		}
	}

}
