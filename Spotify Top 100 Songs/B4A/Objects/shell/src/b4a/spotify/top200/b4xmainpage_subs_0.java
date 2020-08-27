package b4a.spotify.top200;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 21;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="Root = Root1";
Debug.ShouldStop(2097152);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 23;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(4194304);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 25;BA.debugLine="PullToRefresh.Initialize(CListView,Me,\"RefreshPul";
Debug.ShouldStop(16777216);
__ref.getField(false,"_pulltorefresh" /*RemoteObject*/ ).runClassMethod (b4a.spotify.top200.clvswipe.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_clistview" /*RemoteObject*/ )),(Object)(__ref),(Object)(RemoteObject.createImmutable("RefreshPuller")));
 BA.debugLineNum = 26;BA.debugLine="PullToRefresh.PullToRefreshPanel = RefreshPanel";
Debug.ShouldStop(33554432);
__ref.getField(false,"_pulltorefresh" /*RemoteObject*/ ).runClassMethod (b4a.spotify.top200.clvswipe.class, "_setpulltorefreshpanel" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_refreshpanel" /*RemoteObject*/ ).getObject()));
 BA.debugLineNum = 28;BA.debugLine="CListView.DefaultTextColor = Colors.Black";
Debug.ShouldStop(134217728);
__ref.getField(false,"_clistview" /*RemoteObject*/ ).setField ("_defaulttextcolor",b4xmainpage.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 30;BA.debugLine="Refresh";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4a.spotify.top200.b4xmainpage.class, "_refresh" /*void*/ );
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
b4xmainpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xmainpage._root);
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
b4xmainpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xmainpage._xui);
 //BA.debugLineNum = 11;BA.debugLine="Private PullToRefresh As CLVSwipe";
b4xmainpage._pulltorefresh = RemoteObject.createNew ("b4a.spotify.top200.clvswipe");__ref.setField("_pulltorefresh",b4xmainpage._pulltorefresh);
 //BA.debugLineNum = 12;BA.debugLine="Private CListView As CustomListView";
b4xmainpage._clistview = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_clistview",b4xmainpage._clistview);
 //BA.debugLineNum = 13;BA.debugLine="Private RefreshPanel As Panel";
b4xmainpage._refreshpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_refreshpanel",b4xmainpage._refreshpanel);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clistview_itemclick(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("CListView_ItemClick (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,78);
if (RapidSub.canDelegate("clistview_itemclick")) { return __ref.runUserSub(false, "b4xmainpage","clistview_itemclick", __ref, _index, _value);}
RemoteObject _i = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 78;BA.debugLine="Private Sub CListView_ItemClick (Index As Int, Val";
Debug.ShouldStop(8192);
 BA.debugLineNum = 79;BA.debugLine="Try";
