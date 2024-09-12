import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Entry {
    public static void main(String[] args) throws Exception{
        Cat myCat = new Cat("stella", 5);
        Field[]catField = myCat.getClass().getDeclaredFields();


       ///// @///////////This is to get all the fields or data member name.
        for(Field field : catField)
        {
            System.out.println(field.getName());
        }

        for(Field field : catField)
        {
            if(field.getName().equals("name"))
            {
                field.setAccessible(true);
                field.set(myCat, "Santra Billa");
            }
            else if(field.getName().equals("age"))
            {
                field.setAccessible(true);
                field.setInt(myCat, 7);
            }
        }
        System.out.println(myCat.getName());
        System.out.println(myCat.getAge());
//
//
//
//        Method[] catMethod = myCat.getClass().getDeclaredMethods();
//
////        @ This is to get all the methods name;
////        for(Method method : catMethod)
////        {
////            System.out.println(method.getName());
////        }
//
//        for(Method method : catMethod)
//        {
//            if(method.getName().equals("thisIsPublicStaticMethod"))
//            {
//                method.setAccessible(true);
//                method.invoke(myCat);
//            }
//        }
//
    }
}
