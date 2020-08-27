
package b4a.spotify.top200;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xbitset {
    public static RemoteObject myClass;
	public b4xbitset() {
	}
    public static PCBA staticBA = new PCBA(null, b4xbitset.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _data = null;
public static RemoteObject _msize = RemoteObject.createImmutable(0);
public static b4a.spotify.top200.main _main = null;
public static b4a.spotify.top200.starter _starter = null;
public static b4a.spotify.top200.b4xpages _b4xpages = null;
public static b4a.spotify.top200.b4xcollections _b4xcollections = null;
public static b4a.spotify.top200.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"data",_ref.getField(false, "_data"),"mSize",_ref.getField(false, "_msize")};
}
}