package com.twocloo.base.db; class DBAccess { void a() { int a;
a=0;// .class public abstract Lcom/twocloo/base/db/DBAccess;
a=0;// .super Ljava/lang/Object;
a=0;// .source "DBAccess.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field protected static volatile db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final ctx:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 0
a=0;//     .param p1, "ctx"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 20
a=0;//     #p0=(Reference,Lcom/twocloo/base/db/DBAccess;);
a=0;//     iput-object p1, p0, Lcom/twocloo/base/db/DBAccess;->ctx:Landroid/content/Context;
a=0;// 
a=0;//     .line 21
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public close()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Z
a=0;//     .locals 1
a=0;//     .param p1, "tableName"    # Ljava/lang/String;
a=0;//     .param p2, "deleteCondition"    # Ljava/lang/String;
a=0;//     .param p3, "deleteArgs"    # [Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 92
a=0;//     sget-object v0, Lcom/twocloo/base/db/DBAccess;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     invoke-virtual {v0, p1, p2, p3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public execSQL(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p1, "sql"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 143
a=0;//     sget-object v0, Lcom/twocloo/base/db/DBAccess;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     invoke-virtual {v0, p1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 145
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public findInfo(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Landroid/database/Cursor;
a=0;//     .locals 11
a=0;//     .param p1, "tableName"    # Ljava/lang/String;
a=0;//     .param p2, "columns"    # [Ljava/lang/String;
a=0;//     .param p3, "selection"    # Ljava/lang/String;
a=0;//     .param p4, "selectionArgs"    # [Ljava/lang/String;
a=0;//     .param p5, "groupBy"    # Ljava/lang/String;
a=0;//     .param p6, "having"    # Ljava/lang/String;
a=0;//     .param p7, "orderBy"    # Ljava/lang/String;
a=0;//     .param p8, "limit"    # Ljava/lang/String;
a=0;//     .param p9, "distinct"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 131
a=0;//     sget-object v0, Lcom/twocloo/base/db/DBAccess;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     move/from16 v1, p9
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/String;);
a=0;//     move-object v4, p3
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move-object v5, p4
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/String;);
a=0;//     move-object/from16 v6, p5
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v7, p6
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v8, p7
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v9, p8
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v0 .. v9}, Landroid/database/sqlite/SQLiteDatabase;->query(ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 133
a=0;//     .local v10, "mCursor":Landroid/database/Cursor;
a=0;//     #v10=(Reference,Landroid/database/Cursor;);
a=0;//     return-object v10
a=0;// .end method
a=0;// 
a=0;// .method public findList(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
a=0;//     .locals 8
a=0;//     .param p1, "tableName"    # Ljava/lang/String;
a=0;//     .param p2, "columns"    # [Ljava/lang/String;
a=0;//     .param p3, "selection"    # Ljava/lang/String;
a=0;//     .param p4, "selectionArgs"    # [Ljava/lang/String;
a=0;//     .param p5, "groupBy"    # Ljava/lang/String;
a=0;//     .param p6, "having"    # Ljava/lang/String;
a=0;//     .param p7, "orderBy"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 118
a=0;//     sget-object v0, Lcom/twocloo/base/db/DBAccess;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-object v2, p2
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     move-object v3, p3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p4
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/String;);
a=0;//     move-object v5, p5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     move-object v6, p6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     move-object v7, p7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getDB()Landroid/database/sqlite/SQLiteDatabase;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 59
a=0;//     sget-object v0, Lcom/twocloo/base/db/DBAccess;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public insert(Ljava/lang/String;Landroid/content/ContentValues;)J
a=0;//     .locals 2
a=0;//     .param p1, "tableName"    # Ljava/lang/String;
a=0;//     .param p2, "initialValues"    # Landroid/content/ContentValues;
a=0;// 
a=0;//     .prologue
a=0;//     .line 81
a=0;//     sget-object v0, Lcom/twocloo/base/db/DBAccess;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, p1, v1, p2}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public isColumnExist(Ljava/lang/String;Ljava/lang/String;)Z
a=0;//     .locals 7
a=0;//     .param p1, "tableName"    # Ljava/lang/String;
a=0;//     .param p2, "columnName"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 182
a=0;//     #v5=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 184
a=0;//     .local v3, "result":Z
a=0;//     #v3=(Null);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 202
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Boolean);v4=(Conflicted);v5=(Boolean);v6=(Conflicted);
a=0;//     return v5
a=0;// 
a=0;//     .line 188
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Null);v4=(Uninit);v5=(Null);v6=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 189
a=0;//     .local v1, "cursor":Landroid/database/Cursor;
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "select count(1) as c from sqlite_master where type =\'table\' and name =\'"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, "\' and sql like \'%"
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, "%\'"
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 190
a=0;//     .local v4, "sql":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     sget-object v5, Lcom/twocloo/base/db/DBAccess;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {v5, v4, v6}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 191
a=0;//     #v1=(Reference,Landroid/database/Cursor;);
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     .line 192
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-interface {v1, v5}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 193
a=0;//     .local v0, "count":I
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_1
a=0;// 
a=0;//     .line 194
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 198
a=0;//     .end local v0    # "count":I
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v3=(Boolean);v5=(Boolean);
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .end local v4    # "sql":Ljava/lang/String;
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move v5, v3
a=0;// 
a=0;//     .line 202
a=0;//     #v5=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 199
a=0;//     :catch_0
a=0;//     #v2=(Uninit);v5=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 200
a=0;//     .local v2, "e":Ljava/lang/Exception;
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5, v2}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public isTableExist(Ljava/lang/String;)Z
a=0;//     .locals 7
a=0;//     .param p1, "tableName"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 153
a=0;//     #v5=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 154
a=0;//     .local v3, "result":Z
a=0;//     #v3=(Null);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 172
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Boolean);v4=(Conflicted);v5=(Boolean);v6=(Conflicted);
a=0;//     return v5
a=0;// 
a=0;//     .line 158
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Null);v4=(Uninit);v5=(Null);v6=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 159
a=0;//     .local v1, "cursor":Landroid/database/Cursor;
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "select count(1) as c from sqlite_master where type =\'table\' and name =\'"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, "\' "
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 160
a=0;//     .local v4, "sql":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     sget-object v5, Lcom/twocloo/base/db/DBAccess;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {v5, v4, v6}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 161
a=0;//     #v1=(Reference,Landroid/database/Cursor;);
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     .line 162
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-interface {v1, v5}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 163
a=0;//     .local v0, "count":I
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_1
a=0;// 
a=0;//     .line 164
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 168
a=0;//     .end local v0    # "count":I
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v3=(Boolean);v5=(Boolean);
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .end local v4    # "sql":Ljava/lang/String;
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move v5, v3
a=0;// 
a=0;//     .line 172
a=0;//     #v5=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 169
a=0;//     :catch_0
a=0;//     #v2=(Uninit);v5=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 170
a=0;//     .local v2, "e":Ljava/lang/Exception;
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5, v2}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected abstract newSQLiteOpenHelper(Landroid/content/Context;)Landroid/database/sqlite/SQLiteOpenHelper;
a=0;// .end method
a=0;// 
a=0;// .method public open()V
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Landroid/database/sqlite/SQLiteException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     sget-object v2, Lcom/twocloo/base/db/DBAccess;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v2=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     sget-object v2, Lcom/twocloo/base/db/DBAccess;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 47
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 32
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);
a=0;//     const-class v3, Lcom/twocloo/base/db/DBAccess;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v3
a=0;// 
a=0;//     .line 34
a=0;//     :try_start_0
a=0;//     sget-object v2, Lcom/twocloo/base/db/DBAccess;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v2=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     sget-object v2, Lcom/twocloo/base/db/DBAccess;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 35
a=0;//     monitor-exit v3
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 32
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v3
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v2
a=0;// 
a=0;//     .line 37
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/twocloo/base/db/DBAccess;->ctx:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/base/db/DBAccess;->newSQLiteOpenHelper(Landroid/content/Context;)Landroid/database/sqlite/SQLiteOpenHelper;
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 40
a=0;//     .local v0, "dbOpenHelper":Landroid/database/sqlite/SQLiteOpenHelper;
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteOpenHelper;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 41
a=0;//     :try_start_2
a=0;//     invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sput-object v2, Lcom/twocloo/base/db/DBAccess;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;//     :try_end_2
a=0;//     .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 32
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     :try_start_3
a=0;//     #v1=(Conflicted);
a=0;//     monitor-exit v3
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 42
a=0;//     :catch_0
a=0;//     #v1=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 43
a=0;//     .local v1, "e":Landroid/database/sqlite/SQLiteException;
a=0;//     #v1=(Reference,Landroid/database/sqlite/SQLiteException;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 44
a=0;//     invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sput-object v2, Lcom/twocloo/base/db/DBAccess;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)Z
a=0;//     .locals 2
a=0;//     .param p1, "tableName"    # Ljava/lang/String;
a=0;//     .param p2, "initialValues"    # Landroid/content/ContentValues;
a=0;//     .param p3, "selection"    # Ljava/lang/String;
a=0;//     .param p4, "selectArgs"    # [Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 104
a=0;//     sget-object v1, Lcom/twocloo/base/db/DBAccess;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v1=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     invoke-virtual {v1, p1, p2, p3, p4}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 106
a=0;//     .local v0, "returnValue":I
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     return v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
