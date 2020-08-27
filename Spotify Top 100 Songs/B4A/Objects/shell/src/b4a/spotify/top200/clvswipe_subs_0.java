package b4a.spotify.top200;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class clvswipe_subs_0 {


public static RemoteObject  _changeoffset(RemoteObject __ref,RemoteObject _index,RemoteObject _dx,RemoteObject _complete) throws Exception{
try {
		Debug.PushSubsStack("ChangeOffset (clvswipe) ","clvswipe",3,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("changeoffset")) { return __ref.runUserSub(false, "clvswipe","changeoffset", __ref, _index, _dx, _complete);}
RemoteObject _aitem = RemoteObject.declareNull("b4a.example3.customlistview._clvitem");
RemoteObject _m = RemoteObject.declareNull("b4a.spotify.top200.clvswipe._swipeitem");
RemoteObject _newleft = RemoteObject.createImmutable(0);
Debug.locals.put("index", _index);
Debug.locals.put("dx", _dx);
Debug.locals.put("complete", _complete);
 BA.debugLineNum = 57;BA.debugLine="Private Sub ChangeOffset(index As Int, dx As Int,";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="If index < 0 Or index >= mCLV.Size Then Return Fa";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("<",_index,BA.numberCast(int.class, 0)) || RemoteObject.solveBoolean("g",_index,__ref.getField(false,"_mclv" /*RemoteObject*/ ).runMethod(true,"_getsize"))) { 
if (true) return clvswipe.__c.getField(true,"False");};
 BA.debugLineNum = 59;BA.debugLine="Dim aItem As CLVItem = mCLV.GetRawListItem(index)";
Debug.ShouldStop(67108864);
_aitem = __ref.getField(false,"_mclv" /*RemoteObject*/ ).runMethod(false,"_getrawlistitem",(Object)(_index));Debug.locals.put("aItem", _aitem);Debug.locals.put("aItem", _aitem);
 BA.debugLineNum = 60;BA.debugLine="If Not(aItem.Value Is SwipeItem) Then Return Fals";
Debug.ShouldStop(134217728);
if (clvswipe.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("i",_aitem.getField(false,"Value"), RemoteObject.createImmutable("b4a.spotify.top200.clvswipe._swipeitem"))))).<Boolean>get().booleanValue()) { 
if (true) return clvswipe.__c.getField(true,"False");};
 BA.debugLineNum = 61;BA.debugLine="Dim m As SwipeItem = aItem.Value";
Debug.ShouldStop(268435456);
_m = (_aitem.getField(false,"Value"));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 62;BA.debugLine="If m.IsSwiped = False And complete = True Then Re";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_m.getField(true,"IsSwiped" /*RemoteObject*/ ),clvswipe.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",_complete,clvswipe.__c.getField(true,"True"))) { 
if (true) return clvswipe.__c.getField(true,"False");};
 BA.debugLineNum = 63;BA.debugLine="If m.IsSwiped = False Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_m.getField(true,"IsSwiped" /*RemoteObject*/ ),clvswipe.__c.getField(true,"False"))) { 
 BA.debugLineNum = 64;BA.debugLine="If m.Actions.IsInitialized And m.Actions.Size >";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean(".",_m.getField(false,"Actions" /*RemoteObject*/ ).runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(">",_m.getField(false,"Actions" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(int.class, 0))) { 
 BA.debugLineNum = 65;BA.debugLine="m.IsSwiped = True";
Debug.ShouldStop(1);
_m.setField ("IsSwiped" /*RemoteObject*/ ,clvswipe.__c.getField(true,"True"));
 BA.debugLineNum = 66;BA.debugLine="If ActionsPanel.Parent.IsInitialized Then Actio";
Debug.ShouldStop(2);
if (__ref.getField(false,"_actionspanel" /*RemoteObject*/ ).runMethod(false,"getParent").runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
__ref.getField(false,"_actionspanel" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");};
 BA.debugLineNum = 67;BA.debugLine="aItem.Panel.Parent.AddView(ActionsPanel, 0, aIt";
Debug.ShouldStop(4);
_aitem.getField(false,"Panel").runMethod(false,"getParent").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_actionspanel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(_aitem.getField(false,"Panel").runMethod(true,"getTop")),(Object)(_aitem.getField(false,"Panel").runMethod(true,"getWidth")),(Object)(_aitem.getField(false,"Panel").runMethod(true,"getHeight")));
 BA.debugLineNum = 68;BA.debugLine="ActionsPanel.SendToBack";
Debug.ShouldStop(8);
__ref.getField(false,"_actionspanel" /*RemoteObject*/ ).runVoidMethod ("SendToBack");
 BA.debugLineNum = 69;BA.debugLine="m.MaxSwipe = CreateActionButtons(m.Actions)";
Debug.ShouldStop(16);
_m.setField ("MaxSwipe" /*RemoteObject*/ ,__ref.runClassMethod (b4a.spotify.top200.clvswipe.class, "_createactionbuttons" /*RemoteObject*/ ,(Object)(_m.getField(false,"Actions" /*RemoteObject*/ ))));
 BA.debugLineNum = 70;BA.debugLine="LastSwipedItem = index";
Debug.ShouldStop(32);
__ref.setField ("_lastswipeditem" /*RemoteObject*/ ,_index);
 }else {
 BA.debugLineNum = 72;BA.debugLine="Return False";
Debug.ShouldStop(128);
if (true) return clvswipe.__c.getField(true,"False");
 };
 };
 BA.debugLineNum = 75;BA.debugLine="Dim NewLeft As Int = Max(Min(aItem.Panel.Left + d";
Debug.ShouldStop(1024);
_newleft = BA.numberCast(int.class, clvswipe.__c.runMethod(true,"Max",(Object)(clvswipe.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_aitem.getField(false,"Panel").runMethod(true,"getLeft"),_dx}, "+",1, 1))),(Object)(BA.numberCast(double.class, 0)))),(Object)(BA.numberCast(double.class, -(double) (0 + _m.getField(true,"MaxSwipe" /*RemoteObject*/ ).<Integer>get().intValue())))));Debug.locals.put("NewLeft", _newleft);Debug.locals.put("NewLeft", _newleft);
 BA.debugLineNum = 76;BA.debugLine="If complete Then";
