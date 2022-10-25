/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.server;

import common.ICalculator;
import java.net.InetAddress;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import javax.swing.JTextArea;

/**
 *
 * @author Admin
 */
public class CalculatorImpl extends UnicastRemoteObject implements ICalculator{

    JTextArea jTextArea1;

    public CalculatorImpl(JTextArea jTextArea1) throws RemoteException {
        this.jTextArea1 = jTextArea1;
    }
    
    @Override
    public int cong(int a, int b) throws RemoteException {
        jTextArea1.append("Client request server 'cong'\n");
        return a + b;
    }

    @Override
    public int tru(int a, int b) throws RemoteException {
        jTextArea1.append("Client request server 'tru'\n");
        return a - b;
    }

    @Override
    public String getServerName() throws RemoteException {
        jTextArea1.append("Client request service 'getServerName'\n");
        try{
            InetAddress server = InetAddress.getLocalHost();
            return server.getHostAddress();
        } catch(java.net.UnknownHostException ex){
            return null;
        }
    }
}
