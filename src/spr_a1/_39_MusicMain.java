package spr_a1;

import java.util.ArrayList;

public class _39_MusicMain {

	// needs: DownloadInfo.java, MusicDownloads.java
	public static void main(String[] args) {

		MusicDownloads md = new MusicDownloads();
		md.print();
		
		// (a)
		System.out.println("(a): ");
		
		DownloadInfo s1 = md.getDownloadInfo("Aqualung");
		if ( s1 == null ){
			System.out.println("null");
		}else {
			System.out.println(s1.getTitle()+": "+s1.getDownloadCount());
		}
		
		DownloadInfo s2 = md.getDownloadInfo("Happy Birthday");
		if ( s2 == null ){
			System.out.println("null");
		}else {
			System.out.println(s2.getTitle()+": "+s2.getDownloadCount());
		}
		
		// (b)
		System.out.println("(b): ");
		ArrayList<String> songTitles = new ArrayList<String>();
		songTitles.add("Lights");
		songTitles.add("Aqualung");
		songTitles.add("Soul Sister");
		songTitles.add("Go Now");
		songTitles.add("Lights");
		songTitles.add("Soul Sister");
		MusicDownloads md2 = new MusicDownloads();
		
		md2.updateDownloads(songTitles);
		md2.print();
		
	}

}
