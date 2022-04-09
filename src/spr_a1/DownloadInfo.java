package spr_a1;

public class DownloadInfo {
	private String title;
	private int num;
	/** Creates a new instance with the given unique title and sets the
	* number of times downloaded to 1.
	* @param title the unique title of the downloaded song
	*/
	public DownloadInfo(String title)
	{ /* implementation not shown */ 
		this.title = title;
		num=1;
	}
	/** @return the title */
	public String getTitle()
	{ /* implementation not shown */ 
		return title;
	}
	public int getDownloadCount() 
	{
		return num;
	}
	/** Increment the number times downloaded by 1 */
	public void incrementTimesDownloaded()
	{ /* implementation not shown */ 
		num++;
	}
	// There may be instance variables, constructors, and methods that are not shown.
}
