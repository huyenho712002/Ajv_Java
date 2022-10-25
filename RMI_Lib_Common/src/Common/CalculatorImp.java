/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

import java.io.UncheckedIOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import javax.swing.JTextArea;

/**
 *
 * @author ADMIN
 */
public class CalculatorImp extends UnicastRemoteObject implements ICalculator{
    CalculatorImp() throws RemoteException{}
    JTextArea jTextArea;
    CalculatorImp(JTextArea jTextArea) throws RemoteException{
        this.jTextArea = jTextArea;
    }
    
    @Override
    public int cong(int a, int b) throws RemoteException {
        jTextArea.append("Client Request server 'cong'\n");
        return a + b;
    }

    @Override
    public int tru(int a, int b) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getServerName() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