Debug.ShouldStop(2048);
if (_complete.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 77;BA.debugLine="If (m.Open = False And NewLeft >= -40dip) Or (m.";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_m.getField(true,"Open" /*RemoteObject*/ ),clvswipe.__c.getField(true,"False")) && RemoteObject.solveBoolean("g",_newleft,BA.numberCast(int.class, -(double) (0 + clvswipe.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40))).<Integer>get().intValue())))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_m.getField(true,"Open" /*RemoteObject*/ ),clvswipe.__c.getField(true,"True")) && RemoteObject.solveBoolean("g",_newleft,BA.numberCast(int.class, -(double) (0 + _m.getField(true,"MaxSwipe" /*RemoteObject*/ ).<Integer>get().intValue())+(double) (0 + clvswipe.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10))).<Integer>get().intValue()))))))) { 
 BA.debugLineNum = 78;BA.debugLine="aItem.Panel.SetLayoutAnimated(200, 0, aItem.Pan";
Debug.ShouldStop(8192);
_aitem.getField(false,"Panel").runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(int.class, 0)),(Object)(_aitem.getField(false,"Panel").runMethod(true,"getTop")),(Object)(_aitem.getField(false,"Panel").runMethod(true,"getWidth")),(Object)(_aitem.getField(false,"Panel").runMethod(true,"getHeight")));
 BA.debugLineNum = 79;BA.debugLine="m.IsSwiped = False";
Debug.ShouldStop(16384);
_m.setField ("IsSwiped" /*RemoteObject*/ ,clvswipe.__c.getField(true,"False"));
 BA.debugLineNum = 80;BA.debugLine="m.Open = False";
Debug.ShouldStop(32768);
_m.setField ("Open" /*RemoteObject*/ ,clvswipe.__c.getField(true,"False"));
 BA.debugLineNum = 81;BA.debugLine="ActionsPanel.RemoveViewFromParent";
Debug.ShouldStop(65536);
__ref.getField(false,"_actionspanel" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");
 }else {
 BA.debugLineNum = 83;BA.debugLine="aItem.Panel.SetLayoutAnimated(200, -m.MaxSwipe,";
Debug.ShouldStop(262144);
_aitem.getField(false,"Panel").runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(int.class, -(double) (0 + _m.getField(true,"MaxSwipe" /*RemoteObject*/ ).<Integer>get().intValue()))),(Object)(_aitem.getField(false,"Panel").runMethod(true,"getTop")),(Object)(_aitem.getField(false,"Panel").runMethod(true,"getWidth")),(Object)(_aitem.getField(false,"Panel").runMethod(true,"getHeight")));
 BA.debugLineNum = 84;BA.debugLine="m.Open = True";
Debug.ShouldStop(524288);
_m.setField ("Open" /*RemoteObject*/ ,clvswipe.__c.getField(true,"True"));
 };
 }else {
 BA.debugLineNum = 88;BA.debugLine="aItem.Panel.Left = NewLeft";
Debug.ShouldStop(8388608);
_aitem.getField(false,"Panel").runMethod(true,"setLeft",_newleft);
 };
 BA.debugLineNum = 90;BA.debugLine="Return True";
Debug.ShouldStop(33554432);
if (true) return clvswipe.__c.getField(true,"True");
 BA.debugLineNum = 91;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _changeyoffset(RemoteObject __ref,RemoteObject _dy,RemoteObject _complete) throws Exception{
try {
		Debug.PushSubsStack("ChangeYOffset (clvswipe) ","clvswipe",3,__ref.getField(false, "ba"),__ref,93);
if (RapidSub.canDelegate("changeyoffset")) { return __ref.runUserSub(false, "clvswipe","changeyoffset", __ref, _dy, _complete);}
RemoteObject _newtop = RemoteObject.createImmutable(0);
Debug.locals.put("dy", _dy);
Debug.locals.put("complete", _complete);
 BA.debugLineNum = 93;BA.debugLine="Private Sub ChangeYOffset(dy As Int, complete As B";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 94;BA.debugLine="If WaitingForRefreshToComplete Then Return";
Debug.ShouldStop(536870912);
if (__ref.getField(true,"_waitingforrefreshtocomplete" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 95;BA.debugLine="Dim NewTop As Int = Min(Max(mCLV.AsView.Top + dy,";
Debug.ShouldStop(1073741824);
_newtop = BA.numberCast(int.class, clvswipe.__c.runMethod(true,"Min",(Object)(clvswipe.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mclv" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getTop"),_dy}, "+",1, 1))),(Object)(BA.numberCast(double.class, 0)))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_mpulltorefreshpanel" /*RemoteObject*/ ).runMethod(true,"getHeight")))));Debug.locals.put("NewTop", _newtop);Debug.locals.put("NewTop", _newtop);
 BA.debugLineNum = 96;BA.debugLine="mCLV.AsView.Top = NewTop";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_mclv" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"setTop",_newtop);
 BA.debugLineNum = 97;BA.debugLine="If NewTop = mPullToRefreshPanel.Height Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_newtop,__ref.getField(false,"_mpulltorefreshpanel" /*RemoteObject*/ ).runMethod(true,"getHeight"))) { 
 BA.debugLineNum = 98;BA.debugLine="RaiseRefreshEvent";
Debug.ShouldStop(2);
__ref.runClassMethod (b4a.spotify.top200.clvswipe.class, "_raiserefreshevent" /*RemoteObject*/ );
 };
 BA.debugLineNum = 100;BA.debugLine="If complete Then";
Debug.ShouldStop(8);
if (_complete.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 101;BA.debugLine="mCLV.AsView.SetLayoutAnimated(200, 0, 0, mCLV.As";
Debug.ShouldStop(16);
__ref.getField(false,"_mclv" /*RemoteObject*/ ).runMethod(false,"_asview").runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_mclv" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mclv" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getHeight")));
 };
 BA.debugLineNum = 103;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private mCLV As CustomListView";
