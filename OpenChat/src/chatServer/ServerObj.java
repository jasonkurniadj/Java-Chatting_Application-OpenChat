package chatServer;

import java.util.*;
import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;
import chattingRoom.*;

/**
 *
 * @author Jason.
 */
public class ServerObj extends UnicastRemoteObject implements IServer{
    static Registry reg = null;
    
    public ServerObj() throws RemoteException{
    }
    
    public static void main(String[] args) {
        try {
            reg = LocateRegistry.createRegistry(1099);
            Naming.bind("OpenChatServer", new ServerObj());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void startServer(){
        main(new String[0]);
    }
    
    public static void stopServer(){
        try {
            reg.unbind("OpenChatServer");
            UnicastRemoteObject.unexportObject(reg, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    List<IUser> users = new ArrayList<IUser>();
    List<String> usersName = new ArrayList<String>();

    @Override
    public boolean registerToServer(IUser user, String name) throws RemoteException {
        boolean resultToReturn = false;
        
        try {
            if(usersName.indexOf(name) > -1){
            
            }    
            else {
                users.add(user);
                usersName.add(name);
                resultToReturn = true;
                
                for(int i=0; i<users.size(); i++){
                    try {
                        users.get(i).updateUserList(usersName);
                    } catch (Exception e) {
                        users.remove(i);
                        usersName.remove(i);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return resultToReturn;
    }

    @Override
    public void msgToServer(String msg, String fromUser, String toName) throws RemoteException {
        if(toName.equalsIgnoreCase("All Users")){
            for(int i=0; i<users.size(); i++){
                try {
                    if(usersName.get(i).equals(fromUser)){
                        users.get(i).msgArrived(msg, "You");
                    }
                    else{
                        users.get(i).msgArrived(msg, fromUser);
                    }
                } catch (Exception e) {
                    users.remove(i);
                    usersName.remove(i);
                    
                    for(IUser iusr : users){
                        iusr.updateUserList(usersName);
                    }
                }
            }
        }
        else{
            int count = 0;
            
            for(int i=0; i<usersName.size(); i++){
                if(usersName.get(i).equals(toName)){
                    count++;
                    
                    try {
                        users.get(i).msgArrived(msg, fromUser);
                    } catch (Exception e) {
                        users.remove(i);
                        usersName.remove(i);
                        
                        for(IUser iusr : users){
                            iusr.updateUserList(usersName);
                        }
                        
                        msgToServer("User "+toName+" Seems Unavailable.", "Server", fromUser);
                        count++;
                    }
                }
                else if(usersName.get(i).equals(fromUser)){
                    count++;
                    
                    try {
                        users.get(i).msgArrived(msg, "You");
                    } catch (Exception e) {
                        users.remove(i);
                        usersName.remove(i);
                        
                        for(IUser iusr : users){
                            iusr.updateUserList(usersName);
                        }
                    }
                }
                
                if(count == 2)
                    break;
            }
        }
    }

    @Override
    public void logoutToServer(IUser user, String name) throws RemoteException {
        users.remove(users);
        usersName.remove(name);
        
        for(IUser iusr : users){
            iusr.updateUserList(usersName);
        }
    } 
}
