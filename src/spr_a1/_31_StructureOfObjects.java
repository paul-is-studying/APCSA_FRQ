package spr_a1;

import java.util.ArrayList;

public class _31_StructureOfObjects {
	
	public static void main(String[] args) {
		
		// structure(arrays, lists) of objects are found frequently.
		// things to remember: 
		// 1. list.get(i) or arr[i] gets you an object reference. (can invoke object methods)
		// 2. elements in lists or arrays require an object. (new!)
		// 3. watch out for NPEs in arrays. (not so much in lists)

		// let's use the DownloadInfo class provided below
		
		// creating a list of DownloadInfo objects

		
		// creating an array of DownloadInfo objects

		
		// arrays can be cumbersome, so let's use the list for this example.
		
		// adding a new element 

		
		// increase times downloaded

		
		// add another element

		
		// set num for the second object to 9

		

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
