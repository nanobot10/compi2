SET JFLEX_HOME= D:\Estudio\Universidad\compi2\jflex-1.7.0\lib\jflex-full-1.7.0.jar
cd D:\Estudio\Universidad\compi2\workspace\Tarea2_201213146\src\com\usac\compi2\analizadores
java -jar %JFLEX_HOME% lexico.flex
pause  

SET CUP_HOME= D:\Estudio\Universidad\compi2\java-cup-11b.jar
cd D:\Estudio\Universidad\compi2\workspace\Tarea2_201213146\src\com\usac\compi2\analizadores
java -jar %CUP_HOME% -parser parser parser.cup
pause