clvswipe._mclv = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_mclv",clvswipe._mclv);
 //BA.debugLineNum = 7;BA.debugLine="Type SwipeItem (Value As Object, Actions As List,";
;
 //BA.debugLineNum = 8;BA.debugLine="Public Base As B4XView";
clvswipe._base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_base",clvswipe._base);
 //BA.debugLineNum = 9;BA.debugLine="Private TouchXStart, TouchYStart As Float";
clvswipe._touchxstart = RemoteObject.createImmutable(0f);__ref.setField("_touchxstart",clvswipe._touchxstart);
clvswipe._touchystart = RemoteObject.createImmutable(0f);__ref.setField("_touchystart",clvswipe._touchystart);
 //BA.debugLineNum = 10;BA.debugLine="Private HandlingSwipe As Boolean";
clvswipe._handlingswipe = RemoteObject.createImmutable(false);__ref.setField("_handlingswipe",clvswipe._handlingswipe);
 //BA.debugLineNum = 11;BA.debugLine="Private ActionsPanel As B4XView";
clvswipe._actionspanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_actionspanel",clvswipe._actionspanel);
 //BA.debugLineNum = 12;BA.debugLine="Private LastSwipedItem As Int = -1";
clvswipe._lastswipeditem = BA.numberCast(int.class, -(double) (0 + 1));__ref.setField("_lastswipeditem",clvswipe._lastswipeditem);
 //BA.debugLineNum = 13;BA.debugLine="Public ActionColors As Map";
clvswipe._actioncolors = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_actioncolors",clvswipe._actioncolors);
 //BA.debugLineNum = 14;BA.debugLine="Private xui As XUI";
clvswipe._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",clvswipe._xui);
 //BA.debugLineNum = 15;BA.debugLine="Private cvs As B4XCanvas";
clvswipe._cvs = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");__ref.setField("_cvs",clvswipe._cvs);
 //BA.debugLineNum = 16;BA.debugLine="Private mCallback As Object";
clvswipe._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",clvswipe._mcallback);
 //BA.debugLineNum = 17;BA.debugLine="Private mEventName As String";
clvswipe._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",clvswipe._meventname);
 //BA.debugLineNum = 18;BA.debugLine="Private mPullToRefreshPanel As B4XView";
clvswipe._mpulltorefreshpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mpulltorefreshpanel",clvswipe._mpulltorefreshpanel);
 //BA.debugLineNum = 19;BA.debugLine="Private PullToRefreshSwipe As Boolean 'ignore";
clvswipe._pulltorefreshswipe = RemoteObject.createImmutable(false);__ref.setField("_pulltorefreshswipe",clvswipe._pulltorefreshswipe);
 //BA.debugLineNum = 20;BA.debugLine="Private WaitingForRefreshToComplete As Boolean";
clvswipe._waitingforrefreshtocomplete = RemoteObject.createImmutable(false);__ref.setField("_waitingforrefreshtocomplete",clvswipe._waitingforrefreshtocomplete);
 //BA.debugLineNum = 22;BA.debugLine="Private mScrollingDisabled As Boolean";
clvswipe._mscrollingdisabled = RemoteObject.createImmutable(false);__ref.setField("_mscrollingdisabled",clvswipe._mscrollingdisabled);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _closelastswiped(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CloseLastSwiped (clvswipe) ","clvswipe",3,__ref.getField(false, "ba"),__ref,172);
if (RapidSub.canDelegate("closelastswiped")) { return __ref.runUserSub(false, "clvswipe","closelastswiped", __ref);}
 BA.debugLineNum = 172;BA.debugLine="Public Sub CloseLastSwiped";
Debug.ShouldStop(2048);
 BA.debugLineNum = 173;BA.debugLine="ChangeOffset(LastSwipedItem, 10000dip, True)";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4a.spotify.top200.clvswipe.class, "_changeoffset" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_lastswipeditem" /*RemoteObject*/ )),(Object)(clvswipe.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10000)))),(Object)(clvswipe.__c.getField(true,"True")));
 BA.debugLineNum = 174;BA.debugLine="LastSwipedItem = -1";
Debug.ShouldStop(8192);
__ref.setField ("_lastswipeditem" /*RemoteObject*/ ,BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 175;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createactionbuttons(RemoteObject __ref,RemoteObject _actions) throws Exception{
try {
		Debug.PushSubsStack("CreateActionButtons (clvswipe) ","clvswipe",3,__ref.getField(false, "ba"),__ref,146);
if (RapidSub.canDelegate("createactionbuttons")) { return __ref.runUserSub(false, "clvswipe","createactionbuttons", __ref, _actions);}
RemoteObject _lastx = RemoteObject.createImmutable(0);
RemoteObject _action = RemoteObject.createImmutable("");
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _xlbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _width = RemoteObject.createImmutable(0);
Debug.locals.put("actions", _actions);
 BA.debugLineNum = 146;BA.debugLine="Private Sub CreateActionButtons (actions As List)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 147;BA.debugLine="ActionsPanel.RemoveAllViews";
Debug.ShouldStop(262144);
__ref.getField(false,"_actionspanel" /*RemoteObject*/ ).runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 148;BA.debugLine="Dim LastX As Int = 0";
Debug.ShouldStop(524288);
_lastx = BA.numberCast(int.class, 0);Debug.locals.put("LastX", _lastx);Debug.locals.put("LastX", _lastx);
 BA.debugLineNum = 149;BA.debugLine="For Each action As String In actions";
Debug.ShouldStop(1048576);
{
final RemoteObject group3 = _actions;
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_action = BA.ObjectToString(group3.runMethod(false,"Get",index3));Debug.locals.put("action", _action);
Debug.locals.put("action", _action);
 BA.debugLineNum = 150;BA.debugLine="Dim l As Label";
Debug.ShouldStop(2097152);
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("l", _l);
 BA.debugLineNum = 151;BA.debugLine="l.Initialize(\"lbl\")";
Debug.ShouldStop(4194304);
_l.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("lbl")));
 BA.debugLineNum = 152;BA.debugLine="Dim xlbl As B4XView = l";
Debug.ShouldStop(8388608);
_xlbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xlbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _l.getObject());Debug.locals.put("xlbl", _xlbl);
 BA.debugLineNum = 153;BA.debugLine="xlbl.Text = action";
Debug.ShouldStop(16777216);
_xlbl.runMethod(true,"setText",BA.ObjectToCharSequence(_action));
 BA.debugLineNum = 154;BA.debugLine="xlbl.Color = ActionColors.GetDefault(action, xui";
Debug.ShouldStop(33554432);
_xlbl.runMethod(true,"setColor",BA.numberCast(int.class, __ref.getField(false,"_actioncolors" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)((_action)),(Object)((__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"))))));
 BA.debugLineNum = 155;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
Debug.ShouldStop(67108864);
_xlbl.runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 156;BA.debugLine="xlbl.Font = xui.CreateDefaultBoldFont(20)";
Debug.ShouldStop(134217728);
_xlbl.runMethod(false,"setFont",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultBoldFont",(Object)(BA.numberCast(float.class, 20))));
 BA.debugLineNum = 157;BA.debugLine="xlbl.TextColor = xui.Color_Black";
Debug.ShouldStop(268435456);
_xlbl.runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black"));
 BA.debugLineNum = 158;BA.debugLine="Dim width As Int = Max(40dip, cvs.MeasureText(ac";
Debug.ShouldStop(536870912);
_width = BA.numberCast(int.class, clvswipe.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, clvswipe.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40))))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"MeasureText",(Object)(_action),(Object)(_xlbl.runMethod(false,"getFont"))).runMethod(true,"getWidth"),clvswipe.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0))));Debug.locals.put("width", _width);Debug.locals.put("width", _width);
 BA.debugLineNum = 159;BA.debugLine="ActionsPanel.AddView(xlbl, ActionsPanel.Width -";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_actionspanel" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_xlbl.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_actionspanel" /*RemoteObject*/ ).runMethod(true,"getWidth"),_width,_lastx}, "--",2, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(_width),(Object)(__ref.getField(false,"_actionspanel" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 160;BA.debugLine="LastX = LastX + width";
Debug.ShouldStop(-2147483648);
_lastx = RemoteObject.solve(new RemoteObject[] {_lastx,_width}, "+",1, 1);Debug.locals.put("LastX", _lastx);
 }
}Debug.locals.put("action", _action);
;
 BA.debugLineNum = 162;BA.debugLine="Return LastX";
