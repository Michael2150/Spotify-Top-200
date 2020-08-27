package b4a.spotify.top200;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class song extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.spotify.top200.song");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.spotify.top200.song.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public int _rank = 0;
public String _songname = "";
public String _artist = "";
public int _streams = 0;
public String _link = "";
public b4a.spotify.top200.main _main = null;
public b4a.spotify.top200.starter _starter = null;
public b4a.spotify.top200.b4xpages _b4xpages = null;
public b4a.spotify.top200.b4xcollections _b4xcollections = null;
public b4a.spotify.top200.httputils2service _httputils2service = null;
public String  _getsummary(b4a.spotify.top200.song __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="song";
if (Debug.shouldDelegate(ba, "getsummary", false))
	 {return ((String) Debug.delegate(ba, "getsummary", null));}
RDebugUtils.currentLine=32702464;
 //BA.debugLineNum = 32702464;BA.debugLine="Public Sub GetSummary As String";
RDebugUtils.currentLine=32702465;
 //BA.debugLineNum = 32702465;BA.debugLine="Return $\" (${Rank}) ${CRLF} ${SongName} ${CRLF} $";
if (true) return (" ("+__c.SmartStringFormatter("",(Object)(__ref._rank /*int*/ ))+") "+__c.SmartStringFormatter("",(Object)(__c.CRLF))+" "+__c.SmartStringFormatter("",(Object)(__ref._songname /*String*/ ))+" "+__c.SmartStringFormatter("",(Object)(__c.CRLF))+" "+__c.SmartStringFormatter("",(Object)(__ref._artist /*String*/ ))+" "+__c.SmartStringFormatter("",(Object)(__c.CRLF))+" Streams: "+__c.SmartStringFormatter("",(Object)(__ref._streams /*int*/ ))+"");
RDebugUtils.currentLine=32702466;
 //BA.debugLineNum = 32702466;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.spotify.top200.song __ref,anywheresoftware.b4a.BA _ba,String[] _data) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="song";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_data}));}
RDebugUtils.currentLine=31588352;
 //BA.debugLineNum = 31588352;BA.debugLine="Public Sub Initialize(data() As String)";
RDebugUtils.currentLine=31588353;
 //BA.debugLineNum = 31588353;BA.debugLine="Rank = data(0)";
__ref._rank /*int*/  = (int)(Double.parseDouble(_data[(int) (0)]));
RDebugUtils.currentLine=31588354;
 //BA.debugLineNum = 31588354;BA.debugLine="SongName = data(1)";
__ref._songname /*String*/  = _data[(int) (1)];
RDebugUtils.currentLine=31588355;
 //BA.debugLineNum = 31588355;BA.debugLine="Artist = data(2)";
__ref._artist /*String*/  = _data[(int) (2)];
RDebugUtils.currentLine=31588356;
 //BA.debugLineNum = 31588356;BA.debugLine="Streams = data(3)";
__ref._streams /*int*/  = (int)(Double.parseDouble(_data[(int) (3)]));
RDebugUtils.currentLine=31588357;
 //BA.debugLineNum = 31588357;BA.debugLine="Link = data(4)";
__ref._link /*String*/  = _data[(int) (4)];
RDebugUtils.currentLine=31588358;
 //BA.debugLineNum = 31588358;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.spotify.top200.song __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="song";
RDebugUtils.currentLine=31522816;
 //BA.debugLineNum = 31522816;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=31522818;
 //BA.debugLineNum = 31522818;BA.debugLine="Public Rank As Int = 0";
_rank = (int) (0);
RDebugUtils.currentLine=31522819;
 //BA.debugLineNum = 31522819;BA.debugLine="Public SongName As String = \"\"";
_songname = "";
RDebugUtils.currentLine=31522820;
 //BA.debugLineNum = 31522820;BA.debugLine="Public Artist As String = \"\"";
_artist = "";
RDebugUtils.currentLine=31522821;
 //BA.debugLineNum = 31522821;BA.debugLine="Public Streams As Int = 0";
_streams = (int) (0);
RDebugUtils.currentLine=31522822;
 //BA.debugLineNum = 31522822;BA.debugLine="Public Link As String = \"\"";
_link = "";
RDebugUtils.currentLine=31522823;
 //BA.debugLineNum = 31522823;BA.debugLine="End Sub";
return "";
}
public String  _gettitle(b4a.spotify.top200.song __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="song";
if (Debug.shouldDelegate(ba, "gettitle", false))
	 {return ((String) Debug.delegate(ba, "gettitle", null));}
RDebugUtils.currentLine=33030144;
 //BA.debugLineNum = 33030144;BA.debugLine="Public Sub GetTitle As String";
RDebugUtils.currentLine=33030145;
 //BA.debugLineNum = 33030145;BA.debugLine="Return $\"\"$";
if (true) return ("");
RDebugUtils.currentLine=33030146;
 //BA.debugLineNum = 33030146;BA.debugLine="End Sub";
return "";
}
}