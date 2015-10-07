package lists.controller;
import java.util.ArrayList;
import list.view.ListViewer;

public class Controller 
{
	private ArrayList<String> firstWords;
	private ListViewer popupDisplay;
	
	public Controller()
	{
		firstWords = new ArrayList<String>();
		popupDisplay = new ListViewer();
	}
	
	public void Start()
	{
		firstWords.add("fjakhfjkdghakdfjggjkreahfdk");
		showList();
	}
	
	private void showList()
	{
		for(int spot = 0; spot < firstWords.size(); spot++)
		{
			popupDisplay.showList("The Contents at " + spot + "are" + firstWords.get(spot));
		}
	}
	
}
