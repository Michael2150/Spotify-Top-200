package b4a.spotify.top200;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class clvswipe extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.spotify.top200.clvswipe");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.spotify.top200.clvswipe.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _swipeitem{
public boolean IsInitialized;
public Object Value;
public anywheresoftware.b4a.objects.collections.List Actions;
public boolean IsSwiped;
public int MaxSwipe;
public boolean Open;
public void Initialize() {
IsInitialized = true;
Value = new Object();
Actions = new anywheresoftware.b4a.objects.collections.List();
IsSwiped = false;
MaxSwipe = 0;
Open = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.example3.customlistview _mclv = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
public float _touchxstart = 0f;
public float _touchystart = 0f;
public boolean _handlingswipe = false;
public anywheresoftware.b4a.objects.B4XViewWrapper _actionspanel = null;
public int _lastswipeditem = 0;
public anywheresoftware.b4a.objects.collections.Map _actioncolors = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
public Object _mcallback = null;
public String _meventname = "";
public anywheresoftware.b4a.objects.B4XViewWrapper _mpulltorefreshpanel = null;
public boolean _pulltorefreshswipe = false;
public boolean _waitingforrefreshtocomplete = false;
public boolean _mscrollingdisabled = false;
public b4a.spotify.top200.main _main = null;
public b4a.spotify.top200.starter _starter = null;
public b4a.spotify.top200.b4xpages _b4xpages = null;
public b4a.spotify.top200.b4xcollections _b4xcollections = null;
public b4a.spotify.top200.httputils2service _httputils2service = null;
public String  _initialize(b4a.spotify.top200.clvswipe __ref,anywheresoftware.b4a.BA _ba,b4a.example3.customlistview _clv,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="clvswipe";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_clv,_callback,_eventname}));}
anywheresoftware.b4a.objects.TouchPanelCreator _creator = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=10747904;
 //BA.debugLineNum = 10747904;BA.debugLine="Public Sub Initialize (clv As CustomListView, Call";
RDebugUtils.currentLine=10747906;
 //BA.debugLineNum = 10747906;BA.debugLine="Dim creator As TouchPanelCreator";
_creator = new anywheresoftware.b4a.objects.TouchPanelCreator();
RDebugUtils.currentLine=10747907;
 //BA.debugLineNum = 10747907;BA.debugLine="Base = creator.CreateTouchPanel(\"TouchPanel\")";
__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_creator.CreateTouchPanel(ba,"TouchPanel").getObject()));
RDebugUtils.currentLine=10747914;
 //BA.debugLineNum = 10747914;BA.debugLine="ActionsPanel = xui.CreatePanel(\"\")";
__ref._actionspanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=10747915;
 //BA.debugLineNum = 10747915;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=10747916;
 //BA.debugLineNum = 10747916;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 1dip, 1dip)";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)));
RDebugUtils.currentLine=10747917;
 //BA.debugLineNum = 10747917;BA.debugLine="cvs.Initialize(p)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(_p);
RDebugUtils.currentLine=10747918;
 //BA.debugLineNum = 10747918;BA.debugLine="mCLV = clv";
__ref._mclv /*b4a.example3.customlistview*/  = _clv;
RDebugUtils.currentLine=10747919;
 //BA.debugLineNum = 10747919;BA.debugLine="mCLV.AsView.Parent.AddView(Base, mCLV.AsView.Left";
__ref._mclv /*b4a.example3.customlistview*/ ._asview().getParent().AddView((android.view.View)(__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),__ref._mclv /*b4a.example3.customlistview*/ ._asview().getLeft(),__ref._mclv /*b4a.example3.customlistview*/ ._asview().getTop(),__ref._mclv /*b4a.example3.customlistview*/ ._asview().getWidth(),__ref._mclv /*b4a.example3.customlistview*/ ._asview().getHeight());
RDebugUtils.currentLine=10747920;
 //BA.debugLineNum = 10747920;BA.debugLine="mCLV.AsView.RemoveViewFromParent";
__ref._mclv /*b4a.example3.customlistview*/ ._asview().RemoveViewFromParent();
RDebugUtils.currentLine=10747921;
 //BA.debugLineNum = 10747921;BA.debugLine="Base.AddView(mCLV.AsView, 0, 0, Base.Width, Base.";
__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._mclv /*b4a.example3.customlistview*/ ._asview().getObject()),(int) (0),(int) (0),__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=10747922;
 //BA.debugLineNum = 10747922;BA.debugLine="mCallback = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=10747923;
 //BA.debugLineNum = 10747923;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=10747924;
 //BA.debugLineNum = 10747924;BA.debugLine="End Sub";
