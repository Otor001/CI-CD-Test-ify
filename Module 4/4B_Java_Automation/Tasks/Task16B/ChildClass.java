package Tasks.Task16B;

public class ChildClass extends ParentClass {

    public void familyName(String name){
        super.familyName(name);
    }
    @Override
    public void familyRace(boolean race) {
        super.familyName(String.valueOf(race));
    }

    public static void main(String[] args) {
        ChildClass family = new ChildClass();

        family.familyName("Otor");
        family.familyRace(true);
    }
}


