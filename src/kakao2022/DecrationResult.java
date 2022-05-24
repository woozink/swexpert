package kakao2022;

import java.util.*;
import java.io.*;

public class DecrationResult {
	public int [] solution(String[] id_list, String[] report, int k ) {
		List<String> list = Arrays.stream(report).distinct().collect(Collectors.tolist());
		HashMap<Stirng, Integer> count = new HashMap<>();
		
		for(String s : list) {
			String target = s.split(" ")[1];
			count.put(target,count.getOrDefault(target,0)+1);
		}
		
		 return Arrays.stream(id_list).map(_user -> {
	            final String user = _user;
	            List<String> reportList = list.stream().filter(s -> s.startsWith(user + " ")).collect(Collectors.toList());
	            return reportList.stream().filter(s -> count.getOrDefault(s.split(" ")[1], 0) >= k).count();
	        }).mapToInt(Long::intValue).toArray();
	    }
