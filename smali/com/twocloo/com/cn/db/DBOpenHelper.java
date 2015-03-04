package com.twocloo.com.cn.db; class DBOpenHelper { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/db/DBOpenHelper;
a=0;// .super Landroid/database/sqlite/SQLiteOpenHelper;
a=0;// .source "DBOpenHelper.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final DB_NAME:Ljava/lang/String; = "2cloo.db"
a=0;// 
a=0;// .field private static final DB_VERSION:I = 0x1
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 3
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     const-string v0, "2cloo.db"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-direct {p0, p1, v0, v1, v2}, Lcom/twocloo/com/cn/db/DBOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V
a=0;// 
a=0;//     .line 20
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/db/DBOpenHelper;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "name"    # Ljava/lang/String;
a=0;//     .param p3, "factory"    # Landroid/database/sqlite/SQLiteDatabase$CursorFactory;
a=0;//     .param p4, "version"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 23
a=0;//     invoke-direct {p0, p1, p2, p3, p4}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V
a=0;// 
a=0;//     .line 24
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/db/DBOpenHelper;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
a=0;//     .locals 1
a=0;//     .param p1, "db"    # Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     const-string v0, "\u521b\u5efa\u6570\u636e\u5e93"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 32
a=0;//     const-string v0, "CREATE TABLE booksf (_id integer primary key autoincrement, articleid text , bookURL text ,bookFile text ,imgFile text ,uid text ,lasttime integer ,lastuptime integer ,hasupdate integer ,finishFlag integer ,title text ,isFromWeb text,author text,updatenumber integer,source text,isFence integer);"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 33
a=0;//     const-string v0, "CREATE TABLE booksq (_id integer primary key autoincrement, articleid text , textid text ,texttitle text ,textjj text ,time integer ,isd integer ,isv integer ,length integer ,location integer);"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 34
a=0;//     const-string v0, "CREATE TABLE bookuser (_id integer primary key autoincrement, articleid text ,isvip integer ,uid text);"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 35
a=0;//     const-string v0, "CREATE TABLE lastread (_id integer primary key autoincrement, articleid text , bookname text ,bookfile text ,textid text ,isvip integer,time integer ,isol integer ,finishFlag integer ,posi integer,index_ integer default -1);"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 36
a=0;//     const-string v0, "CREATE TABLE auto (_id integer primary key autoincrement, articleid text);"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 37
a=0;//     const-string v0, "CREATE TABLE hdbook (_id integer primary key autoincrement, articleid text , isVip integer ,uid text);"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 38
a=0;//     const-string v0, "CREATE TABLE recodehistory (_id integer primary key autoincrement,KEY_uid text,articleid text , tid text , KEY_sync integer);"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 39
a=0;//     const-string v0, "CREATE TABLE searchhistroy (_id integer primary key autoincrement, uid text , content text , time text );"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 40
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onDowngrade(Landroid/database/sqlite/SQLiteDatabase;II)V
a=0;//     .locals 1
a=0;//     .param p1, "db"    # Landroid/database/sqlite/SQLiteDatabase;
a=0;//     .param p2, "oldVersion"    # I
a=0;//     .param p3, "newVersion"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 102
a=0;//     invoke-super {p0, p1, p2, p3}, Landroid/database/sqlite/SQLiteOpenHelper;->onDowngrade(Landroid/database/sqlite/SQLiteDatabase;II)V
a=0;// 
a=0;//     .line 103
a=0;//     const-string v0, "\u6570\u636e\u5e93\u964d\u7ea7"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 104
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
a=0;//     .locals 3
a=0;//     .param p1, "_db"    # Landroid/database/sqlite/SQLiteDatabase;
a=0;//     .param p2, "oldVersion"    # I
a=0;//     .param p3, "newVersion"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 77
a=0;//     const-string v0, "\u5347\u7ea7\u6570\u636e\u5e93"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 78
a=0;//     sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "oldVersion:"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ";"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 98
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public tabbleIsExist(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase;)Z
a=0;//     .locals 7
a=0;//     .param p1, "tableName"    # Ljava/lang/String;
a=0;//     .param p2, "db"    # Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 50
a=0;//     #v5=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 51
a=0;//     .local v3, "result":Z
a=0;//     #v3=(Null);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 69
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Boolean);v4=(Conflicted);v5=(Boolean);v6=(Conflicted);
a=0;//     return v5
a=0;// 
a=0;//     .line 54
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Null);v4=(Uninit);v5=(Null);v6=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 56
a=0;//     .local v1, "cursor":Landroid/database/Cursor;
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "select count(*) as c from Sqlite_master  where type =\'table\' and name =\'"
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
a=0;//     .line 57
a=0;//     .local v4, "sql":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {p2, v4, v5}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 58
a=0;//     #v1=(Reference,Landroid/database/Cursor;);
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     .line 59
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-interface {v1, v5}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 60
a=0;//     .local v0, "count":I
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_1
a=0;// 
a=0;//     .line 61
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 64
a=0;//     .end local v0    # "count":I
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v3=(Boolean);v5=(Boolean);
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 65
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .end local v4    # "sql":Ljava/lang/String;
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move v5, v3
a=0;// 
a=0;//     .line 69
a=0;//     #v5=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 66
a=0;//     :catch_0
a=0;//     #v2=(Uninit);v5=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 67
a=0;//     .local v2, "e":Ljava/lang/Exception;
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
