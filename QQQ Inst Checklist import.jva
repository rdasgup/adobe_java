// Dieses Script fuellt die MS-Inst Checkliste mit den
// Daten aus "Z:\Transfer\TTemp\MS-Inst_Daten.txt" und
// Schreibt die neue Datei nach
// "Z:\Transfer\Ttemp\_MS-Inst_Checklist.pdf"
// (c) R. Das Gupta
// Letzte Aenderung: 2020-Nov-18

// Variablen Definition
var DataFile = "/z/Transfer/Ttemp/MS-Inst_Daten.txt"
var rdgPath = "/z/Transfer/Ttemp/Inst_Checklist_QQQ.pdf"

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
