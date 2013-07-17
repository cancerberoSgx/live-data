package org.sgx.ld.client.states;

import java.util.Map;

import org.sgx.jsutil.client.appstate.AbstractAppStateManager;
import org.sgx.jsutil.client.appstate.AppState;
import org.sgx.jsutil.client.appstate.AppStateParamHelper;
import org.sgx.ld.client.LDMain;
import org.sgx.ld.client.ui.views.FreeTemplateEditor;

/**
 * responsible of knowng and mantain all the states of the application and know the state names. 
 * @author sg
 *
 */
public class LDStateManager extends AbstractAppStateManager {

	public static final String 
		
	
		STATE_HOME = "home", 
		STATE_NOTFOUND = "notFound",
		
		STATE_FREEEDITOR = "freeEditor", 
				
//		STATE_SEARCHPLACE = "searchPlace", 
//		STATE_EDITPLACE = "editPlace",
//		
//		STATE_EDITMAPVIEW="editMap",
//		STATE_SEARCHMAPVIEW="searchMap", 		
//		 
//		STATE_ELEVATION = "elevationTool", 
//		STATE_VIEWMAP = "viewMap", 

		
		PARAM_ID = "id", 
		PARAM_ADD = "add",
		PARAM_CMD = "cmd",
		
		
		CMD_EDIT = "edit", 
		CMD_ADD = "add", 
		CMD_VIEW = "view";

	
	public LDStateManager() {
		super();

		addState(new LDAppState(STATE_HOME) {
			@Override
			public void perform(String params) {
//				HomeView view = MNMain.getInstance().getViewManager().getView(HomeView.class);
//				MNMain.getInstance().getLayout().getStatePanel().setState(this, view);
			}
		});
		
		addState(new LDAppState(STATE_FREEEDITOR) {
			@Override
			public void perform(String params) {
				FreeTemplateEditor view = LDViewManager.getInstance().getView(FreeTemplateEditor.class); //new FreeCompiler();
				LDMain.layout().setView(view); 
				System.out.println("done");
//				LDMain.views().getView(c)
//				HomeView view = MNMain.getInstance().getViewManager().getView(HomeView.class);
//				MNMain.getInstance().getLayout().getStatePanel().setState(this, view);
			}
		});
	
	}
	
	@Override
	public void navigate(AppState state, String params) {
		super.navigate(state, params);
//		MNMain.getInstance().getLayout().getStatePanel().setState(state, null); 
	}
	
	@Override
	public AppState getDefaultState() {
		return this.getStates().get(STATE_HOME);
	}

	AppState notFoundState = null;
	
	@Override
	public AppState getNotFoundState() {
		if (notFoundState == null)
			notFoundState = new LDAppState(STATE_NOTFOUND) {
				@Override
				public void perform(String params) {
					super.perform(params);
//					MNMain.getInstance().getLayout().setStatusText("Not found", "text-error");
				}
			};
		return notFoundState;
	}

	public void navigate(String state, Map<String, String> params) {
		String pstr = AppStateParamHelper.toUrl(params); 
		this.navigate(state, pstr); 
	}


}
