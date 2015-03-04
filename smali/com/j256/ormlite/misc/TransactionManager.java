package com.j256.ormlite.misc; class TransactionManager { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/misc/TransactionManager;
a=0;// .super Ljava/lang/Object;
a=0;// .source "TransactionManager.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final SAVE_POINT_PREFIX:Ljava/lang/String; = "ORMLITE"
a=0;// 
a=0;// .field private static final logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;// .field private static savePointCounter:Ljava/util/concurrent/atomic/AtomicInteger;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 64
a=0;//     const-class v0, Lcom/j256/ormlite/misc/TransactionManager;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {v0}, Lcom/j256/ormlite/logger/LoggerFactory;->getLogger(Ljava/lang/Class;)Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/j256/ormlite/misc/TransactionManager;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     .line 68
a=0;//     new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/atomic/AtomicInteger;);
a=0;//     invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/atomic/AtomicInteger;);
a=0;//     sput-object v0, Lcom/j256/ormlite/misc/TransactionManager;->savePointCounter:Ljava/util/concurrent/atomic/AtomicInteger;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 75
a=0;//     #p0=(Reference,Lcom/j256/ormlite/misc/TransactionManager;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Lcom/j256/ormlite/support/ConnectionSource;)V
a=0;//     .locals 0
a=0;//     .param p1, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     .prologue
a=0;//     .line 80
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 81
a=0;//     #p0=(Reference,Lcom/j256/ormlite/misc/TransactionManager;);
a=0;//     iput-object p1, p0, Lcom/j256/ormlite/misc/TransactionManager;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     .line 82
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/misc/TransactionManager;->initialize()V
a=0;// 
a=0;//     .line 83
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static callInTransaction(Lcom/j256/ormlite/support/ConnectionSource;Ljava/util/concurrent/Callable;)Ljava/lang/Object;
a=0;//     .locals 3
a=0;//     .param p0, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/j256/ormlite/support/ConnectionSource;",
a=0;//             "Ljava/util/concurrent/Callable",
a=0;//             "<TT;>;)TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 121
a=0;//     .local p1, "callable":Ljava/util/concurrent/Callable;, "Ljava/util/concurrent/Callable<TT;>;"
a=0;//     invoke-interface {p0}, Lcom/j256/ormlite/support/ConnectionSource;->getReadWriteConnection()Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 123
a=0;//     .local v0, "connection":Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Lcom/j256/ormlite/support/DatabaseConnection;);
a=0;//     invoke-interface {p0, v0}, Lcom/j256/ormlite/support/ConnectionSource;->saveSpecialConnection(Lcom/j256/ormlite/support/DatabaseConnection;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 124
a=0;//     .local v1, "saved":Z
a=0;//     #v1=(Boolean);
a=0;//     invoke-interface {p0}, Lcom/j256/ormlite/support/ConnectionSource;->getDatabaseType()Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/db/DatabaseType;);
a=0;//     invoke-static {v0, v1, v2, p1}, Lcom/j256/ormlite/misc/TransactionManager;->callInTransaction(Lcom/j256/ormlite/support/DatabaseConnection;ZLcom/j256/ormlite/db/DatabaseType;Ljava/util/concurrent/Callable;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 127
a=0;//     invoke-interface {p0, v0}, Lcom/j256/ormlite/support/ConnectionSource;->clearSpecialConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     .line 128
a=0;//     invoke-interface {p0, v0}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     return-object v2
a=0;// 
a=0;//     .line 127
a=0;//     .end local v1    # "saved":Z
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-interface {p0, v0}, Lcom/j256/ormlite/support/ConnectionSource;->clearSpecialConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     .line 128
a=0;//     invoke-interface {p0, v0}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     throw v2
a=0;// .end method
a=0;// 
a=0;// .method public static callInTransaction(Lcom/j256/ormlite/support/DatabaseConnection;Lcom/j256/ormlite/db/DatabaseType;Ljava/util/concurrent/Callable;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p0, "connection"    # Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     .param p1, "databaseType"    # Lcom/j256/ormlite/db/DatabaseType;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/j256/ormlite/support/DatabaseConnection;",
a=0;//             "Lcom/j256/ormlite/db/DatabaseType;",
a=0;//             "Ljava/util/concurrent/Callable",
a=0;//             "<TT;>;)TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 137
a=0;//     .local p2, "callable":Ljava/util/concurrent/Callable;, "Ljava/util/concurrent/Callable<TT;>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0, v0, p1, p2}, Lcom/j256/ormlite/misc/TransactionManager;->callInTransaction(Lcom/j256/ormlite/support/DatabaseConnection;ZLcom/j256/ormlite/db/DatabaseType;Ljava/util/concurrent/Callable;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static callInTransaction(Lcom/j256/ormlite/support/DatabaseConnection;ZLcom/j256/ormlite/db/DatabaseType;Ljava/util/concurrent/Callable;)Ljava/lang/Object;
a=0;//     .locals 9
a=0;//     .param p0, "connection"    # Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     .param p1, "saved"    # Z
a=0;//     .param p2, "databaseType"    # Lcom/j256/ormlite/db/DatabaseType;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/j256/ormlite/support/DatabaseConnection;",
a=0;//             "Z",
a=0;//             "Lcom/j256/ormlite/db/DatabaseType;",
a=0;//             "Ljava/util/concurrent/Callable",
a=0;//             "<TT;>;)TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p3, "callable":Ljava/util/concurrent/Callable;, "Ljava/util/concurrent/Callable<TT;>;"
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     .line 146
a=0;//     #v8=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 148
a=0;//     .local v0, "autoCommitAtStart":Z
a=0;//     #v0=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 149
a=0;//     .local v2, "hasSavePoint":Z
a=0;//     #v2=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 150
a=0;//     .local v4, "savePoint":Ljava/sql/Savepoint;
a=0;//     #v4=(Null);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-interface {p2}, Lcom/j256/ormlite/db/DatabaseType;->isNestedSavePointsSupported()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     .line 151
a=0;//     :cond_0
a=0;//     #v5=(Conflicted);
a=0;//     invoke-interface {p0}, Lcom/j256/ormlite/support/DatabaseConnection;->isAutoCommitSupported()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     .line 152
a=0;//     invoke-interface {p0}, Lcom/j256/ormlite/support/DatabaseConnection;->isAutoCommit()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 153
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 155
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-interface {p0, v5}, Lcom/j256/ormlite/support/DatabaseConnection;->setAutoCommit(Z)V
a=0;// 
a=0;//     .line 156
a=0;//     sget-object v5, Lcom/j256/ormlite/misc/TransactionManager;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v5=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     const-string v6, "had to set auto-commit to false"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Lcom/j256/ormlite/logger/Logger;->debug(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 159
a=0;//     :cond_1
a=0;//     #v5=(Conflicted);v6=(Conflicted);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "ORMLITE"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     sget-object v6, Lcom/j256/ormlite/misc/TransactionManager;->savePointCounter:Ljava/util/concurrent/atomic/AtomicInteger;
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-interface {p0, v5}, Lcom/j256/ormlite/support/DatabaseConnection;->setSavePoint(Ljava/lang/String;)Ljava/sql/Savepoint;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 160
a=0;//     #v4=(Reference,Ljava/sql/Savepoint;);
a=0;//     if-nez v4, :cond_5
a=0;// 
a=0;//     .line 161
a=0;//     sget-object v5, Lcom/j256/ormlite/misc/TransactionManager;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     const-string v6, "started savePoint transaction"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Lcom/j256/ormlite/logger/Logger;->debug(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 165
a=0;//     :goto_0
a=0;//     #v7=(Conflicted);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 168
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v2=(Boolean);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-interface {p3}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 169
a=0;//     .local v3, "result":Ljava/lang/Object;, "TT;"
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 170
a=0;//     invoke-static {p0, v4}, Lcom/j256/ormlite/misc/TransactionManager;->commit(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/sql/Savepoint;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/sql/SQLException; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 185
a=0;//     :cond_3
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 187
a=0;//     invoke-interface {p0, v8}, Lcom/j256/ormlite/support/DatabaseConnection;->setAutoCommit(Z)V
a=0;// 
a=0;//     .line 188
a=0;//     sget-object v5, Lcom/j256/ormlite/misc/TransactionManager;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v5=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     const-string v6, "restored auto-commit to true"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Lcom/j256/ormlite/logger/Logger;->debug(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_4
a=0;//     #v5=(Conflicted);v6=(Conflicted);
a=0;//     return-object v3
a=0;// 
a=0;//     .line 163
a=0;//     .end local v3    # "result":Ljava/lang/Object;, "TT;"
a=0;//     :cond_5
a=0;//     :try_start_2
a=0;//     #v2=(Null);v3=(Uninit);v5=(Reference,Ljava/lang/String;);v6=(Integer);v7=(Uninit);
a=0;//     sget-object v5, Lcom/j256/ormlite/misc/TransactionManager;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     const-string v6, "started savePoint transaction {}"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v4}, Ljava/sql/Savepoint;->getSavepointName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6, v7}, Lcom/j256/ormlite/logger/Logger;->debug(Ljava/lang/String;Ljava/lang/Object;)V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 185
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v2=(Boolean);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     .line 187
a=0;//     invoke-interface {p0, v8}, Lcom/j256/ormlite/support/DatabaseConnection;->setAutoCommit(Z)V
a=0;// 
a=0;//     .line 188
a=0;//     sget-object v6, Lcom/j256/ormlite/misc/TransactionManager;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v6=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     const-string v7, "restored auto-commit to true"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Lcom/j256/ormlite/logger/Logger;->debug(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_6
a=0;//     #v6=(Conflicted);v7=(Conflicted);
a=0;//     throw v5
a=0;// 
a=0;//     .line 173
a=0;//     :catch_0
a=0;//     #v1=(Uninit);v5=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 174
a=0;//     .local v1, "e":Ljava/sql/SQLException;
a=0;//     #v1=(Reference,Ljava/sql/SQLException;);
a=0;//     if-eqz v2, :cond_7
a=0;// 
a=0;//     .line 175
a=0;//     :try_start_3
a=0;//     invoke-static {p0, v4}, Lcom/j256/ormlite/misc/TransactionManager;->rollBack(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/sql/Savepoint;)V
a=0;// 
a=0;//     .line 177
a=0;//     :cond_7
a=0;//     throw v1
a=0;// 
a=0;//     .line 178
a=0;//     .end local v1    # "e":Ljava/sql/SQLException;
a=0;//     :catch_1
a=0;//     #v1=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 179
a=0;//     .local v1, "e":Ljava/lang/Exception;
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     if-eqz v2, :cond_8
a=0;// 
a=0;//     .line 180
a=0;//     invoke-static {p0, v4}, Lcom/j256/ormlite/misc/TransactionManager;->rollBack(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/sql/Savepoint;)V
a=0;// 
a=0;//     .line 182
a=0;//     :cond_8
a=0;//     const-string v5, "Transaction callable threw non-SQL exception"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5, v1}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     throw v5
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// .end method
a=0;// 
a=0;// .method private static commit(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/sql/Savepoint;)V
a=0;//     .locals 3
a=0;//     .param p0, "connection"    # Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     .param p1, "savePoint"    # Ljava/sql/Savepoint;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 198
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 199
a=0;//     .local v0, "name":Ljava/lang/String;
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p0, p1}, Lcom/j256/ormlite/support/DatabaseConnection;->commit(Ljava/sql/Savepoint;)V
a=0;// 
a=0;//     .line 200
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 201
a=0;//     sget-object v1, Lcom/j256/ormlite/misc/TransactionManager;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     const-string v2, "committed savePoint transaction"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Lcom/j256/ormlite/logger/Logger;->debug(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 205
a=0;//     :goto_1
a=0;//     return-void
a=0;// 
a=0;//     .line 198
a=0;//     .end local v0    # "name":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     invoke-interface {p1}, Ljava/sql/Savepoint;->getSavepointName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 203
a=0;//     .restart local v0    # "name":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     sget-object v1, Lcom/j256/ormlite/misc/TransactionManager;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     const-string v2, "committed savePoint transaction {}"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, v0}, Lcom/j256/ormlite/logger/Logger;->debug(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private static rollBack(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/sql/Savepoint;)V
a=0;//     .locals 3
a=0;//     .param p0, "connection"    # Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     .param p1, "savePoint"    # Ljava/sql/Savepoint;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 208
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 209
a=0;//     .local v0, "name":Ljava/lang/String;
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p0, p1}, Lcom/j256/ormlite/support/DatabaseConnection;->rollback(Ljava/sql/Savepoint;)V
a=0;// 
a=0;//     .line 210
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 211
a=0;//     sget-object v1, Lcom/j256/ormlite/misc/TransactionManager;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     const-string v2, "rolled back savePoint transaction"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Lcom/j256/ormlite/logger/Logger;->debug(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 215
a=0;//     :goto_1
a=0;//     return-void
a=0;// 
a=0;//     .line 208
a=0;//     .end local v0    # "name":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     invoke-interface {p1}, Ljava/sql/Savepoint;->getSavepointName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 213
a=0;//     .restart local v0    # "name":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     sget-object v1, Lcom/j256/ormlite/misc/TransactionManager;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     const-string v2, "rolled back savePoint transaction {}"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, v0}, Lcom/j256/ormlite/logger/Logger;->debug(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public callInTransaction(Ljava/util/concurrent/Callable;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Ljava/util/concurrent/Callable",
a=0;//             "<TT;>;)TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 112
a=0;//     .local p1, "callable":Ljava/util/concurrent/Callable;, "Ljava/util/concurrent/Callable<TT;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/misc/TransactionManager;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-static {v0, p1}, Lcom/j256/ormlite/misc/TransactionManager;->callInTransaction(Lcom/j256/ormlite/support/ConnectionSource;Ljava/util/concurrent/Callable;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public initialize()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 89
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/misc/TransactionManager;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 90
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "dataSource was not set on "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 92
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setConnectionSource(Lcom/j256/ormlite/support/ConnectionSource;)V
a=0;//     .locals 0
a=0;//     .param p1, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     .prologue
a=0;//     .line 194
a=0;//     iput-object p1, p0, Lcom/j256/ormlite/misc/TransactionManager;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     .line 195
a=0;//     return-void
a=0;// .end method
}}