Debug.ShouldStop(2);
if (true) return _lastx;
 BA.debugLineNum = 163;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createitemvalue(RemoteObject __ref,RemoteObject _value,RemoteObject _actions) throws Exception{
try {
		Debug.PushSubsStack("CreateItemValue (clvswipe) ","clvswipe",3,__ref.getField(false, "ba"),__ref,49);
if (RapidSub.canDelegate("createitemvalue")) { return __ref.runUserSub(false, "clvswipe","createitemvalue", __ref, _value, _actions);}
RemoteObject _m = RemoteObject.declareNull("b4a.spotify.top200.clvswipe._swipeitem");
Debug.locals.put("Value", _value);
Debug.locals.put("Actions", _actions);
 BA.debugLineNum = 49;BA.debugLine="Public Sub CreateItemValue(Value As Object, Action";
Debug.ShouldStop(65536);
 BA.debugLineNum = 50;BA.debugLine="Dim m As SwipeItem";
Debug.ShouldStop(131072);
_m = RemoteObject.createNew ("b4a.spotify.top200.clvswipe._swipeitem");Debug.locals.put("m", _m);
 BA.debugLineNum = 51;BA.debugLine="m.Initialize";
Debug.ShouldStop(262144);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 52;BA.debugLine="m.Value = Value";
Debug.ShouldStop(524288);
_m.setField ("Value" /*RemoteObject*/ ,_value);
 BA.debugLineNum = 53;BA.debugLine="m.Actions = Actions";
Debug.ShouldStop(1048576);
_m.setField ("Actions" /*RemoteObject*/ ,_actions);
 BA.debugLineNum = 54;BA.debugLine="Return m";
Debug.ShouldStop(2097152);
if (true) return _m;
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpulltorefreshpanel(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getPullToRefreshPanel (clvswipe) ","clvswipe",3,__ref.getField(false, "ba"),__ref,195);
if (RapidSub.canDelegate("getpulltorefreshpanel")) { return __ref.runUserSub(false, "clvswipe","getpulltorefreshpanel", __ref);}
 BA.debugLineNum = 195;BA.debugLine="Public Sub getPullToRefreshPanel As B4XView";
Debug.ShouldStop(4);
 BA.debugLineNum = 196;BA.debugLine="Return mPullToRefreshPanel";
Debug.ShouldStop(8);
if (true) return __ref.getField(false,"_mpulltorefreshpanel" /*RemoteObject*/ );
 BA.debugLineNum = 197;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getscrollingenabled(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getScrollingEnabled (clvswipe) ","clvswipe",3,__ref.getField(false, "ba"),__ref,203);
if (RapidSub.canDelegate("getscrollingenabled")) { return __ref.runUserSub(false, "clvswipe","getscrollingenabled", __ref);}
 BA.debugLineNum = 203;BA.debugLine="Public Sub getScrollingEnabled As Boolean";
Debug.ShouldStop(1024);
 BA.debugLineNum = 204;BA.debugLine="Return Not(mScrollingDisabled)";
Debug.ShouldStop(2048);
if (true) return clvswipe.__c.runMethod(true,"Not",(Object)(__ref.getField(true,"_mscrollingdisabled" /*RemoteObject*/ )));
 BA.debugLineNum = 205;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _clv,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (clvswipe) ","clvswipe",3,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "clvswipe","initialize", __ref, _ba, _clv, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _creator = RemoteObject.declareNull("anywheresoftware.b4a.objects.TouchPanelCreator");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("ba", _ba);
Debug.locals.put("clv", _clv);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 26;BA.debugLine="Public Sub Initialize (clv As CustomListView, Call";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 28;BA.debugLine="Dim creator As TouchPanelCreator";
Debug.ShouldStop(134217728);
_creator = RemoteObject.createNew ("anywheresoftware.b4a.objects.TouchPanelCreator");Debug.locals.put("creator", _creator);
 BA.debugLineNum = 29;BA.debugLine="Base = creator.CreateTouchPanel(\"TouchPanel\")";
Debug.ShouldStop(268435456);
__ref.getField(false,"_base" /*RemoteObject*/ ).setObject (_creator.runMethod(false,"CreateTouchPanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("TouchPanel"))).getObject());
 BA.debugLineNum = 36;BA.debugLine="ActionsPanel = xui.CreatePanel(\"\")";
Debug.ShouldStop(8);
__ref.setField ("_actionspanel" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 37;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(16);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 38;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 1dip, 1dip)";
Debug.ShouldStop(32);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(clvswipe.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))),(Object)(clvswipe.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))));
 BA.debugLineNum = 39;BA.debugLine="cvs.Initialize(p)";
Debug.ShouldStop(64);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(_p));
 BA.debugLineNum = 40;BA.debugLine="mCLV = clv";
