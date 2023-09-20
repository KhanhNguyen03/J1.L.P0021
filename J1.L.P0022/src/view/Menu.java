package view;

import controller.Management;


public class Menu extends MenuGenaric {
    public Menu(String title, String[] s) {
        super(title,s);
    }

    Management manager = new Management();
    @Override
    public boolean execute(int choice) {
        switch (choice) {
            case 1:
                manager.addCandidate(0);
                break;
            case 2:
                manager.addCandidate(1);
                break;
            case 3:
                manager.addCandidate(2);
                break;
            case 4:
                manager.searchCandidate();
                break;
            case 5:
                return true;
            default:
                break;
        }
        return false;
    }
}


