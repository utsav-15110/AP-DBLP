import java.util.*;

class Publication {
	private ArrayList <String> authorslist = new ArrayList<String>();
	private String title;
	private String pages;
	private String volume;
	private String journal;
	private String ee;
	private String url;
	private int year = 0;
	private int val =0 ;

	Publication()
	{
		val = 0;
	}
	
	public void addAuthor(String auth)
	{
		authorslist.add(auth);
	}
	
	public int getYear()
	{
		return year;
	}
	
	public void setYear(int x)
	{
		year = x;
	}
	
	public int getVal()
	{
		return val;
	}
	
	public void setVal(int x)
	{
		val = x;
	}
	
	public ArrayList <String> getAuthor() // getter for Author
	{
		return authorslist;
	}

	public String getTitle() // getter for Title
	{
		return title;
	}
	
	public String getPages() // getter for Pages
	{
		return pages;
	}
	
	public String getVolume() // getter for Volume
	{
		return volume;
	}
	
	public String getJournal() // getter for Journal
	{
		return journal;
	}
	
	public String getEE() // getter for EE
	{
		return ee;
	}
	
	public String getURL() // getter for URL
	{
		return url;
	}
	
	public void setAuthor(ArrayList <String> authors_input)
	{
		authorslist = authors_input;
	}
	
	public void setTitle(String title_input)
	{
		title = title_input;
	}
	
	public void setPages(String pages_input)
	{
		pages = pages_input;
	}
	
	public void setVolume(String volume_input)
	{
		volume = volume_input;
	}
	
	public void setJournal(String journal_input)
	{
		journal = journal_input;
	}
	
	public void setEE(String ee_input)
	{
		ee = ee_input;
	}
	
	public void setURL(String url_input)
	{
		url = url_input;
	}

	public void display()
	{
		for(int i=0;i<authorslist.size(); i++)
			System.out.println(authorslist.get(i));
		System.out.println();
//		System.out.println(title);
//		System.out.println(pages);
//		System.out.println(year);
//		System.out.println(journal);
//		System.out.println(url);
		System.out.println();
	}

}
