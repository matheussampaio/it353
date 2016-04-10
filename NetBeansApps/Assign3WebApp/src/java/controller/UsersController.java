package controller;

import dao.UserDAO;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.UserBean;

/**
 * @author ldacruz
 */
@ManagedBean
@SessionScoped
public class UsersController {

    private UserBean theModel;
        
    private String response;
    
    private int loginFails;
    
    private boolean loggedIn;
    
    /**
     * Creates a new instance of UsersController
     */
    public UsersController() {
        loginFails = 0;
        loggedIn = false;
        theModel = new UserBean();
    }
    
    public String createUser() {
        UserDAO userDAO = new UserDAO();
        
        boolean saved = userDAO.createUser(theModel);
                
        if (saved) {
            theModel.sendConfirmationEmail();
            this.response = theModel.getUserInfo();
        } else {
            this.response = "Couldn't create your account!";
        }

        return "echo.xhtml";
    }
    
    public String updateUser() {
        UserDAO userDAO = new UserDAO();
        
        userDAO.updateUser(theModel);

        return "update.xhtml";
    }
    
    public String login() {
        if (loginFails == 3) {
            this.response = "You already tried 3 times to login and failed.";
            loggedIn = false;
            return "LoginBad.xhtml";
        }
        
        UserDAO userDAO = new UserDAO();
        
        if (userDAO.checkLogin(theModel.getUsername(), theModel.getPassword())) {
            theModel.loadUserData(theModel.getUsername());
            loginFails = 0;
            loggedIn = true;
            this.response = "Hello, " + theModel.getUsername();
            return "LoginGood.xhtml";
        }

        loginFails++;
        loggedIn = false;
        this.response = "Invalid username / password combination. Try number: " + loginFails;
        return "LoginBad.xhtml";
    }
    
    public String onload() {
        if (!loggedIn) {
            return "login.xhtml";
        }
        
        return "";
    }
    
    public UserBean getTheModel() {
        return theModel;
    }

    public void setTheModel(UserBean theModel) {
        this.theModel = theModel;
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
    
    public String getAvailableMessage() {
        if (theModel.getUsername() == null) {
            return "";
        }
        
        if (!theModel.userNameIsUnique()) {
            return "Username not available!";
        }
        
        return "Username available!";
    }
}
