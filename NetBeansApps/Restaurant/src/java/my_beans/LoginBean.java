/*
 * LoginBean.java
 * Clint Riley, Chris Olson
 * March 27, 2010
 */
package my_beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Bean to process the login form.
 * @author Clint
 */
@ManagedBean(name = "LoginBean")
@SessionScoped
public class LoginBean {

    private String username;
    private String password;
    private String email = "";
    private String fullName = "";
    private String favStore ="select";
    private String response = "LoginGood.xhtml";
    private boolean login = false;
    private String errorResponse = "";

    /** Creates a new instance of LoginBean */
    public LoginBean() {
    }

    public void updateFrom(LoginBean lb){
        email = lb.getEmail();
        fullName = lb.getFullName();
        favStore = lb.getFavStore();
    }

    public String getLogin(){
        String out = (login)?"true":"false";

        return out;
    }
    public String isLogin() {
        if (login) {
            return "true";
        }
        return "false";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getErrorResponse() {
        return errorResponse;
    }

    public void setErrorResponse(String errorResponse) {
        this.errorResponse = errorResponse;
    }

    public String getFavStore() {
        return favStore;
    }

    public void setFavStore(String favStore) {
        this.favStore = favStore;
    }
    
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }

    /**
     *
     * @return Result of login process
     */
    public String login() {
        System.out.println("Login fired");

        errorResponse = "";
        LoginBean temp;
        if ((temp = LoginBeanDA.validInfo(username, password))!=null) {
            System.out.println("Good login");
            login = true;
            updateFrom(temp);
            return "account.xhtml";
        } else {
            System.out.println("Bad login");
            errorResponse = "Invalid username or password";
            return "login.xhtml";
        }
    }

    public String logout() {
        login = false;
        username = "";
        password = "";
        return "index.xhtml";

    }

    /**
     * Gets a string representing the type of error.
     * @return Error message depending on nature of failure
     */
    public String errorResponse() {
        return errorResponse;
    }

    public String checkLogin() {
        String outHtml = "test";
        if (login) {
            outHtml += "Here";
        } else {
            outHtml += "Else Here";
            outHtml += "<h:panelGrid columns=\"1\">";
            outHtml += "<h:panelGroup layout=\"block\">\n";
            outHtml += "<h:form>\n<h:commandLink action=\"#{loginBean.login()}\" value=\"login\" />";
            outHtml += "</h:form>\n</h:panelGroup>";
        }
        return outHtml;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the response
     */
    public String getResponse() {
        return response;
    }

    /**
     * @param response the response to set
     */
    public void setResponse(String response) {
        this.response = response;
    }

    public boolean checkUserName() {
        if (username.length() < 6 || username.length() > 12) {
            errorResponse = "Username must be between 6 and 12 characters";
            return false;
        }
        if(LoginBeanDA.usernameTaken(username)){
            errorResponse = "Username '"+username+"' has already been taken";
            return false;
        }
        return true;
    }

    public boolean checkPassword() {
        if (password.length() < 6 || password.length() > 12) {
            errorResponse = "Password must be between 6 and 12 characters";
            return false;
        }
        return true;
    }

    public boolean checkName(){
        if(fullName.equals("")){
            errorResponse = "Please enter your name";
            return false;
        }
        return true;
    }

    public boolean checkEmail(){
        boolean result = true;
        int atPosition = email.indexOf("@");
        if (atPosition == -1 // must have an @ sign
                || atPosition == 0 // no @ at the beginning
                || atPosition == email.length() - 1) // no @ at the end
        {
            result = false;
        } else {
            atPosition = email.indexOf("@", atPosition + 1);
            if (atPosition != -1) {
                result = false; //more than one @ symbol
            }
        }

        if (result) {
            //check periods
            if(email.charAt(0)=='.'||email.charAt(email.length()-1)=='.'){
                result=false;
            }else{
                atPosition = email.indexOf("@");
                int periodPos = email.indexOf(".", atPosition+1);
                if(email.charAt(atPosition-1)=='.'||periodPos==atPosition+1||periodPos == -1){
                    result=false;
                }
            }
        }

        if(!result){
            errorResponse = "Invalid email address";
        }
        return result;

    }

    public String persist() {
        int error = 0;
        errorResponse = "";
        
        if (checkName()&&checkUserName() && checkPassword()&&checkEmail()) {
            error = LoginBeanDA.storeCustomerToDB(this);
        }
        if (error == 0) {
            return "signup.xhtml";
        }
        login();
        return "account.xhtml";
    }

    public String update(){
        int error = 0;
        errorResponse = "";


        error = LoginBeanDA.updateCustomerToDB(this);
        
        return "account";
    }
}
