package com.j256.ormlite.dao; class RuntimeExceptionDao { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/dao/RuntimeExceptionDao;
a=0;// .super Ljava/lang/Object;
a=0;// .source "RuntimeExceptionDao.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<T:",
a=0;//         "Ljava/lang/Object;",
a=0;//         "ID:",
a=0;//         "Ljava/lang/Object;",
a=0;//         ">",
a=0;//         "Ljava/lang/Object;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final LOG_LEVEL:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;// .field private static final logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private dao:Lcom/j256/ormlite/dao/Dao;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/j256/ormlite/dao/Dao",
a=0;//             "<TT;TID;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 48
a=0;//     sget-object v0, Lcom/j256/ormlite/logger/Log$Level;->DEBUG:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     sput-object v0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->LOG_LEVEL:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     .line 51
a=0;//     const-class v0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/j256/ormlite/logger/LoggerFactory;->getLogger(Ljava/lang/Class;)Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Lcom/j256/ormlite/dao/Dao;)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/dao/Dao",
a=0;//             "<TT;TID;>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     .local p1, "dao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<TT;TID;>;"
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 54
a=0;//     #p0=(Reference,Lcom/j256/ormlite/dao/RuntimeExceptionDao;);
a=0;//     iput-object p1, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     .line 55
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static createDao(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/table/DatabaseTableConfig;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;
a=0;//     .locals 2
a=0;//     .param p0, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             "ID:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/j256/ormlite/support/ConnectionSource;",
a=0;//             "Lcom/j256/ormlite/table/DatabaseTableConfig",
a=0;//             "<TT;>;)",
a=0;//             "Lcom/j256/ormlite/dao/RuntimeExceptionDao",
a=0;//             "<TT;TID;>;"
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
a=0;//     .line 75
a=0;//     .local p1, "tableConfig":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<TT;>;"
a=0;//     invoke-static {p0, p1}, Lcom/j256/ormlite/dao/DaoManager;->createDao(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/table/DatabaseTableConfig;)Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 76
a=0;//     .local v0, "castDao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<TT;TID;>;"
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     new-instance v1, Lcom/j256/ormlite/dao/RuntimeExceptionDao;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/j256/ormlite/dao/RuntimeExceptionDao;);
a=0;//     invoke-direct {v1, v0}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;-><init>(Lcom/j256/ormlite/dao/Dao;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/RuntimeExceptionDao;);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public static createDao(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;
a=0;//     .locals 2
a=0;//     .param p0, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             "ID:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/j256/ormlite/support/ConnectionSource;",
a=0;//             "Ljava/lang/Class",
a=0;//             "<TT;>;)",
a=0;//             "Lcom/j256/ormlite/dao/RuntimeExceptionDao",
a=0;//             "<TT;TID;>;"
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
a=0;//     .line 64
a=0;//     .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     invoke-static {p0, p1}, Lcom/j256/ormlite/dao/DaoManager;->createDao(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;)Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 65
a=0;//     .local v0, "castDao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<TT;TID;>;"
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     new-instance v1, Lcom/j256/ormlite/dao/RuntimeExceptionDao;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/j256/ormlite/dao/RuntimeExceptionDao;);
a=0;//     invoke-direct {v1, v0}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;-><init>(Lcom/j256/ormlite/dao/Dao;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/RuntimeExceptionDao;);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method private logMessage(Ljava/lang/Exception;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p1, "e"    # Ljava/lang/Exception;
a=0;//     .param p2, "message"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 818
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     sget-object v0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     sget-object v1, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->LOG_LEVEL:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/j256/ormlite/logger/Logger;->log(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 819
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public callBatchTasks(Ljava/util/concurrent/Callable;)Ljava/lang/Object;
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<CT:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Ljava/util/concurrent/Callable",
a=0;//             "<TCT;>;)TCT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 517
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     .local p1, "callable":Ljava/util/concurrent/Callable;, "Ljava/util/concurrent/Callable<TCT;>;"
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1, p1}, Lcom/j256/ormlite/dao/Dao;->callBatchTasks(Ljava/util/concurrent/Callable;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// 
a=0;//     .line 518
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 519
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "callBatchTasks threw exception on: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->logMessage(Ljava/lang/Exception;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 520
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public clearObjectCache()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 659
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/dao/Dao;->clearObjectCache()V
a=0;// 
a=0;//     .line 660
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public closeLastIterator()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 397
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1}, Lcom/j256/ormlite/dao/Dao;->closeLastIterator()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 402
a=0;//     return-void
a=0;// 
a=0;//     .line 398
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 399
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     const-string v1, "closeLastIterator threw exception"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->logMessage(Ljava/lang/Exception;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 400
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public commit(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;//     .locals 3
a=0;//     .param p1, "connection"    # Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;//     .prologue
a=0;//     .line 777
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1, p1}, Lcom/j256/ormlite/dao/Dao;->commit(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 782
a=0;//     return-void
a=0;// 
a=0;//     .line 778
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 779
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "commit("
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ") threw exception"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->logMessage(Ljava/lang/Exception;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 780
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public countOf()J
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 593
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1}, Lcom/j256/ormlite/dao/Dao;->countOf()J
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     return-wide v1
a=0;// 
a=0;//     .line 594
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 595
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     const-string v1, "countOf threw exception"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->logMessage(Ljava/lang/Exception;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 596
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public countOf(Lcom/j256/ormlite/stmt/PreparedQuery;)J
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/stmt/PreparedQuery",
a=0;//             "<TT;>;)J"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 605
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     .local p1, "preparedQuery":Lcom/j256/ormlite/stmt/PreparedQuery;, "Lcom/j256/ormlite/stmt/PreparedQuery<TT;>;"
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1, p1}, Lcom/j256/ormlite/dao/Dao;->countOf(Lcom/j256/ormlite/stmt/PreparedQuery;)J
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     return-wide v1
a=0;// 
a=0;//     .line 606
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 607
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "countOf threw exception on "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->logMessage(Ljava/lang/Exception;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 608
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public create(Ljava/lang/Object;)I
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TT;)I"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 225
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     .local p1, "data":Ljava/lang/Object;, "TT;"
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1, p1}, Lcom/j256/ormlite/dao/Dao;->create(Ljava/lang/Object;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     return v1
a=0;// 
a=0;//     .line 226
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 227
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "create threw exception on: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->logMessage(Ljava/lang/Exception;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 228
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public createIfNotExists(Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TT;)TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 237
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     .local p1, "data":Ljava/lang/Object;, "TT;"
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1, p1}, Lcom/j256/ormlite/dao/Dao;->createIfNotExists(Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// 
a=0;//     .line 238
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 239
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "createIfNotExists threw exception on: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->logMessage(Ljava/lang/Exception;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 240
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public createOrUpdate(Ljava/lang/Object;)Lcom/j256/ormlite/dao/Dao$CreateOrUpdateStatus;
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TT;)",
a=0;//             "Lcom/j256/ormlite/dao/Dao$CreateOrUpdateStatus;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 249
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     .local p1, "data":Ljava/lang/Object;, "TT;"
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1, p1}, Lcom/j256/ormlite/dao/Dao;->createOrUpdate(Ljava/lang/Object;)Lcom/j256/ormlite/dao/Dao$CreateOrUpdateStatus;
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// 
a=0;//     .line 250
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 251
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "createOrUpdate threw exception on: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->logMessage(Ljava/lang/Exception;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 252
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public delete(Lcom/j256/ormlite/stmt/PreparedDelete;)I
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/stmt/PreparedDelete",
a=0;//             "<TT;>;)I"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 357
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     .local p1, "preparedDelete":Lcom/j256/ormlite/stmt/PreparedDelete;, "Lcom/j256/ormlite/stmt/PreparedDelete<TT;>;"
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1, p1}, Lcom/j256/ormlite/dao/Dao;->delete(Lcom/j256/ormlite/stmt/PreparedDelete;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     return v1
a=0;// 
a=0;//     .line 358
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 359
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "delete threw exception on: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->logMessage(Ljava/lang/Exception;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 360
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public delete(Ljava/lang/Object;)I
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TT;)I"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 309
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     .local p1, "data":Ljava/lang/Object;, "TT;"
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1, p1}, Lcom/j256/ormlite/dao/Dao;->delete(Ljava/lang/Object;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     return v1
a=0;// 
a=0;//     .line 310
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 311
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "delete threw exception on: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->logMessage(Ljava/lang/Exception;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 312
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public delete(Ljava/util/Collection;)I
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/Collection",
a=0;//             "<TT;>;)I"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 333
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     .local p1, "datas":Ljava/util/Collection;, "Ljava/util/Collection<TT;>;"
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1, p1}, Lcom/j256/ormlite/dao/Dao;->delete(Ljava/util/Collection;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     return v1
a=0;// 
a=0;//     .line 334
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 335
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "delete threw exception on: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->logMessage(Ljava/lang/Exception;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 336
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public deleteBuilder()Lcom/j256/ormlite/stmt/DeleteBuilder;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Lcom/j256/ormlite/stmt/DeleteBuilder",
a=0;//             "<TT;TID;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 205
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/dao/Dao;->deleteBuilder()Lcom/j256/ormlite/stmt/DeleteBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public deleteById(Ljava/lang/Object;)I
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TID;)I"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 321
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     .local p1, "id":Ljava/lang/Object;, "TID;"
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1, p1}, Lcom/j256/ormlite/dao/Dao;->deleteById(Ljava/lang/Object;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     return v1
a=0;// 
a=0;//     .line 322
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 323
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "deleteById threw exception on: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->logMessage(Ljava/lang/Exception;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 324
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public deleteIds(Ljava/util/Collection;)I
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/Collection",
a=0;//             "<TID;>;)I"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 345
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     .local p1, "ids":Ljava/util/Collection;, "Ljava/util/Collection<TID;>;"
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1, p1}, Lcom/j256/ormlite/dao/Dao;->deleteIds(Ljava/util/Collection;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     return v1
a=0;// 
a=0;//     .line 346
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 347
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "deleteIds threw exception on: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->logMessage(Ljava/lang/Exception;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 348
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public endThreadConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;//     .locals 3
a=0;//     .param p1, "connection"    # Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;//     .prologue
a=0;//     .line 715
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1, p1}, Lcom/j256/ormlite/dao/Dao;->endThreadConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 720
a=0;//     return-void
a=0;// 
a=0;//     .line 716
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 717
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "endThreadConnection("
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ") threw exception"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->logMessage(Ljava/lang/Exception;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 718
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public varargs executeRaw(Ljava/lang/String;[Ljava/lang/String;)I
a=0;//     .locals 3
a=0;//     .param p1, "statement"    # Ljava/lang/String;
a=0;//     .param p2, "arguments"    # [Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 481
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1, p1, p2}, Lcom/j256/ormlite/dao/Dao;->executeRaw(Ljava/lang/String;[Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     return v1
a=0;// 
a=0;//     .line 482
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 483
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "executeRaw threw exception on: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->logMessage(Ljava/lang/Exception;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 484
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public executeRawNoArgs(Ljava/lang/String;)I
a=0;//     .locals 3
a=0;//     .param p1, "statement"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 493
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1, p1}, Lcom/j256/ormlite/dao/Dao;->executeRawNoArgs(Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     return v1
a=0;// 
a=0;//     .line 494
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 495
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "executeRawNoArgs threw exception on: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->logMessage(Ljava/lang/Exception;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 496
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public extractId(Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TT;)TID;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 548
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     .local p1, "data":Ljava/lang/Object;, "TT;"
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1, p1}, Lcom/j256/ormlite/dao/Dao;->extractId(Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// 
a=0;//     .line 549
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 550
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "extractId threw exception on: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->logMessage(Ljava/lang/Exception;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 551
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public findForeignFieldType(Ljava/lang/Class;)Lcom/j256/ormlite/field/FieldType;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;)",
a=0;//             "Lcom/j256/ormlite/field/FieldType;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 566
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v0, p1}, Lcom/j256/ormlite/dao/Dao;->findForeignFieldType(Ljava/lang/Class;)Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getConnectionSource()Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 814
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/dao/Dao;->getConnectionSource()Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getDataClass()Ljava/lang/Class;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/lang/Class",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 559
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/dao/Dao;->getDataClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getEmptyForeignCollection(Ljava/lang/String;)Lcom/j256/ormlite/dao/ForeignCollection;
a=0;//     .locals 3
a=0;//     .param p1, "fieldName"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<FT:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Ljava/lang/String;",
a=0;//             ")",
a=0;//             "Lcom/j256/ormlite/dao/ForeignCollection",
a=0;//             "<TFT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 617
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1, p1}, Lcom/j256/ormlite/dao/Dao;->getEmptyForeignCollection(Ljava/lang/String;)Lcom/j256/ormlite/dao/ForeignCollection;
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// 
a=0;//     .line 618
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 619
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "getEmptyForeignCollection threw exception on "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->logMessage(Ljava/lang/Exception;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 620
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public getObjectCache()Lcom/j256/ormlite/dao/ObjectCache;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 640
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/dao/Dao;->getObjectCache()Lcom/j256/ormlite/dao/ObjectCache;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getRawRowMapper()Lcom/j256/ormlite/dao/RawRowMapper;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Lcom/j256/ormlite/dao/RawRowMapper",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 807
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/dao/Dao;->getRawRowMapper()Lcom/j256/ormlite/dao/RawRowMapper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getSelectStarRowMapper()Lcom/j256/ormlite/stmt/GenericRowMapper;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Lcom/j256/ormlite/stmt/GenericRowMapper",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 679
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1}, Lcom/j256/ormlite/dao/Dao;->getSelectStarRowMapper()Lcom/j256/ormlite/stmt/GenericRowMapper;
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// 
a=0;//     .line 680
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 681
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     const-string v1, "getSelectStarRowMapper threw exception"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->logMessage(Ljava/lang/Exception;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 682
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public getWrappedIterable()Lcom/j256/ormlite/dao/CloseableWrappedIterable;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Lcom/j256/ormlite/dao/CloseableWrappedIterable",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 382
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/dao/Dao;->getWrappedIterable()Lcom/j256/ormlite/dao/CloseableWrappedIterable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getWrappedIterable(Lcom/j256/ormlite/stmt/PreparedQuery;)Lcom/j256/ormlite/dao/CloseableWrappedIterable;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/stmt/PreparedQuery",
a=0;//             "<TT;>;)",
a=0;//             "Lcom/j256/ormlite/dao/CloseableWrappedIterable",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 389
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     .local p1, "preparedQuery":Lcom/j256/ormlite/stmt/PreparedQuery;, "Lcom/j256/ormlite/stmt/PreparedQuery<TT;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v0, p1}, Lcom/j256/ormlite/dao/Dao;->getWrappedIterable(Lcom/j256/ormlite/stmt/PreparedQuery;)Lcom/j256/ormlite/dao/CloseableWrappedIterable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public idExists(Ljava/lang/Object;)Z
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TID;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 691
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     .local p1, "id":Ljava/lang/Object;, "TID;"
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1, p1}, Lcom/j256/ormlite/dao/Dao;->idExists(Ljava/lang/Object;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     return v1
a=0;// 
a=0;//     .line 692
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 693
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "idExists threw exception on "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->logMessage(Ljava/lang/Exception;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 694
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public isAutoCommit()Z
a=0;//     .locals 2
a=0;//     .annotation runtime Ljava/lang/Deprecated;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 753
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1}, Lcom/j256/ormlite/dao/Dao;->isAutoCommit()Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     return v1
a=0;// 
a=0;//     .line 754
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 755
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     const-string v1, "isAutoCommit() threw exception"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->logMessage(Ljava/lang/Exception;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 756
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public isAutoCommit(Lcom/j256/ormlite/support/DatabaseConnection;)Z
a=0;//     .locals 3
a=0;//     .param p1, "connection"    # Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;//     .prologue
a=0;//     .line 765
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1, p1}, Lcom/j256/ormlite/dao/Dao;->isAutoCommit(Lcom/j256/ormlite/support/DatabaseConnection;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     return v1
a=0;// 
a=0;//     .line 766
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 767
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "isAutoCommit("
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ") threw exception"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->logMessage(Ljava/lang/Exception;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 768
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public isTableExists()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 581
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1}, Lcom/j256/ormlite/dao/Dao;->isTableExists()Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     return v1
a=0;// 
a=0;//     .line 582
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 583
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     const-string v1, "isTableExists threw exception"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->logMessage(Ljava/lang/Exception;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 584
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public isUpdatable()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 573
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/dao/Dao;->isUpdatable()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public iterator()Lcom/j256/ormlite/dao/CloseableIterator;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Lcom/j256/ormlite/dao/CloseableIterator",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 368
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/dao/Dao;->iterator()Lcom/j256/ormlite/dao/CloseableIterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public iterator(I)Lcom/j256/ormlite/dao/CloseableIterator;
a=0;//     .locals 1
a=0;//     .param p1, "resultFlags"    # I
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(I)",
a=0;//             "Lcom/j256/ormlite/dao/CloseableIterator",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 375
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v0, p1}, Lcom/j256/ormlite/dao/Dao;->iterator(I)Lcom/j256/ormlite/dao/CloseableIterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public iterator(Lcom/j256/ormlite/stmt/PreparedQuery;)Lcom/j256/ormlite/dao/CloseableIterator;
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/stmt/PreparedQuery",
a=0;//             "<TT;>;)",
a=0;//             "Lcom/j256/ormlite/dao/CloseableIterator",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 409
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     .local p1, "preparedQuery":Lcom/j256/ormlite/stmt/PreparedQuery;, "Lcom/j256/ormlite/stmt/PreparedQuery<TT;>;"
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1, p1}, Lcom/j256/ormlite/dao/Dao;->iterator(Lcom/j256/ormlite/stmt/PreparedQuery;)Lcom/j256/ormlite/dao/CloseableIterator;
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// 
a=0;//     .line 410
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 411
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "iterator threw exception on: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->logMessage(Ljava/lang/Exception;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 412
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public iterator(Lcom/j256/ormlite/stmt/PreparedQuery;I)Lcom/j256/ormlite/dao/CloseableIterator;
a=0;//     .locals 3
a=0;//     .param p2, "resultFlags"    # I
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/stmt/PreparedQuery",
a=0;//             "<TT;>;I)",
a=0;//             "Lcom/j256/ormlite/dao/CloseableIterator",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 421
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     .local p1, "preparedQuery":Lcom/j256/ormlite/stmt/PreparedQuery;, "Lcom/j256/ormlite/stmt/PreparedQuery<TT;>;"
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1, p1, p2}, Lcom/j256/ormlite/dao/Dao;->iterator(Lcom/j256/ormlite/stmt/PreparedQuery;I)Lcom/j256/ormlite/dao/CloseableIterator;
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// 
a=0;//     .line 422
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 423
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "iterator threw exception on: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->logMessage(Ljava/lang/Exception;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 424
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public mapSelectStarRow(Lcom/j256/ormlite/support/DatabaseResults;)Ljava/lang/Object;
a=0;//     .locals 2
a=0;//     .param p1, "results"    # Lcom/j256/ormlite/support/DatabaseResults;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/support/DatabaseResults;",
a=0;//             ")TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 667
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1, p1}, Lcom/j256/ormlite/dao/Dao;->mapSelectStarRow(Lcom/j256/ormlite/support/DatabaseResults;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// 
a=0;//     .line 668
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 669
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     const-string v1, "mapSelectStarRow threw exception on results"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->logMessage(Ljava/lang/Exception;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 670
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public objectToString(Ljava/lang/Object;)Ljava/lang/String;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TT;)",
a=0;//             "Ljava/lang/String;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 528
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     .local p1, "data":Ljava/lang/Object;, "TT;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v0, p1}, Lcom/j256/ormlite/dao/Dao;->objectToString(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public objectsEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TT;TT;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 536
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     .local p1, "data1":Ljava/lang/Object;, "TT;"
a=0;//     .local p2, "data2":Ljava/lang/Object;, "TT;"
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1, p1, p2}, Lcom/j256/ormlite/dao/Dao;->objectsEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     return v1
a=0;// 
a=0;//     .line 537
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 538
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "objectsEqual threw exception on: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " and "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->logMessage(Ljava/lang/Exception;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 539
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public query(Lcom/j256/ormlite/stmt/PreparedQuery;)Ljava/util/List;
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/stmt/PreparedQuery",
a=0;//             "<TT;>;)",
a=0;//             "Ljava/util/List",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 213
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     .local p1, "preparedQuery":Lcom/j256/ormlite/stmt/PreparedQuery;, "Lcom/j256/ormlite/stmt/PreparedQuery<TT;>;"
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1, p1}, Lcom/j256/ormlite/dao/Dao;->query(Lcom/j256/ormlite/stmt/PreparedQuery;)Ljava/util/List;
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// 
a=0;//     .line 214
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 215
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "query threw exception on: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->logMessage(Ljava/lang/Exception;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 216
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public queryBuilder()Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Lcom/j256/ormlite/stmt/QueryBuilder",
a=0;//             "<TT;TID;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 191
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/dao/Dao;->queryBuilder()Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public queryForAll()Ljava/util/List;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/List",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 108
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1}, Lcom/j256/ormlite/dao/Dao;->queryForAll()Ljava/util/List;
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// 
a=0;//     .line 109
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 110
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     const-string v1, "queryForAll threw exception"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->logMessage(Ljava/lang/Exception;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 111
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public queryForEq(Ljava/lang/String;Ljava/lang/Object;)Ljava/util/List;
a=0;//     .locals 3
a=0;//     .param p1, "fieldName"    # Ljava/lang/String;
a=0;//     .param p2, "value"    # Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ")",
a=0;//             "Ljava/util/List",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 120
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1, p1, p2}, Lcom/j256/ormlite/dao/Dao;->queryForEq(Ljava/lang/String;Ljava/lang/Object;)Ljava/util/List;
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// 
a=0;//     .line 121
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 122
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "queryForEq threw exception on: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->logMessage(Ljava/lang/Exception;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 123
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public queryForFieldValues(Ljava/util/Map;)Ljava/util/List;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;)",
a=0;//             "Ljava/util/List",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 156
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     .local p1, "fieldValues":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1, p1}, Lcom/j256/ormlite/dao/Dao;->queryForFieldValues(Ljava/util/Map;)Ljava/util/List;
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// 
a=0;//     .line 157
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 158
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     const-string v1, "queryForFieldValues threw exception"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->logMessage(Ljava/lang/Exception;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 159
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public queryForFieldValuesArgs(Ljava/util/Map;)Ljava/util/List;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;)",
a=0;//             "Ljava/util/List",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 168
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     .local p1, "fieldValues":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1, p1}, Lcom/j256/ormlite/dao/Dao;->queryForFieldValuesArgs(Ljava/util/Map;)Ljava/util/List;
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// 
a=0;//     .line 169
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 170
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     const-string v1, "queryForFieldValuesArgs threw exception"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->logMessage(Ljava/lang/Exception;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 171
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public queryForFirst(Lcom/j256/ormlite/stmt/PreparedQuery;)Ljava/lang/Object;
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/stmt/PreparedQuery",
a=0;//             "<TT;>;)TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 96
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     .local p1, "preparedQuery":Lcom/j256/ormlite/stmt/PreparedQuery;, "Lcom/j256/ormlite/stmt/PreparedQuery<TT;>;"
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1, p1}, Lcom/j256/ormlite/dao/Dao;->queryForFirst(Lcom/j256/ormlite/stmt/PreparedQuery;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// 
a=0;//     .line 97
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 98
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "queryForFirst threw exception on: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->logMessage(Ljava/lang/Exception;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 99
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public queryForId(Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TID;)TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     .local p1, "id":Ljava/lang/Object;, "TID;"
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1, p1}, Lcom/j256/ormlite/dao/Dao;->queryForId(Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// 
a=0;//     .line 85
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 86
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "queryForId threw exception on: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->logMessage(Ljava/lang/Exception;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 87
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public queryForMatching(Ljava/lang/Object;)Ljava/util/List;
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TT;)",
a=0;//             "Ljava/util/List",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 132
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     .local p1, "matchObj":Ljava/lang/Object;, "TT;"
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1, p1}, Lcom/j256/ormlite/dao/Dao;->queryForMatching(Ljava/lang/Object;)Ljava/util/List;
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// 
a=0;//     .line 133
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 134
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "queryForMatching threw exception on: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->logMessage(Ljava/lang/Exception;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 135
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public queryForMatchingArgs(Ljava/lang/Object;)Ljava/util/List;
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TT;)",
a=0;//             "Ljava/util/List",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 144
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     .local p1, "matchObj":Ljava/lang/Object;, "TT;"
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1, p1}, Lcom/j256/ormlite/dao/Dao;->queryForMatchingArgs(Ljava/lang/Object;)Ljava/util/List;
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// 
a=0;//     .line 145
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 146
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "queryForMatchingArgs threw exception on: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->logMessage(Ljava/lang/Exception;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 147
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public queryForSameId(Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TT;)TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 180
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     .local p1, "data":Ljava/lang/Object;, "TT;"
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1, p1}, Lcom/j256/ormlite/dao/Dao;->queryForSameId(Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// 
a=0;//     .line 181
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 182
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "queryForSameId threw exception on: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->logMessage(Ljava/lang/Exception;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 183
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public varargs queryRaw(Ljava/lang/String;Lcom/j256/ormlite/dao/RawRowMapper;[Ljava/lang/String;)Lcom/j256/ormlite/dao/GenericRawResults;
a=0;//     .locals 3
a=0;//     .param p1, "query"    # Ljava/lang/String;
a=0;//     .param p3, "arguments"    # [Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<UO:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lcom/j256/ormlite/dao/RawRowMapper",
a=0;//             "<TUO;>;[",
a=0;//             "Ljava/lang/String;",
a=0;//             ")",
a=0;//             "Lcom/j256/ormlite/dao/GenericRawResults",
a=0;//             "<TUO;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 457
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     .local p2, "mapper":Lcom/j256/ormlite/dao/RawRowMapper;, "Lcom/j256/ormlite/dao/RawRowMapper<TUO;>;"
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1, p1, p2, p3}, Lcom/j256/ormlite/dao/Dao;->queryRaw(Ljava/lang/String;Lcom/j256/ormlite/dao/RawRowMapper;[Ljava/lang/String;)Lcom/j256/ormlite/dao/GenericRawResults;
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// 
a=0;//     .line 458
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 459
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "queryRaw threw exception on: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->logMessage(Ljava/lang/Exception;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 460
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public varargs queryRaw(Ljava/lang/String;[Lcom/j256/ormlite/field/DataType;[Ljava/lang/String;)Lcom/j256/ormlite/dao/GenericRawResults;
a=0;//     .locals 3
a=0;//     .param p1, "query"    # Ljava/lang/String;
a=0;//     .param p2, "columnTypes"    # [Lcom/j256/ormlite/field/DataType;
a=0;//     .param p3, "arguments"    # [Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "[",
a=0;//             "Lcom/j256/ormlite/field/DataType;",
a=0;//             "[",
a=0;//             "Ljava/lang/String;",
a=0;//             ")",
a=0;//             "Lcom/j256/ormlite/dao/GenericRawResults",
a=0;//             "<[",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 469
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1, p1, p2, p3}, Lcom/j256/ormlite/dao/Dao;->queryRaw(Ljava/lang/String;[Lcom/j256/ormlite/field/DataType;[Ljava/lang/String;)Lcom/j256/ormlite/dao/GenericRawResults;
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// 
a=0;//     .line 470
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 471
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "queryRaw threw exception on: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->logMessage(Ljava/lang/Exception;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 472
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public varargs queryRaw(Ljava/lang/String;[Ljava/lang/String;)Lcom/j256/ormlite/dao/GenericRawResults;
a=0;//     .locals 3
a=0;//     .param p1, "query"    # Ljava/lang/String;
a=0;//     .param p2, "arguments"    # [Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "[",
a=0;//             "Ljava/lang/String;",
a=0;//             ")",
a=0;//             "Lcom/j256/ormlite/dao/GenericRawResults",
a=0;//             "<[",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 433
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1, p1, p2}, Lcom/j256/ormlite/dao/Dao;->queryRaw(Ljava/lang/String;[Ljava/lang/String;)Lcom/j256/ormlite/dao/GenericRawResults;
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// 
a=0;//     .line 434
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 435
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "queryRaw threw exception on: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->logMessage(Ljava/lang/Exception;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 436
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public varargs queryRawValue(Ljava/lang/String;[Ljava/lang/String;)J
a=0;//     .locals 3
a=0;//     .param p1, "query"    # Ljava/lang/String;
a=0;//     .param p2, "arguments"    # [Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 445
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1, p1, p2}, Lcom/j256/ormlite/dao/Dao;->queryRawValue(Ljava/lang/String;[Ljava/lang/String;)J
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     return-wide v1
a=0;// 
a=0;//     .line 446
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 447
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "queryRawValue threw exception on: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->logMessage(Ljava/lang/Exception;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 448
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public refresh(Ljava/lang/Object;)I
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TT;)I"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 297
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     .local p1, "data":Ljava/lang/Object;, "TT;"
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1, p1}, Lcom/j256/ormlite/dao/Dao;->refresh(Ljava/lang/Object;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     return v1
a=0;// 
a=0;//     .line 298
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 299
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "refresh threw exception on: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->logMessage(Ljava/lang/Exception;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 300
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public rollBack(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;//     .locals 3
a=0;//     .param p1, "connection"    # Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;//     .prologue
a=0;//     .line 789
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1, p1}, Lcom/j256/ormlite/dao/Dao;->rollBack(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 794
a=0;//     return-void
a=0;// 
a=0;//     .line 790
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 791
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "rollBack("
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ") threw exception"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->logMessage(Ljava/lang/Exception;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 792
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public setAutoCommit(Lcom/j256/ormlite/support/DatabaseConnection;Z)V
a=0;//     .locals 3
a=0;//     .param p1, "connection"    # Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     .param p2, "autoCommit"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 740
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1, p1, p2}, Lcom/j256/ormlite/dao/Dao;->setAutoCommit(Lcom/j256/ormlite/support/DatabaseConnection;Z)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 745
a=0;//     return-void
a=0;// 
a=0;//     .line 741
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 742
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "setAutoCommit("
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ","
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ") threw exception"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->logMessage(Ljava/lang/Exception;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 743
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public setAutoCommit(Z)V
a=0;//     .locals 3
a=0;//     .param p1, "autoCommit"    # Z
a=0;//     .annotation runtime Ljava/lang/Deprecated;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 728
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1, p1}, Lcom/j256/ormlite/dao/Dao;->setAutoCommit(Z)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 733
a=0;//     return-void
a=0;// 
a=0;//     .line 729
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 730
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "setAutoCommit("
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ") threw exception"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->logMessage(Ljava/lang/Exception;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 731
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public setObjectCache(Lcom/j256/ormlite/dao/ObjectCache;)V
a=0;//     .locals 3
a=0;//     .param p1, "objectCache"    # Lcom/j256/ormlite/dao/ObjectCache;
a=0;// 
a=0;//     .prologue
a=0;//     .line 648
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1, p1}, Lcom/j256/ormlite/dao/Dao;->setObjectCache(Lcom/j256/ormlite/dao/ObjectCache;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 653
a=0;//     return-void
a=0;// 
a=0;//     .line 649
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 650
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "setObjectCache threw exception on "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->logMessage(Ljava/lang/Exception;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 651
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public setObjectCache(Z)V
a=0;//     .locals 3
a=0;//     .param p1, "enabled"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 629
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1, p1}, Lcom/j256/ormlite/dao/Dao;->setObjectCache(Z)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 634
a=0;//     return-void
a=0;// 
a=0;//     .line 630
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 631
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "setObjectCache("
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ") threw exception"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->logMessage(Ljava/lang/Exception;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 632
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public setObjectFactory(Lcom/j256/ormlite/table/ObjectFactory;)V
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/table/ObjectFactory",
a=0;//             "<TT;>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 800
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     .local p1, "objectFactory":Lcom/j256/ormlite/table/ObjectFactory;, "Lcom/j256/ormlite/table/ObjectFactory<TT;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v0, p1}, Lcom/j256/ormlite/dao/Dao;->setObjectFactory(Lcom/j256/ormlite/table/ObjectFactory;)V
a=0;// 
a=0;//     .line 801
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public startThreadConnection()Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 703
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1}, Lcom/j256/ormlite/dao/Dao;->startThreadConnection()Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// 
a=0;//     .line 704
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 705
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     const-string v1, "startThreadConnection() threw exception"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->logMessage(Ljava/lang/Exception;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 706
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public update(Lcom/j256/ormlite/stmt/PreparedUpdate;)I
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/stmt/PreparedUpdate",
a=0;//             "<TT;>;)I"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 285
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     .local p1, "preparedUpdate":Lcom/j256/ormlite/stmt/PreparedUpdate;, "Lcom/j256/ormlite/stmt/PreparedUpdate<TT;>;"
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1, p1}, Lcom/j256/ormlite/dao/Dao;->update(Lcom/j256/ormlite/stmt/PreparedUpdate;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     return v1
a=0;// 
a=0;//     .line 286
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 287
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "update threw exception on: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->logMessage(Ljava/lang/Exception;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 288
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public update(Ljava/lang/Object;)I
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TT;)I"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 261
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     .local p1, "data":Ljava/lang/Object;, "TT;"
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1, p1}, Lcom/j256/ormlite/dao/Dao;->update(Ljava/lang/Object;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     return v1
a=0;// 
a=0;//     .line 262
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 263
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "update threw exception on: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->logMessage(Ljava/lang/Exception;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 264
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public updateBuilder()Lcom/j256/ormlite/stmt/UpdateBuilder;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Lcom/j256/ormlite/stmt/UpdateBuilder",
a=0;//             "<TT;TID;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 198
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/dao/Dao;->updateBuilder()Lcom/j256/ormlite/stmt/UpdateBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public updateId(Ljava/lang/Object;Ljava/lang/Object;)I
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TT;TID;)I"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 273
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     .local p1, "data":Ljava/lang/Object;, "TT;"
a=0;//     .local p2, "newId":Ljava/lang/Object;, "TID;"
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1, p1, p2}, Lcom/j256/ormlite/dao/Dao;->updateId(Ljava/lang/Object;Ljava/lang/Object;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     return v1
a=0;// 
a=0;//     .line 274
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 275
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "updateId threw exception on: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->logMessage(Ljava/lang/Exception;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 276
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public varargs updateRaw(Ljava/lang/String;[Ljava/lang/String;)I
a=0;//     .locals 3
a=0;//     .param p1, "statement"    # Ljava/lang/String;
a=0;//     .param p2, "arguments"    # [Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 505
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "Lcom/j256/ormlite/dao/RuntimeExceptionDao<TT;TID;>;"
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1, p1, p2}, Lcom/j256/ormlite/dao/Dao;->updateRaw(Ljava/lang/String;[Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     return v1
a=0;// 
a=0;//     .line 506
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 507
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "updateRaw threw exception on: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->logMessage(Ljava/lang/Exception;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 508
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
}}
