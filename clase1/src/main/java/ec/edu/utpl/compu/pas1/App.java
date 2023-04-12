package ec.edu.utpl.compu.pas1;

import java.sql.*;

public class App {
    public static void main (String[] args) throws Exception {
        Connection con =
                DriverManager.getConnection("jdbc:h2:~/dbpa","sa","");

            //1. crear tabala
            //createTabl(con)

            //2. insretar datos
            insertData(con);
            getAllData(con);
            con.close();

    }

    private static void getAllData(Connection con) throws SQLException{
        String select = "SELECT ID, FIRST_NAME, LAST_NAME, AGE FROM REGISTRATION";
        try(Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(select)
        ){
            while (rs.next()){
                System.out.printf("%d - %s %s (%d)\n",
                        rs.getInt("ID"),
                        rs.getString("LAST_NAME"),
                        rs.getString("FIRST_NAME"),
                        rs.getInt("AGE")
                        );
            }
        }
    }

    private static void insertData(Connection con) throws SQLException{
        var data = """
                INSERT INTO REGISTRATION VALUES (1, 'CRISTIAN', 'RODRIGUEZ', 22);
                INSERT INTO REGISTRATION VALUES (2, 'CARLA', 'BENITEZ', 11);
                INSERT INTO REGISTRATION VALUES (3, 'CAROLINA', 'SARANGO', 32);
                INSERT INTO REGISTRATION VALUES (4, 'CAROLAY', 'NAPOLES', 29);
                INSERT INTO REGISTRATION VALUES (5, 'CRISTAL', 'RAMONES', 23);
                INSERT INTO REGISTRATION VALUES (6, 'CARMEN', 'CARRASCO', 10);
                """;
        try(Statement stmt = con.createStatement()){
            int count = stmt.executeUpdate(data);
            System.out.println(count);
        }
    }
            private static void createTable(Connection con) throws SQLException {
                try(Statement stmt = con.createStatement()){
                    var sqlCreateTable = """
                        CREATE TABLE IF NOT EXISTS REGISTRATION
                        (
                        ID INTEGER NOT NULL,
                        FIRST_NAME VARCHAR(255),
                        LAST_NAME VARCHAR(255),
                        AGE INTEGER,
                        CONSTRAINT REGISTRATION_pkey PRIMARY KEY (ID)
                        );
                        """;
                    stmt.executeUpdate(sqlCreateTable);
                    System.out.println("Tabla Creada");
                }
            }
 }
