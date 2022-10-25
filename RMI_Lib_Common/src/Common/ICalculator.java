/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author ADMIN
 */
public interface ICalculator extends Remote{
    int cong(int a, int b) throws RemoteException;
    int tru(int a, int b) throws RemoteException;
    String getServerName() throws RemoteException;
}
