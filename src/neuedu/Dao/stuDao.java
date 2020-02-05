package neuedu.Dao;

import neuedu.Pojo.stu;

import java.util.List;

public interface stuDao {
    int add(stu stu);
    List<stu> select();

}
