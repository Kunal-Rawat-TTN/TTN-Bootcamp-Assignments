package com.kunalTTN;

import com.google.gson.Gson;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Getter
@AllArgsConstructor
@ToString
public class Main {
    int sampleID;
    String name;
    public static void main(String[] args) throws SQLException {
        //use of lombok [provided dependency]
        Main sample1=new Main(1,"Kunal Rawat");
        System.out.println(sample1.getName());

        //use of Gson [compile time]
        Gson gson = new Gson();
        String json = gson.toJson(new int[]{1, 2, 3});
        System.out.println(json); // Output: [1,2,3]

        //use of jdbc [runtime]
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mavenDB", "root", "KRawat@2212");
        System.out.println("Connected to MySQL Database!");
    }
}