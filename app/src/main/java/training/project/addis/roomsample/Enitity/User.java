package training.project.addis.roomsample.Enitity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by addis on 11/26/17.
 */

@Entity
public class User {

    @PrimaryKey
    private int uId;


    @ColumnInfo(name = "first_name")
    private String firsName;

    @ColumnInfo(name = "last_name")
    private String lastName;


}
