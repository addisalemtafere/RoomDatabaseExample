package training.project.addis.roomsample.DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import training.project.addis.roomsample.Enitity.User;

/**
 * Created by addis on 11/26/17.
 */

@Dao
public interface UserDao {

    @Query("select * from User")
    List<User> getAll();

    @Query("select * from User where uId IN(:userIds)")
    List<User> loadAllByIds(int[] userIds);

    @Query("select * from user where first_name like :first AND " +
            "last_name like:last limit 1 ")
    List<User> finByName(String first, String last);

    @Insert
    void insertAll(User... users);

    @Delete
    void delete(User user);

}
