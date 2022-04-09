package spr_a1;

import java.util.ArrayList;

public class _32_ObjectComparison {
	
	public static void main(String[] args) {
		
		// Generally it's risky to compare objects directly
		
		ArrayList<DownloadInfo> list = new ArrayList<DownloadInfo>(); 
		list.add( new DownloadInfo("aaa") );  
		list.add( new DownloadInfo("bbb") );
		
		DownloadInfo aaa = new DownloadInfo("aaa");
		
		System.out.println(list);
		System.out.println(aaa);
		
		// 1. is the first element in list the same as aaa?

		
		// 2. does the list contain aaa?

		
		// 3. how does contain() work?

		
		// 4. contains() with wrapper classes

		
		// 5. strings and contains()

	}
	
	public static class DownloadInfo {
		private String title;
		private int num;
		public DownloadInfo(String title){ 
			this.title = title;
			num=1;
		}
		public String getTitle(){ 
			return title;
		}
		public int getDownloadCount(){
			return num;
		}
		public void incrementTimesDownloaded(){ 
			num++;
		}
		public void setDownloadCount(int n) {
			num = n;
		}
		public String toString() {
			return title+"("+num+")";
		}
	}
	
}
