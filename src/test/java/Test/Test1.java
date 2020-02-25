package Test;

import com.neuedu.pojo.Student;
import com.neuedu.sever.IterfaceStudent;
import com.neuedu.sever.Sever;

import java.util.List;

/**
 * Created by heystephen on 2020/2/25.
 */
public class Test1 {
    public static void main(String[] args) {
        IterfaceStudent iterfaceStudent = new Sever();
        List<Student>list =  iterfaceStudent.query();
        System.out.println(list);
    }
}
