package spr_a1;

public class _41_NPE {
	
	public static void main(String[] args) {
		
		// You may have NPE problems if you are using arrays
		
		DownloadInfo[] arr = new DownloadInfo[5]; 
		arr[0] = new DownloadInfo("aaa") ;  
		arr[1] = new DownloadInfo("bbb") ; 
		arr[2] = new DownloadInfo("ccc") ; 

		// now printing this
		for(int i=0; i<arr.length; i++) {
			System.out.println( arr[i].getTitle()+"("+arr[i].getDownloadCount()+")");
		}
		
		// rectify NPEs


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
