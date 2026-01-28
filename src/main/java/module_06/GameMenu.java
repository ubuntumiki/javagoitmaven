package example.com.module_06;

class GameMenu {

    abstract static class MenuItem {
        public abstract String getAction();
    }

    static class Start extends MenuItem {
        @Override
        public String getAction() {
            return "start";
        }
    }

    static class Options extends MenuItem {
        @Override
        public String getAction() {
            return "options";
        }
    }

    static class Exit extends MenuItem {
        @Override
        public String getAction() {
            return "exit";
        }
    }

    void act(MenuItem item) {
        System.out.println(item.getAction());
    }
}

class GameMenuTest {
    public static void main(String[] args) {
        GameMenu menu = new GameMenu();

        //options
        menu.act(new GameMenu.Options());

        //start
        menu.act(new GameMenu.Start());

        //exit
        menu.act(new GameMenu.Exit());
    }
}