package services;

import mvvm.model.implementation.*;
import mvvm.model.interfaces.*;

public class ServicesFlyweight {
    private ServerAccessFlyweight serverAccessFlyweight;
    private IUserService userService;
    private IAdminService adminService;
    private ICurrencyService currencyService;

    public ServicesFlyweight(ServerAccessFlyweight serverAccessFlyweight) {
        this.serverAccessFlyweight = serverAccessFlyweight;
    }

    public IUserService getUserService() {
        if(userService == null){
            userService = new UserService(serverAccessFlyweight.getUserServer());
        }
        return userService;
    }
    public IAdminService getAdminService() {
        if(adminService == null){
            adminService = new AdminService(serverAccessFlyweight.getAdminServer());
        }
        return adminService;
    }
    public ICurrencyService getCurrencyService() {
        if(currencyService == null){
            currencyService = new CurrencyService(serverAccessFlyweight.getCurrencyServer());
        }
        return currencyService;
    }
}
