package b4a.spotify.top200;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xmainpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.spotify.top200.b4xmainpage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.spotify.top200.b4xmainpage.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4a.spotify.top200.clvswipe _pulltorefresh = null;
public b4a.example3.customlistview _clistview = null;
public anywheresoftware.b4a.objects.PanelWrapper _refreshpanel = null;
public b4a.spotify.top200.main _main = null;
public b4a.spotify.top200.starter _starter = null;
public b4a.spotify.top200.b4xpages _b4xpages = null;
public b4a.spotify.top200.b4xcollections _b4xcollections = null;
public b4a.spotify.top200.httputils2service _httputils2service = null;
public String  _b4xpage_created(b4a.spotify.top200.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="Root.LoadLayout(\"MainPage\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("MainPage",ba);
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="PullToRefresh.Initialize(CListView,Me,\"RefreshPul";
__ref._pulltorefresh /*b4a.spotify.top200.clvswipe*/ ._initialize /*String*/ (null,ba,__ref._clistview /*b4a.example3.customlistview*/ ,this,"RefreshPuller");
RDebugUtils.currentLine=720901;
 //BA.debugLineNum = 720901;BA.debugLine="PullToRefresh.PullToRefreshPanel = RefreshPanel";
__ref._pulltorefresh /*b4a.spotify.top200.clvswipe*/ ._setpulltorefreshpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._refreshpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject())));
RDebugUtils.currentLine=720903;
 //BA.debugLineNum = 720903;BA.debugLine="CListView.DefaultTextColor = Colors.Black";
__ref._clistview /*b4a.example3.customlistview*/ ._defaulttextcolor = __c.Colors.Black;
RDebugUtils.currentLine=720905;
 //BA.debugLineNum = 720905;BA.debugLine="Refresh";
__ref._refresh /*void*/ (null);
RDebugUtils.currentLine=720906;
 //BA.debugLineNum = 720906;BA.debugLine="End Sub";
return "";
}
public void  _refresh(b4a.spotify.top200.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "refresh", false))
	 {Debug.delegate(ba, "refresh", null); return;}
ResumableSub_Refresh rsub = new ResumableSub_Refresh(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Refresh extends BA.ResumableSub {
public ResumableSub_Refresh(b4a.spotify.top200.b4xmainpage parent,b4a.spotify.top200.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.spotify.top200.b4xmainpage __ref;
b4a.spotify.top200.b4xmainpage parent;
anywheresoftware.b4a.objects.collections.List _data = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=10616833;
 //BA.debugLineNum = 10616833;BA.debugLine="Wait For (GetData) Complete (Data As List)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "refresh"), __ref._getdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_data = (anywheresoftware.b4a.objects.collections.List) result[1];
;
RDebugUtils.currentLine=10616834;
 //BA.debugLineNum = 10616834;BA.debugLine="FillListView(Data)";
__ref._filllistview /*String*/ (null,_data);
RDebugUtils.currentLine=10616835;
 //BA.debugLineNum = 10616835;BA.debugLine="PullToRefresh.RefreshCompleted";
__ref._pulltorefresh /*b4a.spotify.top200.clvswipe*/ ._refreshcompleted /*String*/ (null);
RDebugUtils.currentLine=10616836;
 //BA.debugLineNum = 10616836;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4a.spotify.top200.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="Private PullToRefresh As CLVSwipe";
_pulltorefresh = new b4a.spotify.top200.clvswipe();
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="Private CListView As CustomListView";
_clistview = new b4a.example3.customlistview();
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="Private RefreshPanel As Panel";
_refreshpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="End Sub";
return "";
}
public String  _clistview_itemclick(b4a.spotify.top200.b4xmainpage __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "clistview_itemclick", false))
	 {return ((String) Debug.delegate(ba, "clistview_itemclick", new Object[] {_index,_value}));}
anywheresoftware.b4a.objects.IntentWrapper _i = null;
RDebugUtils.currentLine=34144256;
 //BA.debugLineNum = 34144256;BA.debugLine="Private Sub CListView_ItemClick (Index As Int, Val";
RDebugUtils.currentLine=34144257;
 //BA.debugLineNum = 34144257;BA.debugLine="Try";
try {RDebugUtils.currentLine=34144258;
 //BA.debugLineNum = 34144258;BA.debugLine="Dim I As Intent";
_i = new anywheresoftware.b4a.objects.IntentWrapper();
RDebugUtils.currentLine=34144259;
 //BA.debugLineNum = 34144259;BA.debugLine="i.Initialize(I.ACTION_VIEW,Value)";
_i.Initialize(_i.ACTION_VIEW,BA.ObjectToString(_value));
RDebugUtils.currentLine=34144260;
 //BA.debugLineNum = 34144260;BA.debugLine="StartActivity(I)";
__c.StartActivity(ba,(Object)(_i.getObject()));
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=34144262;
 //BA.debugLineNum = 34144262;BA.debugLine="Log(LastException)";
__c.LogImpl("634144262",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=34144264;
 //BA.debugLineNum = 34144264;BA.debugLine="End Sub";
return "";
}
public String  _filllistview(b4a.spotify.top200.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.List _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "filllistview", false))
	 {return ((String) Debug.delegate(ba, "filllistview", new Object[] {_data}));}
b4a.spotify.top200.song _song = null;
RDebugUtils.currentLine=31719424;
 //BA.debugLineNum = 31719424;BA.debugLine="Private Sub FillListView(Data As List)";
RDebugUtils.currentLine=31719425;
 //BA.debugLineNum = 31719425;BA.debugLine="CListView.Clear";
__ref._clistview /*b4a.example3.customlistview*/ ._clear();
RDebugUtils.currentLine=31719426;
 //BA.debugLineNum = 31719426;BA.debugLine="For Each song As Song In Data";
{
final anywheresoftware.b4a.BA.IterableList group2 = _data;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_song = (b4a.spotify.top200.song)(group2.Get(index2));
RDebugUtils.currentLine=31719427;
 //BA.debugLineNum = 31719427;BA.debugLine="CListView.AddTextItem(song.GetSummary,song.Link)";
__ref._clistview /*b4a.example3.customlistview*/ ._addtextitem((Object)(_song._getsummary /*String*/ (null)),(Object)(_song._link /*String*/ ));
 }
};
RDebugUtils.currentLine=31719429;
 //BA.debugLineNum = 31719429;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _getdata(b4a.spotify.top200.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "getdata", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "getdata", null));}
