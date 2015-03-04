package com.j256.ormlite.dao; class BaseDaoImpl { void a() { int a;
a=0;// .class public abstract Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;// .super Ljava/lang/Object;
a=0;// .source "BaseDaoImpl.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/j256/ormlite/dao/BaseDaoImpl$DaoConfigArray;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<T:",
a=0;//         "Ljava/lang/Object;",
a=0;//         "ID:",
a=0;//         "Ljava/lang/Object;",
a=0;//         ">",
a=0;//         "Ljava/lang/Object;",
a=0;//         "Lcom/j256/ormlite/dao/Dao",
a=0;//         "<TT;TID;>;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final daoConfigLevelLocal:Ljava/lang/ThreadLocal;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/lang/ThreadLocal",
a=0;//             "<",
a=0;//             "Lcom/j256/ormlite/dao/BaseDaoImpl$DaoConfigArray;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private static defaultObjectCache:Lcom/j256/ormlite/dao/ReferenceObjectCache;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;// .field protected final dataClass:Ljava/lang/Class;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/lang/Class",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field protected databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;// .field private initialized:Z
a=0;// 
a=0;// .field protected lastIterator:Lcom/j256/ormlite/dao/CloseableIterator;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/j256/ormlite/dao/CloseableIterator",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private objectCache:Lcom/j256/ormlite/dao/ObjectCache;
a=0;// 
a=0;// .field protected objectFactory:Lcom/j256/ormlite/table/ObjectFactory;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/j256/ormlite/table/ObjectFactory",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field protected statementExecutor:Lcom/j256/ormlite/stmt/StatementExecutor;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/j256/ormlite/stmt/StatementExecutor",
a=0;//             "<TT;TID;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field protected tableConfig:Lcom/j256/ormlite/table/DatabaseTableConfig;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/j256/ormlite/table/DatabaseTableConfig",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field protected tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/j256/ormlite/table/TableInfo",
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
a=0;//     .line 69
a=0;//     new-instance v0, Lcom/j256/ormlite/dao/BaseDaoImpl$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/dao/BaseDaoImpl$1;);
a=0;//     invoke-direct {v0}, Lcom/j256/ormlite/dao/BaseDaoImpl$1;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/BaseDaoImpl$1;);
a=0;//     sput-object v0, Lcom/j256/ormlite/dao/BaseDaoImpl;->daoConfigLevelLocal:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected constructor <init>(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/table/DatabaseTableConfig;)V
a=0;//     .locals 1
a=0;//     .param p1, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/support/ConnectionSource;",
a=0;//             "Lcom/j256/ormlite/table/DatabaseTableConfig",
a=0;//             "<TT;>;)V"
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
a=0;//     .line 117
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     .local p2, "tableConfig":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<TT;>;"
a=0;//     invoke-virtual {p2}, Lcom/j256/ormlite/table/DatabaseTableConfig;->getDataClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {p0, p1, v0, p2}, Lcom/j256/ormlite/dao/BaseDaoImpl;-><init>(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;Lcom/j256/ormlite/table/DatabaseTableConfig;)V
a=0;// 
a=0;//     .line 118
a=0;//     #p0=(Reference,Lcom/j256/ormlite/dao/BaseDaoImpl;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected constructor <init>(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;)V
a=0;//     .locals 1
a=0;//     .param p1, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/support/ConnectionSource;",
a=0;//             "Ljava/lang/Class",
a=0;//             "<TT;>;)V"
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
a=0;//     .line 105
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     .local p2, "dataClass":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, p2, v0}, Lcom/j256/ormlite/dao/BaseDaoImpl;-><init>(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;Lcom/j256/ormlite/table/DatabaseTableConfig;)V
a=0;// 
a=0;//     .line 106
a=0;//     #p0=(Reference,Lcom/j256/ormlite/dao/BaseDaoImpl;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;Lcom/j256/ormlite/table/DatabaseTableConfig;)V
a=0;//     .locals 0
a=0;//     .param p1, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/support/ConnectionSource;",
a=0;//             "Ljava/lang/Class",
a=0;//             "<TT;>;",
a=0;//             "Lcom/j256/ormlite/table/DatabaseTableConfig",
a=0;//             "<TT;>;)V"
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
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     .local p2, "dataClass":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     .local p3, "tableConfig":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<TT;>;"
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 122
a=0;//     #p0=(Reference,Lcom/j256/ormlite/dao/BaseDaoImpl;);
a=0;//     iput-object p2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->dataClass:Ljava/lang/Class;
a=0;// 
a=0;//     .line 123
a=0;//     iput-object p3, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->tableConfig:Lcom/j256/ormlite/table/DatabaseTableConfig;
a=0;// 
a=0;//     .line 124
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 125
a=0;//     iput-object p1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     .line 126
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->initialize()V
a=0;// 
a=0;//     .line 128
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected constructor <init>(Ljava/lang/Class;)V
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/Class",
a=0;//             "<TT;>;)V"
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
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     .local p1, "dataClass":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 92
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, v0, p1, v0}, Lcom/j256/ormlite/dao/BaseDaoImpl;-><init>(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;Lcom/j256/ormlite/table/DatabaseTableConfig;)V
a=0;// 
a=0;//     .line 93
a=0;//     #p0=(Reference,Lcom/j256/ormlite/dao/BaseDaoImpl;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$100(Lcom/j256/ormlite/dao/BaseDaoImpl;I)Lcom/j256/ormlite/dao/CloseableIterator;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;//     .param p1, "x1"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     invoke-direct {p0, p1}, Lcom/j256/ormlite/dao/BaseDaoImpl;->createIterator(I)Lcom/j256/ormlite/dao/CloseableIterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/CloseableIterator;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$200(Lcom/j256/ormlite/dao/BaseDaoImpl;Lcom/j256/ormlite/stmt/PreparedQuery;I)Lcom/j256/ormlite/dao/CloseableIterator;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;//     .param p1, "x1"    # Lcom/j256/ormlite/stmt/PreparedQuery;
a=0;//     .param p2, "x2"    # I
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     invoke-direct {p0, p1, p2}, Lcom/j256/ormlite/dao/BaseDaoImpl;->createIterator(Lcom/j256/ormlite/stmt/PreparedQuery;I)Lcom/j256/ormlite/dao/CloseableIterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/CloseableIterator;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized clearAllInternalObjectCaches()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 776
a=0;//     const-class v1, Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/j256/ormlite/dao/BaseDaoImpl;->defaultObjectCache:Lcom/j256/ormlite/dao/ReferenceObjectCache;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/ReferenceObjectCache;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 777
a=0;//     sget-object v0, Lcom/j256/ormlite/dao/BaseDaoImpl;->defaultObjectCache:Lcom/j256/ormlite/dao/ReferenceObjectCache;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/j256/ormlite/dao/ReferenceObjectCache;->clearAll()V
a=0;// 
a=0;//     .line 778
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/j256/ormlite/dao/BaseDaoImpl;->defaultObjectCache:Lcom/j256/ormlite/dao/ReferenceObjectCache;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 780
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/ReferenceObjectCache;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 776
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method static createDao(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/table/DatabaseTableConfig;)Lcom/j256/ormlite/dao/Dao;
a=0;//     .locals 1
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
a=0;//             "Lcom/j256/ormlite/dao/Dao",
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
a=0;//     .line 911
a=0;//     .local p1, "tableConfig":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<TT;>;"
a=0;//     new-instance v0, Lcom/j256/ormlite/dao/BaseDaoImpl$5;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/dao/BaseDaoImpl$5;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/j256/ormlite/dao/BaseDaoImpl$5;-><init>(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/table/DatabaseTableConfig;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/BaseDaoImpl$5;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static createDao(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;)Lcom/j256/ormlite/dao/Dao;
a=0;//     .locals 1
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
a=0;//             "Lcom/j256/ormlite/dao/Dao",
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
a=0;//     .line 897
a=0;//     .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     new-instance v0, Lcom/j256/ormlite/dao/BaseDaoImpl$4;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/dao/BaseDaoImpl$4;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/j256/ormlite/dao/BaseDaoImpl$4;-><init>(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/BaseDaoImpl$4;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private createIterator(I)Lcom/j256/ormlite/dao/CloseableIterator;
a=0;//     .locals 5
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
a=0;//     .line 923
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     :try_start_0
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->statementExecutor:Lcom/j256/ormlite/stmt/StatementExecutor;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/stmt/StatementExecutor;);
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v3=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     iget-object v4, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->objectCache:Lcom/j256/ormlite/dao/ObjectCache;
a=0;// 
a=0;//     #v4=(Reference,Lcom/j256/ormlite/dao/ObjectCache;);
a=0;//     invoke-virtual {v2, p0, v3, p1, v4}, Lcom/j256/ormlite/stmt/StatementExecutor;->buildIterator(Lcom/j256/ormlite/dao/BaseDaoImpl;Lcom/j256/ormlite/support/ConnectionSource;ILcom/j256/ormlite/dao/ObjectCache;)Lcom/j256/ormlite/stmt/SelectIterator;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 925
a=0;//     .local v1, "iterator":Lcom/j256/ormlite/stmt/SelectIterator;, "Lcom/j256/ormlite/stmt/SelectIterator<TT;TID;>;"
a=0;//     #v1=(Reference,Lcom/j256/ormlite/stmt/SelectIterator;);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 926
a=0;//     .end local v1    # "iterator":Lcom/j256/ormlite/stmt/SelectIterator;, "Lcom/j256/ormlite/stmt/SelectIterator<TT;TID;>;"
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 927
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     new-instance v2, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Could not build iterator for "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->dataClass:Ljava/lang/Class;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v2
a=0;// .end method
a=0;// 
a=0;// .method private createIterator(Lcom/j256/ormlite/stmt/PreparedQuery;I)Lcom/j256/ormlite/dao/CloseableIterator;
a=0;//     .locals 8
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
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 933
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     .local p1, "preparedQuery":Lcom/j256/ormlite/stmt/PreparedQuery;, "Lcom/j256/ormlite/stmt/PreparedQuery<TT;>;"
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->statementExecutor:Lcom/j256/ormlite/stmt/StatementExecutor;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/StatementExecutor;);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     iget-object v4, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->objectCache:Lcom/j256/ormlite/dao/ObjectCache;
a=0;// 
a=0;//     #v4=(Reference,Lcom/j256/ormlite/dao/ObjectCache;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/BaseDaoImpl;);
a=0;//     move-object v3, p1
a=0;// 
a=0;//     #v3=(Reference,Lcom/j256/ormlite/stmt/PreparedQuery;);
a=0;//     move v5, p2
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual/range {v0 .. v5}, Lcom/j256/ormlite/stmt/StatementExecutor;->buildIterator(Lcom/j256/ormlite/dao/BaseDaoImpl;Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/stmt/PreparedStmt;Lcom/j256/ormlite/dao/ObjectCache;I)Lcom/j256/ormlite/stmt/SelectIterator;
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 935
a=0;//     .local v7, "iterator":Lcom/j256/ormlite/stmt/SelectIterator;, "Lcom/j256/ormlite/stmt/SelectIterator<TT;TID;>;"
a=0;//     #v7=(Reference,Lcom/j256/ormlite/stmt/SelectIterator;);
a=0;//     return-object v7
a=0;// 
a=0;//     .line 936
a=0;//     .end local v7    # "iterator":Lcom/j256/ormlite/stmt/SelectIterator;, "Lcom/j256/ormlite/stmt/SelectIterator<TT;TID;>;"
a=0;//     :catch_0
a=0;//     move-exception v6
a=0;// 
a=0;//     .line 937
a=0;//     .local v6, "e":Ljava/sql/SQLException;
a=0;//     #v6=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "Could not build prepared-query iterator for "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->dataClass:Ljava/lang/Class;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0, v6}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method private queryForFieldValues(Ljava/util/Map;Z)Ljava/util/List;
a=0;//     .locals 7
a=0;//     .param p2, "useArgs"    # Z
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;Z)",
a=0;//             "Ljava/util/List",
a=0;//             "<TT;>;"
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
a=0;//     .line 965
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     .local p1, "fieldValues":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->checkForInitialized()V
a=0;// 
a=0;//     .line 966
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->queryBuilder()Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 967
a=0;//     .local v4, "qb":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<TT;TID;>;"
a=0;//     #v4=(Reference,Lcom/j256/ormlite/stmt/QueryBuilder;);
a=0;//     invoke-virtual {v4}, Lcom/j256/ormlite/stmt/QueryBuilder;->where()Lcom/j256/ormlite/stmt/Where;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 968
a=0;//     .local v5, "where":Lcom/j256/ormlite/stmt/Where;, "Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     #v5=(Reference,Lcom/j256/ormlite/stmt/Where;);
a=0;//     invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .local v3, "i$":Ljava/util/Iterator;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/Map$Entry;
a=0;// 
a=0;//     .line 969
a=0;//     .local v0, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 970
a=0;//     .local v1, "fieldValue":Ljava/lang/Object;
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 971
a=0;//     new-instance v2, Lcom/j256/ormlite/stmt/SelectArg;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/j256/ormlite/stmt/SelectArg;);
a=0;//     invoke-direct {v2, v1}, Lcom/j256/ormlite/stmt/SelectArg;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     .local v2, "fieldValue":Lcom/j256/ormlite/stmt/SelectArg;
a=0;//     #v2=(Reference,Lcom/j256/ormlite/stmt/SelectArg;);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     .line 973
a=0;//     .end local v2    # "fieldValue":Lcom/j256/ormlite/stmt/SelectArg;
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v6, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v5, v6, v1}, Lcom/j256/ormlite/stmt/Where;->eq(Ljava/lang/String;Ljava/lang/Object;)Lcom/j256/ormlite/stmt/Where;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 975
a=0;//     .end local v0    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     .end local v1    # "fieldValue":Ljava/lang/Object;
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v6=(Boolean);
a=0;//     invoke-interface {p1}, Ljava/util/Map;->size()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-nez v6, :cond_2
a=0;// 
a=0;//     .line 976
a=0;//     invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 979
a=0;//     :goto_1
a=0;//     #v6=(Reference,Ljava/util/List;);
a=0;//     return-object v6
a=0;// 
a=0;//     .line 978
a=0;//     :cond_2
a=0;//     #v6=(Integer);
a=0;//     invoke-interface {p1}, Ljava/util/Map;->size()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Lcom/j256/ormlite/stmt/Where;->and(I)Lcom/j256/ormlite/stmt/Where;
a=0;// 
a=0;//     .line 979
a=0;//     invoke-virtual {v4}, Lcom/j256/ormlite/stmt/QueryBuilder;->query()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/List;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private queryForMatching(Ljava/lang/Object;Z)Ljava/util/List;
a=0;//     .locals 10
a=0;//     .param p2, "useArgs"    # Z
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TT;Z)",
a=0;//             "Ljava/util/List",
a=0;//             "<TT;>;"
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
a=0;//     .line 942
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     .local p1, "matchObj":Ljava/lang/Object;, "TT;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->checkForInitialized()V
a=0;// 
a=0;//     .line 943
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->queryBuilder()Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 944
a=0;//     .local v7, "qb":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<TT;TID;>;"
a=0;//     #v7=(Reference,Lcom/j256/ormlite/stmt/QueryBuilder;);
a=0;//     invoke-virtual {v7}, Lcom/j256/ormlite/stmt/QueryBuilder;->where()Lcom/j256/ormlite/stmt/Where;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 945
a=0;//     .local v8, "where":Lcom/j256/ormlite/stmt/Where;, "Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     #v8=(Reference,Lcom/j256/ormlite/stmt/Where;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 946
a=0;//     .local v1, "fieldC":I
a=0;//     #v1=(Null);
a=0;//     iget-object v9, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     #v9=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     invoke-virtual {v9}, Lcom/j256/ormlite/table/TableInfo;->getFieldTypes()[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .local v0, "arr$":[Lcom/j256/ormlite/field/FieldType;
a=0;//     #v0=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     array-length v6, v0
a=0;// 
a=0;//     .local v6, "len$":I
a=0;//     #v6=(Integer);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .local v5, "i$":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Integer);
a=0;//     if-ge v5, v6, :cond_2
a=0;// 
a=0;//     aget-object v2, v0, v5
a=0;// 
a=0;//     .line 947
a=0;//     .local v2, "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v2, p1}, Lcom/j256/ormlite/field/FieldType;->getFieldValueIfNotDefault(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 948
a=0;//     .local v3, "fieldValue":Ljava/lang/Object;
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 949
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 950
a=0;//     new-instance v4, Lcom/j256/ormlite/stmt/SelectArg;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/j256/ormlite/stmt/SelectArg;);
a=0;//     invoke-direct {v4, v3}, Lcom/j256/ormlite/stmt/SelectArg;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     .local v4, "fieldValue":Lcom/j256/ormlite/stmt/SelectArg;
a=0;//     #v4=(Reference,Lcom/j256/ormlite/stmt/SelectArg;);
a=0;//     move-object v3, v4
a=0;// 
a=0;//     .line 952
a=0;//     .end local v4    # "fieldValue":Lcom/j256/ormlite/stmt/SelectArg;
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);
a=0;//     invoke-virtual {v2}, Lcom/j256/ormlite/field/FieldType;->getColumnName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v8, v9, v3}, Lcom/j256/ormlite/stmt/Where;->eq(Ljava/lang/String;Ljava/lang/Object;)Lcom/j256/ormlite/stmt/Where;
a=0;// 
a=0;//     .line 953
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     .line 946
a=0;//     :cond_1
a=0;//     add-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 956
a=0;//     .end local v2    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     .end local v3    # "fieldValue":Ljava/lang/Object;
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     .line 957
a=0;//     invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 960
a=0;//     :goto_1
a=0;//     return-object v9
a=0;// 
a=0;//     .line 959
a=0;//     :cond_3
a=0;//     invoke-virtual {v8, v1}, Lcom/j256/ormlite/stmt/Where;->and(I)Lcom/j256/ormlite/stmt/Where;
a=0;// 
a=0;//     .line 960
a=0;//     invoke-virtual {v7}, Lcom/j256/ormlite/stmt/QueryBuilder;->query()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public callBatchTasks(Ljava/util/concurrent/Callable;)Ljava/lang/Object;
a=0;//     .locals 4
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
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 613
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     .local p1, "callable":Ljava/util/concurrent/Callable;, "Ljava/util/concurrent/Callable<TCT;>;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->checkForInitialized()V
a=0;// 
a=0;//     .line 614
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v2}, Lcom/j256/ormlite/support/ConnectionSource;->getReadWriteConnection()Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 620
a=0;//     .local v0, "connection":Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Lcom/j256/ormlite/support/DatabaseConnection;);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     invoke-interface {v2, v0}, Lcom/j256/ormlite/support/ConnectionSource;->saveSpecialConnection(Lcom/j256/ormlite/support/DatabaseConnection;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 621
a=0;//     .local v1, "saved":Z
a=0;//     #v1=(Boolean);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->statementExecutor:Lcom/j256/ormlite/stmt/StatementExecutor;
a=0;// 
a=0;//     invoke-virtual {v2, v0, v1, p1}, Lcom/j256/ormlite/stmt/StatementExecutor;->callBatchTasks(Lcom/j256/ormlite/support/DatabaseConnection;ZLjava/util/concurrent/Callable;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 623
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v3=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v3, v0}, Lcom/j256/ormlite/support/ConnectionSource;->clearSpecialConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     .line 624
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     invoke-interface {v3, v0}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     return-object v2
a=0;// 
a=0;//     .line 623
a=0;//     .end local v1    # "saved":Z
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v3=(Uninit);
a=0;//     move-exception v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v3=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v3, v0}, Lcom/j256/ormlite/support/ConnectionSource;->clearSpecialConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     .line 624
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     invoke-interface {v3, v0}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     throw v2
a=0;// .end method
a=0;// 
a=0;// .method protected checkForInitialized()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 916
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     iget-boolean v0, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->initialized:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 917
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "you must call initialize() before you can use the dao"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 919
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public clearObjectCache()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 767
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->objectCache:Lcom/j256/ormlite/dao/ObjectCache;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/ObjectCache;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 768
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->objectCache:Lcom/j256/ormlite/dao/ObjectCache;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->dataClass:Ljava/lang/Class;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-interface {v0, v1}, Lcom/j256/ormlite/dao/ObjectCache;->clear(Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 770
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public closeLastIterator()V
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 519
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->lastIterator:Lcom/j256/ormlite/dao/CloseableIterator;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/CloseableIterator;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 520
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->lastIterator:Lcom/j256/ormlite/dao/CloseableIterator;
a=0;// 
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/dao/CloseableIterator;->close()V
a=0;// 
a=0;//     .line 521
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->lastIterator:Lcom/j256/ormlite/dao/CloseableIterator;
a=0;// 
a=0;//     .line 523
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/CloseableIterator;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public closeableIterator()Lcom/j256/ormlite/dao/CloseableIterator;
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
a=0;//     .line 477
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     invoke-virtual {p0, v0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->iterator(I)Lcom/j256/ormlite/dao/CloseableIterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/CloseableIterator;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public commit(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;//     .locals 1
a=0;//     .param p1, "connection"    # Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 841
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-interface {p1, v0}, Lcom/j256/ormlite/support/DatabaseConnection;->commit(Ljava/sql/Savepoint;)V
a=0;// 
a=0;//     .line 842
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public countOf()J
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 686
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->checkForInitialized()V
a=0;// 
a=0;//     .line 687
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v1}, Lcom/j256/ormlite/support/ConnectionSource;->getReadOnlyConnection()Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 689
a=0;//     .local v0, "connection":Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Lcom/j256/ormlite/support/DatabaseConnection;);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->statementExecutor:Lcom/j256/ormlite/stmt/StatementExecutor;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/j256/ormlite/stmt/StatementExecutor;->queryForCountStar(Lcom/j256/ormlite/support/DatabaseConnection;)J
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     .line 691
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v3=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v3, v0}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     return-wide v1
a=0;// 
a=0;//     :catchall_0
a=0;//     #v1=(Reference,Ujava/lang/Object;);v2=(Uninit);v3=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v2, v0}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public countOf(Lcom/j256/ormlite/stmt/PreparedQuery;)J
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/stmt/PreparedQuery",
a=0;//             "<TT;>;)J"
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
a=0;//     .line 696
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     .local p1, "preparedQuery":Lcom/j256/ormlite/stmt/PreparedQuery;, "Lcom/j256/ormlite/stmt/PreparedQuery<TT;>;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->checkForInitialized()V
a=0;// 
a=0;//     .line 697
a=0;//     invoke-interface {p1}, Lcom/j256/ormlite/stmt/PreparedQuery;->getType()Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;);
a=0;//     sget-object v2, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->SELECT_LONG:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;);
a=0;//     if-eq v1, v2, :cond_0
a=0;// 
a=0;//     .line 698
a=0;//     new-instance v1, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Prepared query is not of type "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sget-object v3, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->SELECT_LONG:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ", did you call QueryBuilder.setCountOf(true)?"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 701
a=0;//     :cond_0
a=0;//     #v3=(Uninit);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     invoke-interface {v1}, Lcom/j256/ormlite/support/ConnectionSource;->getReadOnlyConnection()Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 703
a=0;//     .local v0, "connection":Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Lcom/j256/ormlite/support/DatabaseConnection;);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->statementExecutor:Lcom/j256/ormlite/stmt/StatementExecutor;
a=0;// 
a=0;//     invoke-virtual {v1, v0, p1}, Lcom/j256/ormlite/stmt/StatementExecutor;->queryForLong(Lcom/j256/ormlite/support/DatabaseConnection;Lcom/j256/ormlite/stmt/PreparedStmt;)J
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     .line 705
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v3=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v3, v0}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     return-wide v1
a=0;// 
a=0;//     :catchall_0
a=0;//     #v1=(Reference,Ujava/lang/Object;);v2=(Reference,Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;);v3=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     invoke-interface {v2, v0}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public create(Ljava/lang/Object;)I
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TT;)I"
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
a=0;//     .line 296
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     .local p1, "data":Ljava/lang/Object;, "TT;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->checkForInitialized()V
a=0;// 
a=0;//     .line 298
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 299
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 310
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Integer);v3=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 301
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     instance-of v2, p1, Lcom/j256/ormlite/misc/BaseDaoEnabled;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     move-object v1, p1
a=0;// 
a=0;//     .line 303
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/j256/ormlite/misc/BaseDaoEnabled;
a=0;// 
a=0;//     .line 304
a=0;//     .local v1, "daoEnabled":Lcom/j256/ormlite/misc/BaseDaoEnabled;, "Lcom/j256/ormlite/misc/BaseDaoEnabled<TT;TID;>;"
a=0;//     invoke-virtual {v1, p0}, Lcom/j256/ormlite/misc/BaseDaoEnabled;->setDao(Lcom/j256/ormlite/dao/Dao;)V
a=0;// 
a=0;//     .line 306
a=0;//     .end local v1    # "daoEnabled":Lcom/j256/ormlite/misc/BaseDaoEnabled;, "Lcom/j256/ormlite/misc/BaseDaoEnabled<TT;TID;>;"
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v2}, Lcom/j256/ormlite/support/ConnectionSource;->getReadWriteConnection()Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 308
a=0;//     .local v0, "connection":Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Lcom/j256/ormlite/support/DatabaseConnection;);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->statementExecutor:Lcom/j256/ormlite/stmt/StatementExecutor;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->objectCache:Lcom/j256/ormlite/dao/ObjectCache;
a=0;// 
a=0;//     #v3=(Reference,Lcom/j256/ormlite/dao/ObjectCache;);
a=0;//     invoke-virtual {v2, v0, p1, v3}, Lcom/j256/ormlite/stmt/StatementExecutor;->create(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/lang/Object;Lcom/j256/ormlite/dao/ObjectCache;)I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 310
a=0;//     #v2=(Integer);
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     invoke-interface {v3, v0}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v2=(Reference,Ujava/lang/Object;);v3=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v3=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v3, v0}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     throw v2
a=0;// .end method
a=0;// 
a=0;// .method public createIfNotExists(Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TT;)TT;"
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
a=0;//     .line 315
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     .local p1, "data":Ljava/lang/Object;, "TT;"
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 316
a=0;//     const/4 p1, 0x0
a=0;// 
a=0;//     .line 323
a=0;//     .end local p1    # "data":Ljava/lang/Object;, "TT;"
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-object p1
a=0;// 
a=0;//     .line 318
a=0;//     .restart local p1    # "data":Ljava/lang/Object;, "TT;"
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     invoke-virtual {p0, p1}, Lcom/j256/ormlite/dao/BaseDaoImpl;->queryForSameId(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 319
a=0;//     .local v0, "existing":Ljava/lang/Object;, "TT;"
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 320
a=0;//     invoke-virtual {p0, p1}, Lcom/j256/ormlite/dao/BaseDaoImpl;->create(Ljava/lang/Object;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     move-object p1, v0
a=0;// 
a=0;//     .line 323
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public createOrUpdate(Ljava/lang/Object;)Lcom/j256/ormlite/dao/Dao$CreateOrUpdateStatus;
a=0;//     .locals 5
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TT;)",
a=0;//             "Lcom/j256/ormlite/dao/Dao$CreateOrUpdateStatus;"
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
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     .local p1, "data":Ljava/lang/Object;, "TT;"
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 328
a=0;//     #v3=(Null);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 329
a=0;//     new-instance v2, Lcom/j256/ormlite/dao/Dao$CreateOrUpdateStatus;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/j256/ormlite/dao/Dao$CreateOrUpdateStatus;);
a=0;//     invoke-direct {v2, v3, v3, v3}, Lcom/j256/ormlite/dao/Dao$CreateOrUpdateStatus;-><init>(ZZI)V
a=0;// 
a=0;//     .line 338
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Reference,Lcom/j256/ormlite/dao/Dao$CreateOrUpdateStatus;);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 331
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     invoke-virtual {p0, p1}, Lcom/j256/ormlite/dao/BaseDaoImpl;->extractId(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 333
a=0;//     .local v0, "id":Ljava/lang/Object;, "TID;"
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->idExists(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 334
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);
a=0;//     invoke-virtual {p0, p1}, Lcom/j256/ormlite/dao/BaseDaoImpl;->create(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 335
a=0;//     .local v1, "numRows":I
a=0;//     #v1=(Integer);
a=0;//     new-instance v2, Lcom/j256/ormlite/dao/Dao$CreateOrUpdateStatus;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/j256/ormlite/dao/Dao$CreateOrUpdateStatus;);
a=0;//     invoke-direct {v2, v4, v3, v1}, Lcom/j256/ormlite/dao/Dao$CreateOrUpdateStatus;-><init>(ZZI)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/dao/Dao$CreateOrUpdateStatus;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 337
a=0;//     .end local v1    # "numRows":I
a=0;//     :cond_2
a=0;//     #v1=(Uninit);v2=(Boolean);
a=0;//     invoke-virtual {p0, p1}, Lcom/j256/ormlite/dao/BaseDaoImpl;->update(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 338
a=0;//     .restart local v1    # "numRows":I
a=0;//     #v1=(Integer);
a=0;//     new-instance v2, Lcom/j256/ormlite/dao/Dao$CreateOrUpdateStatus;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/j256/ormlite/dao/Dao$CreateOrUpdateStatus;);
a=0;//     invoke-direct {v2, v3, v4, v1}, Lcom/j256/ormlite/dao/Dao$CreateOrUpdateStatus;-><init>(ZZI)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/dao/Dao$CreateOrUpdateStatus;);
a=0;//     goto :goto_0
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
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 463
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     .local p1, "preparedDelete":Lcom/j256/ormlite/stmt/PreparedDelete;, "Lcom/j256/ormlite/stmt/PreparedDelete<TT;>;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->checkForInitialized()V
a=0;// 
a=0;//     .line 464
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v1}, Lcom/j256/ormlite/support/ConnectionSource;->getReadWriteConnection()Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 466
a=0;//     .local v0, "connection":Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Lcom/j256/ormlite/support/DatabaseConnection;);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->statementExecutor:Lcom/j256/ormlite/stmt/StatementExecutor;
a=0;// 
a=0;//     invoke-virtual {v1, v0, p1}, Lcom/j256/ormlite/stmt/StatementExecutor;->delete(Lcom/j256/ormlite/support/DatabaseConnection;Lcom/j256/ormlite/stmt/PreparedDelete;)I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 468
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v2, v0}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     return v1
a=0;// 
a=0;//     :catchall_0
a=0;//     #v1=(Reference,Ujava/lang/Object;);v2=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v2, v0}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
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
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 403
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     .local p1, "data":Ljava/lang/Object;, "TT;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->checkForInitialized()V
a=0;// 
a=0;//     .line 405
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 406
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 412
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 408
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v1}, Lcom/j256/ormlite/support/ConnectionSource;->getReadWriteConnection()Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 410
a=0;//     .local v0, "connection":Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Lcom/j256/ormlite/support/DatabaseConnection;);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->statementExecutor:Lcom/j256/ormlite/stmt/StatementExecutor;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->objectCache:Lcom/j256/ormlite/dao/ObjectCache;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/dao/ObjectCache;);
a=0;//     invoke-virtual {v1, v0, p1, v2}, Lcom/j256/ormlite/stmt/StatementExecutor;->delete(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/lang/Object;Lcom/j256/ormlite/dao/ObjectCache;)I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 412
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     invoke-interface {v2, v0}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v1=(Reference,Ujava/lang/Object;);v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v2, v0}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
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
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 433
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     .local p1, "datas":Ljava/util/Collection;, "Ljava/util/Collection<TT;>;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->checkForInitialized()V
a=0;// 
a=0;//     .line 435
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 436
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 442
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 438
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Boolean);v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v1}, Lcom/j256/ormlite/support/ConnectionSource;->getReadWriteConnection()Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 440
a=0;//     .local v0, "connection":Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Lcom/j256/ormlite/support/DatabaseConnection;);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->statementExecutor:Lcom/j256/ormlite/stmt/StatementExecutor;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->objectCache:Lcom/j256/ormlite/dao/ObjectCache;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/dao/ObjectCache;);
a=0;//     invoke-virtual {v1, v0, p1, v2}, Lcom/j256/ormlite/stmt/StatementExecutor;->deleteObjects(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/util/Collection;Lcom/j256/ormlite/dao/ObjectCache;)I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 442
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     invoke-interface {v2, v0}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v1=(Reference,Ujava/lang/Object;);v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v2, v0}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public deleteBuilder()Lcom/j256/ormlite/stmt/DeleteBuilder;
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Lcom/j256/ormlite/stmt/DeleteBuilder",
a=0;//             "<TT;TID;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 257
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->checkForInitialized()V
a=0;// 
a=0;//     .line 258
a=0;//     new-instance v0, Lcom/j256/ormlite/stmt/DeleteBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/stmt/DeleteBuilder;);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/db/DatabaseType;);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     invoke-direct {v0, v1, v2, p0}, Lcom/j256/ormlite/stmt/DeleteBuilder;-><init>(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/table/TableInfo;Lcom/j256/ormlite/dao/Dao;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/DeleteBuilder;);
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
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 418
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     .local p1, "id":Ljava/lang/Object;, "TID;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->checkForInitialized()V
a=0;// 
a=0;//     .line 420
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 421
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 427
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 423
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v1}, Lcom/j256/ormlite/support/ConnectionSource;->getReadWriteConnection()Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 425
a=0;//     .local v0, "connection":Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Lcom/j256/ormlite/support/DatabaseConnection;);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->statementExecutor:Lcom/j256/ormlite/stmt/StatementExecutor;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->objectCache:Lcom/j256/ormlite/dao/ObjectCache;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/dao/ObjectCache;);
a=0;//     invoke-virtual {v1, v0, p1, v2}, Lcom/j256/ormlite/stmt/StatementExecutor;->deleteById(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/lang/Object;Lcom/j256/ormlite/dao/ObjectCache;)I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 427
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     invoke-interface {v2, v0}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v1=(Reference,Ujava/lang/Object;);v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v2, v0}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
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
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 448
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     .local p1, "ids":Ljava/util/Collection;, "Ljava/util/Collection<TID;>;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->checkForInitialized()V
a=0;// 
a=0;//     .line 450
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 451
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 457
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 453
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Boolean);v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v1}, Lcom/j256/ormlite/support/ConnectionSource;->getReadWriteConnection()Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 455
a=0;//     .local v0, "connection":Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Lcom/j256/ormlite/support/DatabaseConnection;);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->statementExecutor:Lcom/j256/ormlite/stmt/StatementExecutor;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->objectCache:Lcom/j256/ormlite/dao/ObjectCache;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/dao/ObjectCache;);
a=0;//     invoke-virtual {v1, v0, p1, v2}, Lcom/j256/ormlite/stmt/StatementExecutor;->deleteIds(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/util/Collection;Lcom/j256/ormlite/dao/ObjectCache;)I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 457
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     invoke-interface {v2, v0}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v1=(Reference,Ujava/lang/Object;);v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v2, v0}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public endThreadConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;//     .locals 1
a=0;//     .param p1, "connection"    # Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 810
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v0, p1}, Lcom/j256/ormlite/support/ConnectionSource;->clearSpecialConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     .line 811
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     .line 812
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public varargs executeRaw(Ljava/lang/String;[Ljava/lang/String;)I
a=0;//     .locals 4
a=0;//     .param p1, "statement"    # Ljava/lang/String;
a=0;//     .param p2, "arguments"    # [Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 577
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->checkForInitialized()V
a=0;// 
a=0;//     .line 578
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v2}, Lcom/j256/ormlite/support/ConnectionSource;->getReadWriteConnection()Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 580
a=0;//     .local v0, "connection":Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Lcom/j256/ormlite/support/DatabaseConnection;);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->statementExecutor:Lcom/j256/ormlite/stmt/StatementExecutor;
a=0;// 
a=0;//     invoke-virtual {v2, v0, p1, p2}, Lcom/j256/ormlite/stmt/StatementExecutor;->executeRaw(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/lang/String;[Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 584
a=0;//     #v2=(Integer);
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v3=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v3, v0}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     return v2
a=0;// 
a=0;//     .line 581
a=0;//     :catch_0
a=0;//     #v2=(Reference,Ujava/lang/Object;);v3=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 582
a=0;//     .local v1, "e":Ljava/sql/SQLException;
a=0;//     :try_start_1
a=0;//     #v1=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Could not run raw execute statement "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2, v1}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     throw v2
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 584
a=0;//     .end local v1    # "e":Ljava/sql/SQLException;
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v3=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v3, v0}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     throw v2
a=0;// .end method
a=0;// 
a=0;// .method public executeRawNoArgs(Ljava/lang/String;)I
a=0;//     .locals 4
a=0;//     .param p1, "statement"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 589
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->checkForInitialized()V
a=0;// 
a=0;//     .line 590
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v2}, Lcom/j256/ormlite/support/ConnectionSource;->getReadWriteConnection()Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 592
a=0;//     .local v0, "connection":Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Lcom/j256/ormlite/support/DatabaseConnection;);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->statementExecutor:Lcom/j256/ormlite/stmt/StatementExecutor;
a=0;// 
a=0;//     invoke-virtual {v2, v0, p1}, Lcom/j256/ormlite/stmt/StatementExecutor;->executeRawNoArgs(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 596
a=0;//     #v2=(Integer);
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v3=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v3, v0}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     return v2
a=0;// 
a=0;//     .line 593
a=0;//     :catch_0
a=0;//     #v2=(Reference,Ujava/lang/Object;);v3=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 594
a=0;//     .local v1, "e":Ljava/sql/SQLException;
a=0;//     :try_start_1
a=0;//     #v1=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Could not run raw execute statement "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2, v1}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     throw v2
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 596
a=0;//     .end local v1    # "e":Ljava/sql/SQLException;
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v3=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v3, v0}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     throw v2
a=0;// .end method
a=0;// 
a=0;// .method public extractId(Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 5
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TT;)TID;"
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
a=0;//     .line 647
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     .local p1, "data":Ljava/lang/Object;, "TT;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->checkForInitialized()V
a=0;// 
a=0;//     .line 648
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     invoke-virtual {v2}, Lcom/j256/ormlite/table/TableInfo;->getIdField()Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 649
a=0;//     .local v1, "idField":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v1=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 650
a=0;//     new-instance v2, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Class "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->dataClass:Ljava/lang/Class;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, " does not have an id field"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/sql/SQLException;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 653
a=0;//     :cond_0
a=0;//     #v3=(Uninit);v4=(Uninit);
a=0;//     invoke-virtual {v1, p1}, Lcom/j256/ormlite/field/FieldType;->extractJavaFieldValue(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 654
a=0;//     .local v0, "id":Ljava/lang/Object;, "TID;"
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public findForeignFieldType(Ljava/lang/Class;)Lcom/j256/ormlite/field/FieldType;
a=0;//     .locals 5
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
a=0;//     .line 662
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->checkForInitialized()V
a=0;// 
a=0;//     .line 663
a=0;//     iget-object v4, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     #v4=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     invoke-virtual {v4}, Lcom/j256/ormlite/table/TableInfo;->getFieldTypes()[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .local v0, "arr$":[Lcom/j256/ormlite/field/FieldType;
a=0;//     #v0=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     array-length v3, v0
a=0;// 
a=0;//     .local v3, "len$":I
a=0;//     #v3=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i$":I
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Integer);
a=0;//     if-ge v2, v3, :cond_1
a=0;// 
a=0;//     aget-object v1, v0, v2
a=0;// 
a=0;//     .line 664
a=0;//     .local v1, "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v1}, Lcom/j256/ormlite/field/FieldType;->getType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     if-ne v4, p1, :cond_0
a=0;// 
a=0;//     .line 668
a=0;//     .end local v1    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     :goto_1
a=0;//     return-object v1
a=0;// 
a=0;//     .line 663
a=0;//     .restart local v1    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     :cond_0
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 668
a=0;//     .end local v1    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public getConnectionSource()Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 872
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
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
a=0;//     .line 658
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->dataClass:Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getEmptyForeignCollection(Ljava/lang/String;)Lcom/j256/ormlite/dao/ForeignCollection;
a=0;//     .locals 7
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
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 710
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->checkForInitialized()V
a=0;// 
a=0;//     .line 711
a=0;//     iget-object v4, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     #v4=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     invoke-virtual {v4}, Lcom/j256/ormlite/table/TableInfo;->getFieldTypes()[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .local v0, "arr$":[Lcom/j256/ormlite/field/FieldType;
a=0;//     #v0=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     array-length v3, v0
a=0;// 
a=0;//     .local v3, "len$":I
a=0;//     #v3=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i$":I
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Integer);v4=(Conflicted);
a=0;//     if-ge v2, v3, :cond_1
a=0;// 
a=0;//     aget-object v1, v0, v2
a=0;// 
a=0;//     .line 712
a=0;//     .local v1, "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v1}, Lcom/j256/ormlite/field/FieldType;->getColumnName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 713
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-virtual {v1, v5, v5, v4}, Lcom/j256/ormlite/field/FieldType;->buildForeignCollection(Ljava/lang/Object;Ljava/lang/Object;Z)Lcom/j256/ormlite/dao/BaseForeignCollection;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Lcom/j256/ormlite/dao/BaseForeignCollection;);
a=0;//     return-object v4
a=0;// 
a=0;//     .line 711
a=0;//     :cond_0
a=0;//     #v4=(Boolean);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 716
a=0;//     .end local v1    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v4=(Conflicted);
a=0;//     new-instance v4, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "Could not find a field named "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v4, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v4
a=0;// .end method
a=0;// 
a=0;// .method public getObjectCache()Lcom/j256/ormlite/dao/ObjectCache;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 763
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->objectCache:Lcom/j256/ormlite/dao/ObjectCache;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/ObjectCache;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getObjectFactory()Lcom/j256/ormlite/table/ObjectFactory;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Lcom/j256/ormlite/table/ObjectFactory",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 849
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->objectFactory:Lcom/j256/ormlite/table/ObjectFactory;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/table/ObjectFactory;);
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
a=0;//     .line 791
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->statementExecutor:Lcom/j256/ormlite/stmt/StatementExecutor;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/StatementExecutor;);
a=0;//     invoke-virtual {v0}, Lcom/j256/ormlite/stmt/StatementExecutor;->getRawRowMapper()Lcom/j256/ormlite/dao/RawRowMapper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getSelectStarRowMapper()Lcom/j256/ormlite/stmt/GenericRowMapper;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Lcom/j256/ormlite/stmt/GenericRowMapper",
a=0;//             "<TT;>;"
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
a=0;//     .line 787
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->statementExecutor:Lcom/j256/ormlite/stmt/StatementExecutor;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/StatementExecutor;);
a=0;//     invoke-virtual {v0}, Lcom/j256/ormlite/stmt/StatementExecutor;->getSelectStarRowMapper()Lcom/j256/ormlite/stmt/GenericRowMapper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getTableConfig()Lcom/j256/ormlite/table/DatabaseTableConfig;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Lcom/j256/ormlite/table/DatabaseTableConfig",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 861
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->tableConfig:Lcom/j256/ormlite/table/DatabaseTableConfig;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/table/DatabaseTableConfig;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getTableInfo()Lcom/j256/ormlite/table/TableInfo;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Lcom/j256/ormlite/table/TableInfo",
a=0;//             "<TT;TID;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 868
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getWrappedIterable()Lcom/j256/ormlite/dao/CloseableWrappedIterable;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Lcom/j256/ormlite/dao/CloseableWrappedIterable",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 487
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->checkForInitialized()V
a=0;// 
a=0;//     .line 488
a=0;//     new-instance v0, Lcom/j256/ormlite/dao/CloseableWrappedIterableImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/dao/CloseableWrappedIterableImpl;);
a=0;//     new-instance v1, Lcom/j256/ormlite/dao/BaseDaoImpl$2;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/j256/ormlite/dao/BaseDaoImpl$2;);
a=0;//     invoke-direct {v1, p0}, Lcom/j256/ormlite/dao/BaseDaoImpl$2;-><init>(Lcom/j256/ormlite/dao/BaseDaoImpl;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/BaseDaoImpl$2;);
a=0;//     invoke-direct {v0, v1}, Lcom/j256/ormlite/dao/CloseableWrappedIterableImpl;-><init>(Lcom/j256/ormlite/dao/CloseableIterable;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/CloseableWrappedIterableImpl;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getWrappedIterable(Lcom/j256/ormlite/stmt/PreparedQuery;)Lcom/j256/ormlite/dao/CloseableWrappedIterable;
a=0;//     .locals 2
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
a=0;//     .line 503
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     .local p1, "preparedQuery":Lcom/j256/ormlite/stmt/PreparedQuery;, "Lcom/j256/ormlite/stmt/PreparedQuery<TT;>;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->checkForInitialized()V
a=0;// 
a=0;//     .line 504
a=0;//     new-instance v0, Lcom/j256/ormlite/dao/CloseableWrappedIterableImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/dao/CloseableWrappedIterableImpl;);
a=0;//     new-instance v1, Lcom/j256/ormlite/dao/BaseDaoImpl$3;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/j256/ormlite/dao/BaseDaoImpl$3;);
a=0;//     invoke-direct {v1, p0, p1}, Lcom/j256/ormlite/dao/BaseDaoImpl$3;-><init>(Lcom/j256/ormlite/dao/BaseDaoImpl;Lcom/j256/ormlite/stmt/PreparedQuery;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/BaseDaoImpl$3;);
a=0;//     invoke-direct {v0, v1}, Lcom/j256/ormlite/dao/CloseableWrappedIterableImpl;-><init>(Lcom/j256/ormlite/dao/CloseableIterable;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/CloseableWrappedIterableImpl;);
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
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 795
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     .local p1, "id":Ljava/lang/Object;, "TID;"
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v1}, Lcom/j256/ormlite/support/ConnectionSource;->getReadOnlyConnection()Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 797
a=0;//     .local v0, "connection":Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Lcom/j256/ormlite/support/DatabaseConnection;);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->statementExecutor:Lcom/j256/ormlite/stmt/StatementExecutor;
a=0;// 
a=0;//     invoke-virtual {v1, v0, p1}, Lcom/j256/ormlite/stmt/StatementExecutor;->ifExists(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/lang/Object;)Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 799
a=0;//     #v1=(Boolean);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v2, v0}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     return v1
a=0;// 
a=0;//     :catchall_0
a=0;//     #v1=(Reference,Ujava/lang/Object;);v2=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v2, v0}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public initialize()V
a=0;//     .locals 11
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 134
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     iget-boolean v8, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->initialized:Z
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_0
a=0;// 
a=0;//     .line 215
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Integer);v9=(Conflicted);v10=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 139
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Boolean);v9=(Uninit);v10=(Uninit);
a=0;//     iget-object v8, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v8=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     if-nez v8, :cond_1
a=0;// 
a=0;//     .line 140
a=0;//     new-instance v8, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v10, "connectionSource was never set on "
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-direct {v8, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v8
a=0;// 
a=0;//     .line 143
a=0;//     :cond_1
a=0;//     #v9=(Uninit);v10=(Uninit);
a=0;//     iget-object v8, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     invoke-interface {v8}, Lcom/j256/ormlite/support/ConnectionSource;->getDatabaseType()Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     iput-object v8, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     .line 144
a=0;//     iget-object v8, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     if-nez v8, :cond_2
a=0;// 
a=0;//     .line 145
a=0;//     new-instance v8, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v10, "connectionSource is getting a null DatabaseType in "
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-direct {v8, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v8
a=0;// 
a=0;//     .line 148
a=0;//     :cond_2
a=0;//     #v9=(Uninit);v10=(Uninit);
a=0;//     iget-object v8, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->tableConfig:Lcom/j256/ormlite/table/DatabaseTableConfig;
a=0;// 
a=0;//     if-nez v8, :cond_3
a=0;// 
a=0;//     .line 149
a=0;//     new-instance v8, Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     #v8=(UninitRef,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     iget-object v9, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v9=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     iget-object v10, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->dataClass:Ljava/lang/Class;
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v8, v9, p0, v10}, Lcom/j256/ormlite/table/TableInfo;-><init>(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/dao/BaseDaoImpl;Ljava/lang/Class;)V
a=0;// 
a=0;//     #v8=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     iput-object v8, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     .line 154
a=0;//     :goto_1
a=0;//     new-instance v8, Lcom/j256/ormlite/stmt/StatementExecutor;
a=0;// 
a=0;//     #v8=(UninitRef,Lcom/j256/ormlite/stmt/StatementExecutor;);
a=0;//     iget-object v9, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     iget-object v10, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     invoke-direct {v8, v9, v10, p0}, Lcom/j256/ormlite/stmt/StatementExecutor;-><init>(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/table/TableInfo;Lcom/j256/ormlite/dao/Dao;)V
a=0;// 
a=0;//     #v8=(Reference,Lcom/j256/ormlite/stmt/StatementExecutor;);
a=0;//     iput-object v8, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->statementExecutor:Lcom/j256/ormlite/stmt/StatementExecutor;
a=0;// 
a=0;//     .line 169
a=0;//     sget-object v8, Lcom/j256/ormlite/dao/BaseDaoImpl;->daoConfigLevelLocal:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Lcom/j256/ormlite/dao/BaseDaoImpl$DaoConfigArray;
a=0;// 
a=0;//     .line 170
a=0;//     .local v2, "daoConfigLevel":Lcom/j256/ormlite/dao/BaseDaoImpl$DaoConfigArray;
a=0;//     invoke-virtual {v2}, Lcom/j256/ormlite/dao/BaseDaoImpl$DaoConfigArray;->size()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-lez v8, :cond_4
a=0;// 
a=0;//     .line 172
a=0;//     invoke-virtual {v2, p0}, Lcom/j256/ormlite/dao/BaseDaoImpl$DaoConfigArray;->addDao(Lcom/j256/ormlite/dao/BaseDaoImpl;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 151
a=0;//     .end local v2    # "daoConfigLevel":Lcom/j256/ormlite/dao/BaseDaoImpl$DaoConfigArray;
a=0;//     :cond_3
a=0;//     #v2=(Uninit);v8=(Reference,Lcom/j256/ormlite/table/DatabaseTableConfig;);v9=(Uninit);v10=(Uninit);
a=0;//     iget-object v8, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->tableConfig:Lcom/j256/ormlite/table/DatabaseTableConfig;
a=0;// 
a=0;//     iget-object v9, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v9=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-virtual {v8, v9}, Lcom/j256/ormlite/table/DatabaseTableConfig;->extractFieldTypes(Lcom/j256/ormlite/support/ConnectionSource;)V
a=0;// 
a=0;//     .line 152
a=0;//     new-instance v8, Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     #v8=(UninitRef,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     iget-object v9, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     iget-object v10, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->tableConfig:Lcom/j256/ormlite/table/DatabaseTableConfig;
a=0;// 
a=0;//     #v10=(Reference,Lcom/j256/ormlite/table/DatabaseTableConfig;);
a=0;//     invoke-direct {v8, v9, p0, v10}, Lcom/j256/ormlite/table/TableInfo;-><init>(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/dao/BaseDaoImpl;Lcom/j256/ormlite/table/DatabaseTableConfig;)V
a=0;// 
a=0;//     #v8=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     iput-object v8, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 176
a=0;//     .restart local v2    # "daoConfigLevel":Lcom/j256/ormlite/dao/BaseDaoImpl$DaoConfigArray;
a=0;//     :cond_4
a=0;//     #v2=(Reference,Lcom/j256/ormlite/dao/BaseDaoImpl$DaoConfigArray;);v8=(Integer);
a=0;//     invoke-virtual {v2, p0}, Lcom/j256/ormlite/dao/BaseDaoImpl$DaoConfigArray;->addDao(Lcom/j256/ormlite/dao/BaseDaoImpl;)V
a=0;// 
a=0;//     .line 185
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .local v5, "i":I
a=0;//     :goto_2
a=0;//     :try_start_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);v5=(Integer);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-virtual {v2}, Lcom/j256/ormlite/dao/BaseDaoImpl$DaoConfigArray;->size()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     if-ge v5, v8, :cond_6
a=0;// 
a=0;//     .line 186
a=0;//     invoke-virtual {v2, v5}, Lcom/j256/ormlite/dao/BaseDaoImpl$DaoConfigArray;->get(I)Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 195
a=0;//     .local v1, "dao":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<**>;"
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/BaseDaoImpl;);
a=0;//     iget-object v8, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v8=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-static {v8, v1}, Lcom/j256/ormlite/dao/DaoManager;->registerDao(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/dao/Dao;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 199
a=0;//     :try_start_1
a=0;//     invoke-virtual {v1}, Lcom/j256/ormlite/dao/BaseDaoImpl;->getTableInfo()Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Lcom/j256/ormlite/table/TableInfo;->getFieldTypes()[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .local v0, "arr$":[Lcom/j256/ormlite/field/FieldType;
a=0;//     #v0=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     array-length v7, v0
a=0;// 
a=0;//     .local v7, "len$":I
a=0;//     #v7=(Integer);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .local v6, "i$":I
a=0;//     :goto_3
a=0;//     #v6=(Integer);
a=0;//     if-ge v6, v7, :cond_5
a=0;// 
a=0;//     aget-object v4, v0, v6
a=0;// 
a=0;//     .line 200
a=0;//     .local v4, "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v4=(Null);
a=0;//     iget-object v8, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/j256/ormlite/dao/BaseDaoImpl;->getDataClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v4, v8, v9}, Lcom/j256/ormlite/field/FieldType;->configDaoInformation(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/sql/SQLException; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 199
a=0;//     add-int/lit8 v6, v6, 0x1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 202
a=0;//     .end local v0    # "arr$":[Lcom/j256/ormlite/field/FieldType;
a=0;//     .end local v4    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     .end local v6    # "i$":I
a=0;//     .end local v7    # "len$":I
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 204
a=0;//     .local v3, "e":Ljava/sql/SQLException;
a=0;//     :try_start_2
a=0;//     #v3=(Reference,Ljava/sql/SQLException;);
a=0;//     iget-object v8, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     invoke-static {v8, v1}, Lcom/j256/ormlite/dao/DaoManager;->unregisterDao(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/dao/Dao;)V
a=0;// 
a=0;//     .line 205
a=0;//     throw v3
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 213
a=0;//     .end local v1    # "dao":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<**>;"
a=0;//     .end local v3    # "e":Ljava/sql/SQLException;
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v2}, Lcom/j256/ormlite/dao/BaseDaoImpl$DaoConfigArray;->clear()V
a=0;// 
a=0;//     throw v8
a=0;// 
a=0;//     .line 209
a=0;//     .restart local v0    # "arr$":[Lcom/j256/ormlite/field/FieldType;
a=0;//     .restart local v1    # "dao":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<**>;"
a=0;//     .restart local v6    # "i$":I
a=0;//     .restart local v7    # "len$":I
a=0;//     :cond_5
a=0;//     #v0=(Reference,[Lcom/j256/ormlite/field/FieldType;);v1=(Reference,Lcom/j256/ormlite/dao/BaseDaoImpl;);v3=(Uninit);v6=(Integer);v7=(Integer);
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     :try_start_3
a=0;//     #v8=(One);
a=0;//     iput-boolean v8, v1, Lcom/j256/ormlite/dao/BaseDaoImpl;->initialized:Z
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     .line 185
a=0;//     add-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 213
a=0;//     .end local v0    # "arr$":[Lcom/j256/ormlite/field/FieldType;
a=0;//     .end local v1    # "dao":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<**>;"
a=0;//     .end local v6    # "i$":I
a=0;//     .end local v7    # "len$":I
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);v1=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Integer);
a=0;//     invoke-virtual {v2}, Lcom/j256/ormlite/dao/BaseDaoImpl$DaoConfigArray;->clear()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isAutoCommit()Z
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 828
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v1}, Lcom/j256/ormlite/support/ConnectionSource;->getReadWriteConnection()Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 830
a=0;//     .local v0, "connection":Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Lcom/j256/ormlite/support/DatabaseConnection;);
a=0;//     invoke-virtual {p0, v0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->isAutoCommit(Lcom/j256/ormlite/support/DatabaseConnection;)Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 832
a=0;//     #v1=(Boolean);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v2, v0}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     return v1
a=0;// 
a=0;//     :catchall_0
a=0;//     #v1=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);v2=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v2, v0}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public isAutoCommit(Lcom/j256/ormlite/support/DatabaseConnection;)Z
a=0;//     .locals 1
a=0;//     .param p1, "connection"    # Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 837
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     invoke-interface {p1}, Lcom/j256/ormlite/support/DatabaseConnection;->isAutoCommit()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isTableExists()Z
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 676
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->checkForInitialized()V
a=0;// 
a=0;//     .line 677
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v1}, Lcom/j256/ormlite/support/ConnectionSource;->getReadOnlyConnection()Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 679
a=0;//     .local v0, "connection":Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Lcom/j256/ormlite/support/DatabaseConnection;);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/j256/ormlite/table/TableInfo;->getTableName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v0, v1}, Lcom/j256/ormlite/support/DatabaseConnection;->isTableExists(Ljava/lang/String;)Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 681
a=0;//     #v1=(Boolean);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v2, v0}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     return v1
a=0;// 
a=0;//     :catchall_0
a=0;//     #v1=(Reference,Ujava/lang/Object;);v2=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v2, v0}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public isUpdatable()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 672
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     invoke-virtual {v0}, Lcom/j256/ormlite/table/TableInfo;->isUpdatable()Z
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
a=0;//     .line 473
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     invoke-virtual {p0, v0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->iterator(I)Lcom/j256/ormlite/dao/CloseableIterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/CloseableIterator;);
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
a=0;//     .line 481
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->checkForInitialized()V
a=0;// 
a=0;//     .line 482
a=0;//     invoke-direct {p0, p1}, Lcom/j256/ormlite/dao/BaseDaoImpl;->createIterator(I)Lcom/j256/ormlite/dao/CloseableIterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/CloseableIterator;);
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->lastIterator:Lcom/j256/ormlite/dao/CloseableIterator;
a=0;// 
a=0;//     .line 483
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->lastIterator:Lcom/j256/ormlite/dao/CloseableIterator;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public iterator(Lcom/j256/ormlite/stmt/PreparedQuery;)Lcom/j256/ormlite/dao/CloseableIterator;
a=0;//     .locals 1
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
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 526
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     .local p1, "preparedQuery":Lcom/j256/ormlite/stmt/PreparedQuery;, "Lcom/j256/ormlite/stmt/PreparedQuery<TT;>;"
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     invoke-virtual {p0, p1, v0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->iterator(Lcom/j256/ormlite/stmt/PreparedQuery;I)Lcom/j256/ormlite/dao/CloseableIterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/CloseableIterator;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public iterator(Lcom/j256/ormlite/stmt/PreparedQuery;I)Lcom/j256/ormlite/dao/CloseableIterator;
a=0;//     .locals 1
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
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 530
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     .local p1, "preparedQuery":Lcom/j256/ormlite/stmt/PreparedQuery;, "Lcom/j256/ormlite/stmt/PreparedQuery<TT;>;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->checkForInitialized()V
a=0;// 
a=0;//     .line 531
a=0;//     invoke-direct {p0, p1, p2}, Lcom/j256/ormlite/dao/BaseDaoImpl;->createIterator(Lcom/j256/ormlite/stmt/PreparedQuery;I)Lcom/j256/ormlite/dao/CloseableIterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/CloseableIterator;);
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->lastIterator:Lcom/j256/ormlite/dao/CloseableIterator;
a=0;// 
a=0;//     .line 532
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->lastIterator:Lcom/j256/ormlite/dao/CloseableIterator;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic iterator()Ljava/util/Iterator;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->iterator()Lcom/j256/ormlite/dao/CloseableIterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/CloseableIterator;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public mapSelectStarRow(Lcom/j256/ormlite/support/DatabaseResults;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p1, "results"    # Lcom/j256/ormlite/support/DatabaseResults;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/support/DatabaseResults;",
a=0;//             ")TT;"
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
a=0;//     .line 783
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->statementExecutor:Lcom/j256/ormlite/stmt/StatementExecutor;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/StatementExecutor;);
a=0;//     invoke-virtual {v0}, Lcom/j256/ormlite/stmt/StatementExecutor;->getSelectStarRowMapper()Lcom/j256/ormlite/stmt/GenericRowMapper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0, p1}, Lcom/j256/ormlite/stmt/GenericRowMapper;->mapRow(Lcom/j256/ormlite/support/DatabaseResults;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
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
a=0;//     .line 629
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     .local p1, "data":Ljava/lang/Object;, "TT;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->checkForInitialized()V
a=0;// 
a=0;//     .line 630
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     invoke-virtual {v0, p1}, Lcom/j256/ormlite/table/TableInfo;->objectToString(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public objectsEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
a=0;//     .locals 7
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TT;TT;)Z"
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
a=0;//     .line 634
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     .local p1, "data1":Ljava/lang/Object;, "TT;"
a=0;//     .local p2, "data2":Ljava/lang/Object;, "TT;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->checkForInitialized()V
a=0;// 
a=0;//     .line 635
a=0;//     iget-object v6, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     #v6=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     invoke-virtual {v6}, Lcom/j256/ormlite/table/TableInfo;->getFieldTypes()[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .local v0, "arr$":[Lcom/j256/ormlite/field/FieldType;
a=0;//     #v0=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     array-length v5, v0
a=0;// 
a=0;//     .local v5, "len$":I
a=0;//     #v5=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .local v4, "i$":I
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Integer);v6=(Conflicted);
a=0;//     if-ge v4, v5, :cond_1
a=0;// 
a=0;//     aget-object v3, v0, v4
a=0;// 
a=0;//     .line 636
a=0;//     .local v3, "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v3, p1}, Lcom/j256/ormlite/field/FieldType;->extractJavaFieldValue(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 637
a=0;//     .local v1, "fieldObj1":Ljava/lang/Object;
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v3, p2}, Lcom/j256/ormlite/field/FieldType;->extractJavaFieldValue(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 639
a=0;//     .local v2, "fieldObj2":Ljava/lang/Object;
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v3}, Lcom/j256/ormlite/field/FieldType;->getDataPersister()Lcom/j256/ormlite/field/DataPersister;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Lcom/j256/ormlite/field/DataPersister;);
a=0;//     invoke-interface {v6, v1, v2}, Lcom/j256/ormlite/field/DataPersister;->dataIsEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_0
a=0;// 
a=0;//     .line 640
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 643
a=0;//     .end local v1    # "fieldObj1":Ljava/lang/Object;
a=0;//     .end local v2    # "fieldObj2":Ljava/lang/Object;
a=0;//     .end local v3    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v6
a=0;// 
a=0;//     .line 635
a=0;//     .restart local v1    # "fieldObj1":Ljava/lang/Object;
a=0;//     .restart local v2    # "fieldObj2":Ljava/lang/Object;
a=0;//     .restart local v3    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     :cond_0
a=0;//     #v1=(Reference,Ljava/lang/Object;);v2=(Reference,Ljava/lang/Object;);v3=(Null);
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 643
a=0;//     .end local v1    # "fieldObj1":Ljava/lang/Object;
a=0;//     .end local v2    # "fieldObj2":Ljava/lang/Object;
a=0;//     .end local v3    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v6=(Conflicted);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     goto :goto_1
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
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 262
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     .local p1, "preparedQuery":Lcom/j256/ormlite/stmt/PreparedQuery;, "Lcom/j256/ormlite/stmt/PreparedQuery<TT;>;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->checkForInitialized()V
a=0;// 
a=0;//     .line 263
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->statementExecutor:Lcom/j256/ormlite/stmt/StatementExecutor;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/StatementExecutor;);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->objectCache:Lcom/j256/ormlite/dao/ObjectCache;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/dao/ObjectCache;);
a=0;//     invoke-virtual {v0, v1, p1, v2}, Lcom/j256/ormlite/stmt/StatementExecutor;->query(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/stmt/PreparedStmt;Lcom/j256/ormlite/dao/ObjectCache;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public queryBuilder()Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Lcom/j256/ormlite/stmt/QueryBuilder",
a=0;//             "<TT;TID;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 247
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->checkForInitialized()V
a=0;// 
a=0;//     .line 248
a=0;//     new-instance v0, Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/stmt/QueryBuilder;);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/db/DatabaseType;);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     invoke-direct {v0, v1, v2, p0}, Lcom/j256/ormlite/stmt/QueryBuilder;-><init>(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/table/TableInfo;Lcom/j256/ormlite/dao/Dao;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/QueryBuilder;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public queryForAll()Ljava/util/List;
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/List",
a=0;//             "<TT;>;"
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
a=0;//     .line 238
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->checkForInitialized()V
a=0;// 
a=0;//     .line 239
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->statementExecutor:Lcom/j256/ormlite/stmt/StatementExecutor;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/StatementExecutor;);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->objectCache:Lcom/j256/ormlite/dao/ObjectCache;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/dao/ObjectCache;);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/j256/ormlite/stmt/StatementExecutor;->queryForAll(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/dao/ObjectCache;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public queryForEq(Ljava/lang/String;Ljava/lang/Object;)Ljava/util/List;
a=0;//     .locals 1
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
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 243
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->queryBuilder()Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/QueryBuilder;);
a=0;//     invoke-virtual {v0}, Lcom/j256/ormlite/stmt/QueryBuilder;->where()Lcom/j256/ormlite/stmt/Where;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2}, Lcom/j256/ormlite/stmt/Where;->eq(Ljava/lang/String;Ljava/lang/Object;)Lcom/j256/ormlite/stmt/Where;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/j256/ormlite/stmt/Where;->query()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public queryForFieldValues(Ljava/util/Map;)Ljava/util/List;
a=0;//     .locals 1
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
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 275
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     .local p1, "fieldValues":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->queryForFieldValues(Ljava/util/Map;Z)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public queryForFieldValuesArgs(Ljava/util/Map;)Ljava/util/List;
a=0;//     .locals 1
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
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 279
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     .local p1, "fieldValues":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->queryForFieldValues(Ljava/util/Map;Z)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     return-object v0
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
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 228
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     .local p1, "preparedQuery":Lcom/j256/ormlite/stmt/PreparedQuery;, "Lcom/j256/ormlite/stmt/PreparedQuery<TT;>;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->checkForInitialized()V
a=0;// 
a=0;//     .line 229
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v1}, Lcom/j256/ormlite/support/ConnectionSource;->getReadOnlyConnection()Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 231
a=0;//     .local v0, "connection":Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Lcom/j256/ormlite/support/DatabaseConnection;);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->statementExecutor:Lcom/j256/ormlite/stmt/StatementExecutor;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->objectCache:Lcom/j256/ormlite/dao/ObjectCache;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/dao/ObjectCache;);
a=0;//     invoke-virtual {v1, v0, p1, v2}, Lcom/j256/ormlite/stmt/StatementExecutor;->queryForFirst(Lcom/j256/ormlite/support/DatabaseConnection;Lcom/j256/ormlite/stmt/PreparedStmt;Lcom/j256/ormlite/dao/ObjectCache;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 233
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     invoke-interface {v2, v0}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     return-object v1
a=0;// 
a=0;//     :catchall_0
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v2, v0}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
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
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 218
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     .local p1, "id":Ljava/lang/Object;, "TID;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->checkForInitialized()V
a=0;// 
a=0;//     .line 219
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v1}, Lcom/j256/ormlite/support/ConnectionSource;->getReadOnlyConnection()Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 221
a=0;//     .local v0, "connection":Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Lcom/j256/ormlite/support/DatabaseConnection;);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->statementExecutor:Lcom/j256/ormlite/stmt/StatementExecutor;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->objectCache:Lcom/j256/ormlite/dao/ObjectCache;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/dao/ObjectCache;);
a=0;//     invoke-virtual {v1, v0, p1, v2}, Lcom/j256/ormlite/stmt/StatementExecutor;->queryForId(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/lang/Object;Lcom/j256/ormlite/dao/ObjectCache;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 223
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     invoke-interface {v2, v0}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     return-object v1
a=0;// 
a=0;//     :catchall_0
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v2, v0}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public queryForMatching(Ljava/lang/Object;)Ljava/util/List;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TT;)",
a=0;//             "Ljava/util/List",
a=0;//             "<TT;>;"
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
a=0;//     .line 267
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     .local p1, "matchObj":Ljava/lang/Object;, "TT;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->queryForMatching(Ljava/lang/Object;Z)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public queryForMatchingArgs(Ljava/lang/Object;)Ljava/util/List;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TT;)",
a=0;//             "Ljava/util/List",
a=0;//             "<TT;>;"
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
a=0;//     .line 271
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     .local p1, "matchObj":Ljava/lang/Object;, "TT;"
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->queryForMatching(Ljava/lang/Object;Z)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public queryForSameId(Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TT;)TT;"
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
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     .local p1, "data":Ljava/lang/Object;, "TT;"
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 283
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->checkForInitialized()V
a=0;// 
a=0;//     .line 284
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 291
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/Object;);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 287
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Null);
a=0;//     invoke-virtual {p0, p1}, Lcom/j256/ormlite/dao/BaseDaoImpl;->extractId(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 288
a=0;//     .local v0, "id":Ljava/lang/Object;, "TID;"
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 291
a=0;//     invoke-virtual {p0, v0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->queryForId(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public varargs queryRaw(Ljava/lang/String;Lcom/j256/ormlite/dao/RawRowMapper;[Ljava/lang/String;)Lcom/j256/ormlite/dao/GenericRawResults;
a=0;//     .locals 7
a=0;//     .param p1, "query"    # Ljava/lang/String;
a=0;//     .param p3, "arguments"    # [Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<GR:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lcom/j256/ormlite/dao/RawRowMapper",
a=0;//             "<TGR;>;[",
a=0;//             "Ljava/lang/String;",
a=0;//             ")",
a=0;//             "Lcom/j256/ormlite/dao/GenericRawResults",
a=0;//             "<TGR;>;"
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
a=0;//     .line 546
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     .local p2, "mapper":Lcom/j256/ormlite/dao/RawRowMapper;, "Lcom/j256/ormlite/dao/RawRowMapper<TGR;>;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->checkForInitialized()V
a=0;// 
a=0;//     .line 548
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->statementExecutor:Lcom/j256/ormlite/stmt/StatementExecutor;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/StatementExecutor;);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     iget-object v5, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->objectCache:Lcom/j256/ormlite/dao/ObjectCache;
a=0;// 
a=0;//     #v5=(Reference,Lcom/j256/ormlite/dao/ObjectCache;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Lcom/j256/ormlite/dao/RawRowMapper;);
a=0;//     move-object v4, p3
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/String;);
a=0;//     invoke-virtual/range {v0 .. v5}, Lcom/j256/ormlite/stmt/StatementExecutor;->queryRaw(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/String;Lcom/j256/ormlite/dao/RawRowMapper;[Ljava/lang/String;Lcom/j256/ormlite/dao/ObjectCache;)Lcom/j256/ormlite/dao/GenericRawResults;
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 549
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v6
a=0;// 
a=0;//     .line 550
a=0;//     .local v6, "e":Ljava/sql/SQLException;
a=0;//     #v6=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "Could not perform raw query for "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0, v6}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public varargs queryRaw(Ljava/lang/String;[Lcom/j256/ormlite/field/DataType;[Ljava/lang/String;)Lcom/j256/ormlite/dao/GenericRawResults;
a=0;//     .locals 7
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
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 556
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->checkForInitialized()V
a=0;// 
a=0;//     .line 558
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->statementExecutor:Lcom/j256/ormlite/stmt/StatementExecutor;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/StatementExecutor;);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     iget-object v5, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->objectCache:Lcom/j256/ormlite/dao/ObjectCache;
a=0;// 
a=0;//     #v5=(Reference,Lcom/j256/ormlite/dao/ObjectCache;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,[Lcom/j256/ormlite/field/DataType;);
a=0;//     move-object v4, p3
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/String;);
a=0;//     invoke-virtual/range {v0 .. v5}, Lcom/j256/ormlite/stmt/StatementExecutor;->queryRaw(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/String;[Lcom/j256/ormlite/field/DataType;[Ljava/lang/String;Lcom/j256/ormlite/dao/ObjectCache;)Lcom/j256/ormlite/dao/GenericRawResults;
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 559
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v6
a=0;// 
a=0;//     .line 560
a=0;//     .local v6, "e":Ljava/sql/SQLException;
a=0;//     #v6=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "Could not perform raw query for "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0, v6}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public varargs queryRaw(Ljava/lang/String;[Ljava/lang/String;)Lcom/j256/ormlite/dao/GenericRawResults;
a=0;//     .locals 4
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
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 536
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->checkForInitialized()V
a=0;// 
a=0;//     .line 538
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->statementExecutor:Lcom/j256/ormlite/stmt/StatementExecutor;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/stmt/StatementExecutor;);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->objectCache:Lcom/j256/ormlite/dao/ObjectCache;
a=0;// 
a=0;//     #v3=(Reference,Lcom/j256/ormlite/dao/ObjectCache;);
a=0;//     invoke-virtual {v1, v2, p1, p2, v3}, Lcom/j256/ormlite/stmt/StatementExecutor;->queryRaw(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/String;[Ljava/lang/String;Lcom/j256/ormlite/dao/ObjectCache;)Lcom/j256/ormlite/dao/GenericRawResults;
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// 
a=0;//     .line 539
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 540
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Could not perform raw query for "
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
a=0;//     invoke-static {v1, v0}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public varargs queryRawValue(Ljava/lang/String;[Ljava/lang/String;)J
a=0;//     .locals 5
a=0;//     .param p1, "query"    # Ljava/lang/String;
a=0;//     .param p2, "arguments"    # [Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 565
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->checkForInitialized()V
a=0;// 
a=0;//     .line 566
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v2}, Lcom/j256/ormlite/support/ConnectionSource;->getReadOnlyConnection()Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 568
a=0;//     .local v0, "connection":Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Lcom/j256/ormlite/support/DatabaseConnection;);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->statementExecutor:Lcom/j256/ormlite/stmt/StatementExecutor;
a=0;// 
a=0;//     invoke-virtual {v2, v0, p1, p2}, Lcom/j256/ormlite/stmt/StatementExecutor;->queryForLong(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/lang/String;[Ljava/lang/String;)J
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     .line 572
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iget-object v4, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v4=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v4, v0}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     return-wide v2
a=0;// 
a=0;//     .line 569
a=0;//     :catch_0
a=0;//     #v2=(Reference,Ujava/lang/Object;);v3=(Uninit);v4=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 570
a=0;//     .local v1, "e":Ljava/sql/SQLException;
a=0;//     :try_start_1
a=0;//     #v1=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Could not perform raw value query for "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2, v1}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     throw v2
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 572
a=0;//     .end local v1    # "e":Ljava/sql/SQLException;
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v3=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v3, v0}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     throw v2
a=0;// .end method
a=0;// 
a=0;// .method public refresh(Ljava/lang/Object;)I
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TT;)I"
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
a=0;//     .line 383
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     .local p1, "data":Ljava/lang/Object;, "TT;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->checkForInitialized()V
a=0;// 
a=0;//     .line 385
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 386
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 397
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Integer);v3=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 388
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     instance-of v2, p1, Lcom/j256/ormlite/misc/BaseDaoEnabled;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     move-object v1, p1
a=0;// 
a=0;//     .line 390
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/j256/ormlite/misc/BaseDaoEnabled;
a=0;// 
a=0;//     .line 391
a=0;//     .local v1, "daoEnabled":Lcom/j256/ormlite/misc/BaseDaoEnabled;, "Lcom/j256/ormlite/misc/BaseDaoEnabled<TT;TID;>;"
a=0;//     invoke-virtual {v1, p0}, Lcom/j256/ormlite/misc/BaseDaoEnabled;->setDao(Lcom/j256/ormlite/dao/Dao;)V
a=0;// 
a=0;//     .line 393
a=0;//     .end local v1    # "daoEnabled":Lcom/j256/ormlite/misc/BaseDaoEnabled;, "Lcom/j256/ormlite/misc/BaseDaoEnabled<TT;TID;>;"
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v2}, Lcom/j256/ormlite/support/ConnectionSource;->getReadOnlyConnection()Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 395
a=0;//     .local v0, "connection":Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Lcom/j256/ormlite/support/DatabaseConnection;);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->statementExecutor:Lcom/j256/ormlite/stmt/StatementExecutor;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->objectCache:Lcom/j256/ormlite/dao/ObjectCache;
a=0;// 
a=0;//     #v3=(Reference,Lcom/j256/ormlite/dao/ObjectCache;);
a=0;//     invoke-virtual {v2, v0, p1, v3}, Lcom/j256/ormlite/stmt/StatementExecutor;->refresh(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/lang/Object;Lcom/j256/ormlite/dao/ObjectCache;)I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 397
a=0;//     #v2=(Integer);
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     invoke-interface {v3, v0}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v2=(Reference,Ujava/lang/Object;);v3=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v3=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v3, v0}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     throw v2
a=0;// .end method
a=0;// 
a=0;// .method public rollBack(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;//     .locals 1
a=0;//     .param p1, "connection"    # Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 845
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-interface {p1, v0}, Lcom/j256/ormlite/support/DatabaseConnection;->rollback(Ljava/sql/Savepoint;)V
a=0;// 
a=0;//     .line 846
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setAutoCommit(Lcom/j256/ormlite/support/DatabaseConnection;Z)V
a=0;//     .locals 0
a=0;//     .param p1, "connection"    # Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     .param p2, "autoCommit"    # Z
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 824
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     invoke-interface {p1, p2}, Lcom/j256/ormlite/support/DatabaseConnection;->setAutoCommit(Z)V
a=0;// 
a=0;//     .line 825
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setAutoCommit(Z)V
a=0;//     .locals 3
a=0;//     .param p1, "autoCommit"    # Z
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 815
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v1}, Lcom/j256/ormlite/support/ConnectionSource;->getReadWriteConnection()Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 817
a=0;//     .local v0, "connection":Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Lcom/j256/ormlite/support/DatabaseConnection;);
a=0;//     invoke-virtual {p0, v0, p1}, Lcom/j256/ormlite/dao/BaseDaoImpl;->setAutoCommit(Lcom/j256/ormlite/support/DatabaseConnection;Z)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 819
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     invoke-interface {v1, v0}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     .line 821
a=0;//     return-void
a=0;// 
a=0;//     .line 819
a=0;//     :catchall_0
a=0;//     move-exception v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v2, v0}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public setConnectionSource(Lcom/j256/ormlite/support/ConnectionSource;)V
a=0;//     .locals 0
a=0;//     .param p1, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     .prologue
a=0;//     .line 876
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     iput-object p1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     .line 877
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setObjectCache(Lcom/j256/ormlite/dao/ObjectCache;)V
a=0;//     .locals 3
a=0;//     .param p1, "objectCache"    # Lcom/j256/ormlite/dao/ObjectCache;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 743
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 744
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->objectCache:Lcom/j256/ormlite/dao/ObjectCache;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/ObjectCache;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 746
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->objectCache:Lcom/j256/ormlite/dao/ObjectCache;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->dataClass:Ljava/lang/Class;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-interface {v0, v1}, Lcom/j256/ormlite/dao/ObjectCache;->clear(Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 747
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->objectCache:Lcom/j256/ormlite/dao/ObjectCache;
a=0;// 
a=0;//     .line 760
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/ObjectCache;);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 750
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->objectCache:Lcom/j256/ormlite/dao/ObjectCache;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/ObjectCache;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->objectCache:Lcom/j256/ormlite/dao/ObjectCache;
a=0;// 
a=0;//     if-eq v0, p1, :cond_2
a=0;// 
a=0;//     .line 752
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->objectCache:Lcom/j256/ormlite/dao/ObjectCache;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->dataClass:Ljava/lang/Class;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-interface {v0, v1}, Lcom/j256/ormlite/dao/ObjectCache;->clear(Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 754
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/j256/ormlite/table/TableInfo;->getIdField()Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     .line 755
a=0;//     new-instance v0, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Class "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->dataClass:Ljava/lang/Class;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " must have an id field to enable the object cache"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 757
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v2=(Uninit);
a=0;//     iput-object p1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->objectCache:Lcom/j256/ormlite/dao/ObjectCache;
a=0;// 
a=0;//     .line 758
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->objectCache:Lcom/j256/ormlite/dao/ObjectCache;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->dataClass:Ljava/lang/Class;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-interface {v0, v1}, Lcom/j256/ormlite/dao/ObjectCache;->registerClass(Ljava/lang/Class;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setObjectCache(Z)V
a=0;//     .locals 3
a=0;//     .param p1, "enabled"    # Z
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 720
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     if-eqz p1, :cond_3
a=0;// 
a=0;//     .line 721
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->objectCache:Lcom/j256/ormlite/dao/ObjectCache;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/ObjectCache;);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 722
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/j256/ormlite/table/TableInfo;->getIdField()Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 723
a=0;//     new-instance v0, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Class "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->dataClass:Ljava/lang/Class;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " must have an id field to enable the object cache"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 725
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 726
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/j256/ormlite/dao/BaseDaoImpl;->defaultObjectCache:Lcom/j256/ormlite/dao/ReferenceObjectCache;
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 728
a=0;//     invoke-static {}, Lcom/j256/ormlite/dao/ReferenceObjectCache;->makeWeakCache()Lcom/j256/ormlite/dao/ReferenceObjectCache;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/j256/ormlite/dao/BaseDaoImpl;->defaultObjectCache:Lcom/j256/ormlite/dao/ReferenceObjectCache;
a=0;// 
a=0;//     .line 730
a=0;//     :cond_1
a=0;//     sget-object v0, Lcom/j256/ormlite/dao/BaseDaoImpl;->defaultObjectCache:Lcom/j256/ormlite/dao/ReferenceObjectCache;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->objectCache:Lcom/j256/ormlite/dao/ObjectCache;
a=0;// 
a=0;//     .line 731
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 732
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->objectCache:Lcom/j256/ormlite/dao/ObjectCache;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->dataClass:Ljava/lang/Class;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Lcom/j256/ormlite/dao/ObjectCache;->registerClass(Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 740
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 731
a=0;//     :catchall_0
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_1
a=0;//     monitor-exit v1
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 735
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->objectCache:Lcom/j256/ormlite/dao/ObjectCache;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/ObjectCache;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 736
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->objectCache:Lcom/j256/ormlite/dao/ObjectCache;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->dataClass:Ljava/lang/Class;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-interface {v0, v1}, Lcom/j256/ormlite/dao/ObjectCache;->clear(Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 737
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->objectCache:Lcom/j256/ormlite/dao/ObjectCache;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setObjectFactory(Lcom/j256/ormlite/table/ObjectFactory;)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/table/ObjectFactory",
a=0;//             "<TT;>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 853
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     .local p1, "objectFactory":Lcom/j256/ormlite/table/ObjectFactory;, "Lcom/j256/ormlite/table/ObjectFactory<TT;>;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->checkForInitialized()V
a=0;// 
a=0;//     .line 854
a=0;//     iput-object p1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->objectFactory:Lcom/j256/ormlite/table/ObjectFactory;
a=0;// 
a=0;//     .line 855
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTableConfig(Lcom/j256/ormlite/table/DatabaseTableConfig;)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/table/DatabaseTableConfig",
a=0;//             "<TT;>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 884
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     .local p1, "tableConfig":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<TT;>;"
a=0;//     iput-object p1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->tableConfig:Lcom/j256/ormlite/table/DatabaseTableConfig;
a=0;// 
a=0;//     .line 885
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public startThreadConnection()Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 804
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v1}, Lcom/j256/ormlite/support/ConnectionSource;->getReadWriteConnection()Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 805
a=0;//     .local v0, "connection":Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     #v0=(Reference,Lcom/j256/ormlite/support/DatabaseConnection;);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     invoke-interface {v1, v0}, Lcom/j256/ormlite/support/ConnectionSource;->saveSpecialConnection(Lcom/j256/ormlite/support/DatabaseConnection;)Z
a=0;// 
a=0;//     .line 806
a=0;//     return-object v0
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
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 373
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     .local p1, "preparedUpdate":Lcom/j256/ormlite/stmt/PreparedUpdate;, "Lcom/j256/ormlite/stmt/PreparedUpdate<TT;>;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->checkForInitialized()V
a=0;// 
a=0;//     .line 374
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v1}, Lcom/j256/ormlite/support/ConnectionSource;->getReadWriteConnection()Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 376
a=0;//     .local v0, "connection":Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Lcom/j256/ormlite/support/DatabaseConnection;);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->statementExecutor:Lcom/j256/ormlite/stmt/StatementExecutor;
a=0;// 
a=0;//     invoke-virtual {v1, v0, p1}, Lcom/j256/ormlite/stmt/StatementExecutor;->update(Lcom/j256/ormlite/support/DatabaseConnection;Lcom/j256/ormlite/stmt/PreparedUpdate;)I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 378
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v2, v0}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     return v1
a=0;// 
a=0;//     :catchall_0
a=0;//     #v1=(Reference,Ujava/lang/Object;);v2=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v2, v0}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
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
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 343
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     .local p1, "data":Ljava/lang/Object;, "TT;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->checkForInitialized()V
a=0;// 
a=0;//     .line 345
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 346
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 352
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 348
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v1}, Lcom/j256/ormlite/support/ConnectionSource;->getReadWriteConnection()Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 350
a=0;//     .local v0, "connection":Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Lcom/j256/ormlite/support/DatabaseConnection;);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->statementExecutor:Lcom/j256/ormlite/stmt/StatementExecutor;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->objectCache:Lcom/j256/ormlite/dao/ObjectCache;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/dao/ObjectCache;);
a=0;//     invoke-virtual {v1, v0, p1, v2}, Lcom/j256/ormlite/stmt/StatementExecutor;->update(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/lang/Object;Lcom/j256/ormlite/dao/ObjectCache;)I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 352
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     invoke-interface {v2, v0}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v1=(Reference,Ujava/lang/Object;);v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v2, v0}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public updateBuilder()Lcom/j256/ormlite/stmt/UpdateBuilder;
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Lcom/j256/ormlite/stmt/UpdateBuilder",
a=0;//             "<TT;TID;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 252
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->checkForInitialized()V
a=0;// 
a=0;//     .line 253
a=0;//     new-instance v0, Lcom/j256/ormlite/stmt/UpdateBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/stmt/UpdateBuilder;);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/db/DatabaseType;);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     invoke-direct {v0, v1, v2, p0}, Lcom/j256/ormlite/stmt/UpdateBuilder;-><init>(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/table/TableInfo;Lcom/j256/ormlite/dao/Dao;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/UpdateBuilder;);
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
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 358
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     .local p1, "data":Ljava/lang/Object;, "TT;"
a=0;//     .local p2, "newId":Ljava/lang/Object;, "TID;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->checkForInitialized()V
a=0;// 
a=0;//     .line 360
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 361
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 367
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 363
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v1}, Lcom/j256/ormlite/support/ConnectionSource;->getReadWriteConnection()Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 365
a=0;//     .local v0, "connection":Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Lcom/j256/ormlite/support/DatabaseConnection;);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->statementExecutor:Lcom/j256/ormlite/stmt/StatementExecutor;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->objectCache:Lcom/j256/ormlite/dao/ObjectCache;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/dao/ObjectCache;);
a=0;//     invoke-virtual {v1, v0, p1, p2, v2}, Lcom/j256/ormlite/stmt/StatementExecutor;->updateId(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/lang/Object;Ljava/lang/Object;Lcom/j256/ormlite/dao/ObjectCache;)I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 367
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     invoke-interface {v2, v0}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v1=(Reference,Ujava/lang/Object;);v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v2, v0}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public varargs updateRaw(Ljava/lang/String;[Ljava/lang/String;)I
a=0;//     .locals 4
a=0;//     .param p1, "statement"    # Ljava/lang/String;
a=0;//     .param p2, "arguments"    # [Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 601
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->checkForInitialized()V
a=0;// 
a=0;//     .line 602
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v2}, Lcom/j256/ormlite/support/ConnectionSource;->getReadWriteConnection()Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 604
a=0;//     .local v0, "connection":Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Lcom/j256/ormlite/support/DatabaseConnection;);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->statementExecutor:Lcom/j256/ormlite/stmt/StatementExecutor;
a=0;// 
a=0;//     invoke-virtual {v2, v0, p1, p2}, Lcom/j256/ormlite/stmt/StatementExecutor;->updateRaw(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/lang/String;[Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 608
a=0;//     #v2=(Integer);
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v3=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v3, v0}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     return v2
a=0;// 
a=0;//     .line 605
a=0;//     :catch_0
a=0;//     #v2=(Reference,Ujava/lang/Object;);v3=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 606
a=0;//     .local v1, "e":Ljava/sql/SQLException;
a=0;//     :try_start_1
a=0;//     #v1=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Could not run raw update statement "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2, v1}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     throw v2
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 608
a=0;//     .end local v1    # "e":Ljava/sql/SQLException;
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/dao/BaseDaoImpl;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v3=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v3, v0}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     throw v2
a=0;// .end method
}}
