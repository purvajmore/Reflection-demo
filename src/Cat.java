public class Cat {

    private final String name;
    private int age;

    public Cat(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void meow()
    {
        System.out.println("Meow");
    }
    private void heyThisIsPrivate()
    {
        System.out.println("How Did you Call This");
    }
    public static void thisIsPublicStaticMethod()
    {
        System.out.println("I am Public and Static");
    }
    private static void thisIsPrivateStaticMethod()
    {
        System.out.println("Hey I am Private And Static");
    }

}