Debug.ShouldStop(16384);
try { BA.debugLineNum = 80;BA.debugLine="Dim I As Intent";
Debug.ShouldStop(32768);
_i = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("I", _i);
 BA.debugLineNum = 81;BA.debugLine="i.Initialize(I.ACTION_VIEW,Value)";
Debug.ShouldStop(65536);
_i.runVoidMethod ("Initialize",(Object)(_i.getField(true,"ACTION_VIEW")),(Object)(BA.ObjectToString(_value)));
 BA.debugLineNum = 82;BA.debugLine="StartActivity(I)";
Debug.ShouldStop(131072);
b4xmainpage.__c.runVoidMethod ("StartActivity",__ref.getField(false, "ba"),(Object)((_i.getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e6.toString()); BA.debugLineNum = 84;BA.debugLine="Log(LastException)";
Debug.ShouldStop(524288);
b4xmainpage.__c.runVoidMethod ("LogImpl","634144262",BA.ObjectToString(b4xmainpage.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _filllistview(RemoteObject __ref,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("FillListView (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,43);
if (RapidSub.canDelegate("filllistview")) { return __ref.runUserSub(false, "b4xmainpage","filllistview", __ref, _data);}
RemoteObject _song = RemoteObject.declareNull("b4a.spotify.top200.song");
Debug.locals.put("Data", _data);
 BA.debugLineNum = 43;BA.debugLine="Private Sub FillListView(Data As List)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 44;BA.debugLine="CListView.Clear";
Debug.ShouldStop(2048);
__ref.getField(false,"_clistview" /*RemoteObject*/ ).runVoidMethod ("_clear");
 BA.debugLineNum = 45;BA.debugLine="For Each song As Song In Data";
Debug.ShouldStop(4096);
{
final RemoteObject group2 = _data;
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_song = (group2.runMethod(false,"Get",index2));Debug.locals.put("song", _song);
Debug.locals.put("song", _song);
 BA.debugLineNum = 46;BA.debugLine="CListView.AddTextItem(song.GetSummary,song.Link)";
Debug.ShouldStop(8192);
__ref.getField(false,"_clistview" /*RemoteObject*/ ).runVoidMethod ("_addtextitem",(Object)((_song.runClassMethod (b4a.spotify.top200.song.class, "_getsummary" /*RemoteObject*/ ))),(Object)((_song.getField(true,"_link" /*RemoteObject*/ ))));
 }
}Debug.locals.put("song", _song);
;
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdata(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetData (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,50);
if (RapidSub.canDelegate("getdata")) { return __ref.runUserSub(false, "b4xmainpage","getdata", __ref);}
ResumableSub_GetData rsub = new ResumableSub_GetData(null,__ref);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetData extends BA.ResumableSub {
public ResumableSub_GetData(b4a.spotify.top200.b4xmainpage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.spotify.top200.b4xmainpage parent;
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _getjob = RemoteObject.declareNull("b4a.spotify.top200.httpjob");
RemoteObject _job = RemoteObject.declareNull("b4a.spotify.top200.httpjob");
RemoteObject _tempdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _su = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");
RemoteObject _results = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _result = null;
RemoteObject _tempsong = RemoteObject.declareNull("b4a.spotify.top200.song");
RemoteObject group15;
int index15;
int groupLen15;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetData (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,50);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 51;BA.debugLine="Dim Data As List : Data.initialize";
Debug.ShouldStop(262144);
_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Data", _data);
 BA.debugLineNum = 51;BA.debugLine="Dim Data As List : Data.initialize";
Debug.ShouldStop(262144);
_data.runVoidMethod ("Initialize");
 BA.debugLineNum = 53;BA.debugLine="Dim GETjob As HttpJob";
Debug.ShouldStop(1048576);
_getjob = RemoteObject.createNew ("b4a.spotify.top200.httpjob");Debug.locals.put("GETjob", _getjob);
 BA.debugLineNum = 54;BA.debugLine="GETjob.Initialize(\"getData\",Me)";
Debug.ShouldStop(2097152);
_getjob.runClassMethod (b4a.spotify.top200.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("getData")),(Object)(__ref));
 BA.debugLineNum = 55;BA.debugLine="GETjob.Download(\"https://spotifycharts.com/region";
Debug.ShouldStop(4194304);
_getjob.runClassMethod (b4a.spotify.top200.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("https://spotifycharts.com/regional/global/daily/latest/download")));
 BA.debugLineNum = 56;BA.debugLine="Wait for JobDone (job As HttpJob)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "getdata"), null);
this.state = 11;
return;
case 11:
//C
this.state = 1;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("job", _job);
;
 BA.debugLineNum = 57;BA.debugLine="If job.Success Then";
Debug.ShouldStop(16777216);
if (true) break;

case 1:
//if
this.state = 10;
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 58;BA.debugLine="File.WriteString(File.DirInternal,\"data.csv\",job";
Debug.ShouldStop(33554432);
parent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("data.csv")),(Object)(_job.runClassMethod (b4a.spotify.top200.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 59;BA.debugLine="Dim tempData As List = File.ReadList(File.DirInt";
Debug.ShouldStop(67108864);
_tempdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_tempdata = parent.__c.getField(false,"File").runMethod(false,"ReadList",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("data.csv")));Debug.locals.put("tempData", _tempdata);Debug.locals.put("tempData", _tempdata);
 BA.debugLineNum = 61;BA.debugLine="tempData.RemoveAt(0)";
Debug.ShouldStop(268435456);
_tempdata.runVoidMethod ("RemoveAt",(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 62;BA.debugLine="tempData.RemoveAt(0)";
Debug.ShouldStop(536870912);
_tempdata.runVoidMethod ("RemoveAt",(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 63;BA.debugLine="File.WriteList(File.DirInternal,\"data.csv\",tempD";
Debug.ShouldStop(1073741824);
parent.__c.getField(false,"File").runVoidMethod ("WriteList",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("data.csv")),(Object)(_tempdata));
 BA.debugLineNum = 65;BA.debugLine="Dim su As StringUtils";
Debug.ShouldStop(1);
_su = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");Debug.locals.put("su", _su);
 BA.debugLineNum = 66;BA.debugLine="Dim results As List = su.LoadCSV(File.DirInterna";
Debug.ShouldStop(2);
_results = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_results = _su.runMethod(false,"LoadCSV",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("data.csv")),(Object)(BA.ObjectToChar(RemoteObject.createImmutable(","))));Debug.locals.put("results", _results);Debug.locals.put("results", _results);
 BA.debugLineNum = 67;BA.debugLine="For Each result() As String In results";
Debug.ShouldStop(4);
if (true) break;

case 4:
//for
this.state = 7;
group15 = _results;
index15 = 0;
groupLen15 = group15.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("result", _result);
this.state = 12;
if (true) break;

case 12:
//C
this.state = 7;
if (index15 < groupLen15) {
this.state = 6;
_result = (group15.runMethod(false,"Get",index15));Debug.locals.put("result", _result);}
if (true) break;

case 13:
//C
this.state = 12;
index15++;
Debug.locals.put("result", _result);
if (true) break;

case 6:
//C
this.state = 13;
 BA.debugLineNum = 68;BA.debugLine="Dim tempSong As Song : tempSong.Initialize(resu";
Debug.ShouldStop(8);
_tempsong = RemoteObject.createNew ("b4a.spotify.top200.song");Debug.locals.put("tempSong", _tempsong);
 BA.debugLineNum = 68;BA.debugLine="Dim tempSong As Song : tempSong.Initialize(resu";
Debug.ShouldStop(8);
_tempsong.runClassMethod (b4a.spotify.top200.song.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_result));
 BA.debugLineNum = 69;BA.debugLine="Data.Add(tempSong)";
Debug.ShouldStop(16);
_data.runVoidMethod ("Add",(Object)((_tempsong)));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 10;
Debug.locals.put("result", _result);
;
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 72;BA.debugLine="LogColor(job.ErrorMessage , Colors.Red)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("LogImpl","631326230",_job.getField(true,"_errormessage" /*RemoteObject*/ ),parent.__c.getField(false,"Colors").getField(true,"Red"));
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 75;BA.debugLine="Return Data";
Debug.ShouldStop(1024);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_data));return;};
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _jobdone(RemoteObject __ref,RemoteObject _job) throws Exception{
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(32768);
 BA.debugLineNum = 18;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _refresh(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Refresh (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,37);
if (RapidSub.canDelegate("refresh")) { __ref.runUserSub(false, "b4xmainpage","refresh", __ref); return;}
ResumableSub_Refresh rsub = new ResumableSub_Refresh(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Refresh extends BA.ResumableSub {
public ResumableSub_Refresh(b4a.spotify.top200.b4xmainpage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.spotify.top200.b4xmainpage parent;
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Refresh (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,37);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 38;BA.debugLine="Wait For (GetData) Complete (Data As List)";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "refresh"), __ref.runClassMethod (b4a.spotify.top200.b4xmainpage.class, "_getdata" /*RemoteObject*/ ));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_data = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Data", _data);
;
 BA.debugLineNum = 39;BA.debugLine="FillListView(Data)";
Debug.ShouldStop(64);
__ref.runClassMethod (b4a.spotify.top200.b4xmainpage.class, "_filllistview" /*RemoteObject*/ ,(Object)(_data));
 BA.debugLineNum = 40;BA.debugLine="PullToRefresh.RefreshCompleted";
Debug.ShouldStop(128);
__ref.getField(false,"_pulltorefresh" /*RemoteObject*/ ).runClassMethod (b4a.spotify.top200.clvswipe.class, "_refreshcompleted" /*RemoteObject*/ );
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _complete(RemoteObject __ref,RemoteObject _data) throws Exception{
}
public static RemoteObject  _refreshpuller_refreshrequested(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RefreshPuller_RefreshRequested (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,33);
if (RapidSub.canDelegate("refreshpuller_refreshrequested")) { return __ref.runUserSub(false, "b4xmainpage","refreshpuller_refreshrequested", __ref);}
 BA.debugLineNum = 33;BA.debugLine="Private Sub RefreshPuller_RefreshRequested";
Debug.ShouldStop(1);
 BA.debugLineNum = 34;BA.debugLine="Refresh";
Debug.ShouldStop(2);
__ref.runClassMethod (b4a.spotify.top200.b4xmainpage.class, "_refresh" /*void*/ );
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}