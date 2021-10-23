package HomeWork;

class Actor {
    public void act(){}
}

class HappyActor extends Actor {
    public void act() {
        System.out.println("HappyActor!");
    }
}

class SadActor extends Actor {
    public void act() {
        System.out.println("SadActor!");
    }
}

class Stage {
    Actor actor = new HappyActor();

    public void change(SadActor actor) {
        this.actor = actor;
    }

    public void act() {
        this.actor.act();  //actor.act也行
    }
}

public class Test7 {
    public static void main(String[] args) {
        Stage stage = new Stage();
        stage.act();
        stage.change(new SadActor());
        stage.act();
    }
}
