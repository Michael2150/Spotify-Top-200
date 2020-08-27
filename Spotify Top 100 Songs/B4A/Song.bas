B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10
@EndOfDesignText@
Sub Class_Globals
	''Properties
	Public Rank As Int = 0
	Public SongName As String = ""
	Public Artist As String = ""
	Public Streams As Int = 0
	Public Link As String = ""
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(data() As String)
	Rank = data(0)
	SongName = data(1)
	Artist = data(2)
	Streams = data(3)
	Link = data(4)
End Sub

Public Sub GetSummary As String
	Return $" (${Rank}) ${CRLF} ${SongName} ${CRLF} ${Artist} ${CRLF} Streams: ${Streams}"$
End Sub