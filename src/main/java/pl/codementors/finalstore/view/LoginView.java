package pl.codementors.finalstore.view;


import pl.codementors.finalstore.FinalUserDAO;

import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class LoginView implements Serializable {

    @EJB
    private FinalUserDAO dao;


}
