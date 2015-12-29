package mwang;

public class SongList 
{
	private String songName;
	private int songNumber;
	private int songMinutes;
	private int songSeconds;
	private int totalMinutes;
	private int totalSeconds;
	
	public SongList()
	{
		songName = " ";
		totalMinutes = 0;
		totalSeconds = 0;
	}

	public void addSong(int songNumber, String songName, int songMinutes, int songSeconds)
	{
		this.songNumber = songNumber;
		this.songName = songName;
		this.songMinutes = songMinutes;
		this.songSeconds = songSeconds;
		
		totalMinutes = totalMinutes + songMinutes;
		totalSeconds = totalSeconds + songSeconds;
		
		if(totalSeconds >= 60)
		{
			totalMinutes = totalMinutes + (totalSeconds / 60);
			totalSeconds = totalSeconds % 60;
		}		
	}

	public int getSongNumber()
	{
		return songNumber;
	}

	public String getSongName()
	{
		return songName;
	}
	
	public int getSongMinutes()
	{
		return songMinutes;
	}
	
	public int getSongSeconds()
	{
		return songSeconds;
	}
	
	public int getTotalMinutes()
	{
		return totalMinutes;
	}

	public int getTotalSeconds()
	{
		return totalSeconds;
	}
	
	public int getMinutesLeft()
	{
		return 79 - totalMinutes;
	}
	
	public int getSecondsLeft()
	{
		return 60 - totalSeconds;
	}
	
	
	
	
	
	
	
}
