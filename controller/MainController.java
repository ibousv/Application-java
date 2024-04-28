/**
 * Controller package
 */
package controller;

import model.*;
/**
 * The Main Controller
 * extend Verify class
 */
public class MainController extends Verify {

  String login;
  String password;

// Getters and Settersi

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


}