return "";
}
public String  _setpulltorefreshpanel(b4a.spotify.top200.clvswipe __ref,anywheresoftware.b4a.objects.B4XViewWrapper _pnl) throws Exception{
__ref = this;
RDebugUtils.currentModule="clvswipe";
if (Debug.shouldDelegate(ba, "setpulltorefreshpanel", false))
	 {return ((String) Debug.delegate(ba, "setpulltorefreshpanel", new Object[] {_pnl}));}
RDebugUtils.currentLine=11468800;
 //BA.debugLineNum = 11468800;BA.debugLine="Public Sub setPullToRefreshPanel(pnl As B4XView)";
RDebugUtils.currentLine=11468801;
 //BA.debugLineNum = 11468801;BA.debugLine="If pnl.Parent.IsInitialized Then pnl.RemoveViewFr";
if (_pnl.getParent().IsInitialized()) { 
_pnl.RemoveViewFromParent();};
RDebugUtils.currentLine=11468802;
 //BA.debugLineNum = 11468802;BA.debugLine="If mPullToRefreshPanel.IsInitialized Then mPullTo";
if (__ref._mpulltorefreshpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
__ref._mpulltorefreshpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();};
RDebugUtils.currentLine=11468803;
 //BA.debugLineNum = 11468803;BA.debugLine="mPullToRefreshPanel = pnl";
__ref._mpulltorefreshpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _pnl;
RDebugUtils.currentLine=11468804;
 //BA.debugLineNum = 11468804;BA.debugLine="Base.AddView(mPullToRefreshPanel, 0, 0, Base.Widt";
__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._mpulltorefreshpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mpulltorefreshpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=11468805;
 //BA.debugLineNum = 11468805;BA.debugLine="mPullToRefreshPanel.SendToBack";
__ref._mpulltorefreshpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SendToBack();
RDebugUtils.currentLine=11468806;
 //BA.debugLineNum = 11468806;BA.debugLine="mPullToRefreshPanel.Visible = False";
__ref._mpulltorefreshpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=11468807;
 //BA.debugLineNum = 11468807;BA.debugLine="End Sub";
return "";
}
public String  _refreshcompleted(b4a.spotify.top200.clvswipe __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clvswipe";
if (Debug.shouldDelegate(ba, "refreshcompleted", false))
	 {return ((String) Debug.delegate(ba, "refreshcompleted", null));}
RDebugUtils.currentLine=11141120;
 //BA.debugLineNum = 11141120;BA.debugLine="Public Sub RefreshCompleted";
RDebugUtils.currentLine=11141121;
 //BA.debugLineNum = 11141121;BA.debugLine="If WaitingForRefreshToComplete = False Then Retur";
if (__ref._waitingforrefreshtocomplete /*boolean*/ ==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=11141122;
 //BA.debugLineNum = 11141122;BA.debugLine="WaitingForRefreshToComplete = False";
__ref._waitingforrefreshtocomplete /*boolean*/  = __c.False;
RDebugUtils.currentLine=11141123;
 //BA.debugLineNum = 11141123;BA.debugLine="mPullToRefreshPanel.Visible = False";
__ref._mpulltorefreshpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=11141124;
 //BA.debugLineNum = 11141124;BA.debugLine="mCLV.AsView.SetLayoutAnimated(200, 0, 0, mCLV.AsV";
__ref._mclv /*b4a.example3.customlistview*/ ._asview().SetLayoutAnimated((int) (200),(int) (0),(int) (0),__ref._mclv /*b4a.example3.customlistview*/ ._asview().getWidth(),__ref._mclv /*b4a.example3.customlistview*/ ._asview().getHeight());
RDebugUtils.currentLine=11141129;
 //BA.debugLineNum = 11141129;BA.debugLine="End Sub";
return "";
}
public boolean  _changeoffset(b4a.spotify.top200.clvswipe __ref,int _index,int _dx,boolean _complete) throws Exception{
__ref = this;
RDebugUtils.currentModule="clvswipe";
if (Debug.shouldDelegate(ba, "changeoffset", false))
	 {return ((Boolean) Debug.delegate(ba, "changeoffset", new Object[] {_index,_dx,_complete}));}
b4a.example3.customlistview._clvitem _aitem = null;
b4a.spotify.top200.clvswipe._swipeitem _m = null;
int _newleft = 0;
RDebugUtils.currentLine=10878976;
 //BA.debugLineNum = 10878976;BA.debugLine="Private Sub ChangeOffset(index As Int, dx As Int,";
RDebugUtils.currentLine=10878977;
 //BA.debugLineNum = 10878977;BA.debugLine="If index < 0 Or index >= mCLV.Size Then Return Fa";
if (_index<0 || _index>=__ref._mclv /*b4a.example3.customlistview*/ ._getsize()) { 
if (true) return __c.False;};
RDebugUtils.currentLine=10878978;
 //BA.debugLineNum = 10878978;BA.debugLine="Dim aItem As CLVItem = mCLV.GetRawListItem(index)";
_aitem = __ref._mclv /*b4a.example3.customlistview*/ ._getrawlistitem(_index);
RDebugUtils.currentLine=10878979;
 //BA.debugLineNum = 10878979;BA.debugLine="If Not(aItem.Value Is SwipeItem) Then Return Fals";
if (__c.Not(_aitem.Value instanceof b4a.spotify.top200.clvswipe._swipeitem)) { 
if (true) return __c.False;};
RDebugUtils.currentLine=10878980;
 //BA.debugLineNum = 10878980;BA.debugLine="Dim m As SwipeItem = aItem.Value";
_m = (b4a.spotify.top200.clvswipe._swipeitem)(_aitem.Value);
RDebugUtils.currentLine=10878981;
 //BA.debugLineNum = 10878981;BA.debugLine="If m.IsSwiped = False And complete = True Then Re";
if (_m.IsSwiped /*boolean*/ ==__c.False && _complete==__c.True) { 
if (true) return __c.False;};
RDebugUtils.currentLine=10878982;
 //BA.debugLineNum = 10878982;BA.debugLine="If m.IsSwiped = False Then";
if (_m.IsSwiped /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=10878983;
 //BA.debugLineNum = 10878983;BA.debugLine="If m.Actions.IsInitialized And m.Actions.Size >";
if (_m.Actions /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized() && _m.Actions /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=10878984;
 //BA.debugLineNum = 10878984;BA.debugLine="m.IsSwiped = True";
_m.IsSwiped /*boolean*/  = __c.True;
RDebugUtils.currentLine=10878985;
 //BA.debugLineNum = 10878985;BA.debugLine="If ActionsPanel.Parent.IsInitialized Then Actio";
if (__ref._actionspanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().IsInitialized()) { 
__ref._actionspanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();};
RDebugUtils.currentLine=10878986;
 //BA.debugLineNum = 10878986;BA.debugLine="aItem.Panel.Parent.AddView(ActionsPanel, 0, aIt";
_aitem.Panel.getParent().AddView((android.view.View)(__ref._actionspanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),_aitem.Panel.getTop(),_aitem.Panel.getWidth(),_aitem.Panel.getHeight());
RDebugUtils.currentLine=10878987;
 //BA.debugLineNum = 10878987;BA.debugLine="ActionsPanel.SendToBack";
__ref._actionspanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SendToBack();
RDebugUtils.currentLine=10878988;
 //BA.debugLineNum = 10878988;BA.debugLine="m.MaxSwipe = CreateActionButtons(m.Actions)";
_m.MaxSwipe /*int*/  = __ref._createactionbuttons /*int*/ (null,_m.Actions /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=10878989;
 //BA.debugLineNum = 10878989;BA.debugLine="LastSwipedItem = index";
__ref._lastswipeditem /*int*/  = _index;
 }else {
RDebugUtils.currentLine=10878991;
 //BA.debugLineNum = 10878991;BA.debugLine="Return False";
if (true) return __c.False;
 };
 };
RDebugUtils.currentLine=10878994;
 //BA.debugLineNum = 10878994;BA.debugLine="Dim NewLeft As Int = Max(Min(aItem.Panel.Left + d";
_newleft = (int) (__c.Max(__c.Min(_aitem.Panel.getLeft()+_dx,0),-_m.MaxSwipe /*int*/ ));
RDebugUtils.currentLine=10878995;
 //BA.debugLineNum = 10878995;BA.debugLine="If complete Then";
if (_complete) { 
RDebugUtils.currentLine=10878996;
 //BA.debugLineNum = 10878996;BA.debugLine="If (m.Open = False And NewLeft >= -40dip) Or (m.";
if ((_m.Open /*boolean*/ ==__c.False && _newleft>=-__c.DipToCurrent((int) (40))) || (_m.Open /*boolean*/ ==__c.True && _newleft>=-_m.MaxSwipe /*int*/ +__c.DipToCurrent((int) (10)))) { 
RDebugUtils.currentLine=10878997;
 //BA.debugLineNum = 10878997;BA.debugLine="aItem.Panel.SetLayoutAnimated(200, 0, aItem.Pan";
_aitem.Panel.SetLayoutAnimated((int) (200),(int) (0),_aitem.Panel.getTop(),_aitem.Panel.getWidth(),_aitem.Panel.getHeight());
RDebugUtils.currentLine=10878998;
 //BA.debugLineNum = 10878998;BA.debugLine="m.IsSwiped = False";
_m.IsSwiped /*boolean*/  = __c.False;
RDebugUtils.currentLine=10878999;
 //BA.debugLineNum = 10878999;BA.debugLine="m.Open = False";
_m.Open /*boolean*/  = __c.False;
RDebugUtils.currentLine=10879000;
 //BA.debugLineNum = 10879000;BA.debugLine="ActionsPanel.RemoveViewFromParent";
__ref._actionspanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
 }else {
RDebugUtils.currentLine=10879002;
 //BA.debugLineNum = 10879002;BA.debugLine="aItem.Panel.SetLayoutAnimated(200, -m.MaxSwipe,";
_aitem.Panel.SetLayoutAnimated((int) (200),(int) (-_m.MaxSwipe /*int*/ ),_aitem.Panel.getTop(),_aitem.Panel.getWidth(),_aitem.Panel.getHeight());
RDebugUtils.currentLine=10879003;
 //BA.debugLineNum = 10879003;BA.debugLine="m.Open = True";
_m.Open /*boolean*/  = __c.True;
 };
 }else {
RDebugUtils.currentLine=10879007;
 //BA.debugLineNum = 10879007;BA.debugLine="aItem.Panel.Left = NewLeft";
_aitem.Panel.setLeft(_newleft);
 };
RDebugUtils.currentLine=10879009;
 //BA.debugLineNum = 10879009;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=10879010;
 //BA.debugLineNum = 10879010;BA.debugLine="End Sub";
return false;
}
public int  _createactionbuttons(b4a.spotify.top200.clvswipe __ref,anywheresoftware.b4a.objects.collections.List _actions) throws Exception{
__ref = this;
RDebugUtils.currentModule="clvswipe";
if (Debug.shouldDelegate(ba, "createactionbuttons", false))
	 {return ((Integer) Debug.delegate(ba, "createactionbuttons", new Object[] {_actions}));}
int _lastx = 0;
String _action = "";
anywheresoftware.b4a.objects.LabelWrapper _l = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
int _width = 0;
RDebugUtils.currentLine=11206656;
 //BA.debugLineNum = 11206656;BA.debugLine="Private Sub CreateActionButtons (actions As List)";
RDebugUtils.currentLine=11206657;
 //BA.debugLineNum = 11206657;BA.debugLine="ActionsPanel.RemoveAllViews";
__ref._actionspanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveAllViews();
RDebugUtils.currentLine=11206658;
 //BA.debugLineNum = 11206658;BA.debugLine="Dim LastX As Int = 0";
_lastx = (int) (0);
RDebugUtils.currentLine=11206659;
 //BA.debugLineNum = 11206659;BA.debugLine="For Each action As String In actions";
{
final anywheresoftware.b4a.BA.IterableList group3 = _actions;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_action = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=11206660;
 //BA.debugLineNum = 11206660;BA.debugLine="Dim l As Label";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=11206661;
 //BA.debugLineNum = 11206661;BA.debugLine="l.Initialize(\"lbl\")";
_l.Initialize(ba,"lbl");
RDebugUtils.currentLine=11206662;
 //BA.debugLineNum = 11206662;BA.debugLine="Dim xlbl As B4XView = l";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_l.getObject()));
RDebugUtils.currentLine=11206663;
 //BA.debugLineNum = 11206663;BA.debugLine="xlbl.Text = action";
_xlbl.setText(BA.ObjectToCharSequence(_action));
RDebugUtils.currentLine=11206664;
 //BA.debugLineNum = 11206664;BA.debugLine="xlbl.Color = ActionColors.GetDefault(action, xui";
_xlbl.setColor((int)(BA.ObjectToNumber(__ref._actioncolors /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(_action),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White)))));
RDebugUtils.currentLine=11206665;
 //BA.debugLineNum = 11206665;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
_xlbl.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=11206666;
 //BA.debugLineNum = 11206666;BA.debugLine="xlbl.Font = xui.CreateDefaultBoldFont(20)";
_xlbl.setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (20)));
RDebugUtils.currentLine=11206667;
 //BA.debugLineNum = 11206667;BA.debugLine="xlbl.TextColor = xui.Color_Black";
