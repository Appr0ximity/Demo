package com.accenture.client;

import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class RightPanel extends VerticalPanel{
	 public RightPanel() {
	        // By default, display a label indicating that no item is selected
	        showNoItemSelected();
	    }

	    public void showNoItemSelected() {
	        clear(); // Clear any existing content

	        // Create and add a label to indicate no item is selected
	        Label label = new Label("No item selected");
	        add(label);
	    }

	    public void showSelectedItem(String selectedItemText) {
	        clear(); // Clear any existing content

	        // Create and add a label to display the selected item
	        Label label = new Label("Selected item: " + selectedItemText);
	        add(label);
	    }
}
