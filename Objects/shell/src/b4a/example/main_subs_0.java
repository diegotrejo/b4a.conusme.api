package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,29);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 29;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="Activity.LoadLayout(\"Layout\")";
Debug.ShouldStop(536870912);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Layout")),main.mostCurrent.activityBA);
 BA.debugLineNum = 31;BA.debugLine="apiDeps.Initialize(\"https://appempresautn003.azur";
Debug.ShouldStop(1073741824);
main.mostCurrent._apideps.runClassMethod (b4a.example.departamentos.class, "_initialize" /*RemoteObject*/ ,main.processBA,(Object)(RemoteObject.createImmutable("https://appempresautn003.azurewebsites.net/api/Departamentos")));
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,38);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 38;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(32);
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,34);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 34;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(2);
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _cmdcreate_click() throws Exception{
try {
		Debug.PushSubsStack("cmdCreate_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,92);
if (RapidSub.canDelegate("cmdcreate_click")) { b4a.example.main.remoteMe.runUserSub(false, "main","cmdcreate_click"); return;}
ResumableSub_cmdCreate_Click rsub = new ResumableSub_cmdCreate_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_cmdCreate_Click extends BA.ResumableSub {
public ResumableSub_cmdCreate_Click(b4a.example.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.main parent;
RemoteObject _d = RemoteObject.declareNull("b4a.example.departamento");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("cmdCreate_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,92);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 93;BA.debugLine="Wait For (apiDeps.Create( 0, txtNombre.Text, txtC";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "cmdcreate_click"), parent.mostCurrent._apideps.runClassMethod (b4a.example.departamentos.class, "_create" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent._txtnombre.runMethod(true,"getText")),(Object)(parent.mostCurrent._txtciudad.runMethod(true,"getText"))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_d = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("d", _d);
;
 BA.debugLineNum = 94;BA.debugLine="If d.Id > 0 Then";
Debug.ShouldStop(536870912);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean(">",_d.getField(true,"_id" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 95;BA.debugLine="txtID.Text = d.Id";
Debug.ShouldStop(1073741824);
parent.mostCurrent._txtid.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_d.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 96;BA.debugLine="Msgbox(\"Insertado el registro\", \"OK\")";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Insertado el registro")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),main.mostCurrent.activityBA);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 98;BA.debugLine="Msgbox(\"No se pudo insertar el registro\", \"Error";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No se pudo insertar el registro")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),main.mostCurrent.activityBA);
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
public static void  _complete(RemoteObject _d) throws Exception{
}
public static void  _cmddelete_click() throws Exception{
try {
		Debug.PushSubsStack("cmdDelete_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,61);
if (RapidSub.canDelegate("cmddelete_click")) { b4a.example.main.remoteMe.runUserSub(false, "main","cmddelete_click"); return;}
ResumableSub_cmdDelete_Click rsub = new ResumableSub_cmdDelete_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_cmdDelete_Click extends BA.ResumableSub {
public ResumableSub_cmdDelete_Click(b4a.example.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.main parent;
RemoteObject _r = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("cmdDelete_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,61);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 62;BA.debugLine="Wait For (apiDeps.Delete( txtID.Text )) Complete";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "cmddelete_click"), parent.mostCurrent._apideps.runClassMethod (b4a.example.departamentos.class, "_delete" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, parent.mostCurrent._txtid.runMethod(true,"getText")))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_r = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("r", _r);
;
 BA.debugLineNum = 63;BA.debugLine="If r = True Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_r,parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 64;BA.debugLine="txtID.Text = \"\"";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._txtid.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 65;BA.debugLine="txtNombre.Text = \"\"";
Debug.ShouldStop(1);
parent.mostCurrent._txtnombre.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 66;BA.debugLine="txtCiudad.Text = \"\"";
Debug.ShouldStop(2);
parent.mostCurrent._txtciudad.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 67;BA.debugLine="Msgbox(\"registro borrado !!\", \"Ok\")";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("registro borrado !!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Ok"))),main.mostCurrent.activityBA);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 69;BA.debugLine="Msgbox(\"no hay datos\", \"Error\")";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("no hay datos")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),main.mostCurrent.activityBA);
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
public static void  _cmdread_click() throws Exception{
try {
		Debug.PushSubsStack("cmdRead_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,82);
if (RapidSub.canDelegate("cmdread_click")) { b4a.example.main.remoteMe.runUserSub(false, "main","cmdread_click"); return;}
ResumableSub_cmdRead_Click rsub = new ResumableSub_cmdRead_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_cmdRead_Click extends BA.ResumableSub {
public ResumableSub_cmdRead_Click(b4a.example.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.main parent;
RemoteObject _d = RemoteObject.declareNull("b4a.example.departamento");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("cmdRead_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,82);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 83;BA.debugLine="Wait For (apiDeps.Read_ById( txtID.Text )) Comple";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "cmdread_click"), parent.mostCurrent._apideps.runClassMethod (b4a.example.departamentos.class, "_read_byid" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, parent.mostCurrent._txtid.runMethod(true,"getText")))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_d = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("d", _d);
;
 BA.debugLineNum = 84;BA.debugLine="If d.Id > 0 Then";
Debug.ShouldStop(524288);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean(">",_d.getField(true,"_id" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 85;BA.debugLine="txtNombre.Text = d.Nombre";
Debug.ShouldStop(1048576);
parent.mostCurrent._txtnombre.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_d.getField(true,"_nombre" /*RemoteObject*/ )));
 BA.debugLineNum = 86;BA.debugLine="txtCiudad.Text = d.Ciudad";
Debug.ShouldStop(2097152);
parent.mostCurrent._txtciudad.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_d.getField(true,"_ciudad" /*RemoteObject*/ )));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 88;BA.debugLine="Msgbox(\"no hay datos\", \"Error\")";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("no hay datos")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),main.mostCurrent.activityBA);
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
public static void  _cmdupdate_click() throws Exception{
try {
		Debug.PushSubsStack("cmdUpdate_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,73);
if (RapidSub.canDelegate("cmdupdate_click")) { b4a.example.main.remoteMe.runUserSub(false, "main","cmdupdate_click"); return;}
ResumableSub_cmdUpdate_Click rsub = new ResumableSub_cmdUpdate_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_cmdUpdate_Click extends BA.ResumableSub {
public ResumableSub_cmdUpdate_Click(b4a.example.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.main parent;
RemoteObject _r = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("cmdUpdate_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,73);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 74;BA.debugLine="Wait For (apiDeps.Update( txtID.Text , txtNombre.";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "cmdupdate_click"), parent.mostCurrent._apideps.runClassMethod (b4a.example.departamentos.class, "_update" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, parent.mostCurrent._txtid.runMethod(true,"getText"))),(Object)(parent.mostCurrent._txtnombre.runMethod(true,"getText")),(Object)(parent.mostCurrent._txtciudad.runMethod(true,"getText"))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_r = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("r", _r);
;
 BA.debugLineNum = 75;BA.debugLine="If r = True Then";
Debug.ShouldStop(1024);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_r,parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 76;BA.debugLine="Msgbox(\"registro actualizado !!\", \"Ok\")";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("registro actualizado !!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Ok"))),main.mostCurrent.activityBA);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 78;BA.debugLine="Msgbox(\"no hay datos\", \"Error\")";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("no hay datos")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),main.mostCurrent.activityBA);
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 80;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 23;BA.debugLine="Private apiDeps As Departamentos";
main.mostCurrent._apideps = RemoteObject.createNew ("b4a.example.departamentos");
 //BA.debugLineNum = 24;BA.debugLine="Private txtID As EditText";
main.mostCurrent._txtid = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private txtNombre As EditText";
main.mostCurrent._txtnombre = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private txtCiudad As EditText";
main.mostCurrent._txtciudad = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
httputils2service_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
departamento.myClass = BA.getDeviceClass ("b4a.example.departamento");
departamentos.myClass = BA.getDeviceClass ("b4a.example.departamentos");
httputils2service.myClass = BA.getDeviceClass ("b4a.example.httputils2service");
httpjob.myClass = BA.getDeviceClass ("b4a.example.httpjob");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 18;BA.debugLine="Private xui As XUI";
main._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}