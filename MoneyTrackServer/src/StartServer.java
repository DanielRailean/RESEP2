
import database.implementation.UserService;
import networking.implementation.UserServer;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class StartServer {

    public static void main(String[] args) throws RemoteException {
        Registry registry = LocateRegistry.createRegistry(4000);
        new UserServer(new UserService(), registry);
    }

}
