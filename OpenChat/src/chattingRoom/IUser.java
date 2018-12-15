package chattingRoom;

import java.util.*;
import java.rmi.*;

/**
 *
 * @author Jason.
 */
public interface IUser extends Remote{
    public void updateUserList (List<String> userName) throws RemoteException;
    public void msgArrived (String msg, String fromUser) throws RemoteException;
}
