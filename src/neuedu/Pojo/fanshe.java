package neuedu.Pojo;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class fanshe {
    public static void main(String[] args) {
        try {
            Class aClass =Class.forName("com.edu.Pojo.stu");
            System.out.println(aClass.getName());           /*获取类的全名称*/
            System.out.println(aClass.getSimpleName());       /*获取类的名称*/
            System.out.println(aClass.getDeclaredField("age").getName());  /*获取类的单独属性*/
            Field[] files =aClass.getDeclaredFields();
            for (Field f:files)
            {
                System.out.println(f.getName());                 /*获取全部的属性*/
            }
            System.out.println(aClass.getMethod("a"));     /*获取类中单独的方法*/
           Method[] methods = aClass.getMethods();
            for (Method m:methods)
            {
                System.out.println(m.getName());             /*获取类中的全部方法*/
            }




            Class aClass1 =Class.forName("com.edu.Pojo.stu");
           Object stu1 = aClass.newInstance();
           Method method1 =aClass1.getMethod("a");          /*对象调用方法*/
            method1.invoke(stu1);

















        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
