package chattingRoom;

import java.util.*;
import java.rmi.*;
import java.rmi.server.*;

/**
 *
 * @author Jason.
 */
public class UserObj extends UnicastRemoteObject implements IUser{
    public UserObj() throws RemoteException{
    }

    @Override
    public void updateUserList(List<String> userName) throws RemoteException {
        ChatRoom._updateUserList(userName);
    }

    @Override
    public void msgArrived(String msg, String fromUser) throws RemoteException {
        ChatRoom._msgArrived(msg, fromUser);
    }
}
