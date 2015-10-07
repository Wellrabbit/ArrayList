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
	/**
	 * Add things to the first and second position of the array
	 */
	public void Start()
	{
		firstWords.add("fjakhfjkdghakdfjggjkreahfdk");
		firstWords.add("BAbbabbaaababbaaaaa");
		showList();
	}
	/**
	 * Display in popup the arrays stored strings via spot
	 */
	private void showList()
	{
		for(int spot = 0; spot < firstWords.size(); spot++)
		{
			popupDisplay.showList("The Contents at " + spot + " are " + firstWords.get(spot));
		}
	}
	
}
