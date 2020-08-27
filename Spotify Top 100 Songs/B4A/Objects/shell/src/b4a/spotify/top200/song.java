
package b4a.spotify.top200;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class song {
    public static RemoteObject myClass;
	public song() {
	}
    public static PCBA staticBA = new PCBA(null, song.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _rank = RemoteObject.createImmutable(0);
public static RemoteObject _songname = RemoteObject.createImmutable("");
public static RemoteObject _artist = RemoteObject.createImmutable("");
public static RemoteObject _streams = RemoteObject.createImmutable(0);
public static RemoteObject _link = RemoteObject.createImmutable("");
public static b4a.spotify.top200.main _main = null;
public static b4a.spotify.top200.starter _starter = null;
public static b4a.spotify.top200.b4xpages _b4xpages = null;
public static b4a.spotify.top200.b4xcollections _b4xcollections = null;
public static b4a.spotify.top200.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"Artist",_ref.getField(false, "_artist"),"Link",_ref.getField(false, "_link"),"Rank",_ref.getField(false, "_rank"),"SongName",_ref.getField(false, "_songname"),"Streams",_ref.getField(false, "_streams")};
}
}