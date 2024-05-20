
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class departamentos {
    public static RemoteObject myClass;
	public departamentos() {
	}
    public static PCBA staticBA = new PCBA(null, departamentos.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _jsonparser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
public static RemoteObject _apijob = RemoteObject.declareNull("b4a.example.httpjob");
public static RemoteObject _apiurl = RemoteObject.createImmutable("");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"apiJob",_ref.getField(false, "_apijob"),"ApiURL",_ref.getField(false, "_apiurl"),"jsonParser",_ref.getField(false, "_jsonparser")};
}
}