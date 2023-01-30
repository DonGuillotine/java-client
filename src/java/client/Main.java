/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import ejb.ApplicationSessionRemote;
import javax.ejb.EJB;

/**
 *
 * @author Donald
 */
public class Main {

    @EJB
    private static ApplicationSessionRemote applicationSession;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Result: "+ applicationSession.add(2,4));
    }
    
}