Debug.ShouldStop(128);
__ref.setField ("_mclv" /*RemoteObject*/ ,_clv);
 BA.debugLineNum = 41;BA.debugLine="mCLV.AsView.Parent.AddView(Base, mCLV.AsView.Left";
Debug.ShouldStop(256);
__ref.getField(false,"_mclv" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(false,"getParent").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_base" /*RemoteObject*/ ).getObject())),(Object)(__ref.getField(false,"_mclv" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getLeft")),(Object)(__ref.getField(false,"_mclv" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getTop")),(Object)(__ref.getField(false,"_mclv" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mclv" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getHeight")));
 BA.debugLineNum = 42;BA.debugLine="mCLV.AsView.RemoveViewFromParent";
Debug.ShouldStop(512);
__ref.getField(false,"_mclv" /*RemoteObject*/ ).runMethod(false,"_asview").runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 43;BA.debugLine="Base.AddView(mCLV.AsView, 0, 0, Base.Width, Base.";
Debug.ShouldStop(1024);
__ref.getField(false,"_base" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_mclv" /*RemoteObject*/ ).runMethod(false,"_asview").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 44;BA.debugLine="mCallback = Callback";
Debug.ShouldStop(2048);
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 45;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(4096);
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbl_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Lbl_Click (clvswipe) ","clvswipe",3,__ref.getField(false, "ba"),__ref,165);
if (RapidSub.canDelegate("lbl_click")) { return __ref.runUserSub(false, "clvswipe","lbl_click", __ref);}
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _index = RemoteObject.createImmutable(0);
 BA.debugLineNum = 165;BA.debugLine="Private Sub Lbl_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 166;BA.debugLine="Dim lbl As B4XView = Sender";
Debug.ShouldStop(32);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), clvswipe.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 167;BA.debugLine="Dim index As Int = LastSwipedItem";
Debug.ShouldStop(64);
_index = __ref.getField(true,"_lastswipeditem" /*RemoteObject*/ );Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 168;BA.debugLine="CloseLastSwiped";
Debug.ShouldStop(128);
__ref.runClassMethod (b4a.spotify.top200.clvswipe.class, "_closelastswiped" /*RemoteObject*/ );
 BA.debugLineNum = 169;BA.debugLine="CallSub3(mCallback, mEventName & \"_ActionClicked\"";
Debug.ShouldStop(256);
clvswipe.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ActionClicked"))),(Object)((_index)),(Object)((_lbl.runMethod(true,"getText"))));
 BA.debugLineNum = 170;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _raiserefreshevent(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RaiseRefreshEvent (clvswipe) ","clvswipe",3,__ref.getField(false, "ba"),__ref,105);
if (RapidSub.canDelegate("raiserefreshevent")) { return __ref.runUserSub(false, "clvswipe","raiserefreshevent", __ref);}
 BA.debugLineNum = 105;BA.debugLine="Private Sub RaiseRefreshEvent";
Debug.ShouldStop(256);
 BA.debugLineNum = 106;BA.debugLine="WaitingForRefreshToComplete = True";
Debug.ShouldStop(512);
__ref.setField ("_waitingforrefreshtocomplete" /*RemoteObject*/ ,clvswipe.__c.getField(true,"True"));
 BA.debugLineNum = 107;BA.debugLine="HandlingSwipe = False";
Debug.ShouldStop(1024);
__ref.setField ("_handlingswipe" /*RemoteObject*/ ,clvswipe.__c.getField(true,"False"));
 BA.debugLineNum = 108;BA.debugLine="CallSub(mCallback, mEventName & \"_RefreshRequeste";
Debug.ShouldStop(2048);
clvswipe.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_RefreshRequested"))));
 BA.debugLineNum = 109;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _refreshcompleted(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RefreshCompleted (clvswipe) ","clvswipe",3,__ref.getField(false, "ba"),__ref,135);
if (RapidSub.canDelegate("refreshcompleted")) { return __ref.runUserSub(false, "clvswipe","refreshcompleted", __ref);}
 BA.debugLineNum = 135;BA.debugLine="Public Sub RefreshCompleted";
Debug.ShouldStop(64);
 BA.debugLineNum = 136;BA.debugLine="If WaitingForRefreshToComplete = False Then Retur";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_waitingforrefreshtocomplete" /*RemoteObject*/ ),clvswipe.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 137;BA.debugLine="WaitingForRefreshToComplete = False";
Debug.ShouldStop(256);
__ref.setField ("_waitingforrefreshtocomplete" /*RemoteObject*/ ,clvswipe.__c.getField(true,"False"));
 BA.debugLineNum = 138;BA.debugLine="mPullToRefreshPanel.Visible = False";
Debug.ShouldStop(512);
__ref.getField(false,"_mpulltorefreshpanel" /*RemoteObject*/ ).runMethod(true,"setVisible",clvswipe.__c.getField(true,"False"));
 BA.debugLineNum = 139;BA.debugLine="mCLV.AsView.SetLayoutAnimated(200, 0, 0, mCLV.AsV";
Debug.ShouldStop(1024);
__ref.getField(false,"_mclv" /*RemoteObject*/ ).runMethod(false,"_asview").runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_mclv" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mclv" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getHeight")));
 BA.debugLineNum = 144;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Resize (clvswipe) ","clvswipe",3,__ref.getField(false, "ba"),__ref,177);
if (RapidSub.canDelegate("resize")) { return __ref.runUserSub(false, "clvswipe","resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 177;BA.debugLine="Public Sub Resize(Width As Int, Height As Int)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 178;BA.debugLine="CloseLastSwiped";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4a.spotify.top200.clvswipe.class, "_closelastswiped" /*RemoteObject*/ );
 BA.debugLineNum = 179;BA.debugLine="ActionsPanel.Width = Width";
Debug.ShouldStop(262144);
__ref.getField(false,"_actionspanel" /*RemoteObject*/ ).runMethod(true,"setWidth",_width);
 BA.debugLineNum = 180;BA.debugLine="Base.SetLayoutAnimated(0, Base.Left, Base.Top, Wi";
Debug.ShouldStop(524288);
__ref.getField(false,"_base" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getLeft")),(Object)(__ref.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getTop")),(Object)(_width),(Object)(_height));
 BA.debugLineNum = 181;BA.debugLine="If mPullToRefreshPanel.IsInitialized Then";
Debug.ShouldStop(1048576);
if (__ref.getField(false,"_mpulltorefreshpanel" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 182;BA.debugLine="mPullToRefreshPanel.SetLayoutAnimated(0, 0, 0, W";
Debug.ShouldStop(2097152);
__ref.getField(false,"_mpulltorefreshpanel" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_width),(Object)(__ref.getField(false,"_mpulltorefreshpanel" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 };
 BA.debugLineNum = 184;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _scrollchanged(RemoteObject __ref,RemoteObject _offset) throws Exception{
try {
		Debug.PushSubsStack("ScrollChanged (clvswipe) ","clvswipe",3,__ref.getField(false, "ba"),__ref,111);
if (RapidSub.canDelegate("scrollchanged")) { return __ref.runUserSub(false, "clvswipe","scrollchanged", __ref, _offset);}
Debug.locals.put("offset", _offset);
 BA.debugLineNum = 111;BA.debugLine="Public Sub ScrollChanged (offset As Int)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 133;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpulltorefreshpanel(RemoteObject __ref,RemoteObject _pnl) throws Exception{
try {
		Debug.PushSubsStack("setPullToRefreshPanel (clvswipe) ","clvswipe",3,__ref.getField(false, "ba"),__ref,186);
if (RapidSub.canDelegate("setpulltorefreshpanel")) { return __ref.runUserSub(false, "clvswipe","setpulltorefreshpanel", __ref, _pnl);}
Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 186;BA.debugLine="Public Sub setPullToRefreshPanel(pnl As B4XView)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 187;BA.debugLine="If pnl.Parent.IsInitialized Then pnl.RemoveViewFr";
Debug.ShouldStop(67108864);
if (_pnl.runMethod(false,"getParent").runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
_pnl.runVoidMethod ("RemoveViewFromParent");};
 BA.debugLineNum = 188;BA.debugLine="If mPullToRefreshPanel.IsInitialized Then mPullTo";
Debug.ShouldStop(134217728);
if (__ref.getField(false,"_mpulltorefreshpanel" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
__ref.getField(false,"_mpulltorefreshpanel" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");};
 BA.debugLineNum = 189;BA.debugLine="mPullToRefreshPanel = pnl";
Debug.ShouldStop(268435456);
__ref.setField ("_mpulltorefreshpanel" /*RemoteObject*/ ,_pnl);
 BA.debugLineNum = 190;BA.debugLine="Base.AddView(mPullToRefreshPanel, 0, 0, Base.Widt";
Debug.ShouldStop(536870912);
__ref.getField(false,"_base" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_mpulltorefreshpanel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mpulltorefreshpanel" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 191;BA.debugLine="mPullToRefreshPanel.SendToBack";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_mpulltorefreshpanel" /*RemoteObject*/ ).runVoidMethod ("SendToBack");
 BA.debugLineNum = 192;BA.debugLine="mPullToRefreshPanel.Visible = False";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_mpulltorefreshpanel" /*RemoteObject*/ ).runMethod(true,"setVisible",clvswipe.__c.getField(true,"False"));
 BA.debugLineNum = 193;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setscrollingenabled(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("setScrollingEnabled (clvswipe) ","clvswipe",3,__ref.getField(false, "ba"),__ref,207);
if (RapidSub.canDelegate("setscrollingenabled")) { return __ref.runUserSub(false, "clvswipe","setscrollingenabled", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 207;BA.debugLine="Public Sub setScrollingEnabled (b As Boolean)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 208;BA.debugLine="mScrollingDisabled = Not(b)";
Debug.ShouldStop(32768);
__ref.setField ("_mscrollingdisabled" /*RemoteObject*/ ,clvswipe.__c.runMethod(true,"Not",(Object)(_b)));
 BA.debugLineNum = 209;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _touchpanel_onintercepttouchevent(RemoteObject __ref,RemoteObject _action,RemoteObject _x,RemoteObject _y,RemoteObject _motionevent) throws Exception{
try {
		Debug.PushSubsStack("TouchPanel_OnInterceptTouchEvent (clvswipe) ","clvswipe",3,__ref.getField(false, "ba"),__ref,211);
if (RapidSub.canDelegate("touchpanel_onintercepttouchevent")) { return __ref.runUserSub(false, "clvswipe","touchpanel_onintercepttouchevent", __ref, _action, _x, _y, _motionevent);}
RemoteObject _dx = RemoteObject.createImmutable(0f);
RemoteObject _dy = RemoteObject.createImmutable(0f);
RemoteObject _newswipeitem = RemoteObject.createImmutable(0);
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
Debug.locals.put("MotionEvent", _motionevent);
 BA.debugLineNum = 211;BA.debugLine="Private Sub TouchPanel_OnInterceptTouchEvent (Acti";
Debug.ShouldStop(262144);
 BA.debugLineNum = 212;BA.debugLine="If mScrollingDisabled Or HandlingSwipe Or Waiting";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean(".",__ref.getField(true,"_mscrollingdisabled" /*RemoteObject*/ )) || RemoteObject.solveBoolean(".",__ref.getField(true,"_handlingswipe" /*RemoteObject*/ )) || RemoteObject.solveBoolean(".",__ref.getField(true,"_waitingforrefreshtocomplete" /*RemoteObject*/ ))) { 
if (true) return clvswipe.__c.getField(true,"True");};
 BA.debugLineNum = 213;BA.debugLine="Select Action";
Debug.ShouldStop(1048576);
switch (BA.switchObjectToInt(_action,__ref.getField(false,"_base" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_DOWN"),__ref.getField(false,"_base" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_MOVE"))) {
case 0: {
 BA.debugLineNum = 215;BA.debugLine="TouchXStart = X";
Debug.ShouldStop(4194304);
__ref.setField ("_touchxstart" /*RemoteObject*/ ,_x);
 BA.debugLineNum = 216;BA.debugLine="TouchYStart = Y";
Debug.ShouldStop(8388608);
__ref.setField ("_touchystart" /*RemoteObject*/ ,_y);
 BA.debugLineNum = 217;BA.debugLine="HandlingSwipe = False";
Debug.ShouldStop(16777216);
__ref.setField ("_handlingswipe" /*RemoteObject*/ ,clvswipe.__c.getField(true,"False"));
 break; }
case 1: {
 BA.debugLineNum = 219;BA.debugLine="Dim dx As Float = Abs(x - TouchXStart)";
Debug.ShouldStop(67108864);
_dx = BA.numberCast(float.class, clvswipe.__c.runMethod(true,"Abs",(Object)(RemoteObject.solve(new RemoteObject[] {_x,__ref.getField(true,"_touchxstart" /*RemoteObject*/ )}, "-",1, 0))));Debug.locals.put("dx", _dx);Debug.locals.put("dx", _dx);
 BA.debugLineNum = 220;BA.debugLine="Dim dy As Float = Abs(y - TouchYStart)";
Debug.ShouldStop(134217728);
_dy = BA.numberCast(float.class, clvswipe.__c.runMethod(true,"Abs",(Object)(RemoteObject.solve(new RemoteObject[] {_y,__ref.getField(true,"_touchystart" /*RemoteObject*/ )}, "-",1, 0))));Debug.locals.put("dy", _dy);Debug.locals.put("dy", _dy);
 BA.debugLineNum = 221;BA.debugLine="If mPullToRefreshPanel.IsInitialized And mCLV.s";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(".",__ref.getField(false,"_mpulltorefreshpanel" /*RemoteObject*/ ).runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean("=",__ref.getField(false,"_mclv" /*RemoteObject*/ ).getField(false,"_sv").runMethod(true,"getScrollViewOffsetY"),BA.numberCast(int.class, 0)) && RemoteObject.solveBoolean(">",RemoteObject.solve(new RemoteObject[] {_y,__ref.getField(true,"_touchystart" /*RemoteObject*/ )}, "-",1, 0),BA.numberCast(double.class, clvswipe.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))))) { 
 BA.debugLineNum = 222;BA.debugLine="HandlingSwipe = True";
Debug.ShouldStop(536870912);
__ref.setField ("_handlingswipe" /*RemoteObject*/ ,clvswipe.__c.getField(true,"True"));
 BA.debugLineNum = 223;BA.debugLine="PullToRefreshSwipe = True";
Debug.ShouldStop(1073741824);
__ref.setField ("_pulltorefreshswipe" /*RemoteObject*/ ,clvswipe.__c.getField(true,"True"));
 BA.debugLineNum = 224;BA.debugLine="mPullToRefreshPanel.Visible = True";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_mpulltorefreshpanel" /*RemoteObject*/ ).runMethod(true,"setVisible",clvswipe.__c.getField(true,"True"));
 BA.debugLineNum = 225;BA.debugLine="CloseLastSwiped";
Debug.ShouldStop(1);
__ref.runClassMethod (b4a.spotify.top200.clvswipe.class, "_closelastswiped" /*RemoteObject*/ );
 }else 
{ BA.debugLineNum = 226;BA.debugLine="Else If dy < 20dip And dx > 10dip And mCLV.Size";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("<",_dy,BA.numberCast(float.class, clvswipe.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20))))) && RemoteObject.solveBoolean(">",_dx,BA.numberCast(float.class, clvswipe.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10))))) && RemoteObject.solveBoolean(">",__ref.getField(false,"_mclv" /*RemoteObject*/ ).runMethod(true,"_getsize"),BA.numberCast(int.class, 0))) { 
 BA.debugLineNum = 227;BA.debugLine="If HandlingSwipe = False Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_handlingswipe" /*RemoteObject*/ ),clvswipe.__c.getField(true,"False"))) { 
 BA.debugLineNum = 228;BA.debugLine="Dim NewSwipeItem As Int = mCLV.FindIndexFromO";
Debug.ShouldStop(8);
_newswipeitem = __ref.getField(false,"_mclv" /*RemoteObject*/ ).runMethod(true,"_findindexfromoffset",(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_touchystart" /*RemoteObject*/ ),__ref.getField(false,"_mclv" /*RemoteObject*/ ).getField(false,"_sv").runMethod(true,"getScrollViewOffsetY")}, "+",1, 0))));Debug.locals.put("NewSwipeItem", _newswipeitem);Debug.locals.put("NewSwipeItem", _newswipeitem);
 BA.debugLineNum = 229;BA.debugLine="If NewSwipeItem <> LastSwipedItem Then CloseL";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("!",_newswipeitem,__ref.getField(true,"_lastswipeditem" /*RemoteObject*/ ))) { 
__ref.runClassMethod (b4a.spotify.top200.clvswipe.class, "_closelastswiped" /*RemoteObject*/ );};
 BA.debugLineNum = 230;BA.debugLine="LastSwipedItem = NewSwipeItem";
Debug.ShouldStop(32);
__ref.setField ("_lastswipeditem" /*RemoteObject*/ ,_newswipeitem);
 };
 BA.debugLineNum = 232;BA.debugLine="HandlingSwipe = True";
Debug.ShouldStop(128);
__ref.setField ("_handlingswipe" /*RemoteObject*/ ,clvswipe.__c.getField(true,"True"));
 BA.debugLineNum = 233;BA.debugLine="PullToRefreshSwipe = False";
Debug.ShouldStop(256);
__ref.setField ("_pulltorefreshswipe" /*RemoteObject*/ ,clvswipe.__c.getField(true,"False"));
 }}
;
 break; }
}
;
 BA.debugLineNum = 236;BA.debugLine="Return HandlingSwipe";
Debug.ShouldStop(2048);
if (true) return __ref.getField(true,"_handlingswipe" /*RemoteObject*/ );
 BA.debugLineNum = 237;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _touchpanel_ontouchevent(RemoteObject __ref,RemoteObject _action,RemoteObject _x,RemoteObject _y,RemoteObject _motionevent) throws Exception{
try {
		Debug.PushSubsStack("TouchPanel_OnTouchEvent (clvswipe) ","clvswipe",3,__ref.getField(false, "ba"),__ref,239);
if (RapidSub.canDelegate("touchpanel_ontouchevent")) { return __ref.runUserSub(false, "clvswipe","touchpanel_ontouchevent", __ref, _action, _x, _y, _motionevent);}
RemoteObject _dy = RemoteObject.createImmutable(0f);
RemoteObject _dx = RemoteObject.createImmutable(0f);
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
Debug.locals.put("MotionEvent", _motionevent);
 BA.debugLineNum = 239;BA.debugLine="Private Sub TouchPanel_OnTouchEvent (Action As Int";
Debug.ShouldStop(16384);
 BA.debugLineNum = 240;BA.debugLine="If mScrollingDisabled Or HandlingSwipe = False Or";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean(".",__ref.getField(true,"_mscrollingdisabled" /*RemoteObject*/ )) || RemoteObject.solveBoolean("=",__ref.getField(true,"_handlingswipe" /*RemoteObject*/ ),clvswipe.__c.getField(true,"False")) || RemoteObject.solveBoolean(".",__ref.getField(true,"_waitingforrefreshtocomplete" /*RemoteObject*/ ))) { 
if (true) return clvswipe.__c.getField(true,"True");};
 BA.debugLineNum = 241;BA.debugLine="If PullToRefreshSwipe Then";
Debug.ShouldStop(65536);
if (__ref.getField(true,"_pulltorefreshswipe" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 242;BA.debugLine="Select Action";
Debug.ShouldStop(131072);
switch (BA.switchObjectToInt(_action,__ref.getField(false,"_base" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_MOVE"),__ref.getField(false,"_base" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_UP"))) {
case 0: {
 BA.debugLineNum = 244;BA.debugLine="Dim dy As Float = y - TouchYStart";
Debug.ShouldStop(524288);
_dy = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_y,__ref.getField(true,"_touchystart" /*RemoteObject*/ )}, "-",1, 0));Debug.locals.put("dy", _dy);Debug.locals.put("dy", _dy);
 BA.debugLineNum = 245;BA.debugLine="TouchYStart = Y";
Debug.ShouldStop(1048576);
__ref.setField ("_touchystart" /*RemoteObject*/ ,_y);
 BA.debugLineNum = 246;BA.debugLine="ChangeYOffset(dy, False)";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4a.spotify.top200.clvswipe.class, "_changeyoffset" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _dy)),(Object)(clvswipe.__c.getField(true,"False")));
 break; }
case 1: {
 BA.debugLineNum = 248;BA.debugLine="ChangeYOffset(dy, True)";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4a.spotify.top200.clvswipe.class, "_changeyoffset" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _dy)),(Object)(clvswipe.__c.getField(true,"True")));
 BA.debugLineNum = 249;BA.debugLine="HandlingSwipe = False";
Debug.ShouldStop(16777216);
__ref.setField ("_handlingswipe" /*RemoteObject*/ ,clvswipe.__c.getField(true,"False"));
 break; }
}
;
 }else {
 BA.debugLineNum = 252;BA.debugLine="Select Action";
Debug.ShouldStop(134217728);
switch (BA.switchObjectToInt(_action,__ref.getField(false,"_base" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_MOVE"),__ref.getField(false,"_base" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_UP"))) {
case 0: {
 BA.debugLineNum = 254;BA.debugLine="Dim dx As Float = x - TouchXStart";
Debug.ShouldStop(536870912);
_dx = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_x,__ref.getField(true,"_touchxstart" /*RemoteObject*/ )}, "-",1, 0));Debug.locals.put("dx", _dx);Debug.locals.put("dx", _dx);
 BA.debugLineNum = 255;BA.debugLine="TouchXStart = X";
