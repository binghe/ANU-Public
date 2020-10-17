(* ::Package:: *)

(* Copyright 2020  Chun Tian (binghe) <binghe.lisp@gmail.com>
   Version: 1.0

   Usage: put fmjdbc.jar into $UserBaseDirectory/Applications/Oracle/Java
 *)

BeginPackage["FMPLink`", {"DatabaseLink`", "JLink`"}]

OpenFMPConnection::usage = "Open a connection to a FileMaker Pro database."
CloseFMPConnection::usage = "Close the FileMaker Pro database connection."

Begin["`Private`"]
	OpenFMPConnection[db_, user_, pass_] :=
		OpenSQLConnection[JDBC["com.filemaker.jdbc.Driver",
			"jdbc:filemaker://localhost/" <> db],
			"Name"->"FMP" (* this is a fixed name *),
			"Username"->user,
			"Password"->pass];
	
	CloseFMPConnection[conn_] := CloseSQLConnection[conn];
End[]

EndPackage[]
