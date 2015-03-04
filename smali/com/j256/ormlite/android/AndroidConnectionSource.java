package com.j256.ormlite.android; class AndroidConnectionSource { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/android/AndroidConnectionSource;
a=0;// .super Lcom/j256/ormlite/support/BaseConnectionSource;
a=0;// .source "AndroidConnectionSource.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private connection:Lcom/j256/ormlite/android/AndroidDatabaseConnection;
a=0;// 
a=0;// .field private final databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;// .field private final helper:Landroid/database/sqlite/SQLiteOpenHelper;
a=0;// 
a=0;// .field private volatile isOpen:Z
a=0;// 
a=0;// .field private final sqliteDatabase:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     const-class v0, Lcom/j256/ormlite/android/AndroidConnectionSource;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {v0}, Lcom/j256/ormlite/logger/LoggerFactory;->getLogger(Ljava/lang/Class;)Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/j256/ormlite/android/AndroidConnectionSource;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/database/sqlite/SQLiteDatabase;)V
a=0;//     .locals 2
a=0;//     .param p1, "sqliteDatabase"    # Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 39
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Lcom/j256/ormlite/support/BaseConnectionSource;-><init>()V
a=0;// 
a=0;//     .line 30
a=0;//     #p0=(Reference,Lcom/j256/ormlite/android/AndroidConnectionSource;);
a=0;//     iput-object v1, p0, Lcom/j256/ormlite/android/AndroidConnectionSource;->connection:Lcom/j256/ormlite/android/AndroidDatabaseConnection;
a=0;// 
a=0;//     .line 31
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/j256/ormlite/android/AndroidConnectionSource;->isOpen:Z
a=0;// 
a=0;//     .line 32
a=0;//     new-instance v0, Lcom/j256/ormlite/db/SqliteAndroidDatabaseType;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/db/SqliteAndroidDatabaseType;);
a=0;//     invoke-direct {v0}, Lcom/j256/ormlite/db/SqliteAndroidDatabaseType;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/db/SqliteAndroidDatabaseType;);
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/android/AndroidConnectionSource;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     .line 40
a=0;//     iput-object v1, p0, Lcom/j256/ormlite/android/AndroidConnectionSource;->helper:Landroid/database/sqlite/SQLiteOpenHelper;
a=0;// 
a=0;//     .line 41
a=0;//     iput-object p1, p0, Lcom/j256/ormlite/android/AndroidConnectionSource;->sqliteDatabase:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     .line 42
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/database/sqlite/SQLiteOpenHelper;)V
a=0;//     .locals 2
a=0;//     .param p1, "helper"    # Landroid/database/sqlite/SQLiteOpenHelper;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 34
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Lcom/j256/ormlite/support/BaseConnectionSource;-><init>()V
a=0;// 
a=0;//     .line 30
a=0;//     #p0=(Reference,Lcom/j256/ormlite/android/AndroidConnectionSource;);
a=0;//     iput-object v1, p0, Lcom/j256/ormlite/android/AndroidConnectionSource;->connection:Lcom/j256/ormlite/android/AndroidDatabaseConnection;
a=0;// 
a=0;//     .line 31
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/j256/ormlite/android/AndroidConnectionSource;->isOpen:Z
a=0;// 
a=0;//     .line 32
a=0;//     new-instance v0, Lcom/j256/ormlite/db/SqliteAndroidDatabaseType;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/db/SqliteAndroidDatabaseType;);
a=0;//     invoke-direct {v0}, Lcom/j256/ormlite/db/SqliteAndroidDatabaseType;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/db/SqliteAndroidDatabaseType;);
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/android/AndroidConnectionSource;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     .line 35
a=0;//     iput-object p1, p0, Lcom/j256/ormlite/android/AndroidConnectionSource;->helper:Landroid/database/sqlite/SQLiteOpenHelper;
a=0;// 
a=0;//     .line 36
a=0;//     iput-object v1, p0, Lcom/j256/ormlite/android/AndroidConnectionSource;->sqliteDatabase:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     .line 37
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public clearSpecialConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;//     .locals 1
a=0;//     .param p1, "connection"    # Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;//     .prologue
a=0;//     .line 87
a=0;//     sget-object v0, Lcom/j256/ormlite/android/AndroidConnectionSource;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     invoke-virtual {p0, p1, v0}, Lcom/j256/ormlite/android/AndroidConnectionSource;->clearSpecial(Lcom/j256/ormlite/support/DatabaseConnection;Lcom/j256/ormlite/logger/Logger;)Z
a=0;// 
a=0;//     .line 88
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public close()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 92
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/j256/ormlite/android/AndroidConnectionSource;->isOpen:Z
a=0;// 
a=0;//     .line 93
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public closeQuietly()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 96
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/android/AndroidConnectionSource;->close()V
a=0;// 
a=0;//     .line 97
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getDatabaseType()Lcom/j256/ormlite/db/DatabaseType;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 100
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidConnectionSource;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/db/DatabaseType;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getReadOnlyConnection()Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/android/AndroidConnectionSource;->getReadWriteConnection()Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/support/DatabaseConnection;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getReadWriteConnection()Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     .locals 7
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 55
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/android/AndroidConnectionSource;->getSavedConnection()Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 56
a=0;//     .local v0, "conn":Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     #v0=(Reference,Lcom/j256/ormlite/support/DatabaseConnection;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 75
a=0;//     .end local v0    # "conn":Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 59
a=0;//     .restart local v0    # "conn":Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/android/AndroidConnectionSource;->connection:Lcom/j256/ormlite/android/AndroidDatabaseConnection;
a=0;// 
a=0;//     #v3=(Reference,Lcom/j256/ormlite/android/AndroidDatabaseConnection;);
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     .line 61
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/android/AndroidConnectionSource;->sqliteDatabase:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 63
a=0;//     :try_start_0
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/android/AndroidConnectionSource;->helper:Landroid/database/sqlite/SQLiteOpenHelper;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;//     :try_end_0
a=0;//     .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 70
a=0;//     .local v1, "db":Landroid/database/sqlite/SQLiteDatabase;
a=0;//     :goto_1
a=0;//     #v1=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     new-instance v3, Lcom/j256/ormlite/android/AndroidDatabaseConnection;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/j256/ormlite/android/AndroidDatabaseConnection;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-direct {v3, v1, v4}, Lcom/j256/ormlite/android/AndroidDatabaseConnection;-><init>(Landroid/database/sqlite/SQLiteDatabase;Z)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/j256/ormlite/android/AndroidDatabaseConnection;);
a=0;//     iput-object v3, p0, Lcom/j256/ormlite/android/AndroidConnectionSource;->connection:Lcom/j256/ormlite/android/AndroidDatabaseConnection;
a=0;// 
a=0;//     .line 71
a=0;//     sget-object v3, Lcom/j256/ormlite/android/AndroidConnectionSource;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     const-string v4, "created connection {} for db {}, helper {}"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     iget-object v5, p0, Lcom/j256/ormlite/android/AndroidConnectionSource;->connection:Lcom/j256/ormlite/android/AndroidDatabaseConnection;
a=0;// 
a=0;//     #v5=(Reference,Lcom/j256/ormlite/android/AndroidDatabaseConnection;);
a=0;//     iget-object v6, p0, Lcom/j256/ormlite/android/AndroidConnectionSource;->helper:Landroid/database/sqlite/SQLiteOpenHelper;
a=0;// 
a=0;//     #v6=(Reference,Landroid/database/sqlite/SQLiteOpenHelper;);
a=0;//     invoke-virtual {v3, v4, v5, v1, v6}, Lcom/j256/ormlite/logger/Logger;->trace(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 75
a=0;//     .end local v1    # "db":Landroid/database/sqlite/SQLiteDatabase;
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidConnectionSource;->connection:Lcom/j256/ormlite/android/AndroidDatabaseConnection;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 64
a=0;//     :catch_0
a=0;//     #v1=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 65
a=0;//     .local v2, "e":Landroid/database/SQLException;
a=0;//     #v2=(Reference,Landroid/database/SQLException;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Getting a writable database from helper "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p0, Lcom/j256/ormlite/android/AndroidConnectionSource;->helper:Landroid/database/sqlite/SQLiteOpenHelper;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, " failed"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3, v2}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     throw v3
a=0;// 
a=0;//     .line 68
a=0;//     .end local v2    # "e":Landroid/database/SQLException;
a=0;//     :cond_1
a=0;//     #v2=(Uninit);v4=(Uninit);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/android/AndroidConnectionSource;->sqliteDatabase:Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     .restart local v1    # "db":Landroid/database/sqlite/SQLiteDatabase;
a=0;//     #v1=(Reference,Landroid/database/sqlite/SQLiteDatabase;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 73
a=0;//     .end local v1    # "db":Landroid/database/sqlite/SQLiteDatabase;
a=0;//     :cond_2
a=0;//     #v1=(Uninit);
a=0;//     sget-object v3, Lcom/j256/ormlite/android/AndroidConnectionSource;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     const-string v4, "{}: returning read-write connection {}, helper {}"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     iget-object v5, p0, Lcom/j256/ormlite/android/AndroidConnectionSource;->connection:Lcom/j256/ormlite/android/AndroidDatabaseConnection;
a=0;// 
a=0;//     #v5=(Reference,Lcom/j256/ormlite/android/AndroidDatabaseConnection;);
a=0;//     iget-object v6, p0, Lcom/j256/ormlite/android/AndroidConnectionSource;->helper:Landroid/database/sqlite/SQLiteOpenHelper;
a=0;// 
a=0;//     #v6=(Reference,Landroid/database/sqlite/SQLiteOpenHelper;);
a=0;//     invoke-virtual {v3, v4, p0, v5, v6}, Lcom/j256/ormlite/logger/Logger;->trace(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public isOpen()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 104
a=0;//     iget-boolean v0, p0, Lcom/j256/ormlite/android/AndroidConnectionSource;->isOpen:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;//     .locals 0
a=0;//     .param p1, "connection"    # Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;//     .prologue
a=0;//     .line 80
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public saveSpecialConnection(Lcom/j256/ormlite/support/DatabaseConnection;)Z
a=0;//     .locals 1
a=0;//     .param p1, "connection"    # Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 83
a=0;//     invoke-virtual {p0, p1}, Lcom/j256/ormlite/android/AndroidConnectionSource;->saveSpecial(Lcom/j256/ormlite/support/DatabaseConnection;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 109
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "@"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-super {p0}, Ljava/lang/Object;->hashCode()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
