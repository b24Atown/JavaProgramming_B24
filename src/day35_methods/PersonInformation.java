package day35_methods;

public class PersonInformation {

    /*
    building up email
    parameterrs: name (first and last), domain
    buildEmaili("james bond", "gmail")
    output james_bond@gmail.com
     */
    public static void buildEmail(String name,String domain){

        name = name.replace(" ", "_");
        //could have also used substring, or split. so keep in mind the person will put their full name, you wanna take the space and make it an underscore so their name comes as james_bond when they input james bond

        System.out.println(name + "@" + domain + ".com");

    }



    public static void login(String username,String password){
        if(username.equals("jbond007") && password.equals("bond007")){
            System.out.println("LOGGED IN");
        }else{
            System.out.println("INVALID CREDENTIALS");
        }
    }

    public static void main(String[] args) {
        buildEmail("james bond","gmail");
        buildEmail("adam smith", "yahoo");

        login("admin","password");
        login("jbond007","bond007");

    }
}