_xlbl.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black);
RDebugUtils.currentLine=11206668;
 //BA.debugLineNum = 11206668;BA.debugLine="Dim width As Int = Max(40dip, cvs.MeasureText(ac";
_width = (int) (__c.Max(__c.DipToCurrent((int) (40)),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .MeasureText(_action,_xlbl.getFont()).getWidth()+__c.DipToCurrent((int) (20))));
RDebugUtils.currentLine=11206669;
 //BA.debugLineNum = 11206669;BA.debugLine="ActionsPanel.AddView(xlbl, ActionsPanel.Width -";
__ref._actionspanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_xlbl.getObject()),(int) (__ref._actionspanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-_width-_lastx),(int) (0),_width,__ref._actionspanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=11206670;
 //BA.debugLineNum = 11206670;BA.debugLine="LastX = LastX + width";
_lastx = (int) (_lastx+_width);
 }
};
RDebugUtils.currentLine=11206672;
 //BA.debugLineNum = 11206672;BA.debugLine="Return LastX";
if (true) return _lastx;
RDebugUtils.currentLine=11206673;
 //BA.debugLineNum = 11206673;BA.debugLine="End Sub";
return 0;
}
public String  _changeyoffset(b4a.spotify.top200.clvswipe __ref,int _dy,boolean _complete) throws Exception{
__ref = this;
RDebugUtils.currentModule="clvswipe";
if (Debug.shouldDelegate(ba, "changeyoffset", false))
	 {return ((String) Debug.delegate(ba, "changeyoffset", new Object[] {_dy,_complete}));}
int _newtop = 0;
RDebugUtils.currentLine=10944512;
 //BA.debugLineNum = 10944512;BA.debugLine="Private Sub ChangeYOffset(dy As Int, complete As B";
RDebugUtils.currentLine=10944513;
 //BA.debugLineNum = 10944513;BA.debugLine="If WaitingForRefreshToComplete Then Return";
if (__ref._waitingforrefreshtocomplete /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=10944514;
 //BA.debugLineNum = 10944514;BA.debugLine="Dim NewTop As Int = Min(Max(mCLV.AsView.Top + dy,";
_newtop = (int) (__c.Min(__c.Max(__ref._mclv /*b4a.example3.customlistview*/ ._asview().getTop()+_dy,0),__ref._mpulltorefreshpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
RDebugUtils.currentLine=10944515;
 //BA.debugLineNum = 10944515;BA.debugLine="mCLV.AsView.Top = NewTop";
__ref._mclv /*b4a.example3.customlistview*/ ._asview().setTop(_newtop);
RDebugUtils.currentLine=10944516;
 //BA.debugLineNum = 10944516;BA.debugLine="If NewTop = mPullToRefreshPanel.Height Then";
if (_newtop==__ref._mpulltorefreshpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()) { 
RDebugUtils.currentLine=10944517;
 //BA.debugLineNum = 10944517;BA.debugLine="RaiseRefreshEvent";
__ref._raiserefreshevent /*String*/ (null);
 };
RDebugUtils.currentLine=10944519;
 //BA.debugLineNum = 10944519;BA.debugLine="If complete Then";
if (_complete) { 
RDebugUtils.currentLine=10944520;
 //BA.debugLineNum = 10944520;BA.debugLine="mCLV.AsView.SetLayoutAnimated(200, 0, 0, mCLV.As";
__ref._mclv /*b4a.example3.customlistview*/ ._asview().SetLayoutAnimated((int) (200),(int) (0),(int) (0),__ref._mclv /*b4a.example3.customlistview*/ ._asview().getWidth(),__ref._mclv /*b4a.example3.customlistview*/ ._asview().getHeight());
 };
RDebugUtils.currentLine=10944522;
 //BA.debugLineNum = 10944522;BA.debugLine="End Sub";
return "";
}
public String  _raiserefreshevent(b4a.spotify.top200.clvswipe __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clvswipe";
if (Debug.shouldDelegate(ba, "raiserefreshevent", false))
	 {return ((String) Debug.delegate(ba, "raiserefreshevent", null));}
RDebugUtils.currentLine=11010048;
 //BA.debugLineNum = 11010048;BA.debugLine="Private Sub RaiseRefreshEvent";
RDebugUtils.currentLine=11010049;
 //BA.debugLineNum = 11010049;BA.debugLine="WaitingForRefreshToComplete = True";
__ref._waitingforrefreshtocomplete /*boolean*/  = __c.True;
RDebugUtils.currentLine=11010050;
 //BA.debugLineNum = 11010050;BA.debugLine="HandlingSwipe = False";
__ref._handlingswipe /*boolean*/  = __c.False;
RDebugUtils.currentLine=11010051;
 //BA.debugLineNum = 11010051;BA.debugLine="CallSub(mCallback, mEventName & \"_RefreshRequeste";
__c.CallSubNew(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_RefreshRequested");
RDebugUtils.currentLine=11010052;
 //BA.debugLineNum = 11010052;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.spotify.top200.clvswipe __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clvswipe";
RDebugUtils.currentLine=10682368;
 //BA.debugLineNum = 10682368;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=10682369;
 //BA.debugLineNum = 10682369;BA.debugLine="Private mCLV As CustomListView";
_mclv = new b4a.example3.customlistview();
RDebugUtils.currentLine=10682370;
 //BA.debugLineNum = 10682370;BA.debugLine="Type SwipeItem (Value As Object, Actions As List,";
;
RDebugUtils.currentLine=10682371;
 //BA.debugLineNum = 10682371;BA.debugLine="Public Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=10682372;
 //BA.debugLineNum = 10682372;BA.debugLine="Private TouchXStart, TouchYStart As Float";
_touchxstart = 0f;
_touchystart = 0f;
RDebugUtils.currentLine=10682373;
 //BA.debugLineNum = 10682373;BA.debugLine="Private HandlingSwipe As Boolean";
_handlingswipe = false;
RDebugUtils.currentLine=10682374;
 //BA.debugLineNum = 10682374;BA.debugLine="Private ActionsPanel As B4XView";
_actionspanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=10682375;
 //BA.debugLineNum = 10682375;BA.debugLine="Private LastSwipedItem As Int = -1";
_lastswipeditem = (int) (-1);
RDebugUtils.currentLine=10682376;
 //BA.debugLineNum = 10682376;BA.debugLine="Public ActionColors As Map";
_actioncolors = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=10682377;
 //BA.debugLineNum = 10682377;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=10682378;
 //BA.debugLineNum = 10682378;BA.debugLine="Private cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=10682379;
 //BA.debugLineNum = 10682379;BA.debugLine="Private mCallback As Object";
_mcallback = new Object();
RDebugUtils.currentLine=10682380;
 //BA.debugLineNum = 10682380;BA.debugLine="Private mEventName As String";
_meventname = "";
RDebugUtils.currentLine=10682381;
 //BA.debugLineNum = 10682381;BA.debugLine="Private mPullToRefreshPanel As B4XView";
_mpulltorefreshpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=10682382;
 //BA.debugLineNum = 10682382;BA.debugLine="Private PullToRefreshSwipe As Boolean 'ignore";
_pulltorefreshswipe = false;
RDebugUtils.currentLine=10682383;
 //BA.debugLineNum = 10682383;BA.debugLine="Private WaitingForRefreshToComplete As Boolean";
_waitingforrefreshtocomplete = false;
RDebugUtils.currentLine=10682385;
 //BA.debugLineNum = 10682385;BA.debugLine="Private mScrollingDisabled As Boolean";
_mscrollingdisabled = false;
RDebugUtils.currentLine=10682387;
 //BA.debugLineNum = 10682387;BA.debugLine="End Sub";
return "";
}
public String  _closelastswiped(b4a.spotify.top200.clvswipe __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clvswipe";
if (Debug.shouldDelegate(ba, "closelastswiped", false))
	 {return ((String) Debug.delegate(ba, "closelastswiped", null));}
RDebugUtils.currentLine=11337728;
 //BA.debugLineNum = 11337728;BA.debugLine="Public Sub CloseLastSwiped";
RDebugUtils.currentLine=11337729;
 //BA.debugLineNum = 11337729;BA.debugLine="ChangeOffset(LastSwipedItem, 10000dip, True)";
__ref._changeoffset /*boolean*/ (null,__ref._lastswipeditem /*int*/ ,__c.DipToCurrent((int) (10000)),__c.True);
RDebugUtils.currentLine=11337730;
 //BA.debugLineNum = 11337730;BA.debugLine="LastSwipedItem = -1";
__ref._lastswipeditem /*int*/  = (int) (-1);
RDebugUtils.currentLine=11337731;
 //BA.debugLineNum = 11337731;BA.debugLine="End Sub";
return "";
}
public b4a.spotify.top200.clvswipe._swipeitem  _createitemvalue(b4a.spotify.top200.clvswipe __ref,Object _value,anywheresoftware.b4a.objects.collections.List _actions) throws Exception{
__ref = this;
RDebugUtils.currentModule="clvswipe";
if (Debug.shouldDelegate(ba, "createitemvalue", false))
	 {return ((b4a.spotify.top200.clvswipe._swipeitem) Debug.delegate(ba, "createitemvalue", new Object[] {_value,_actions}));}
b4a.spotify.top200.clvswipe._swipeitem _m = null;
RDebugUtils.currentLine=10813440;
 //BA.debugLineNum = 10813440;BA.debugLine="Public Sub CreateItemValue(Value As Object, Action";
RDebugUtils.currentLine=10813441;
 //BA.debugLineNum = 10813441;BA.debugLine="Dim m As SwipeItem";
_m = new b4a.spotify.top200.clvswipe._swipeitem();
RDebugUtils.currentLine=10813442;
 //BA.debugLineNum = 10813442;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=10813443;
 //BA.debugLineNum = 10813443;BA.debugLine="m.Value = Value";
_m.Value /*Object*/  = _value;
RDebugUtils.currentLine=10813444;
 //BA.debugLineNum = 10813444;BA.debugLine="m.Actions = Actions";
_m.Actions /*anywheresoftware.b4a.objects.collections.List*/  = _actions;
RDebugUtils.currentLine=10813445;
 //BA.debugLineNum = 10813445;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=10813446;
 //BA.debugLineNum = 10813446;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpulltorefreshpanel(b4a.spotify.top200.clvswipe __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clvswipe";
if (Debug.shouldDelegate(ba, "getpulltorefreshpanel", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getpulltorefreshpanel", null));}
RDebugUtils.currentLine=11534336;
 //BA.debugLineNum = 11534336;BA.debugLine="Public Sub getPullToRefreshPanel As B4XView";
RDebugUtils.currentLine=11534337;
 //BA.debugLineNum = 11534337;BA.debugLine="Return mPullToRefreshPanel";
if (true) return __ref._mpulltorefreshpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=11534338;
 //BA.debugLineNum = 11534338;BA.debugLine="End Sub";
return null;
}
public boolean  _getscrollingenabled(b4a.spotify.top200.clvswipe __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clvswipe";
if (Debug.shouldDelegate(ba, "getscrollingenabled", false))
	 {return ((Boolean) Debug.delegate(ba, "getscrollingenabled", null));}
RDebugUtils.currentLine=11599872;
 //BA.debugLineNum = 11599872;BA.debugLine="Public Sub getScrollingEnabled As Boolean";
RDebugUtils.currentLine=11599873;
 //BA.debugLineNum = 11599873;BA.debugLine="Return Not(mScrollingDisabled)";
if (true) return __c.Not(__ref._mscrollingdisabled /*boolean*/ );
RDebugUtils.currentLine=11599874;
 //BA.debugLineNum = 11599874;BA.debugLine="End Sub";
return false;
}
public String  _lbl_click(b4a.spotify.top200.clvswipe __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clvswipe";
if (Debug.shouldDelegate(ba, "lbl_click", false))
	 {return ((String) Debug.delegate(ba, "lbl_click", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
int _index = 0;
RDebugUtils.currentLine=11272192;
 //BA.debugLineNum = 11272192;BA.debugLine="Private Sub Lbl_Click";
RDebugUtils.currentLine=11272193;
 //BA.debugLineNum = 11272193;BA.debugLine="Dim lbl As B4XView = Sender";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=11272194;
 //BA.debugLineNum = 11272194;BA.debugLine="Dim index As Int = LastSwipedItem";
_index = __ref._lastswipeditem /*int*/ ;
RDebugUtils.currentLine=11272195;
 //BA.debugLineNum = 11272195;BA.debugLine="CloseLastSwiped";
__ref._closelastswiped /*String*/ (null);
RDebugUtils.currentLine=11272196;
 //BA.debugLineNum = 11272196;BA.debugLine="CallSub3(mCallback, mEventName & \"_ActionClicked\"";
__c.CallSubNew3(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ActionClicked",(Object)(_index),(Object)(_lbl.getText()));
RDebugUtils.currentLine=11272197;
 //BA.debugLineNum = 11272197;BA.debugLine="End Sub";
return "";
}
public String  _resize(b4a.spotify.top200.clvswipe __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="clvswipe";
if (Debug.shouldDelegate(ba, "resize", false))
	 {return ((String) Debug.delegate(ba, "resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=11403264;
 //BA.debugLineNum = 11403264;BA.debugLine="Public Sub Resize(Width As Int, Height As Int)";
RDebugUtils.currentLine=11403265;
 //BA.debugLineNum = 11403265;BA.debugLine="CloseLastSwiped";
__ref._closelastswiped /*String*/ (null);
RDebugUtils.currentLine=11403266;
 //BA.debugLineNum = 11403266;BA.debugLine="ActionsPanel.Width = Width";
__ref._actionspanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(_width);
RDebugUtils.currentLine=11403267;
 //BA.debugLineNum = 11403267;BA.debugLine="Base.SetLayoutAnimated(0, Base.Left, Base.Top, Wi";
__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft(),__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop(),_width,_height);
RDebugUtils.currentLine=11403268;
 //BA.debugLineNum = 11403268;BA.debugLine="If mPullToRefreshPanel.IsInitialized Then";
if (__ref._mpulltorefreshpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=11403269;
 //BA.debugLineNum = 11403269;BA.debugLine="mPullToRefreshPanel.SetLayoutAnimated(0, 0, 0, W";
__ref._mpulltorefreshpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),_width,__ref._mpulltorefreshpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 };
RDebugUtils.currentLine=11403271;
 //BA.debugLineNum = 11403271;BA.debugLine="End Sub";
return "";
}
public String  _scrollchanged(b4a.spotify.top200.clvswipe __ref,int _offset) throws Exception{
__ref = this;
RDebugUtils.currentModule="clvswipe";
if (Debug.shouldDelegate(ba, "scrollchanged", false))
	 {return ((String) Debug.delegate(ba, "scrollchanged", new Object[] {_offset}));}
RDebugUtils.currentLine=11075584;
 //BA.debugLineNum = 11075584;BA.debugLine="Public Sub ScrollChanged (offset As Int)";
RDebugUtils.currentLine=11075606;
 //BA.debugLineNum = 11075606;BA.debugLine="End Sub";
return "";
}
public String  _setscrollingenabled(b4a.spotify.top200.clvswipe __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="clvswipe";
if (Debug.shouldDelegate(ba, "setscrollingenabled", false))
	 {return ((String) Debug.delegate(ba, "setscrollingenabled", new Object[] {_b}));}
RDebugUtils.currentLine=11665408;
 //BA.debugLineNum = 11665408;BA.debugLine="Public Sub setScrollingEnabled (b As Boolean)";
RDebugUtils.currentLine=11665409;
 //BA.debugLineNum = 11665409;BA.debugLine="mScrollingDisabled = Not(b)";
__ref._mscrollingdisabled /*boolean*/  = __c.Not(_b);
RDebugUtils.currentLine=11665410;
 //BA.debugLineNum = 11665410;BA.debugLine="End Sub";
return "";
}
public boolean  _touchpanel_onintercepttouchevent(b4a.spotify.top200.clvswipe __ref,int _action,float _x,float _y,Object _motionevent) throws Exception{
__ref = this;
RDebugUtils.currentModule="clvswipe";
if (Debug.shouldDelegate(ba, "touchpanel_onintercepttouchevent", false))
	 {return ((Boolean) Debug.delegate(ba, "touchpanel_onintercepttouchevent", new Object[] {_action,_x,_y,_motionevent}));}
float _dx = 0f;
float _dy = 0f;
int _newswipeitem = 0;
RDebugUtils.currentLine=11730944;
 //BA.debugLineNum = 11730944;BA.debugLine="Private Sub TouchPanel_OnInterceptTouchEvent (Acti";
RDebugUtils.currentLine=11730945;
 //BA.debugLineNum = 11730945;BA.debugLine="If mScrollingDisabled Or HandlingSwipe Or Waiting";
if (__ref._mscrollingdisabled /*boolean*/  || __ref._handlingswipe /*boolean*/  || __ref._waitingforrefreshtocomplete /*boolean*/ ) { 
if (true) return __c.True;};
RDebugUtils.currentLine=11730946;
 //BA.debugLineNum = 11730946;BA.debugLine="Select Action";
switch (BA.switchObjectToInt(_action,__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_DOWN,__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_MOVE)) {
case 0: {
RDebugUtils.currentLine=11730948;
 //BA.debugLineNum = 11730948;BA.debugLine="TouchXStart = X";
__ref._touchxstart /*float*/  = _x;
RDebugUtils.currentLine=11730949;
 //BA.debugLineNum = 11730949;BA.debugLine="TouchYStart = Y";
__ref._touchystart /*float*/  = _y;
RDebugUtils.currentLine=11730950;
 //BA.debugLineNum = 11730950;BA.debugLine="HandlingSwipe = False";
__ref._handlingswipe /*boolean*/  = __c.False;
 break; }
case 1: {
RDebugUtils.currentLine=11730952;
 //BA.debugLineNum = 11730952;BA.debugLine="Dim dx As Float = Abs(x - TouchXStart)";
_dx = (float) (__c.Abs(_x-__ref._touchxstart /*float*/ ));
RDebugUtils.currentLine=11730953;
 //BA.debugLineNum = 11730953;BA.debugLine="Dim dy As Float = Abs(y - TouchYStart)";
_dy = (float) (__c.Abs(_y-__ref._touchystart /*float*/ ));
RDebugUtils.currentLine=11730954;
 //BA.debugLineNum = 11730954;BA.debugLine="If mPullToRefreshPanel.IsInitialized And mCLV.s";
if (__ref._mpulltorefreshpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized() && __ref._mclv /*b4a.example3.customlistview*/ ._sv.getScrollViewOffsetY()==0 && _y-__ref._touchystart /*float*/ >__c.DipToCurrent((int) (3))) { 
RDebugUtils.currentLine=11730955;
 //BA.debugLineNum = 11730955;BA.debugLine="HandlingSwipe = True";
__ref._handlingswipe /*boolean*/  = __c.True;
RDebugUtils.currentLine=11730956;
 //BA.debugLineNum = 11730956;BA.debugLine="PullToRefreshSwipe = True";
__ref._pulltorefreshswipe /*boolean*/  = __c.True;
RDebugUtils.currentLine=11730957;
 //BA.debugLineNum = 11730957;BA.debugLine="mPullToRefreshPanel.Visible = True";
__ref._mpulltorefreshpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=11730958;
 //BA.debugLineNum = 11730958;BA.debugLine="CloseLastSwiped";
__ref._closelastswiped /*String*/ (null);
 }else 
{RDebugUtils.currentLine=11730959;
 //BA.debugLineNum = 11730959;BA.debugLine="Else If dy < 20dip And dx > 10dip And mCLV.Size";
if (_dy<__c.DipToCurrent((int) (20)) && _dx>__c.DipToCurrent((int) (10)) && __ref._mclv /*b4a.example3.customlistview*/ ._getsize()>0) { 
RDebugUtils.currentLine=11730960;
 //BA.debugLineNum = 11730960;BA.debugLine="If HandlingSwipe = False Then";
if (__ref._handlingswipe /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=11730961;
 //BA.debugLineNum = 11730961;BA.debugLine="Dim NewSwipeItem As Int = mCLV.FindIndexFromO";
_newswipeitem = __ref._mclv /*b4a.example3.customlistview*/ ._findindexfromoffset((int) (__ref._touchystart /*float*/ +__ref._mclv /*b4a.example3.customlistview*/ ._sv.getScrollViewOffsetY()));
RDebugUtils.currentLine=11730962;
 //BA.debugLineNum = 11730962;BA.debugLine="If NewSwipeItem <> LastSwipedItem Then CloseL";
if (_newswipeitem!=__ref._lastswipeditem /*int*/ ) { 
__ref._closelastswiped /*String*/ (null);};
RDebugUtils.currentLine=11730963;
 //BA.debugLineNum = 11730963;BA.debugLine="LastSwipedItem = NewSwipeItem";
__ref._lastswipeditem /*int*/  = _newswipeitem;
 };
RDebugUtils.currentLine=11730965;
 //BA.debugLineNum = 11730965;BA.debugLine="HandlingSwipe = True";
__ref._handlingswipe /*boolean*/  = __c.True;
RDebugUtils.currentLine=11730966;
 //BA.debugLineNum = 11730966;BA.debugLine="PullToRefreshSwipe = False";
__ref._pulltorefreshswipe /*boolean*/  = __c.False;
 }}
;
 break; }
}
;
RDebugUtils.currentLine=11730969;
 //BA.debugLineNum = 11730969;BA.debugLine="Return HandlingSwipe";
if (true) return __ref._handlingswipe /*boolean*/ ;
RDebugUtils.currentLine=11730970;
 //BA.debugLineNum = 11730970;BA.debugLine="End Sub";
return false;
}
public boolean  _touchpanel_ontouchevent(b4a.spotify.top200.clvswipe __ref,int _action,float _x,float _y,Object _motionevent) throws Exception{
__ref = this;
RDebugUtils.currentModule="clvswipe";
if (Debug.shouldDelegate(ba, "touchpanel_ontouchevent", false))
	 {return ((Boolean) Debug.delegate(ba, "touchpanel_ontouchevent", new Object[] {_action,_x,_y,_motionevent}));}
float _dy = 0f;
float _dx = 0f;
RDebugUtils.currentLine=11796480;
 //BA.debugLineNum = 11796480;BA.debugLine="Private Sub TouchPanel_OnTouchEvent (Action As Int";
RDebugUtils.currentLine=11796481;
 //BA.debugLineNum = 11796481;BA.debugLine="If mScrollingDisabled Or HandlingSwipe = False Or";
if (__ref._mscrollingdisabled /*boolean*/  || __ref._handlingswipe /*boolean*/ ==__c.False || __ref._waitingforrefreshtocomplete /*boolean*/ ) { 
if (true) return __c.True;};
RDebugUtils.currentLine=11796482;
 //BA.debugLineNum = 11796482;BA.debugLine="If PullToRefreshSwipe Then";
if (__ref._pulltorefreshswipe /*boolean*/ ) { 
RDebugUtils.currentLine=11796483;
 //BA.debugLineNum = 11796483;BA.debugLine="Select Action";
switch (BA.switchObjectToInt(_action,__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_MOVE,__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_UP)) {
case 0: {
RDebugUtils.currentLine=11796485;
 //BA.debugLineNum = 11796485;BA.debugLine="Dim dy As Float = y - TouchYStart";
_dy = (float) (_y-__ref._touchystart /*float*/ );
RDebugUtils.currentLine=11796486;
 //BA.debugLineNum = 11796486;BA.debugLine="TouchYStart = Y";
__ref._touchystart /*float*/  = _y;
RDebugUtils.currentLine=11796487;
 //BA.debugLineNum = 11796487;BA.debugLine="ChangeYOffset(dy, False)";
__ref._changeyoffset /*String*/ (null,(int) (_dy),__c.False);
 break; }
case 1: {
RDebugUtils.currentLine=11796489;
 //BA.debugLineNum = 11796489;BA.debugLine="ChangeYOffset(dy, True)";
__ref._changeyoffset /*String*/ (null,(int) (_dy),__c.True);
RDebugUtils.currentLine=11796490;
 //BA.debugLineNum = 11796490;BA.debugLine="HandlingSwipe = False";
__ref._handlingswipe /*boolean*/  = __c.False;
 break; }
}
;
 }else {
RDebugUtils.currentLine=11796493;
 //BA.debugLineNum = 11796493;BA.debugLine="Select Action";
switch (BA.switchObjectToInt(_action,__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_MOVE,__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_UP)) {
case 0: {
RDebugUtils.currentLine=11796495;
 //BA.debugLineNum = 11796495;BA.debugLine="Dim dx As Float = x - TouchXStart";
_dx = (float) (_x-__ref._touchxstart /*float*/ );
RDebugUtils.currentLine=11796496;
 //BA.debugLineNum = 11796496;BA.debugLine="TouchXStart = X";
__ref._touchxstart /*float*/  = _x;
RDebugUtils.currentLine=11796497;
 //BA.debugLineNum = 11796497;BA.debugLine="HandlingSwipe = ChangeOffset(LastSwipedItem, d";
__ref._handlingswipe /*boolean*/  = __ref._changeoffset /*boolean*/ (null,__ref._lastswipeditem /*int*/ ,(int) (_dx),__c.False);
 break; }
case 1: {
RDebugUtils.currentLine=11796499;
 //BA.debugLineNum = 11796499;BA.debugLine="ChangeOffset(LastSwipedItem, 0, True)";
__ref._changeoffset /*boolean*/ (null,__ref._lastswipeditem /*int*/ ,(int) (0),__c.True);
RDebugUtils.currentLine=11796500;
 //BA.debugLineNum = 11796500;BA.debugLine="HandlingSwipe = False";
__ref._handlingswipe /*boolean*/  = __c.False;
 break; }
}
;
 };
RDebugUtils.currentLine=11796503;
 //BA.debugLineNum = 11796503;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=11796504;
 //BA.debugLineNum = 11796504;BA.debugLine="End Sub";
return false;
}
}