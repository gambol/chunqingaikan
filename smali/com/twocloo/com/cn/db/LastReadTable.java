package com.twocloo.com.cn.db; class LastReadTable { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/db/LastReadTable;
a=0;// .super Lcom/twocloo/com/cn/db/BaseDBAccess;
a=0;// .source "LastReadTable.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final DB_CREATE:Ljava/lang/String; = "CREATE TABLE lastread (_id integer primary key autoincrement, articleid text , bookname text ,bookfile text ,textid text ,isvip integer,time integer ,isol integer ,finishFlag integer ,posi integer,index_ integer default -1);"
a=0;// 
a=0;// .field public static final KEY_ID:Ljava/lang/String; = "_id"
a=0;// 
a=0;// .field public static final KEY_articleid:Ljava/lang/String; = "articleid"
a=0;// 
a=0;// .field public static final KEY_bookName:Ljava/lang/String; = "bookname"
a=0;// 
a=0;// .field public static final KEY_bookfile:Ljava/lang/String; = "bookfile"
a=0;// 
a=0;// .field public static final KEY_finishFlag:Ljava/lang/String; = "finishFlag"
a=0;// 
a=0;// .field public static final KEY_index:Ljava/lang/String; = "index_"
a=0;// 
a=0;// .field public static final KEY_isVip:Ljava/lang/String; = "isvip"
a=0;// 
a=0;// .field public static final KEY_isol:Ljava/lang/String; = "isol"
a=0;// 
a=0;// .field public static final KEY_posi:Ljava/lang/String; = "posi"
a=0;// 
a=0;// .field public static final KEY_textId:Ljava/lang/String; = "textid"
a=0;// 
a=0;// .field public static final KEY_time:Ljava/lang/String; = "time"
a=0;// 
a=0;// .field public static final Table_lastread:Ljava/lang/String; = "lastread"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final context:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/com/cn/db/BaseDBAccess;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 32
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/db/LastReadTable;);
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/db/LastReadTable;->context:Landroid/content/Context;
a=0;// 
a=0;//     .line 33
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private convertToBook(Landroid/database/Cursor;)Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     .locals 5
a=0;//     .param p1, "cursor"    # Landroid/database/Cursor;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 85
a=0;//     #v2=(Null);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     move-object v0, v2
a=0;// 
a=0;//     .line 115
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/RDBook;);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 89
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     invoke-interface {p1}, Landroid/database/Cursor;->getCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 90
a=0;//     .local v1, "resultCounts":I
a=0;//     #v1=(Integer);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_4
a=0;// 
a=0;//     .line 108
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);
a=0;//     if-eqz p1, :cond_3
a=0;// 
a=0;//     .line 109
a=0;//     invoke-interface {p1}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 110
a=0;//     const/4 p1, 0x0
a=0;// 
a=0;//     :cond_3
a=0;//     move-object v0, v2
a=0;// 
a=0;//     .line 91
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 93
a=0;//     :cond_4
a=0;//     :try_start_1
a=0;//     #v0=(Uninit);v3=(Boolean);
a=0;//     invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z
a=0;// 
a=0;//     .line 94
a=0;//     new-instance v0, Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/beans/RDBook;);
a=0;//     invoke-direct {v0}, Lcom/twocloo/com/cn/beans/RDBook;-><init>()V
a=0;// 
a=0;//     .line 95
a=0;//     .local v0, "rd":Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/RDBook;);
a=0;//     const-string v3, "_id"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-interface {p1, v3}, Landroid/database/Cursor;->getLong(I)J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual {v0, v3, v4}, Lcom/twocloo/com/cn/beans/RDBook;->setId(J)V
a=0;// 
a=0;//     .line 96
a=0;//     const-string v3, "articleid"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-interface {p1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Lcom/twocloo/com/cn/beans/RDBook;->setArticleId(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 97
a=0;//     const-string v3, "bookname"
a=0;// 
a=0;//     invoke-interface {p1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-interface {p1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Lcom/twocloo/com/cn/beans/RDBook;->setBookName(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 98
a=0;//     const-string v3, "bookfile"
a=0;// 
a=0;//     invoke-interface {p1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-interface {p1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Lcom/twocloo/com/cn/beans/RDBook;->setBookFile(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 99
a=0;//     const-string v3, "textid"
a=0;// 
a=0;//     invoke-interface {p1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-interface {p1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Lcom/twocloo/com/cn/beans/RDBook;->setTextId(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 100
a=0;//     const-string v3, "isvip"
a=0;// 
a=0;//     invoke-interface {p1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-interface {p1, v3}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Lcom/twocloo/com/cn/beans/RDBook;->setIsVip(I)V
a=0;// 
a=0;//     .line 101
a=0;//     const-string v3, "posi"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-interface {p1, v3}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Lcom/twocloo/com/cn/beans/RDBook;->setPosi(I)V
a=0;// 
a=0;//     .line 102
a=0;//     const-string v3, "isol"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-interface {p1, v3}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Lcom/twocloo/com/cn/beans/RDBook;->setIsOL(I)V
a=0;// 
a=0;//     .line 103
a=0;//     const-string v3, "finishFlag"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-interface {p1, v3}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Lcom/twocloo/com/cn/beans/RDBook;->setFinishflag(I)V
a=0;// 
a=0;//     .line 104
a=0;//     const-string v3, "index_"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-interface {p1, v3}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Lcom/twocloo/com/cn/beans/RDBook;->setIndex_(I)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 108
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 109
a=0;//     invoke-interface {p1}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 110
a=0;//     const/4 p1, 0x0
a=0;// 
a=0;//     #p1=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 106
a=0;//     .end local v0    # "rd":Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     .end local v1    # "resultCounts":I
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);p1=(Reference,Landroid/database/Cursor;);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 108
a=0;//     #v3=(Reference,Ljava/lang/Exception;);
a=0;//     if-eqz p1, :cond_5
a=0;// 
a=0;//     .line 109
a=0;//     invoke-interface {p1}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 110
a=0;//     const/4 p1, 0x0
a=0;// 
a=0;//     :cond_5
a=0;//     move-object v0, v2
a=0;// 
a=0;//     .line 115
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 107
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 108
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz p1, :cond_6
a=0;// 
a=0;//     .line 109
a=0;//     invoke-interface {p1}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 110
a=0;//     const/4 p1, 0x0
a=0;// 
a=0;//     .line 112
a=0;//     :cond_6
a=0;//     throw v2
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public insertLastRead(Lcom/twocloo/com/cn/beans/RDBook;)J
a=0;//     .locals 4
a=0;//     .param p1, "rd"    # Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     sget-object v1, Lcom/twocloo/com/cn/db/LastReadTable;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v1=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 40
a=0;//     new-instance v1, Lcom/twocloo/com/cn/db/DBOpenHelper;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/db/DBOpenHelper;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/db/LastReadTable;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v1, v2}, Lcom/twocloo/com/cn/db/DBOpenHelper;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/db/DBOpenHelper;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/db/DBOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sput-object v1, Lcom/twocloo/com/cn/db/LastReadTable;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     .line 42
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     new-instance v0, Landroid/content/ContentValues;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/ContentValues;);
a=0;//     invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V
a=0;// 
a=0;//     .line 43
a=0;//     .local v0, "newValues":Landroid/content/ContentValues;
a=0;//     #v0=(Reference,Landroid/content/ContentValues;);
a=0;//     const-string v1, "articleid"
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/RDBook;->getArticleId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 44
a=0;//     const-string v1, "bookname"
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/RDBook;->getBookName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 45
a=0;//     const-string v1, "bookfile"
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/RDBook;->getBookFile()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 46
a=0;//     const-string v1, "textid"
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/RDBook;->getTextId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 47
a=0;//     const-string v1, "isvip"
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/RDBook;->getIsVip()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
a=0;// 
a=0;//     .line 48
a=0;//     const-string v1, "posi"
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/RDBook;->getPosi()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
a=0;// 
a=0;//     .line 49
a=0;//     const-string v1, "time"
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Long;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V
a=0;// 
a=0;//     .line 50
a=0;//     const-string v1, "isol"
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/RDBook;->getIsOL()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
a=0;// 
a=0;//     .line 51
a=0;//     const-string v1, "finishFlag"
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/RDBook;->getFinishflag()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
a=0;// 
a=0;//     .line 52
a=0;//     const-string v1, "index_"
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/RDBook;->getIndex_()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
a=0;// 
a=0;//     .line 53
a=0;//     sget-object v1, Lcom/twocloo/com/cn/db/LastReadTable;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     const-string v2, "lastread"
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v1, v2, v3, v0}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     return-wide v1
a=0;// .end method
a=0;// 
a=0;// .method public queryLastBook()Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 75
a=0;//     #v3=(Null);
a=0;//     sget-object v0, Lcom/twocloo/com/cn/db/LastReadTable;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 76
a=0;//     new-instance v0, Lcom/twocloo/com/cn/db/DBOpenHelper;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/db/DBOpenHelper;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/db/LastReadTable;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1}, Lcom/twocloo/com/cn/db/DBOpenHelper;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/DBOpenHelper;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/db/DBOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/twocloo/com/cn/db/LastReadTable;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     .line 78
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcom/twocloo/com/cn/db/LastReadTable;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     const-string v1, "lastread"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/16 v2, 0xb
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-array v2, v2, [Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const-string v5, "_id"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     aput-object v5, v2, v4
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const-string v5, "articleid"
a=0;// 
a=0;//     aput-object v5, v2, v4
a=0;// 
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const-string v5, "bookname"
a=0;// 
a=0;//     aput-object v5, v2, v4
a=0;// 
a=0;//     const/4 v4, 0x3
a=0;// 
a=0;//     const-string v5, "bookfile"
a=0;// 
a=0;//     aput-object v5, v2, v4
a=0;// 
a=0;//     const/4 v4, 0x4
a=0;// 
a=0;//     const-string v5, "textid"
a=0;// 
a=0;//     aput-object v5, v2, v4
a=0;// 
a=0;//     const/4 v4, 0x5
a=0;// 
a=0;//     const-string v5, "isvip"
a=0;// 
a=0;//     aput-object v5, v2, v4
a=0;// 
a=0;//     const/4 v4, 0x6
a=0;// 
a=0;//     .line 79
a=0;//     const-string v5, "posi"
a=0;// 
a=0;//     aput-object v5, v2, v4
a=0;// 
a=0;//     const/4 v4, 0x7
a=0;// 
a=0;//     const-string v5, "time"
a=0;// 
a=0;//     aput-object v5, v2, v4
a=0;// 
a=0;//     const/16 v4, 0x8
a=0;// 
a=0;//     const-string v5, "isol"
a=0;// 
a=0;//     aput-object v5, v2, v4
a=0;// 
a=0;//     const/16 v4, 0x9
a=0;// 
a=0;//     const-string v5, "finishFlag"
a=0;// 
a=0;//     aput-object v5, v2, v4
a=0;// 
a=0;//     const/16 v4, 0xa
a=0;// 
a=0;//     const-string v5, "index_"
a=0;// 
a=0;//     aput-object v5, v2, v4
a=0;// 
a=0;//     const-string v7, "time desc"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, v3
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move-object v5, v3
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move-object v6, v3
a=0;// 
a=0;//     .line 78
a=0;//     #v6=(Null);
a=0;//     invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 81
a=0;//     .local v8, "result":Landroid/database/Cursor;
a=0;//     #v8=(Reference,Landroid/database/Cursor;);
a=0;//     invoke-direct {p0, v8}, Lcom/twocloo/com/cn/db/LastReadTable;->convertToBook(Landroid/database/Cursor;)Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public queryLastBook(Ljava/lang/String;I)Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     .locals 10
a=0;//     .param p1, "aid"    # Ljava/lang/String;
a=0;//     .param p2, "f"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 61
a=0;//     #v4=(Null);
a=0;//     sget-object v0, Lcom/twocloo/com/cn/db/LastReadTable;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 62
a=0;//     new-instance v0, Lcom/twocloo/com/cn/db/DBOpenHelper;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/db/DBOpenHelper;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/db/LastReadTable;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1}, Lcom/twocloo/com/cn/db/DBOpenHelper;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/DBOpenHelper;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/db/DBOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/twocloo/com/cn/db/LastReadTable;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     .line 64
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     const-string v8, ""
a=0;// 
a=0;//     .line 65
a=0;//     .local v8, "cond":Ljava/lang/String;
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     .line 66
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "articleid=\'"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "\'"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p1
a=0;// 
a=0;//     .line 68
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcom/twocloo/com/cn/db/LastReadTable;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     const-string v1, "lastread"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/16 v2, 0xb
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-array v2, v2, [Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const-string v5, "_id"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     aput-object v5, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const-string v5, "articleid"
a=0;// 
a=0;//     aput-object v5, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const-string v5, "bookname"
a=0;// 
a=0;//     aput-object v5, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     const-string v5, "bookfile"
a=0;// 
a=0;//     aput-object v5, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x4
a=0;// 
a=0;//     const-string v5, "textid"
a=0;// 
a=0;//     aput-object v5, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x5
a=0;// 
a=0;//     const-string v5, "isvip"
a=0;// 
a=0;//     aput-object v5, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x6
a=0;// 
a=0;//     .line 69
a=0;//     const-string v5, "posi"
a=0;// 
a=0;//     aput-object v5, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x7
a=0;// 
a=0;//     const-string v5, "time"
a=0;// 
a=0;//     aput-object v5, v2, v3
a=0;// 
a=0;//     const/16 v3, 0x8
a=0;// 
a=0;//     const-string v5, "isol"
a=0;// 
a=0;//     aput-object v5, v2, v3
a=0;// 
a=0;//     const/16 v3, 0x9
a=0;// 
a=0;//     const-string v5, "finishFlag"
a=0;// 
a=0;//     aput-object v5, v2, v3
a=0;// 
a=0;//     const/16 v3, 0xa
a=0;// 
a=0;//     const-string v5, "index_"
a=0;// 
a=0;//     aput-object v5, v2, v3
a=0;// 
a=0;//     const-string v7, "time desc"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     move-object v3, p1
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v5, v4
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move-object v6, v4
a=0;// 
a=0;//     .line 68
a=0;//     #v6=(Null);
a=0;//     invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 71
a=0;//     .local v9, "result":Landroid/database/Cursor;
a=0;//     #v9=(Reference,Landroid/database/Cursor;);
a=0;//     invoke-direct {p0, v9}, Lcom/twocloo/com/cn/db/LastReadTable;->convertToBook(Landroid/database/Cursor;)Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public remove(Ljava/lang/String;)J
a=0;//     .locals 4
a=0;//     .param p1, "aid"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 57
a=0;//     sget-object v0, Lcom/twocloo/com/cn/db/LastReadTable;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     const-string v1, "lastread"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "articleid=\'"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "\' and isol=1"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
}}
