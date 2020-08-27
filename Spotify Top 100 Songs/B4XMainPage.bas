B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.85
@EndOfDesignText@
#Region Shared Files
#CustomBuildAction: folders ready, %WINDIR%\System32\Robocopy.exe,"..\..\Shared Files" "..\Files"
'Ctrl + click to sync files: ide://run?file=%WINDIR%\System32\Robocopy.exe&args=..\..\Shared+Files&args=..\Files&FilesSync=True
#End Region

'Ctrl + click to export as zip: ide://run?File=%B4X%\Zipper.jar&Args=Project.zip

Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	Private PullToRefresh As CLVSwipe
	Private CListView As CustomListView
	Private RefreshPanel As Panel
End Sub

Public Sub Initialize
	
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	
	PullToRefresh.Initialize(CListView,Me,"RefreshPuller")
	PullToRefresh.PullToRefreshPanel = RefreshPanel
	
	CListView.DefaultTextColor = Colors.Black
	
	Refresh
End Sub

Private Sub RefreshPuller_RefreshRequested
	Refresh
End Sub

Private Sub Refresh
	Wait For (GetData) Complete (Data As List)
	FillListView(Data)
	PullToRefresh.RefreshCompleted
End Sub

Private Sub FillListView(Data As List)
	CListView.Clear
	For Each song As Song In Data
		CListView.AddTextItem(song.GetSummary,song.Link)
	Next
End Sub

Private Sub GetData As ResumableSub
	Dim Data As List : Data.initialize
	
	Dim GETjob As HttpJob
	GETjob.Initialize("getData",Me)
	GETjob.Download("https://spotifycharts.com/regional/global/daily/latest/download")
	Wait for JobDone (job As HttpJob)
	If job.Success Then 
		File.WriteString(File.DirInternal,"data.csv",job.GetString)
		Dim tempData As List = File.ReadList(File.DirInternal,"data.csv")
		'removes the 2 useless parts in the begining of the response
		tempData.RemoveAt(0)
		tempData.RemoveAt(0)
		File.WriteList(File.DirInternal,"data.csv",tempData)
		
		Dim su As StringUtils
		Dim results As List = su.LoadCSV(File.DirInternal,"data.csv",",")
		For Each result() As String In results
			Dim tempSong As Song : tempSong.Initialize(result)
			Data.Add(tempSong)
		Next
	Else
		LogColor(job.ErrorMessage , Colors.Red)
	End If
	
	Return Data
End Sub

Private Sub CListView_ItemClick (Index As Int, Value As Object)
	Try
		Dim I As Intent
		i.Initialize(I.ACTION_VIEW,Value)
		StartActivity(I)
	Catch
		Log(LastException)
	End Try
End Sub