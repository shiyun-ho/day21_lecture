package sg.moe.nus.iss.day21_lecture.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Step 2: Create model

@Data
@AllArgsConstructor
@NoArgsConstructor

public class customer {
    //refer to sql query

    // create table customer(
	// id			int not null auto_increment,
    // first_name	varchar(100) not null, 
    // last_name 	varchar(100) not null, 
    // constraint	customer_pk primary key(id)
    // );

    // select * from customer;
    // update customer 
    // set dob = "1965-08-09" -> dob created
    // where id = 1;

    private Integer id;  
    private String firstName;
    private String lastName;
    private Date dob; 
}
