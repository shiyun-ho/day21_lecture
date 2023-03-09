package sg.moe.nus.iss.day21_lecture.repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import sg.moe.nus.iss.day21_lecture.model.customer;

@Repository
//Step 3: Write repo layer
public class CustomerRepository {

    @Autowired
    //Since we are connecting to DB, we are using jdbc template
    //Defines connection string -> Open Connection with jdbc template
    JdbcTemplate jdbcTemplate;

    //string query that is sql query
    //don't need sql semicolon
    //do the query within sql workbench first
    // private final String findAllSQL = "select * from customer"; 
    private final String findAllSQL = "select id, first_name, last_name, dob from customer"; 

    //function to call and retrieve data\//no limit and offset
    public List<customer> getAllCustomers(){
        //id is incremental, either this or linkedlist
        final List<customer> custList = new ArrayList<customer>(); 
        //not linkedlist, instead array list is used
        final SqlRowSet rs = jdbcTemplate.queryForRowSet(findAllSQL); 

        //while there is a next record
        while (rs.next()){
            customer cust = new customer(); 
            cust.setId(rs.getInt("id"));
            //getString for nvarchar
            cust.setFirstName(rs.getString("first_name"));
            cust.setLastName(rs.getString("last_name"));
            cust.setDob(rs.getDate("dob"));
            custList.add(cust);
        }

        return Collections.unmodifiableList(custList);
        
    }

}
