package com.accenture.client;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.RootLayoutPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Demo implements EntryPoint {

	public void onModuleLoad() {
		DockLayoutPanel dockLayoutPanel = new DockLayoutPanel(com.google.gwt.dom.client.Style.Unit.PX);
        
        // Create instances of your custom panels
        LeftPanel leftPanel = new LeftPanel();
        RightPanel rightPanel = new RightPanel();

        // Add panels to the DockLayoutPanel
        dockLayoutPanel.addWest(leftPanel, 150);
        dockLayoutPanel.add(rightPanel);

        // Attach the DockLayoutPanel to the RootLayoutPanel
        RootLayoutPanel.get().add(dockLayoutPanel);
	}
}
