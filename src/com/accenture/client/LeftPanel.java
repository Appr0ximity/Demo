package com.accenture.client;

import com.google.gwt.user.client.ui.Tree;
import com.google.gwt.user.client.ui.TreeItem;
import com.google.gwt.user.client.ui.VerticalPanel;

public class LeftPanel extends VerticalPanel{
	public LeftPanel() {
        // Create a tree
        Tree staticTree = createStaticTree();

        // Set the width and height of the tree (optional)
        staticTree.setWidth("100%");
        staticTree.setHeight("100%");

        // Add the tree to the panel
        add(staticTree);
    }

    private Tree createStaticTree() {
        // Create the tree
        Tree staticTree = new Tree();

        // Add Widgets category
        TreeItem widgetsCategory = new TreeItem();
        widgetsCategory.setText("Widgets");
        widgetsCategory.addItem(createTreeItem("Checkbox"));
        widgetsCategory.addItem(createTreeItem("Radio Button"));
        widgetsCategory.addItem(createTreeItem("Basic Button"));
        widgetsCategory.addItem(createTreeItem("Custom Button"));
        widgetsCategory.addItem(createTreeItem("File Upload"));
        widgetsCategory.addItem(createTreeItem("Date Picker"));
        widgetsCategory.addItem(createTreeItem("Hyperlink"));
        staticTree.addItem(widgetsCategory);

        // Add Text Input category
        TreeItem textInputCategory = new TreeItem();
        textInputCategory.setText("Text Input");
        textInputCategory.addItem(createTreeItem("Basic Text"));
        textInputCategory.addItem(createTreeItem("Rich Text"));
        staticTree.addItem(textInputCategory);

        // Add Popups category
        TreeItem popupsCategory = new TreeItem();
        popupsCategory.setText("Popups");
        popupsCategory.addItem(createTreeItem("Basic Popups"));
        popupsCategory.addItem(createTreeItem("Dialog Box"));
        staticTree.addItem(popupsCategory);

        return staticTree;
    }

    private TreeItem createTreeItem(String text) {
        TreeItem item = new TreeItem();
        item.setText(text);
        return item;
    }
}
