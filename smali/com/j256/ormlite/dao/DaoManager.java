package com.j256.ormlite.dao; class DaoManager { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/dao/DaoManager;
a=0;// .super Ljava/lang/Object;
a=0;// .source "DaoManager.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/j256/ormlite/dao/DaoManager$TableConfigConnectionSource;,
a=0;//         Lcom/j256/ormlite/dao/DaoManager$ClassConnectionSource;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static classMap:Ljava/util/Map;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Lcom/j256/ormlite/dao/DaoManager$ClassConnectionSource;",
a=0;//             "Lcom/j256/ormlite/dao/Dao",
a=0;//             "<**>;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private static configMap:Ljava/util/Map;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;",
a=0;//             "Lcom/j256/ormlite/table/DatabaseTableConfig",
a=0;//             "<*>;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private static logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;// .field private static tableConfigMap:Ljava/util/Map;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Lcom/j256/ormlite/dao/DaoManager$TableConfigConnectionSource;",
a=0;//             "Lcom/j256/ormlite/dao/Dao",
a=0;//             "<**>;>;"
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
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 31
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/j256/ormlite/dao/DaoManager;->configMap:Ljava/util/Map;
a=0;// 
a=0;//     .line 32
a=0;//     sput-object v0, Lcom/j256/ormlite/dao/DaoManager;->classMap:Ljava/util/Map;
a=0;// 
a=0;//     .line 33
a=0;//     sput-object v0, Lcom/j256/ormlite/dao/DaoManager;->tableConfigMap:Ljava/util/Map;
a=0;// 
a=0;//     .line 35
a=0;//     const-class v0, Lcom/j256/ormlite/dao/DaoManager;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {v0}, Lcom/j256/ormlite/logger/LoggerFactory;->getLogger(Ljava/lang/Class;)Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/j256/ormlite/dao/DaoManager;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 426
a=0;//     #p0=(Reference,Lcom/j256/ormlite/dao/DaoManager;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized addCachedDatabaseConfigs(Ljava/util/Collection;)V
a=0;//     .locals 7
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/Collection",
a=0;//             "<",
a=0;//             "Lcom/j256/ormlite/table/DatabaseTableConfig",
a=0;//             "<*>;>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 234
a=0;//     .local p0, "configs":Ljava/util/Collection;, "Ljava/util/Collection<Lcom/j256/ormlite/table/DatabaseTableConfig<*>;>;"
a=0;//     const-class v4, Lcom/j256/ormlite/dao/DaoManager;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v4
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v3, Lcom/j256/ormlite/dao/DaoManager;->configMap:Ljava/util/Map;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/Map;);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 235
a=0;//     new-instance v2, Ljava/util/HashMap;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v2}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 239
a=0;//     .local v2, "newMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Class<*>;Lcom/j256/ormlite/table/DatabaseTableConfig<*>;>;"
a=0;//     :goto_0
a=0;//     #v2=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .local v1, "i$":Ljava/util/Iterator;
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/util/Iterator;);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/j256/ormlite/table/DatabaseTableConfig;
a=0;// 
a=0;//     .line 240
a=0;//     .local v0, "config":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<*>;"
a=0;//     invoke-virtual {v0}, Lcom/j256/ormlite/table/DatabaseTableConfig;->getDataClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 241
a=0;//     sget-object v3, Lcom/j256/ormlite/dao/DaoManager;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     const-string v5, "Loaded configuration for {}"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Lcom/j256/ormlite/table/DatabaseTableConfig;->getDataClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v3, v5, v6}, Lcom/j256/ormlite/logger/Logger;->info(Ljava/lang/String;Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 234
a=0;//     .end local v0    # "config":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<*>;"
a=0;//     .end local v1    # "i$":Ljava/util/Iterator;
a=0;//     .end local v2    # "newMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Class<*>;Lcom/j256/ormlite/table/DatabaseTableConfig<*>;>;"
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v4
a=0;// 
a=0;//     throw v3
a=0;// 
a=0;//     .line 237
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     new-instance v2, Ljava/util/HashMap;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/HashMap;);
a=0;//     sget-object v3, Lcom/j256/ormlite/dao/DaoManager;->configMap:Ljava/util/Map;
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V
a=0;// 
a=0;//     .restart local v2    # "newMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Class<*>;Lcom/j256/ormlite/table/DatabaseTableConfig<*>;>;"
a=0;//     #v2=(Reference,Ljava/util/HashMap;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 243
a=0;//     .restart local v1    # "i$":Ljava/util/Iterator;
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/util/Iterator;);v3=(Boolean);v5=(Conflicted);v6=(Conflicted);
a=0;//     sput-object v2, Lcom/j256/ormlite/dao/DaoManager;->configMap:Ljava/util/Map;
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 244
a=0;//     monitor-exit v4
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static addDaoToClassMap(Lcom/j256/ormlite/dao/DaoManager$ClassConnectionSource;Lcom/j256/ormlite/dao/Dao;)V
a=0;//     .locals 1
a=0;//     .param p0, "key"    # Lcom/j256/ormlite/dao/DaoManager$ClassConnectionSource;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/dao/DaoManager$ClassConnectionSource;",
a=0;//             "Lcom/j256/ormlite/dao/Dao",
a=0;//             "<**>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 247
a=0;//     .local p1, "dao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<**>;"
a=0;//     sget-object v0, Lcom/j256/ormlite/dao/DaoManager;->classMap:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 248
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     sput-object v0, Lcom/j256/ormlite/dao/DaoManager;->classMap:Ljava/util/Map;
a=0;// 
a=0;//     .line 250
a=0;//     :cond_0
a=0;//     sget-object v0, Lcom/j256/ormlite/dao/DaoManager;->classMap:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 251
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static addDaoToTableMap(Lcom/j256/ormlite/dao/DaoManager$TableConfigConnectionSource;Lcom/j256/ormlite/dao/Dao;)V
a=0;//     .locals 1
a=0;//     .param p0, "key"    # Lcom/j256/ormlite/dao/DaoManager$TableConfigConnectionSource;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/dao/DaoManager$TableConfigConnectionSource;",
a=0;//             "Lcom/j256/ormlite/dao/Dao",
a=0;//             "<**>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 260
a=0;//     .local p1, "dao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<**>;"
a=0;//     sget-object v0, Lcom/j256/ormlite/dao/DaoManager;->tableConfigMap:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 261
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     sput-object v0, Lcom/j256/ormlite/dao/DaoManager;->tableConfigMap:Ljava/util/Map;
a=0;// 
a=0;//     .line 263
a=0;//     :cond_0
a=0;//     sget-object v0, Lcom/j256/ormlite/dao/DaoManager;->tableConfigMap:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 264
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized clearCache()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 207
a=0;//     const-class v1, Lcom/j256/ormlite/dao/DaoManager;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/j256/ormlite/dao/DaoManager;->configMap:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 208
a=0;//     sget-object v0, Lcom/j256/ormlite/dao/DaoManager;->configMap:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map;->clear()V
a=0;// 
a=0;//     .line 209
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/j256/ormlite/dao/DaoManager;->configMap:Ljava/util/Map;
a=0;// 
a=0;//     .line 211
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     invoke-static {}, Lcom/j256/ormlite/dao/DaoManager;->clearDaoCache()V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 212
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 207
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
a=0;// .method public static declared-synchronized clearDaoCache()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 218
a=0;//     const-class v1, Lcom/j256/ormlite/dao/DaoManager;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/j256/ormlite/dao/DaoManager;->classMap:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 219
a=0;//     sget-object v0, Lcom/j256/ormlite/dao/DaoManager;->classMap:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map;->clear()V
a=0;// 
a=0;//     .line 220
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/j256/ormlite/dao/DaoManager;->classMap:Ljava/util/Map;
a=0;// 
a=0;//     .line 222
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     sget-object v0, Lcom/j256/ormlite/dao/DaoManager;->tableConfigMap:Ljava/util/Map;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 223
a=0;//     sget-object v0, Lcom/j256/ormlite/dao/DaoManager;->tableConfigMap:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map;->clear()V
a=0;// 
a=0;//     .line 224
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/j256/ormlite/dao/DaoManager;->tableConfigMap:Ljava/util/Map;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 226
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 218
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
a=0;// .method public static declared-synchronized createDao(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/table/DatabaseTableConfig;)Lcom/j256/ormlite/dao/Dao;
a=0;//     .locals 3
a=0;//     .param p0, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<D::",
a=0;//             "Lcom/j256/ormlite/dao/Dao",
a=0;//             "<TT;*>;T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/j256/ormlite/support/ConnectionSource;",
a=0;//             "Lcom/j256/ormlite/table/DatabaseTableConfig",
a=0;//             "<TT;>;)TD;"
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
a=0;//     .line 126
a=0;//     .local p1, "tableConfig":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<TT;>;"
a=0;//     const-class v1, Lcom/j256/ormlite/dao/DaoManager;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 127
a=0;//     :try_start_0
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v2, "connectionSource argument cannot be null"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 126
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 129
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Uninit);v2=(Uninit);
a=0;//     invoke-static {p0, p1}, Lcom/j256/ormlite/dao/DaoManager;->doCreateDao(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/table/DatabaseTableConfig;)Lcom/j256/ormlite/dao/Dao;
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized createDao(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;)Lcom/j256/ormlite/dao/Dao;
a=0;//     .locals 17
a=0;//     .param p0, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<D::",
a=0;//             "Lcom/j256/ormlite/dao/Dao",
a=0;//             "<TT;*>;T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/j256/ormlite/support/ConnectionSource;",
a=0;//             "Ljava/lang/Class",
a=0;//             "<TT;>;)TD;"
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
a=0;//     .line 43
a=0;//     .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     const-class v14, Lcom/j256/ormlite/dao/DaoManager;
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v14
a=0;// 
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 44
a=0;//     :try_start_0
a=0;//     new-instance v13, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v13=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v15, "connectionSource argument cannot be null"
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v13, v15}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v13
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 43
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v15=(Conflicted);v16=(Conflicted);
a=0;//     move-exception v13
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v14
a=0;// 
a=0;//     throw v13
a=0;// 
a=0;//     .line 46
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v15=(Uninit);v16=(Uninit);
a=0;//     new-instance v12, Lcom/j256/ormlite/dao/DaoManager$ClassConnectionSource;
a=0;// 
a=0;//     #v12=(UninitRef,Lcom/j256/ormlite/dao/DaoManager$ClassConnectionSource;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v12, v0, v1}, Lcom/j256/ormlite/dao/DaoManager$ClassConnectionSource;-><init>(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 47
a=0;//     .local v12, "key":Lcom/j256/ormlite/dao/DaoManager$ClassConnectionSource;
a=0;//     #v12=(Reference,Lcom/j256/ormlite/dao/DaoManager$ClassConnectionSource;);
a=0;//     invoke-static {v12}, Lcom/j256/ormlite/dao/DaoManager;->lookupDao(Lcom/j256/ormlite/dao/DaoManager$ClassConnectionSource;)Lcom/j256/ormlite/dao/Dao;
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 48
a=0;//     .local v5, "dao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<**>;"
a=0;//     #v5=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     .line 50
a=0;//     move-object v3, v5
a=0;// 
a=0;//     .line 102
a=0;//     .local v3, "castDao":Lcom/j256/ormlite/dao/Dao;, "TD;"
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Reference,Lcom/j256/ormlite/dao/Dao;);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v13=(Conflicted);v15=(Conflicted);
a=0;//     monitor-exit v14
a=0;// 
a=0;//     return-object v3
a=0;// 
a=0;//     .line 55
a=0;//     .end local v3    # "castDao":Lcom/j256/ormlite/dao/Dao;, "TD;"
a=0;//     :cond_1
a=0;//     :try_start_2
a=0;//     #v2=(Uninit);v3=(Uninit);v4=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v13=(Uninit);v15=(Uninit);
a=0;//     invoke-static/range {p0 .. p1}, Lcom/j256/ormlite/dao/DaoManager;->createDaoFromConfig(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .end local v5    # "dao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<**>;"
a=0;//     check-cast v5, Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     .line 56
a=0;//     .restart local v5    # "dao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<**>;"
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     .line 58
a=0;//     move-object v3, v5
a=0;// 
a=0;//     .line 59
a=0;//     .restart local v3    # "castDao":Lcom/j256/ormlite/dao/Dao;, "TD;"
a=0;//     #v3=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 62
a=0;//     .end local v3    # "castDao":Lcom/j256/ormlite/dao/Dao;, "TD;"
a=0;//     :cond_2
a=0;//     #v3=(Uninit);
a=0;//     const-class v13, Lcom/j256/ormlite/table/DatabaseTable;
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/Class;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v13}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/annotation/Annotation;);
a=0;//     check-cast v9, Lcom/j256/ormlite/table/DatabaseTable;
a=0;// 
a=0;//     .line 63
a=0;//     .local v9, "databaseTable":Lcom/j256/ormlite/table/DatabaseTable;
a=0;//     if-eqz v9, :cond_3
a=0;// 
a=0;//     invoke-interface {v9}, Lcom/j256/ormlite/table/DatabaseTable;->daoClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     const-class v15, Ljava/lang/Void;
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/Class;);
a=0;//     if-eq v13, v15, :cond_3
a=0;// 
a=0;//     invoke-interface {v9}, Lcom/j256/ormlite/table/DatabaseTable;->daoClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     const-class v15, Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;// 
a=0;//     if-ne v13, v15, :cond_5
a=0;// 
a=0;//     .line 66
a=0;//     :cond_3
a=0;//     #v15=(Conflicted);
a=0;//     invoke-interface/range {p0 .. p0}, Lcom/j256/ormlite/support/ConnectionSource;->getDatabaseType()Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 67
a=0;//     .local v10, "databaseType":Lcom/j256/ormlite/db/DatabaseType;
a=0;//     #v10=(Reference,Lcom/j256/ormlite/db/DatabaseType;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     invoke-interface {v10, v0, v1}, Lcom/j256/ormlite/db/DatabaseType;->extractDatabaseTableConfig(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;)Lcom/j256/ormlite/table/DatabaseTableConfig;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 69
a=0;//     .local v4, "config":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<TT;>;"
a=0;//     #v4=(Reference,Lcom/j256/ormlite/table/DatabaseTableConfig;);
a=0;//     if-nez v4, :cond_4
a=0;// 
a=0;//     .line 70
a=0;//     invoke-static/range {p0 .. p1}, Lcom/j256/ormlite/dao/BaseDaoImpl;->createDao(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;)Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 74
a=0;//     .local v8, "daoTmp":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<TT;*>;"
a=0;//     :goto_1
a=0;//     #v8=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     move-object v5, v8
a=0;// 
a=0;//     .line 75
a=0;//     sget-object v13, Lcom/j256/ormlite/dao/DaoManager;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     const-string v15, "created dao for class {} with reflection"
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v13, v15, v0}, Lcom/j256/ormlite/logger/Logger;->debug(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 99
a=0;//     .end local v4    # "config":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<TT;>;"
a=0;//     .end local v8    # "daoTmp":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<TT;*>;"
a=0;//     .end local v10    # "databaseType":Lcom/j256/ormlite/db/DatabaseType;
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v10=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-static {v0, v5}, Lcom/j256/ormlite/dao/DaoManager;->registerDao(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/dao/Dao;)V
a=0;// 
a=0;//     .line 101
a=0;//     move-object v3, v5
a=0;// 
a=0;//     .line 102
a=0;//     .restart local v3    # "castDao":Lcom/j256/ormlite/dao/Dao;, "TD;"
a=0;//     #v3=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 72
a=0;//     .end local v3    # "castDao":Lcom/j256/ormlite/dao/Dao;, "TD;"
a=0;//     .restart local v4    # "config":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<TT;>;"
a=0;//     .restart local v10    # "databaseType":Lcom/j256/ormlite/db/DatabaseType;
a=0;//     :cond_4
a=0;//     #v2=(Uninit);v3=(Uninit);v4=(Reference,Lcom/j256/ormlite/table/DatabaseTableConfig;);v6=(Uninit);v7=(Uninit);v8=(Uninit);v10=(Reference,Lcom/j256/ormlite/db/DatabaseType;);v15=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-static {v0, v4}, Lcom/j256/ormlite/dao/BaseDaoImpl;->createDao(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/table/DatabaseTableConfig;)Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .restart local v8    # "daoTmp":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<TT;*>;"
a=0;//     #v8=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 77
a=0;//     .end local v4    # "config":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<TT;>;"
a=0;//     .end local v8    # "daoTmp":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<TT;*>;"
a=0;//     .end local v10    # "databaseType":Lcom/j256/ormlite/db/DatabaseType;
a=0;//     :cond_5
a=0;//     #v4=(Uninit);v8=(Uninit);v10=(Uninit);v15=(Reference,Ljava/lang/Class;);
a=0;//     invoke-interface {v9}, Lcom/j256/ormlite/table/DatabaseTable;->daoClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 78
a=0;//     .local v6, "daoClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     #v6=(Reference,Ljava/lang/Class;);
a=0;//     const/4 v13, 0x2
a=0;// 
a=0;//     #v13=(PosByte);
a=0;//     new-array v2, v13, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     #v13=(Null);
a=0;//     aput-object p0, v2, v13
a=0;// 
a=0;//     const/4 v13, 0x1
a=0;// 
a=0;//     #v13=(One);
a=0;//     aput-object p1, v2, v13
a=0;// 
a=0;//     .line 80
a=0;//     .local v2, "arguments":[Ljava/lang/Object;
a=0;//     invoke-static {v6, v2}, Lcom/j256/ormlite/dao/DaoManager;->findConstructor(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/reflect/Constructor;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 81
a=0;//     .local v7, "daoConstructor":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<*>;"
a=0;//     #v7=(Reference,Ljava/lang/reflect/Constructor;);
a=0;//     if-nez v7, :cond_6
a=0;// 
a=0;//     .line 83
a=0;//     const/4 v13, 0x1
a=0;// 
a=0;//     new-array v2, v13, [Ljava/lang/Object;
a=0;// 
a=0;//     .end local v2    # "arguments":[Ljava/lang/Object;
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     #v13=(Null);
a=0;//     aput-object p0, v2, v13
a=0;// 
a=0;//     .line 84
a=0;//     .restart local v2    # "arguments":[Ljava/lang/Object;
a=0;//     invoke-static {v6, v2}, Lcom/j256/ormlite/dao/DaoManager;->findConstructor(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/reflect/Constructor;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 85
a=0;//     if-nez v7, :cond_6
a=0;// 
a=0;//     .line 86
a=0;//     new-instance v13, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v13=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v15, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "Could not find public constructor with ConnectionSource and optional Class parameters "
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, ".  Missing static on class?"
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-direct {v13, v15}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v13=(Reference,Ljava/sql/SQLException;);
a=0;//     throw v13
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 92
a=0;//     :cond_6
a=0;//     :try_start_3
a=0;//     #v13=(Boolean);v16=(Uninit);
a=0;//     invoke-virtual {v7, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/Object;);
a=0;//     move-object v0, v13
a=0;// 
a=0;//     check-cast v0, Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     move-object v5, v0
a=0;// 
a=0;//     .line 93
a=0;//     sget-object v13, Lcom/j256/ormlite/dao/DaoManager;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     const-string v15, "created dao for class {} from constructor"
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v13, v15, v0}, Lcom/j256/ormlite/logger/Logger;->debug(Ljava/lang/String;Ljava/lang/Object;)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 94
a=0;//     :catch_0
a=0;//     #v13=(Conflicted);
a=0;//     move-exception v11
a=0;// 
a=0;//     .line 95
a=0;//     .local v11, "e":Ljava/lang/Exception;
a=0;//     :try_start_4
a=0;//     #v11=(Reference,Ljava/lang/Exception;);
a=0;//     new-instance v13, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v13=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v15, "Could not call the constructor in class "
a=0;// 
a=0;//     invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-static {v13, v11}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     throw v13
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// .end method
a=0;// 
a=0;// .method private static createDaoFromConfig(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;)Ljava/lang/Object;
a=0;//     .locals 4
a=0;//     .param p0, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<D:",
a=0;//             "Ljava/lang/Object;",
a=0;//             "T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/j256/ormlite/support/ConnectionSource;",
a=0;//             "Ljava/lang/Class",
a=0;//             "<TT;>;)TD;"
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
a=0;//     .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 314
a=0;//     #v0=(Null);
a=0;//     sget-object v3, Lcom/j256/ormlite/dao/DaoManager;->configMap:Ljava/util/Map;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/Map;);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 329
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/Dao;);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 319
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Uninit);v2=(Uninit);
a=0;//     sget-object v3, Lcom/j256/ormlite/dao/DaoManager;->configMap:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/j256/ormlite/table/DatabaseTableConfig;
a=0;// 
a=0;//     .line 321
a=0;//     .local v1, "config":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<TT;>;"
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 326
a=0;//     invoke-static {p0, v1}, Lcom/j256/ormlite/dao/DaoManager;->doCreateDao(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/table/DatabaseTableConfig;)Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 328
a=0;//     .local v2, "configedDao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<TT;*>;"
a=0;//     #v2=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     move-object v0, v2
a=0;// 
a=0;//     .line 329
a=0;//     .local v0, "castDao":Lcom/j256/ormlite/dao/Dao;, "TD;"
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static doCreateDao(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/table/DatabaseTableConfig;)Lcom/j256/ormlite/dao/Dao;
a=0;//     .locals 14
a=0;//     .param p0, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<D::",
a=0;//             "Lcom/j256/ormlite/dao/Dao",
a=0;//             "<TT;*>;T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/j256/ormlite/support/ConnectionSource;",
a=0;//             "Lcom/j256/ormlite/table/DatabaseTableConfig",
a=0;//             "<TT;>;)TD;"
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
a=0;//     .line 334
a=0;//     .local p1, "tableConfig":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<TT;>;"
a=0;//     new-instance v10, Lcom/j256/ormlite/dao/DaoManager$TableConfigConnectionSource;
a=0;// 
a=0;//     #v10=(UninitRef,Lcom/j256/ormlite/dao/DaoManager$TableConfigConnectionSource;);
a=0;//     invoke-direct {v10, p0, p1}, Lcom/j256/ormlite/dao/DaoManager$TableConfigConnectionSource;-><init>(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/table/DatabaseTableConfig;)V
a=0;// 
a=0;//     .line 336
a=0;//     .local v10, "tableKey":Lcom/j256/ormlite/dao/DaoManager$TableConfigConnectionSource;
a=0;//     #v10=(Reference,Lcom/j256/ormlite/dao/DaoManager$TableConfigConnectionSource;);
a=0;//     invoke-static {v10}, Lcom/j256/ormlite/dao/DaoManager;->lookupDao(Lcom/j256/ormlite/dao/DaoManager$TableConfigConnectionSource;)Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 337
a=0;//     .local v4, "dao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<**>;"
a=0;//     #v4=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 339
a=0;//     move-object v1, v4
a=0;// 
a=0;//     .line 387
a=0;//     .local v1, "castDao":Lcom/j256/ormlite/dao/Dao;, "TD;"
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Lcom/j256/ormlite/dao/Dao;);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 344
a=0;//     .end local v1    # "castDao":Lcom/j256/ormlite/dao/Dao;, "TD;"
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v11=(Uninit);v12=(Uninit);
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/table/DatabaseTableConfig;->getDataClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 345
a=0;//     .local v7, "dataClass":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     #v7=(Reference,Ljava/lang/Class;);
a=0;//     new-instance v2, Lcom/j256/ormlite/dao/DaoManager$ClassConnectionSource;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/j256/ormlite/dao/DaoManager$ClassConnectionSource;);
a=0;//     invoke-direct {v2, p0, v7}, Lcom/j256/ormlite/dao/DaoManager$ClassConnectionSource;-><init>(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 346
a=0;//     .local v2, "classKey":Lcom/j256/ormlite/dao/DaoManager$ClassConnectionSource;
a=0;//     #v2=(Reference,Lcom/j256/ormlite/dao/DaoManager$ClassConnectionSource;);
a=0;//     invoke-static {v2}, Lcom/j256/ormlite/dao/DaoManager;->lookupDao(Lcom/j256/ormlite/dao/DaoManager$ClassConnectionSource;)Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 347
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 349
a=0;//     invoke-static {v10, v4}, Lcom/j256/ormlite/dao/DaoManager;->addDaoToTableMap(Lcom/j256/ormlite/dao/DaoManager$TableConfigConnectionSource;Lcom/j256/ormlite/dao/Dao;)V
a=0;// 
a=0;//     .line 351
a=0;//     move-object v1, v4
a=0;// 
a=0;//     .line 352
a=0;//     .restart local v1    # "castDao":Lcom/j256/ormlite/dao/Dao;, "TD;"
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 356
a=0;//     .end local v1    # "castDao":Lcom/j256/ormlite/dao/Dao;, "TD;"
a=0;//     :cond_1
a=0;//     #v1=(Uninit);
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/table/DatabaseTableConfig;->getDataClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/Class;);
a=0;//     const-class v12, Lcom/j256/ormlite/table/DatabaseTable;
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v11, v12}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/annotation/Annotation;);
a=0;//     check-cast v8, Lcom/j256/ormlite/table/DatabaseTable;
a=0;// 
a=0;//     .line 357
a=0;//     .local v8, "databaseTable":Lcom/j256/ormlite/table/DatabaseTable;
a=0;//     if-eqz v8, :cond_2
a=0;// 
a=0;//     invoke-interface {v8}, Lcom/j256/ormlite/table/DatabaseTable;->daoClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     const-class v12, Ljava/lang/Void;
a=0;// 
a=0;//     if-eq v11, v12, :cond_2
a=0;// 
a=0;//     invoke-interface {v8}, Lcom/j256/ormlite/table/DatabaseTable;->daoClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     const-class v12, Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;// 
a=0;//     if-ne v11, v12, :cond_4
a=0;// 
a=0;//     .line 359
a=0;//     :cond_2
a=0;//     invoke-static {p0, p1}, Lcom/j256/ormlite/dao/BaseDaoImpl;->createDao(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/table/DatabaseTableConfig;)Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 360
a=0;//     .local v6, "daoTmp":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<TT;*>;"
a=0;//     #v6=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     move-object v4, v6
a=0;// 
a=0;//     .line 377
a=0;//     .end local v6    # "daoTmp":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<TT;*>;"
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v11=(Conflicted);
a=0;//     invoke-static {v10, v4}, Lcom/j256/ormlite/dao/DaoManager;->addDaoToTableMap(Lcom/j256/ormlite/dao/DaoManager$TableConfigConnectionSource;Lcom/j256/ormlite/dao/Dao;)V
a=0;// 
a=0;//     .line 378
a=0;//     sget-object v11, Lcom/j256/ormlite/dao/DaoManager;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v11=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     const-string v12, "created dao for class {} from table config"
a=0;// 
a=0;//     invoke-virtual {v11, v12, v7}, Lcom/j256/ormlite/logger/Logger;->debug(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 381
a=0;//     invoke-static {v2}, Lcom/j256/ormlite/dao/DaoManager;->lookupDao(Lcom/j256/ormlite/dao/DaoManager$ClassConnectionSource;)Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     if-nez v11, :cond_3
a=0;// 
a=0;//     .line 382
a=0;//     invoke-static {v2, v4}, Lcom/j256/ormlite/dao/DaoManager;->addDaoToClassMap(Lcom/j256/ormlite/dao/DaoManager$ClassConnectionSource;Lcom/j256/ormlite/dao/Dao;)V
a=0;// 
a=0;//     .line 386
a=0;//     :cond_3
a=0;//     move-object v1, v4
a=0;// 
a=0;//     .line 387
a=0;//     .restart local v1    # "castDao":Lcom/j256/ormlite/dao/Dao;, "TD;"
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 362
a=0;//     .end local v1    # "castDao":Lcom/j256/ormlite/dao/Dao;, "TD;"
a=0;//     :cond_4
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     invoke-interface {v8}, Lcom/j256/ormlite/table/DatabaseTable;->daoClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 363
a=0;//     .local v5, "daoClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     #v5=(Reference,Ljava/lang/Class;);
a=0;//     const/4 v11, 0x2
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     new-array v0, v11, [Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     aput-object p0, v0, v11
a=0;// 
a=0;//     const/4 v11, 0x1
a=0;// 
a=0;//     #v11=(One);
a=0;//     aput-object p1, v0, v11
a=0;// 
a=0;//     .line 364
a=0;//     .local v0, "arguments":[Ljava/lang/Object;
a=0;//     invoke-static {v5, v0}, Lcom/j256/ormlite/dao/DaoManager;->findConstructor(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/reflect/Constructor;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 365
a=0;//     .local v3, "constructor":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<*>;"
a=0;//     #v3=(Reference,Ljava/lang/reflect/Constructor;);
a=0;//     if-nez v3, :cond_5
a=0;// 
a=0;//     .line 366
a=0;//     new-instance v11, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v12, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v13, "Could not find public constructor with ConnectionSource, DatabaseTableConfig parameters in class "
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-direct {v11, v12}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v11=(Reference,Ljava/sql/SQLException;);
a=0;//     throw v11
a=0;// 
a=0;//     .line 371
a=0;//     :cond_5
a=0;//     :try_start_0
a=0;//     #v11=(One);v13=(Uninit);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .end local v4    # "dao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<**>;"
a=0;//     check-cast v4, Lcom/j256/ormlite/dao/Dao;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .restart local v4    # "dao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<**>;"
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 372
a=0;//     .end local v4    # "dao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<**>;"
a=0;//     :catch_0
a=0;//     move-exception v9
a=0;// 
a=0;//     .line 373
a=0;//     .local v9, "e":Ljava/lang/Exception;
a=0;//     #v9=(Reference,Ljava/lang/Exception;);
a=0;//     new-instance v11, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v12, "Could not call the constructor in class "
a=0;// 
a=0;//     invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-static {v11, v9}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     throw v11
a=0;// .end method
a=0;// 
a=0;// .method private static findConstructor(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/reflect/Constructor;
a=0;//     .locals 9
a=0;//     .param p1, "params"    # [Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;[",
a=0;//             "Ljava/lang/Object;",
a=0;//             ")",
a=0;//             "Ljava/lang/reflect/Constructor",
a=0;//             "<*>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 291
a=0;//     .local p0, "daoClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     invoke-virtual {p0}, Ljava/lang/Class;->getConstructors()[Ljava/lang/reflect/Constructor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .local v0, "arr$":[Ljava/lang/reflect/Constructor;
a=0;//     #v0=(Reference,[Ljava/lang/reflect/Constructor;);
a=0;//     array-length v4, v0
a=0;// 
a=0;//     .local v4, "len$":I
a=0;//     #v4=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .local v3, "i$":I
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Integer);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     if-ge v3, v4, :cond_3
a=0;// 
a=0;//     aget-object v1, v0, v3
a=0;// 
a=0;//     .line 292
a=0;//     .local v1, "constructor":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<*>;"
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v1}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 293
a=0;//     .local v6, "paramsTypes":[Ljava/lang/Class;, "[Ljava/lang/Class<*>;"
a=0;//     #v6=(Reference,[Ljava/lang/Class;);
a=0;//     array-length v7, v6
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     array-length v8, p1
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-ne v7, v8, :cond_2
a=0;// 
a=0;//     .line 294
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     .line 295
a=0;//     .local v5, "match":Z
a=0;//     #v5=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_1
a=0;//     #v2=(Integer);v8=(Conflicted);
a=0;//     array-length v7, v6
a=0;// 
a=0;//     if-ge v2, v7, :cond_0
a=0;// 
a=0;//     .line 296
a=0;//     aget-object v7, v6, v2
a=0;// 
a=0;//     #v7=(Null);
a=0;//     aget-object v8, p1, v2
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_1
a=0;// 
a=0;//     .line 297
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 301
a=0;//     :cond_0
a=0;//     #v5=(Boolean);v7=(Integer);v8=(Conflicted);
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     .line 306
a=0;//     .end local v1    # "constructor":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<*>;"
a=0;//     .end local v2    # "i":I
a=0;//     .end local v5    # "match":Z
a=0;//     .end local v6    # "paramsTypes":[Ljava/lang/Class;, "[Ljava/lang/Class<*>;"
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 295
a=0;//     .restart local v1    # "constructor":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<*>;"
a=0;//     .restart local v2    # "i":I
a=0;//     .restart local v5    # "match":Z
a=0;//     .restart local v6    # "paramsTypes":[Ljava/lang/Class;, "[Ljava/lang/Class<*>;"
a=0;//     :cond_1
a=0;//     #v2=(Integer);v5=(One);v6=(Reference,[Ljava/lang/Class;);v7=(Boolean);v8=(Reference,Ljava/lang/Class;);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 291
a=0;//     .end local v2    # "i":I
a=0;//     .end local v5    # "match":Z
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);v5=(Conflicted);v7=(Integer);v8=(Conflicted);
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 306
a=0;//     .end local v1    # "constructor":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<*>;"
a=0;//     .end local v6    # "paramsTypes":[Ljava/lang/Class;, "[Ljava/lang/Class<*>;"
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private static lookupDao(Lcom/j256/ormlite/dao/DaoManager$ClassConnectionSource;)Lcom/j256/ormlite/dao/Dao;
a=0;//     .locals 2
a=0;//     .param p0, "key"    # Lcom/j256/ormlite/dao/DaoManager$ClassConnectionSource;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/j256/ormlite/dao/DaoManager$ClassConnectionSource;",
a=0;//             ")",
a=0;//             "Lcom/j256/ormlite/dao/Dao",
a=0;//             "<**>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 267
a=0;//     sget-object v1, Lcom/j256/ormlite/dao/DaoManager;->classMap:Ljava/util/Map;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Map;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 268
a=0;//     new-instance v1, Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v1}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     sput-object v1, Lcom/j256/ormlite/dao/DaoManager;->classMap:Ljava/util/Map;
a=0;// 
a=0;//     .line 270
a=0;//     :cond_0
a=0;//     sget-object v1, Lcom/j256/ormlite/dao/DaoManager;->classMap:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     .line 271
a=0;//     .local v0, "dao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<**>;"
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 272
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 274
a=0;//     .end local v0    # "dao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<**>;"
a=0;//     :cond_1
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static lookupDao(Lcom/j256/ormlite/dao/DaoManager$TableConfigConnectionSource;)Lcom/j256/ormlite/dao/Dao;
a=0;//     .locals 2
a=0;//     .param p0, "key"    # Lcom/j256/ormlite/dao/DaoManager$TableConfigConnectionSource;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/j256/ormlite/dao/DaoManager$TableConfigConnectionSource;",
a=0;//             ")",
a=0;//             "Lcom/j256/ormlite/dao/Dao",
a=0;//             "<**>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 279
a=0;//     sget-object v1, Lcom/j256/ormlite/dao/DaoManager;->tableConfigMap:Ljava/util/Map;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Map;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 280
a=0;//     new-instance v1, Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v1}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     sput-object v1, Lcom/j256/ormlite/dao/DaoManager;->tableConfigMap:Ljava/util/Map;
a=0;// 
a=0;//     .line 282
a=0;//     :cond_0
a=0;//     sget-object v1, Lcom/j256/ormlite/dao/DaoManager;->tableConfigMap:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     .line 283
a=0;//     .local v0, "dao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<**>;"
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 284
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 286
a=0;//     .end local v0    # "dao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<**>;"
a=0;//     :cond_1
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized lookupDao(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/table/DatabaseTableConfig;)Lcom/j256/ormlite/dao/Dao;
a=0;//     .locals 6
a=0;//     .param p0, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<D::",
a=0;//             "Lcom/j256/ormlite/dao/Dao",
a=0;//             "<TT;*>;T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/j256/ormlite/support/ConnectionSource;",
a=0;//             "Lcom/j256/ormlite/table/DatabaseTableConfig",
a=0;//             "<TT;>;)TD;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 138
a=0;//     .local p1, "tableConfig":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<TT;>;"
a=0;//     const-class v4, Lcom/j256/ormlite/dao/DaoManager;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v4
a=0;// 
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 139
a=0;//     :try_start_0
a=0;//     new-instance v3, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v5, "connectionSource argument cannot be null"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v3
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 138
a=0;//     :catchall_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v4
a=0;// 
a=0;//     throw v3
a=0;// 
a=0;//     .line 141
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v2=(Uninit);v3=(Uninit);v5=(Uninit);
a=0;//     new-instance v2, Lcom/j256/ormlite/dao/DaoManager$TableConfigConnectionSource;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/j256/ormlite/dao/DaoManager$TableConfigConnectionSource;);
a=0;//     invoke-direct {v2, p0, p1}, Lcom/j256/ormlite/dao/DaoManager$TableConfigConnectionSource;-><init>(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/table/DatabaseTableConfig;)V
a=0;// 
a=0;//     .line 142
a=0;//     .local v2, "key":Lcom/j256/ormlite/dao/DaoManager$TableConfigConnectionSource;
a=0;//     #v2=(Reference,Lcom/j256/ormlite/dao/DaoManager$TableConfigConnectionSource;);
a=0;//     invoke-static {v2}, Lcom/j256/ormlite/dao/DaoManager;->lookupDao(Lcom/j256/ormlite/dao/DaoManager$TableConfigConnectionSource;)Lcom/j256/ormlite/dao/Dao;
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 143
a=0;//     .local v1, "dao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<**>;"
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 144
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 148
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     monitor-exit v4
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 147
a=0;//     :cond_1
a=0;//     #v0=(Uninit);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 148
a=0;//     .local v0, "castDao":Lcom/j256/ormlite/dao/Dao;, "TD;"
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized lookupDao(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;)Lcom/j256/ormlite/dao/Dao;
a=0;//     .locals 6
a=0;//     .param p0, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<D::",
a=0;//             "Lcom/j256/ormlite/dao/Dao",
a=0;//             "<TT;*>;T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/j256/ormlite/support/ConnectionSource;",
a=0;//             "Ljava/lang/Class",
a=0;//             "<TT;>;)TD;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 109
a=0;//     .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     const-class v4, Lcom/j256/ormlite/dao/DaoManager;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v4
a=0;// 
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 110
a=0;//     :try_start_0
a=0;//     new-instance v3, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v5, "connectionSource argument cannot be null"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v3
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 109
a=0;//     :catchall_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v4
a=0;// 
a=0;//     throw v3
a=0;// 
a=0;//     .line 112
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v2=(Uninit);v3=(Uninit);v5=(Uninit);
a=0;//     new-instance v2, Lcom/j256/ormlite/dao/DaoManager$ClassConnectionSource;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/j256/ormlite/dao/DaoManager$ClassConnectionSource;);
a=0;//     invoke-direct {v2, p0, p1}, Lcom/j256/ormlite/dao/DaoManager$ClassConnectionSource;-><init>(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 113
a=0;//     .local v2, "key":Lcom/j256/ormlite/dao/DaoManager$ClassConnectionSource;
a=0;//     #v2=(Reference,Lcom/j256/ormlite/dao/DaoManager$ClassConnectionSource;);
a=0;//     invoke-static {v2}, Lcom/j256/ormlite/dao/DaoManager;->lookupDao(Lcom/j256/ormlite/dao/DaoManager$ClassConnectionSource;)Lcom/j256/ormlite/dao/Dao;
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 115
a=0;//     .local v1, "dao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<**>;"
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 116
a=0;//     .local v0, "castDao":Lcom/j256/ormlite/dao/Dao;, "TD;"
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     monitor-exit v4
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized registerDao(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/dao/Dao;)V
a=0;//     .locals 3
a=0;//     .param p0, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/support/ConnectionSource;",
a=0;//             "Lcom/j256/ormlite/dao/Dao",
a=0;//             "<**>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 168
a=0;//     .local p1, "dao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<**>;"
a=0;//     const-class v1, Lcom/j256/ormlite/dao/DaoManager;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 169
a=0;//     :try_start_0
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v2, "connectionSource argument cannot be null"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 168
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 171
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Uninit);v2=(Uninit);
a=0;//     new-instance v0, Lcom/j256/ormlite/dao/DaoManager$ClassConnectionSource;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/dao/DaoManager$ClassConnectionSource;);
a=0;//     invoke-interface {p1}, Lcom/j256/ormlite/dao/Dao;->getDataClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, p0, v2}, Lcom/j256/ormlite/dao/DaoManager$ClassConnectionSource;-><init>(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/DaoManager$ClassConnectionSource;);
a=0;//     invoke-static {v0, p1}, Lcom/j256/ormlite/dao/DaoManager;->addDaoToClassMap(Lcom/j256/ormlite/dao/DaoManager$ClassConnectionSource;Lcom/j256/ormlite/dao/Dao;)V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 172
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized registerDaoWithTableConfig(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/dao/Dao;)V
a=0;//     .locals 5
a=0;//     .param p0, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/support/ConnectionSource;",
a=0;//             "Lcom/j256/ormlite/dao/Dao",
a=0;//             "<**>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 190
a=0;//     .local p1, "dao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<**>;"
a=0;//     const-class v3, Lcom/j256/ormlite/dao/DaoManager;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v3
a=0;// 
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 191
a=0;//     :try_start_0
a=0;//     new-instance v2, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v4, "connectionSource argument cannot be null"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v2
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 190
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v3
a=0;// 
a=0;//     throw v2
a=0;// 
a=0;//     .line 193
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v4=(Uninit);
a=0;//     instance-of v2, p1, Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 194
a=0;//     move-object v0, p1
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     check-cast v0, Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;// 
a=0;//     move-object v2, v0
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/dao/BaseDaoImpl;);
a=0;//     invoke-virtual {v2}, Lcom/j256/ormlite/dao/BaseDaoImpl;->getTableConfig()Lcom/j256/ormlite/table/DatabaseTableConfig;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 195
a=0;//     .local v1, "tableConfig":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<*>;"
a=0;//     #v1=(Reference,Lcom/j256/ormlite/table/DatabaseTableConfig;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 196
a=0;//     new-instance v2, Lcom/j256/ormlite/dao/DaoManager$TableConfigConnectionSource;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/j256/ormlite/dao/DaoManager$TableConfigConnectionSource;);
a=0;//     invoke-direct {v2, p0, v1}, Lcom/j256/ormlite/dao/DaoManager$TableConfigConnectionSource;-><init>(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/table/DatabaseTableConfig;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/dao/DaoManager$TableConfigConnectionSource;);
a=0;//     invoke-static {v2, p1}, Lcom/j256/ormlite/dao/DaoManager;->addDaoToTableMap(Lcom/j256/ormlite/dao/DaoManager$TableConfigConnectionSource;Lcom/j256/ormlite/dao/Dao;)V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 201
a=0;//     .end local v1    # "tableConfig":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<*>;"
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);
a=0;//     monitor-exit v3
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 200
a=0;//     :cond_1
a=0;//     :try_start_2
a=0;//     #v2=(Conflicted);v4=(Uninit);
a=0;//     new-instance v2, Lcom/j256/ormlite/dao/DaoManager$ClassConnectionSource;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/j256/ormlite/dao/DaoManager$ClassConnectionSource;);
a=0;//     invoke-interface {p1}, Lcom/j256/ormlite/dao/Dao;->getDataClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v2, p0, v4}, Lcom/j256/ormlite/dao/DaoManager$ClassConnectionSource;-><init>(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/dao/DaoManager$ClassConnectionSource;);
a=0;//     invoke-static {v2, p1}, Lcom/j256/ormlite/dao/DaoManager;->addDaoToClassMap(Lcom/j256/ormlite/dao/DaoManager$ClassConnectionSource;Lcom/j256/ormlite/dao/Dao;)V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static removeDaoToClassMap(Lcom/j256/ormlite/dao/DaoManager$ClassConnectionSource;Lcom/j256/ormlite/dao/Dao;)V
a=0;//     .locals 1
a=0;//     .param p0, "key"    # Lcom/j256/ormlite/dao/DaoManager$ClassConnectionSource;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/dao/DaoManager$ClassConnectionSource;",
a=0;//             "Lcom/j256/ormlite/dao/Dao",
a=0;//             "<**>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 254
a=0;//     .local p1, "dao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<**>;"
a=0;//     sget-object v0, Lcom/j256/ormlite/dao/DaoManager;->classMap:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 255
a=0;//     sget-object v0, Lcom/j256/ormlite/dao/DaoManager;->classMap:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v0, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 257
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized unregisterDao(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/dao/Dao;)V
a=0;//     .locals 3
a=0;//     .param p0, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/support/ConnectionSource;",
a=0;//             "Lcom/j256/ormlite/dao/Dao",
a=0;//             "<**>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 179
a=0;//     .local p1, "dao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<**>;"
a=0;//     const-class v1, Lcom/j256/ormlite/dao/DaoManager;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 180
a=0;//     :try_start_0
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v2, "connectionSource argument cannot be null"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 179
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 182
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Uninit);v2=(Uninit);
a=0;//     new-instance v0, Lcom/j256/ormlite/dao/DaoManager$ClassConnectionSource;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/dao/DaoManager$ClassConnectionSource;);
a=0;//     invoke-interface {p1}, Lcom/j256/ormlite/dao/Dao;->getDataClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, p0, v2}, Lcom/j256/ormlite/dao/DaoManager$ClassConnectionSource;-><init>(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/DaoManager$ClassConnectionSource;);
a=0;//     invoke-static {v0, p1}, Lcom/j256/ormlite/dao/DaoManager;->removeDaoToClassMap(Lcom/j256/ormlite/dao/DaoManager$ClassConnectionSource;Lcom/j256/ormlite/dao/Dao;)V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 183
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