Debug.ShouldStop(1073741824);
__ref.setField ("_touchxstart" /*RemoteObject*/ ,_x);
 BA.debugLineNum = 256;BA.debugLine="HandlingSwipe = ChangeOffset(LastSwipedItem, d";
Debug.ShouldStop(-2147483648);
__ref.setField ("_handlingswipe" /*RemoteObject*/ ,__ref.runClassMethod (b4a.spotify.top200.clvswipe.class, "_changeoffset" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_lastswipeditem" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, _dx)),(Object)(clvswipe.__c.getField(true,"False"))));
 break; }
case 1: {
 BA.debugLineNum = 258;BA.debugLine="ChangeOffset(LastSwipedItem, 0, True)";
Debug.ShouldStop(2);
__ref.runClassMethod (b4a.spotify.top200.clvswipe.class, "_changeoffset" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_lastswipeditem" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 0)),(Object)(clvswipe.__c.getField(true,"True")));
 BA.debugLineNum = 259;BA.debugLine="HandlingSwipe = False";
Debug.ShouldStop(4);
__ref.setField ("_handlingswipe" /*RemoteObject*/ ,clvswipe.__c.getField(true,"False"));
 break; }
}
;
 };
 BA.debugLineNum = 262;BA.debugLine="Return True";
Debug.ShouldStop(32);
if (true) return clvswipe.__c.getField(true,"True");
 BA.debugLineNum = 263;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}