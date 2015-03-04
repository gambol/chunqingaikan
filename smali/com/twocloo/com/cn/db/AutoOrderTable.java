package com.twocloo.com.cn.db; class AutoOrderTable { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/db/AutoOrderTable;
a=0;// .super Lcom/twocloo/com/cn/db/BaseDBAccess;
a=0;// .source "AutoOrderTable.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final DB_CREATE:Ljava/lang/String; = "CREATE TABLE auto (_id integer primary key autoincrement, articleid text);"
a=0;// 
a=0;// .field public static final KEY_ID:Ljava/lang/String; = "_id"
a=0;// 
a=0;// .field public static final KEY_articleid:Ljava/lang/String; = "articleid"
a=0;// 
a=0;// .field public static final Table_auto:Ljava/lang/String; = "auto"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 14
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/com/cn/db/BaseDBAccess;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 15
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/db/AutoOrderTable;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public exist(Ljava/lang/String;)Z
a=0;//     .locals 12
a=0;//     .param p1, "aid"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .line 29
a=0;//     #v11=(Null);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 31
a=0;//     .local v8, "cur":Landroid/database/Cursor;
a=0;//     :try_start_0
a=0;//     #v8=(Null);
a=0;//     sget-object v0, Lcom/twocloo/com/cn/db/AutoOrderTable;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     const-string v1, "auto"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const-string v4, "articleid"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "articleid=\'"
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "\'"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 32
a=0;//     #v8=(Reference,Landroid/database/Cursor;);
a=0;//     if-eqz v8, :cond_3
a=0;// 
a=0;//     invoke-interface {v8}, Landroid/database/Cursor;->moveToFirst()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-interface {v8}, Landroid/database/Cursor;->getCount()I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_3
a=0;// 
a=0;//     .line 38
a=0;//     if-eqz v8, :cond_0
a=0;// 
a=0;//     invoke-interface {v8}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 39
a=0;//     invoke-interface {v8}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 40
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     move v0, v10
a=0;// 
a=0;//     .line 44
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 35
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v9=(Uninit);
a=0;//     move-exception v9
a=0;// 
a=0;//     .line 36
a=0;//     .local v9, "e":Ljava/lang/Exception;
a=0;//     :try_start_1
a=0;//     #v9=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v9}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 38
a=0;//     if-eqz v8, :cond_1
a=0;// 
a=0;//     invoke-interface {v8}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 39
a=0;//     invoke-interface {v8}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 40
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .end local v9    # "e":Ljava/lang/Exception;
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v9=(Conflicted);
a=0;//     move v0, v11
a=0;// 
a=0;//     .line 44
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 37
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 38
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v8, :cond_2
a=0;// 
a=0;//     invoke-interface {v8}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 39
a=0;//     invoke-interface {v8}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 40
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 42
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     throw v0
a=0;// 
a=0;//     .line 38
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/String;);v2=(Reference,[Ljava/lang/String;);v3=(Reference,Ljava/lang/String;);v4=(Null);v5=(Null);v6=(Null);v7=(Null);v9=(Uninit);
a=0;//     if-eqz v8, :cond_1
a=0;// 
a=0;//     invoke-interface {v8}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 39
a=0;//     invoke-interface {v8}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 40
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public insertAutoOrder(Ljava/lang/String;)J
a=0;//     .locals 4
a=0;//     .param p1, "aid"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 23
a=0;//     new-instance v0, Landroid/content/ContentValues;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/ContentValues;);
a=0;//     invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V
a=0;// 
a=0;//     .line 24
a=0;//     .local v0, "newValues":Landroid/content/ContentValues;
a=0;//     #v0=(Reference,Landroid/content/ContentValues;);
a=0;//     const-string v1, "articleid"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 25
a=0;//     sget-object v1, Lcom/twocloo/com/cn/db/AutoOrderTable;->db:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     const-string v2, "auto"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
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
}}
