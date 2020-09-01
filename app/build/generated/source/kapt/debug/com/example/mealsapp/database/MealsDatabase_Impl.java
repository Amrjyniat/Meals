package com.example.mealsapp.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MealsDatabase_Impl extends MealsDatabase {
  private volatile MealCategoryDao _mealCategoryDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `meals_category_list` (`idCategory` TEXT NOT NULL, `nameCategory` TEXT NOT NULL, `imageCategoryUrl` TEXT NOT NULL, `descCategory` TEXT NOT NULL, PRIMARY KEY(`idCategory`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'a69ee1b37fca5f3f3a6025524ce8813c')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `meals_category_list`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsMealsCategoryList = new HashMap<String, TableInfo.Column>(4);
        _columnsMealsCategoryList.put("idCategory", new TableInfo.Column("idCategory", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealsCategoryList.put("nameCategory", new TableInfo.Column("nameCategory", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealsCategoryList.put("imageCategoryUrl", new TableInfo.Column("imageCategoryUrl", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealsCategoryList.put("descCategory", new TableInfo.Column("descCategory", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMealsCategoryList = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMealsCategoryList = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMealsCategoryList = new TableInfo("meals_category_list", _columnsMealsCategoryList, _foreignKeysMealsCategoryList, _indicesMealsCategoryList);
        final TableInfo _existingMealsCategoryList = TableInfo.read(_db, "meals_category_list");
        if (! _infoMealsCategoryList.equals(_existingMealsCategoryList)) {
          return new RoomOpenHelper.ValidationResult(false, "meals_category_list(com.example.mealsapp.database.MealsCategoryDb).\n"
                  + " Expected:\n" + _infoMealsCategoryList + "\n"
                  + " Found:\n" + _existingMealsCategoryList);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "a69ee1b37fca5f3f3a6025524ce8813c", "f78cf855aecdae2547342796fcc95172");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "meals_category_list");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `meals_category_list`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public MealCategoryDao getMealDao() {
    if (_mealCategoryDao != null) {
      return _mealCategoryDao;
    } else {
      synchronized(this) {
        if(_mealCategoryDao == null) {
          _mealCategoryDao = new MealCategoryDao_Impl(this);
        }
        return _mealCategoryDao;
      }
    }
  }
}
