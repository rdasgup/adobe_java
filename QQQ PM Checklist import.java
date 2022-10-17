// Dieses Script fuellt die MS-Chekliste mit den
// Daten aus "Z:\Transfer\TTemp\MSDaten.txt" und
// Schreibt die neue Datei nach
// "Z:\Transfer\Ttemp\_PM_Checkliste.pdf"
// (c) R. Das Gupta
// Letzte Aenderung: 2020-Aug-19

// Variablen Definition
var DataFile = "/z/Transfer/Ttemp/MSDaten.txt"
var rdgPath = "/z/Transfer/Ttemp/PM-Checklist_MS.pdf"

// Systemdaten und SO# einlesen
   var result = rdgGetData (DataFile,0);
// Datei mit den Daten speichern
   if (!result)
     {   
        rdgSaveFile (rdgPath);
     }
     else
     {
        app.alert ("Achtung! Datei: " + DataFile + " nicht vorhanden.")
     }
