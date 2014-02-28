package com.google.gwt.cs310.bikerangers.client;

import com.google.gwt.cs310.bikerangers.shared.FieldVerifier;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyDownEvent;
import com.google.gwt.event.dom.client.KeyDownHandler;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class BikeRangers implements EntryPoint {
	
	private VerticalPanel mainPanel = new VerticalPanel();
	private HorizontalPanel importPanel = new HorizontalPanel();
	private TextBox newUrlTextBox = new TextBox();
	private Button importUrlButton = new Button("Import");
	private Label importPanelTitle = new Label("Admin Page");
	
	
	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		loadBikeRangers();
	}

	private void loadBikeRangers() {
		// Assemble import-data-from-url panel
		importPanel.add(importPanelTitle);
		importPanel.add(newUrlTextBox);
		importPanel.add(importUrlButton);
		
		// Assemble main panel
		mainPanel.add(importPanel);
		
		// Associate the Main panel with the HTML host page.
		RootPanel.get("importURL").add(mainPanel);
				
		// Move cursor focus to the input box.
		newUrlTextBox.setFocus(true);
		
		// Listen for mouse events on the Add button.
		importUrlButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				//TODO backend method
				importDataset();
			}
		});
				
		// Listen for keyboard events in the input box.
		newUrlTextBox.addKeyDownHandler(new KeyDownHandler() {
			public void onKeyDown(KeyDownEvent event) {
				if (event.getNativeKeyCode() == KeyCodes.KEY_ENTER) {
					//TODO backend method
					importDataset();
				}
			}
		});
	}

	
	/**
	 * Import data from entered url.  Executed when the user clicks the importUrlButton
	 * or presses enter in the newUrlTextBox.
	 */
	private void importDataset() {
		// TODO Auto-generated method stub
		final String url = newUrlTextBox.getText().trim();
		newUrlTextBox.setFocus(true);
		
		// Url must begin with "https://" or "http://".
		if (!(url.startsWith("http://") || url.startsWith("https://"))) {
			Window.alert("'" + url + "' is not a valid URL.");
			newUrlTextBox.selectAll();
			return;
		}
		newUrlTextBox.setText("");
		
		parseDataset(url);
	}

	
	/**
	 * Parses dataset from the given URL into JSON objects, then pushes to the
	 * Google datastore.
	 * @param url
	 */
	private void parseDataset(String url) {
		// TODO Auto-generated method stub
		
		// Call parser
		
		// Push to datastore
		
	}
			
}
