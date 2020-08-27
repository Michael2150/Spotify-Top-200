package b4a.spotify.top200;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class song_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Rank As Int = 0";
song._rank = BA.numberCast(int.class, 0);__ref.setField("_rank",song._rank);
 //BA.debugLineNum = 4;BA.debugLine="Public SongName As String = \"\"";
song._songname = BA.ObjectToString("");__ref.setField("_songname",song._songname);
 //BA.debugLineNum = 5;BA.debugLine="Public Artist As String = \"\"";
song._artist = BA.ObjectToString("");__ref.setField("_artist",song._artist);
 //BA.debugLineNum = 6;BA.debugLine="Public Streams As Int = 0";
song._streams = BA.numberCast(int.class, 0);__ref.setField("_streams",song._streams);
 //BA.debugLineNum = 7;BA.debugLine="Public Link As String = \"\"";
song._link = BA.ObjectToString("");__ref.setField("_link",song._link);
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getsummary(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetSummary (song) ","song",4,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("getsummary")) { return __ref.runUserSub(false, "song","getsummary", __ref);}
 BA.debugLineNum = 22;BA.debugLine="Public Sub GetSummary As String";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 23;BA.debugLine="Return $\" (${Rank}) ${CRLF} ${SongName} ${CRLF} $";
Debug.ShouldStop(4194304);
if (true) return (RemoteObject.concat(RemoteObject.createImmutable(" ("),song.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_rank" /*RemoteObject*/ )))),RemoteObject.createImmutable(") "),song.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((song.__c.getField(true,"CRLF")))),RemoteObject.createImmutable(" "),song.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_songname" /*RemoteObject*/ )))),RemoteObject.createImmutable(" "),song.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((song.__c.getField(true,"CRLF")))),RemoteObject.createImmutable(" "),song.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_artist" /*RemoteObject*/ )))),RemoteObject.createImmutable(" "),song.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((song.__c.getField(true,"CRLF")))),RemoteObject.createImmutable(" Streams: "),song.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_streams" /*RemoteObject*/ )))),RemoteObject.createImmutable("")));
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettitle(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetTitle (song) ","song",4,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("gettitle")) { return __ref.runUserSub(false, "song","gettitle", __ref);}
 BA.debugLineNum = 19;BA.debugLine="Public Sub GetTitle As String";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="Return $\"\"$";
Debug.ShouldStop(524288);
if (true) return (RemoteObject.createImmutable(""));
 BA.debugLineNum = 21;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("Initialize (song) ","song",4,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "song","initialize", __ref, _ba, _data);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("data", _data);
 BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(data() As String)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 12;BA.debugLine="Rank = data(0)";
Debug.ShouldStop(2048);
__ref.setField ("_rank" /*RemoteObject*/ ,BA.numberCast(int.class, _data.getArrayElement(true,BA.numberCast(int.class, 0))));
 BA.debugLineNum = 13;BA.debugLine="SongName = data(1)";
Debug.ShouldStop(4096);
__ref.setField ("_songname" /*RemoteObject*/ ,_data.getArrayElement(true,BA.numberCast(int.class, 1)));
 BA.debugLineNum = 14;BA.debugLine="Artist = data(2)";
Debug.ShouldStop(8192);
__ref.setField ("_artist" /*RemoteObject*/ ,_data.getArrayElement(true,BA.numberCast(int.class, 2)));
 BA.debugLineNum = 15;BA.debugLine="Streams = data(3)";
Debug.ShouldStop(16384);
__ref.setField ("_streams" /*RemoteObject*/ ,BA.numberCast(int.class, _data.getArrayElement(true,BA.numberCast(int.class, 3))));
 BA.debugLineNum = 16;BA.debugLine="Link = data(4)";
Debug.ShouldStop(32768);
__ref.setField ("_link" /*RemoteObject*/ ,_data.getArrayElement(true,BA.numberCast(int.class, 4)));
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}