package com.example.mealsapp.database;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MealCategoryDao_Impl implements MealCategoryDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<MealsCategoryDb> __insertionAdapterOfMealsCategoryDb;

  public MealCategoryDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMealsCategoryDb = new EntityInsertionAdapter<MealsCategoryDb>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `meals_category_list` (`idCategory`,`nameCategory`,`imageCategoryUrl`,`descCategory`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MealsCategoryDb value) {
        if (value.getIdCategory() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getIdCategory());
        }
        if (value.getNameCategory() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNameCategory());
        }
        if (value.getImageCategoryUrl() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getImageCategoryUrl());
        }
        if (value.getDescCategory() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescCategory());
        }
      }
    };
  }

  @Override
  public void insertMealsCategory(final List<MealsCategoryDb> mealCategory) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfMealsCategoryDb.insert(mealCategory);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<MealsCategoryDb>> getListMealsCategory() {
    final String _sql = "SELECT * FROM meals_category_list";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"meals_category_list"}, false, new Callable<List<MealsCategoryDb>>() {
      @Override
      public List<MealsCategoryDb> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfIdCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "idCategory");
          final int _cursorIndexOfNameCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "nameCategory");
          final int _cursorIndexOfImageCategoryUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "imageCategoryUrl");
          final int _cursorIndexOfDescCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "descCategory");
          final List<MealsCategoryDb> _result = new ArrayList<MealsCategoryDb>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final MealsCategoryDb _item;
            final String _tmpIdCategory;
            _tmpIdCategory = _cursor.getString(_cursorIndexOfIdCategory);
            final String _tmpNameCategory;
            _tmpNameCategory = _cursor.getString(_cursorIndexOfNameCategory);
            final String _tmpImageCategoryUrl;
            _tmpImageCategoryUrl = _cursor.getString(_cursorIndexOfImageCategoryUrl);
            final String _tmpDescCategory;
            _tmpDescCategory = _cursor.getString(_cursorIndexOfDescCategory);
            _item = new MealsCategoryDb(_tmpIdCategory,_tmpNameCategory,_tmpImageCategoryUrl,_tmpDescCategory);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