ResumableSub_GetData rsub = new ResumableSub_GetData(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_GetData extends BA.ResumableSub {
public ResumableSub_GetData(b4a.spotify.top200.b4xmainpage parent,b4a.spotify.top200.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.spotify.top200.b4xmainpage __ref;
b4a.spotify.top200.b4xmainpage parent;
anywheresoftware.b4a.objects.collections.List _data = null;
b4a.spotify.top200.httpjob _getjob = null;
b4a.spotify.top200.httpjob _job = null;
anywheresoftware.b4a.objects.collections.List _tempdata = null;
anywheresoftware.b4a.objects.StringUtils _su = null;
anywheresoftware.b4a.objects.collections.List _results = null;
String[] _result = null;
b4a.spotify.top200.song _tempsong = null;
anywheresoftware.b4a.BA.IterableList group15;
int index15;
int groupLen15;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=31326209;
 //BA.debugLineNum = 31326209;BA.debugLine="Dim Data As List : Data.initialize";
_data = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=31326209;
 //BA.debugLineNum = 31326209;BA.debugLine="Dim Data As List : Data.initialize";
_data.Initialize();
RDebugUtils.currentLine=31326211;
 //BA.debugLineNum = 31326211;BA.debugLine="Dim GETjob As HttpJob";
_getjob = new b4a.spotify.top200.httpjob();
RDebugUtils.currentLine=31326212;
 //BA.debugLineNum = 31326212;BA.debugLine="GETjob.Initialize(\"getData\",Me)";
_getjob._initialize /*String*/ (null,ba,"getData",parent);
RDebugUtils.currentLine=31326213;
 //BA.debugLineNum = 31326213;BA.debugLine="GETjob.Download(\"https://spotifycharts.com/region";
_getjob._download /*String*/ (null,"https://spotifycharts.com/regional/global/daily/latest/download");
RDebugUtils.currentLine=31326214;
 //BA.debugLineNum = 31326214;BA.debugLine="Wait for JobDone (job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "getdata"), null);
this.state = 11;
return;
case 11:
//C
this.state = 1;
_job = (b4a.spotify.top200.httpjob) result[1];
;
RDebugUtils.currentLine=31326215;
 //BA.debugLineNum = 31326215;BA.debugLine="If job.Success Then";
if (true) break;

case 1:
//if
this.state = 10;
if (_job._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=31326216;
 //BA.debugLineNum = 31326216;BA.debugLine="File.WriteString(File.DirInternal,\"data.csv\",job";
parent.__c.File.WriteString(parent.__c.File.getDirInternal(),"data.csv",_job._getstring /*String*/ (null));
RDebugUtils.currentLine=31326217;
 //BA.debugLineNum = 31326217;BA.debugLine="Dim tempData As List = File.ReadList(File.DirInt";
_tempdata = new anywheresoftware.b4a.objects.collections.List();
_tempdata = parent.__c.File.ReadList(parent.__c.File.getDirInternal(),"data.csv");
RDebugUtils.currentLine=31326219;
 //BA.debugLineNum = 31326219;BA.debugLine="tempData.RemoveAt(0)";
_tempdata.RemoveAt((int) (0));
RDebugUtils.currentLine=31326220;
 //BA.debugLineNum = 31326220;BA.debugLine="tempData.RemoveAt(0)";
_tempdata.RemoveAt((int) (0));
RDebugUtils.currentLine=31326221;
 //BA.debugLineNum = 31326221;BA.debugLine="File.WriteList(File.DirInternal,\"data.csv\",tempD";
parent.__c.File.WriteList(parent.__c.File.getDirInternal(),"data.csv",_tempdata);
RDebugUtils.currentLine=31326223;
 //BA.debugLineNum = 31326223;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=31326224;
 //BA.debugLineNum = 31326224;BA.debugLine="Dim results As List = su.LoadCSV(File.DirInterna";
_results = new anywheresoftware.b4a.objects.collections.List();
_results = _su.LoadCSV(parent.__c.File.getDirInternal(),"data.csv",BA.ObjectToChar(","));
RDebugUtils.currentLine=31326225;
 //BA.debugLineNum = 31326225;BA.debugLine="For Each result() As String In results";
if (true) break;

case 4:
//for
this.state = 7;
group15 = _results;
index15 = 0;
groupLen15 = group15.getSize();
this.state = 12;
if (true) break;

case 12:
//C
this.state = 7;
if (index15 < groupLen15) {
this.state = 6;
_result = (String[])(group15.Get(index15));}
if (true) break;

case 13:
//C
this.state = 12;
index15++;
if (true) break;

case 6:
//C
this.state = 13;
RDebugUtils.currentLine=31326226;
 //BA.debugLineNum = 31326226;BA.debugLine="Dim tempSong As Song : tempSong.Initialize(resu";
_tempsong = new b4a.spotify.top200.song();
RDebugUtils.currentLine=31326226;
 //BA.debugLineNum = 31326226;BA.debugLine="Dim tempSong As Song : tempSong.Initialize(resu";
_tempsong._initialize /*String*/ (null,ba,_result);
RDebugUtils.currentLine=31326227;
 //BA.debugLineNum = 31326227;BA.debugLine="Data.Add(tempSong)";
_data.Add((Object)(_tempsong));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 10;
;
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=31326230;
 //BA.debugLineNum = 31326230;BA.debugLine="LogColor(job.ErrorMessage , Colors.Red)";
parent.__c.LogImpl("631326230",_job._errormessage /*String*/ ,parent.__c.Colors.Red);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=31326233;
 //BA.debugLineNum = 31326233;BA.debugLine="Return Data";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_data));return;};
RDebugUtils.currentLine=31326234;
 //BA.debugLineNum = 31326234;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _initialize(b4a.spotify.top200.b4xmainpage __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="End Sub";
return "";
}
public String  _refreshpuller_refreshrequested(b4a.spotify.top200.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "refreshpuller_refreshrequested", false))
	 {return ((String) Debug.delegate(ba, "refreshpuller_refreshrequested", null));}
RDebugUtils.currentLine=31260672;
 //BA.debugLineNum = 31260672;BA.debugLine="Private Sub RefreshPuller_RefreshRequested";
RDebugUtils.currentLine=31260673;
 //BA.debugLineNum = 31260673;BA.debugLine="Refresh";
__ref._refresh /*void*/ (null);
RDebugUtils.currentLine=31260674;
 //BA.debugLineNum = 31260674;BA.debugLine="End Sub";
return "";
}
}