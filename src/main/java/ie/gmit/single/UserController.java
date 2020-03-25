package ie.gmit.single;
/**
 * Arvids Ceceruks
 * Group A
 * Single responsibility principle Lab-assignment
 * 23/03/2019
 * ****User Controller****
 */

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserController {

    //Handles incoming JSON requests that work on User resource/entity
    private UserStoring userStoring = new UserStoring();
        //Create a new user
        public String createUser(String userJson) throws IOException {
            ObjectMapper mapper = new ObjectMapper();

            User user = mapper.readValue(userJson, User.class);

           UserValidation uv = new UserValidation();

           boolean validUser = uv.userCheck(user);

            if(!validUser) {
                return "ERROR";
            }
            userStoring.storeUser(user);


            return "SUCCESS";
        }



 }

