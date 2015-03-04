package com.twocloo.base.db.orm; class DBHelper { void a() { int a;
a=0;// .class public abstract Lcom/twocloo/base/db/orm/DBHelper;
a=0;// .super Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;
a=0;// .source "DBHelper.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/twocloo/base/db/orm/GetTableAble;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 3
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     invoke-static {p1}, Lcom/twocloo/base/db/orm/DBHelper;->getDBName(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {p1}, Lcom/twocloo/base/db/orm/DBHelper;->getDBVersion(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-direct {p0, p1, v0, v1, v2}, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V
a=0;// 
a=0;//     .line 30
a=0;//     #p0=(Reference,Lcom/twocloo/base/db/orm/DBHelper;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static final getDBName(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 1
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     sget v0, Lcom/twocloo/base/R$string;->db_name:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     .line 75
a=0;//     sget v0, Lcom/twocloo/base/R$string;->db_name:I
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static final getDBVersion(Landroid/content/Context;)I
a=0;//     .locals 2
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 80
a=0;//     sget v0, Lcom/twocloo/base/R$string;->db_version:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     .line 82
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v1, Lcom/twocloo/base/R$string;->db_version:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static getHelper(Ljava/lang/Class;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p0, "clazz"    # Ljava/lang/Class;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Ljava/lang/Class;",
a=0;//             ")TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     invoke-static {}, Lcom/twocloo/base/common/CommonApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Application;);
a=0;//     invoke-static {v0, p0}, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->getHelper(Landroid/content/Context;Ljava/lang/Class;)Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onCreate(Landroid/database/sqlite/SQLiteDatabase;Lcom/j256/ormlite/support/ConnectionSource;)V
a=0;//     .locals 4
a=0;//     .param p1, "db"    # Landroid/database/sqlite/SQLiteDatabase;
a=0;//     .param p2, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Lcom/twocloo/base/db/orm/DBHelper;->tables()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 44
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 36
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v3=(Boolean);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/Class;
a=0;// 
a=0;//     .line 38
a=0;//     .local v0, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     invoke-static {p2, v0}, Lcom/j256/ormlite/table/TableUtils;->createTable(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 41
a=0;//     .end local v0    # "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 42
a=0;//     .local v1, "e":Ljava/sql/SQLException;
a=0;//     #v1=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "\u521b\u5efa\u6570\u636e\u5e93\u5931\u8d25|"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Ljava/sql/SQLException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2, v1}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public onUpgrade(Landroid/database/sqlite/SQLiteDatabase;Lcom/j256/ormlite/support/ConnectionSource;II)V
a=0;//     .locals 4
a=0;//     .param p1, "db"    # Landroid/database/sqlite/SQLiteDatabase;
a=0;//     .param p2, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .param p3, "arg2"    # I
a=0;//     .param p4, "arg3"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Lcom/twocloo/base/db/orm/DBHelper;->tables()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 55
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/twocloo/base/db/orm/DBHelper;->onCreate(Landroid/database/sqlite/SQLiteDatabase;Lcom/j256/ormlite/support/ConnectionSource;)V
a=0;// 
a=0;//     .line 60
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 50
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v3=(Boolean);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/Class;
a=0;// 
a=0;//     .line 52
a=0;//     .local v0, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-static {p2, v0, v3}, Lcom/j256/ormlite/table/TableUtils;->dropTable(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;Z)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 56
a=0;//     .end local v0    # "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 57
a=0;//     .local v1, "e":Ljava/sql/SQLException;
a=0;//     #v1=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "\u66f4\u65b0\u6570\u636e\u5e93\u5931\u8d25|"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Ljava/sql/SQLException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2, v1}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public abstract tables()Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/Class",
a=0;//             "<+",
a=0;//             "Lcom/twocloo/base/db/orm/TableAble;",
a=0;//             ">;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end method
}}
