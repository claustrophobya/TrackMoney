package trackmoney.stefan.claudia.myapplication;
import android.content.ContentValues;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Xibalba on 04-Nov-17.
 */
// creating the class

public class Database extends SQLiteOpenHelper{
    public static final String DATABASE_NAME = "TrackMonet.db";
    public static final String TABLE_NAME = "TrackMoneyApp";
    public static final String COL_1 ="Balance";
    public static final String COL_2 ="Current Balance";
    public static final String COL_3 ="Period_of_time";
    public static final String COL_4 ="weekly";
    public static final String COL_5 ="monthly";
    public static final String COL_6 ="Category";
    public static final String COL_7 ="Rent";
    public static final String COL_8 ="Food";
    public static final String COL_9 ="Utilities";
    public static final String COL_10 ="Enterteinment";

    // creating the database
    public Database(Context context) {
        super(context, DATABASE_NAME, null, 1);

    }

    @Override
    public void onCreate (SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME + " (Balance INTEGER, Current Balance INTEGER, Period of time TEXT, weekly TEXT, monthly TEXT, Category TEXT, Rent TEXT, Food TEXT, Utilities TEXT, Enterteinment TEXT)");

    }

    @Override
    public void onUpgrade (SQLiteDatabase db, int oldVersion, int newVersion) {
       db.execSQL("DROP TABLE IF EXISTS" + TABLE_NAME );
        onCreate (db);
    }

    public boolean insertData (String Balance, String PeriodTime, String weekly, String monthly) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1, Balance);
        contentValues.put(COL_3, PeriodTime);
        contentValues.put(COL_4, weekly);
        contentValues.put(COL_5, monthly);

        long result = db.insert(TABLE_NAME,null, contentValues);
        if (result == -1)
            return false;
        else
            return true;

        }
    }
          //  public static final String Balance = "Balance";
            //public static final String Current_Balance = "Current Balance";
          //  public static final String Period_of_time = "Period of time";
         //   public static final String weekly = "weekly";
         //   public static final String monthly = "monthly";
          //  public static final String Category = "Category";
         //   public static final String Rent = "Rent";
        //    public static final String Food = "Food";
         //   public static final String Utilities = "Utilities";
        //    public static final String Enterteinment = "Enterteinment";


