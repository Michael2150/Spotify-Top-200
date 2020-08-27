
package b4a.spotify.top200;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class clvswipe {
    public static RemoteObject myClass;
	public clvswipe() {
	}
    public static PCBA staticBA = new PCBA(null, clvswipe.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _mclv = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _base = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _touchxstart = RemoteObject.createImmutable(0f);
public static RemoteObject _touchystart = RemoteObject.createImmutable(0f);
public static RemoteObject _handlingswipe = RemoteObject.createImmutable(false);
public static RemoteObject _actionspanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lastswipeditem = RemoteObject.createImmutable(0);
public static RemoteObject _actioncolors = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _cvs = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mpulltorefreshpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _pulltorefreshswipe = RemoteObject.createImmutable(false);
public static RemoteObject _waitingforrefreshtocomplete = RemoteObject.createImmutable(false);
public static RemoteObject _mscrollingdisabled = RemoteObject.createImmutable(false);
public static b4a.spotify.top200.main _main = null;
public static b4a.spotify.top200.starter _starter = null;
public static b4a.spotify.top200.b4xpages _b4xpages = null;
public static b4a.spotify.top200.b4xcollections _b4xcollections = null;
public static b4a.spotify.top200.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"ActionColors",_ref.getField(false, "_actioncolors"),"ActionsPanel",_ref.getField(false, "_actionspanel"),"Base",_ref.getField(false, "_base"),"cvs",_ref.getField(false, "_cvs"),"HandlingSwipe",_ref.getField(false, "_handlingswipe"),"LastSwipedItem",_ref.getField(false, "_lastswipeditem"),"mCallback",_ref.getField(false, "_mcallback"),"mCLV",_ref.getField(false, "_mclv"),"mEventName",_ref.getField(false, "_meventname"),"mPullToRefreshPanel",_ref.getField(false, "_mpulltorefreshpanel"),"mScrollingDisabled",_ref.getField(false, "_mscrollingdisabled"),"PullToRefreshSwipe",_ref.getField(false, "_pulltorefreshswipe"),"TouchXStart",_ref.getField(false, "_touchxstart"),"TouchYStart",_ref.getField(false, "_touchystart"),"WaitingForRefreshToComplete",_ref.getField(false, "_waitingforrefreshtocomplete"),"xui",_ref.getField(false, "_xui")};
}
}