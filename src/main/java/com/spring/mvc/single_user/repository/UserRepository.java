package com.spring.mvc.single_user.repository;

import com.spring.mvc.single_user.entities.User;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

//只須定義interface的規格，即可交由springData管理了

/*
只需定義 interface 的規格, 實作內容是由 SpringData 幫你做
<User, Long> -> User 指的是Entity的類別名, Long 指的是 @Id 的資料型別
方法命名規則：https://blog.csdn.net/sbin456/article/details/53304148
1. 方法查詢以 get | find | read 開頭
2. 涉及條件查詢時, 條件的屬性(字首大寫)用條件關鍵字(And | Or)來連結
3. 若要使用聯集的屬性, 則屬姓名前面要加上 _ (底線)
Ex: getNameBySalary_id
*/
@Repository
public interface UserRepository extends JpaRepository<User, Long> {//<User, Long>指entity的類別名、該類別的id的型別

    User getByName(String name);

    //Where name Like ?% And id < ?
    //Where name Like 'S%' And id < 100
    List<User> getByNameStartingWithAndIdLessThan(String name, Long id);

    //Where name Like ?% And id >= ?
    List<User> getByNameStartingWithAndIdGreaterThanEqual(String name, Long id);

    //Where id in (?,?,?) Or birth < ?
    //Where id in (2,4,6) Or birth < ?
    List<User> getByIdInOrBirthLessThanEqual(List<Long> ids, Date birth);

//        -- SQL
//        SELECT * FROM T_User u WHERE (YEAR(current_date) - YEAR(u.BIRTH)) < 20
//        -- JPQL
//        SELECT u FROM User u WHERE (YEAR(current_date) - YEAR(u.birth)) < :age
    @Query("SELECT u FROM User u    WHERE(YEAR(current_date) - YEAR(u.birth)) < :age")
    List<User> getByAgeLessThan(Integer age);

    // 查詢資料筆數
    @Query(value = "SELECT count(id) FROM T_User", nativeQuery = true)
    Long getTotalCount();
}
