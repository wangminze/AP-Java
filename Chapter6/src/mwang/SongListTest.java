package mwang;

public class SongListTest 
{
	public static void main(String[] args)
	{
		SongList list = new SongList();
		EasyReader file = new EasyReader("Music.dat");
		
		System.out.println(EasyFormat.format("Song", 10) + EasyFormat.format("Song Title", 20) 
		+ EasyFormat.format("Song", 10) + EasyFormat.format("Time", 10) 
		+ EasyFormat.format("Total", 10) + EasyFormat.format("Time", 10));
		System.out.println(EasyFormat.format("Number", 10) + EasyFormat.format("Name", 20) 
		+ EasyFormat.format("Minutes", 10) + EasyFormat.format("Seconds", 10) 
		+ EasyFormat.format("Minutes", 10) + EasyFormat.format("Seconds", 10));
		System.out.println();
	
		int songNumber = file.readInt();		
		
		while(songNumber != 0)
		{
			list.addSong(songNumber, file.readWord(), file.readInt(), file.readInt());
			
			System.out.println(EasyFormat.format(list.getSongNumber(), 10) + EasyFormat.format(list.getSongName(), 20) 
				+ EasyFormat.format(list.getSongMinutes(), 10) + EasyFormat.format(list.getSongSeconds(), 10) 
				+ EasyFormat.format(list.getTotalMinutes(), 10) + EasyFormat.format(list.getTotalSeconds(), 10));
			System.out.println();
			
			
			songNumber = file.readInt();
		}
		
		System.out.println("There are " + list.getMinutesLeft() + " minutes and " + list.getSecondsLeft() + " seconds of time remaining.");
		
		
		
		
		
		
	}
	
	
	
	
}
