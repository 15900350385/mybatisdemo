package neuedu.test;

import neuedu.Dao.stuDao;
import neuedu.Pojo.stu;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class test {
    public static void main(String[] args) {
        String config = "com/edu/Dao/test.xml";
        try {

           InputStream is =  Resources.getResourceAsStream(config);
            SqlSessionFactory factory= new SqlSessionFactoryBuilder().build(is);
            SqlSession sqlSession = factory.openSession();
//            Map<String,Object> map = new HashMap<>();
//            map.put("id",12);
//            map.put("name","dus");
//            List<stu> stus =sqlSession.selectList("select",map);
//            for (stu s :stus)
//            {
//                System.out.println(s);
//            }




//            stu  stu = new stu();
//            stu.setId(12);
//            stu.setName("dus");
//            stu.setAge(22);
//            sqlSession.insert("add",stu);






            stuDao dao = sqlSession.getMapper(stuDao.class);
            List<stu> list = dao.select();
            for (stu s:list
                 ) {
                System.out.println(s);
            }







            stu stu1 = new stu();
            stu1.setAge(15);
            stu1.setName("动态");
            stu1.setId(55);
            dao.add(stu1);





            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
