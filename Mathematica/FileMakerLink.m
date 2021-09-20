(* ::Package:: *)

(* FileMaker Link for Mathematica

   Copyright (c) 2020-2021  Chun Tian (binghe) <binghe.lisp@gmail.com>
   Version: 1.0

   Usage: put fmjdbc.jar into $UserBaseDirectory/Applications/Oracle/Java
 *)

BeginPackage["FileMakerLink`", {"DatabaseLink`"}]

OpenFileMakerConnection::usage = "Open a connection to a (local) FileMaker Pro database."
CloseFileMakerConnection::usage = "Close the FileMaker Pro database connection."

Begin["`Private`"]
	OpenFileMakerConnection[db_, user_, pass_] :=
		OpenSQLConnection[JDBC["com.filemaker.jdbc.Driver",
			"jdbc:filemaker://localhost/" <> db],
			"Name" -> "FMP" (* this is fixed for FileMaker Pro *),
			"Username" -> user,
			"Password" -> pass];
	
	CloseFileMakerConnection[conn_] := CloseSQLConnection[conn];
End[]

EndPackage[]

