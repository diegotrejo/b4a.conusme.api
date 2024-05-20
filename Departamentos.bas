B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	Private jsonParser As JSONParser
	Private apiJob As HttpJob
	Public ApiURL As String
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize( url As String)
	ApiURL = url
End Sub

Public Sub Create( id As Int, nombre As String, ciduad As String) As ResumableSub
	Dim dep As Departamento
	Dim json As String
	Dim data As Map
	
	dep.Initialize()
	json = "{ 'id' : 0, 'nombre' : '" & nombre & "', 'ciudad': '" & ciduad & "' }"
	
	apiJob.Initialize("", Me)
	apiJob.PostString( ApiURL, json )
	apiJob.GetRequest.SetContentType("application/json")
	
	wait for (apiJob) JobDone( resultado As HttpJob )
	If resultado.Success Then
		jsonParser.Initialize( resultado.GetString )
		data = jsonParser.NextObject
		dep.Id = data.Get("id")
		dep.Nombre = data.Get("nombre")
		dep.Ciudad = data.Get("ciudad")
	End If
	
	Return dep
End Sub

Public Sub Read_All() As ResumableSub
	Dim deps As List	
	Dim map As Map
	Dim lst As List
	
	deps.Initialize
	
	apiJob.Initialize("", Me)
	apiJob.Download( ApiURL )
	Wait For (apiJob) JobDone( resultado As HttpJob)
	If resultado.Success Then
		jsonParser.Initialize ( resultado.GetString )
		lst = jsonParser.NextArray
		For i=0 To lst.Size-1
			map = lst.Get(i)		
			Dim dep As Departamento
			dep.Initialize
			dep.Id = map.Get("id")
			dep.Nombre = map.Get("nombre")
			dep.Ciudad = map.Get("ciudad")
			deps.Add(dep)
		Next
	End If
	
	Return deps
End Sub

Public Sub Read_ById( id As Int) As ResumableSub
	Dim dep As Departamento
	dep.Initialize
	
	apiJob.Initialize("", Me)
	apiJob.Download( ApiURL & "/" & id)
	wait for (apiJob) JobDone( resulatdo As HttpJob )
	If resulatdo.Success Then
		jsonParser.Initialize( resulatdo.GetString )
		Dim map As Map = jsonParser.NextObject
		dep.Id = map.Get("id")
		dep.Nombre = map.Get("nombre")
		dep.Ciudad = map.Get("ciudad")
	End If
	Return dep
End Sub

public Sub Update(id As Int, nombre As String, ciduad As String) As ResumableSub
	Dim json As String
	
	json = "{ 'id' : " & id & ", 'nombre' : '" & nombre & "', 'ciudad': '" & ciduad & "' }"
	
	apiJob.Initialize("", Me)
	apiJob.PutString( ApiURL & "/" & id, json )
	apiJob.GetRequest.SetContentType("application/json")
	
	wait for (apiJob) JobDone( resultado As HttpJob )
	Return resultado.Success
End Sub

public Sub Delete( id As Int) As ResumableSub
	apiJob.Initialize("", Me)
	apiJob.Delete( ApiURL & "/" & id )
	
	wait for (apiJob) JobDone( resultado As HttpJob )
	Return resultado.Success
End Sub