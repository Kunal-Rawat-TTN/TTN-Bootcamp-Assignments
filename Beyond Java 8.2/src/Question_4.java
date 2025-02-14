//Superclass
sealed abstract class GovernmentOfIndia permits DefenceMinistry, ForeignMinistry
{
    abstract void notificationMessage();
}

//Child class of GovernmentOfIndia and parent of Army class
sealed class DefenceMinistry extends GovernmentOfIndia permits Army
{
    @Override
    void notificationMessage() {
        System.out.println("This is the notification from Defence Ministry");
    }
}

//Child class of GovernmentOfIndia and parent of Embassy class
sealed class ForeignMinistry extends GovernmentOfIndia permits Embassy
{
    @Override
    void notificationMessage() {
        System.out.println("This is the notification from Foreign Ministry");
    }
}

//Child class of DefenceMinistry, parent of GarhwalRifles class and grandChild of GovernmentOfIndia class
non-sealed class Army extends DefenceMinistry
{
    @Override
    void notificationMessage() {
        System.out.println("This is the notification from Army");
    }
}

//Child class of ForeignMinistry and grandChild of GovernmentOfIndia class
final class Embassy extends ForeignMinistry
{
    @Override
    void notificationMessage() {
        System.out.println("This is the notification from Embassy");
    }
}

//Child class of Army, grandChild of DefenceMinistry and great-grandchild of GovernmentOfIndia class
class GarhwalRifles extends Army
{
    @Override
    void notificationMessage() {
        System.out.println("This is the notification from Garhwal Rifles");
    }
}

public class Question_4 {
    public static void main(String[] args) {
        GarhwalRifles pauriRegiment=new GarhwalRifles();
        pauriRegiment.notificationMessage();

        Army army = new Army();
        army.notificationMessage();

        Embassy ukEmbassy = new Embassy();
        ukEmbassy.notificationMessage();

        ForeignMinistry foreignMinistry = new ForeignMinistry();
        foreignMinistry.notificationMessage();

        DefenceMinistry defenceMinistry = new DefenceMinistry();
        defenceMinistry.notificationMessage();

    }
}