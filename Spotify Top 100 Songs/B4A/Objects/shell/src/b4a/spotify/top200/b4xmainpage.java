
package b4a.spotify.top200;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xmainpage {
    public static RemoteObject myClass;
	public b4xmainpage() {
	}
    public static PCBA staticBA = new PCBA(null, b4xmainpage.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _pulltorefresh = RemoteObject.declareNull("b4a.spotify.top200.clvswipe");
public static RemoteObject _clistview = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _refreshpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static b4a.spotify.top200.main _main = null;
public static b4a.spotify.top200.starter _starter = null;
public static b4a.spotify.top200.b4xpages _b4xpages = null;
public static b4a.spotify.top200.b4xcollections _b4xcollections = null;
public static b4a.spotify.top200.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"CListView",_ref.getField(false, "_clistview"),"PullToRefresh",_ref.getField(false, "_pulltorefresh"),"RefreshPanel",_ref.getField(false, "_refreshpanel"),"Root",_ref.getField(false, "_root"),"xui",_ref.getField(false, "_xui")};
}
}