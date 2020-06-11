import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

class SILab2Test {
    List<String > allStudents ;
    private final SILab2 tester = new SILab2();

    public SILab2Test() {

        allStudents = new LinkedList<>();

        allStudents.add("User1");
        allStudents.add("User2");
    }

    @Test
    void MultipleConditionTester(){
        User user = new User("User1","pass112","user1@email.com");
        Assertions.assertEquals((Object)true,(Object)tester.function(user,allStudents));
        user = new User("User22","pass22","user22@email.com");
        Assertions.assertEquals((Object)false,(Object)tester.function(user,allStudents));
        user = new User("User22","pass22",null);
        Assertions.assertEquals((Object)true,(Object)tester.function(user,allStudents));
    }

    @Test
    void EveryStatementTester(){
        User user = new User("User1","pass112","user1@email.com");
        Assertions.assertEquals((Object)false,(Object)tester.function(user,allStudents));
        user = new User("User22","pass22","user22@email.com");
        user = new User("User22","pass22",null);
        Assertions.assertEquals((Object)false,(Object)tester.function(user,allStudents));
        User finalUser = user;
        Assertions.assertThrows(RuntimeException.class,()->tester.function(finalUser,allStudents));


    }
}