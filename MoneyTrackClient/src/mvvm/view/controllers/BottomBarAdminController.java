package mvvm.view.controllers;

import javafx.scene.input.MouseEvent;
import mvvm.view.ViewController;
import mvvm.view.Views;
import services.ViewHandler;
import services.ViewModelFlyweight;

public class BottomBarAdminController extends ViewController {
    private ViewHandler viewHandler;

    @Override
    public void init(ViewModelFlyweight viewModelFlyweight, ViewHandler viewHandler) {
        this.viewHandler = viewHandler;
    }
    public void categories(MouseEvent mouseEvent){
        System.out.println("categories");

    }
    public void currencies(MouseEvent mouseEvent){
        System.out.println("currencies");
        viewHandler.setCenterView(Views.Currencies.name());

    }
    public void administrators(MouseEvent mouseEvent){
        System.out.println("administrators");

    }
    public void settings(MouseEvent mouseEvent){
        System.out.println("settings");

    }
}
