package org.sgx.ld.client.states;

import org.sgx.jsutil.client.appstate.AppState;
/**
 * abstract AppState for this application (Using UIObject views). 
 * @author sg
 *
 */
public class LDAppState implements AppState {

	public static interface Listener {
		void notifyStatePerformed(); 
	}
	@Override
	public void perform(String params) {
	}

	String name, description; 
	public LDAppState(String name){
		this.name = name;
	}
	

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void uninstall() {
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return getName();
	}
}
