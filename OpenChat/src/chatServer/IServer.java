package chatServer;

import java.rmi.*;
import chattingRoom.*;

/**
 *
 * @author Jason.
 */
public interface IServer extends Remote{
    public boolean registerToServer(IUser user, String name) throws RemoteException;
    public void msgToServer(String msg, String fromUser, String toName) throws  RemoteException;
    public void logoutToServer(IUser user, String name) throws  RemoteException;
}
