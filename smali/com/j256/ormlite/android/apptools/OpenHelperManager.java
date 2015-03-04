package com.j256.ormlite.android.apptools; class OpenHelperManager { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/android/apptools/OpenHelperManager;
a=0;// .super Ljava/lang/Object;
a=0;// .source "OpenHelperManager.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final HELPER_CLASS_RESOURCE_NAME:Ljava/lang/String; = "open_helper_classname"
a=0;// 
a=0;// .field private static volatile helper:Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;
a=0;// 
a=0;// .field private static helperClass:Ljava/lang/Class;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/lang/Class",
a=0;//             "<+",
a=0;//             "Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private static instanceCount:I
a=0;// 
a=0;// .field private static logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;// .field private static wasClosed:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 39
a=0;//     #v1=(Null);
a=0;//     const-class v0, Lcom/j256/ormlite/android/apptools/OpenHelperManager;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {v0}, Lcom/j256/ormlite/logger/LoggerFactory;->getLogger(Ljava/lang/Class;)Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     .line 41
a=0;//     sput-object v2, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->helperClass:Ljava/lang/Class;
a=0;// 
a=0;//     .line 42
a=0;//     sput-object v2, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->helper:Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;
a=0;// 
a=0;//     .line 43
a=0;//     sput-boolean v1, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->wasClosed:Z
a=0;// 
a=0;//     .line 44
a=0;//     sput v1, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->instanceCount:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/j256/ormlite/android/apptools/OpenHelperManager;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static constructHelper(Landroid/content/Context;Ljava/lang/Class;)Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;
a=0;//     .locals 5
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/content/Context;",
a=0;//             "Ljava/lang/Class",
a=0;//             "<+",
a=0;//             "Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;",
a=0;//             ">;)",
a=0;//             "Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 208
a=0;//     .local p1, "openHelperClass":Ljava/lang/Class;, "Ljava/lang/Class<+Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;>;"
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     :try_start_0
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/Class;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Class;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const-class v4, Landroid/content/Context;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     invoke-virtual {p1, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 215
a=0;//     .local v0, "constructor":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<*>;"
a=0;//     #v0=(Reference,Ljava/lang/reflect/Constructor;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     :try_start_1
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     aput-object p0, v2, v3
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     return-object v2
a=0;// 
a=0;//     .line 209
a=0;//     .end local v0    # "constructor":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<*>;"
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 210
a=0;//     .local v1, "e":Ljava/lang/Exception;
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     new-instance v2, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Could not find constructor that hast just a (Context) argument for helper class "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 216
a=0;//     .end local v1    # "e":Ljava/lang/Exception;
a=0;//     .restart local v0    # "constructor":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<*>;"
a=0;//     :catch_1
a=0;//     #v0=(Reference,Ljava/lang/reflect/Constructor;);v1=(Uninit);v2=(Conflicted);v3=(Null);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 217
a=0;//     .restart local v1    # "e":Ljava/lang/Exception;
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     new-instance v2, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Could not construct instance of helper class "
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v2
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized getHelper(Landroid/content/Context;)Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;
a=0;//     .locals 4
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .annotation runtime Ljava/lang/Deprecated;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 97
a=0;//     const-class v2, Lcom/j256/ormlite/android/apptools/OpenHelperManager;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v2
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v1, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->helperClass:Ljava/lang/Class;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 98
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 99
a=0;//     new-instance v1, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v3, "context argument is null"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 97
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v2
a=0;// 
a=0;//     throw v1
a=0;// 
a=0;//     .line 101
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Uninit);v3=(Uninit);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 102
a=0;//     .local v0, "appContext":Landroid/content/Context;
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->lookupHelperClass(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->innerSetHelperClass(Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 104
a=0;//     .end local v0    # "appContext":Landroid/content/Context;
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     sget-object v1, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->helperClass:Ljava/lang/Class;
a=0;// 
a=0;//     invoke-static {p0, v1}, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->loadHelper(Landroid/content/Context;Ljava/lang/Class;)Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     monitor-exit v2
a=0;// 
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized getHelper(Landroid/content/Context;Ljava/lang/Class;)Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;
a=0;//     .locals 2
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;",
a=0;//             ">(",
a=0;//             "Landroid/content/Context;",
a=0;//             "Ljava/lang/Class",
a=0;//             "<TT;>;)TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 74
a=0;//     .local p1, "openHelperClass":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     const-class v1, Lcom/j256/ormlite/android/apptools/OpenHelperManager;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {p1}, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->innerSetHelperClass(Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 75
a=0;//     invoke-static {p0, p1}, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->loadHelper(Landroid/content/Context;Ljava/lang/Class;)Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 74
a=0;//     :catchall_0
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method private static innerSetHelperClass(Ljava/lang/Class;)V
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/Class",
a=0;//             "<+",
a=0;//             "Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 147
a=0;//     .local p0, "openHelperClass":Ljava/lang/Class;, "Ljava/lang/Class<+Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;>;"
a=0;//     sget-object v0, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->helperClass:Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 148
a=0;//     sput-object p0, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->helperClass:Ljava/lang/Class;
a=0;// 
a=0;//     .line 153
a=0;//     :cond_0
a=0;//     return-void
a=0;// 
a=0;//     .line 149
a=0;//     :cond_1
a=0;//     sget-object v0, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->helperClass:Ljava/lang/Class;
a=0;// 
a=0;//     if-eq v0, p0, :cond_0
a=0;// 
a=0;//     .line 150
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Helper class was "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget-object v2, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->helperClass:Ljava/lang/Class;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " but is trying to be reset to "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
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
a=0;// .end method
a=0;// 
a=0;// .method private static loadHelper(Landroid/content/Context;Ljava/lang/Class;)Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;
a=0;//     .locals 6
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;",
a=0;//             ">(",
a=0;//             "Landroid/content/Context;",
a=0;//             "Ljava/lang/Class",
a=0;//             "<TT;>;)TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 156
a=0;//     .local p1, "openHelperClass":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     sget-object v2, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->helper:Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 157
a=0;//     sget-boolean v2, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->wasClosed:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 159
a=0;//     sget-object v2, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     const-string v3, "helper was already closed and is being re-opened"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Lcom/j256/ormlite/logger/Logger;->info(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 161
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     .line 162
a=0;//     new-instance v2, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v3, "context argument is null"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 164
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 165
a=0;//     .local v0, "appContext":Landroid/content/Context;
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     sget-object v2, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->helperClass:Ljava/lang/Class;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {v0, v2}, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->constructHelper(Landroid/content/Context;Ljava/lang/Class;)Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sput-object v2, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->helper:Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;
a=0;// 
a=0;//     .line 166
a=0;//     sget-object v2, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     const-string v3, "zero instances, created helper {}"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     sget-object v4, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->helper:Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;
a=0;// 
a=0;//     #v4=(Reference,Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;);
a=0;//     invoke-virtual {v2, v3, v4}, Lcom/j256/ormlite/logger/Logger;->trace(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 183
a=0;//     invoke-static {}, Lcom/j256/ormlite/dao/BaseDaoImpl;->clearAllInternalObjectCaches()V
a=0;// 
a=0;//     .line 190
a=0;//     invoke-static {}, Lcom/j256/ormlite/dao/DaoManager;->clearDaoCache()V
a=0;// 
a=0;//     .line 191
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     sput v2, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->instanceCount:I
a=0;// 
a=0;//     .line 194
a=0;//     .end local v0    # "appContext":Landroid/content/Context;
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v2=(Reference,Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;);v3=(Conflicted);v4=(Conflicted);
a=0;//     sget v2, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->instanceCount:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     sput v2, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->instanceCount:I
a=0;// 
a=0;//     .line 195
a=0;//     sget-object v2, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     const-string v3, "returning helper {}, instance count = {} "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     sget-object v4, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->helper:Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;
a=0;// 
a=0;//     #v4=(Reference,Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;);
a=0;//     sget v5, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->instanceCount:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v2, v3, v4, v5}, Lcom/j256/ormlite/logger/Logger;->trace(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 197
a=0;//     sget-object v1, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->helper:Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;
a=0;// 
a=0;//     .line 198
a=0;//     .local v1, "castHelper":Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;, "TT;"
a=0;//     #v1=(Reference,Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method private static lookupHelperClass(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Class;
a=0;//     .locals 20
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/content/Context;",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;)",
a=0;//             "Ljava/lang/Class",
a=0;//             "<+",
a=0;//             "Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 227
a=0;//     .local p1, "componentClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     .line 228
a=0;//     .local v13, "resources":Landroid/content/res/Resources;
a=0;//     #v13=(Reference,Landroid/content/res/Resources;);
a=0;//     const-string v17, "open_helper_classname"
a=0;// 
a=0;//     #v17=(Reference,Ljava/lang/String;);
a=0;//     const-string v18, "string"
a=0;// 
a=0;//     #v18=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     #v19=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v1, v18
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v2, v19
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v13, v0, v1, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     .line 229
a=0;//     .local v12, "resourceId":I
a=0;//     #v12=(Integer);
a=0;//     if-eqz v12, :cond_0
a=0;// 
a=0;//     .line 230
a=0;//     invoke-virtual {v13, v12}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 233
a=0;//     .local v6, "className":Ljava/lang/String;
a=0;//     :try_start_0
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 264
a=0;//     .end local v6    # "className":Ljava/lang/String;
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);v4=(Reference,Ljava/lang/Class;);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v10=(Conflicted);v11=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);
a=0;//     return-object v4
a=0;// 
a=0;//     .line 236
a=0;//     .restart local v6    # "className":Ljava/lang/String;
a=0;//     :catch_0
a=0;//     #v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Reference,Ljava/lang/String;);v7=(Uninit);v8=(Uninit);v10=(Uninit);v11=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Reference,Ljava/lang/String;);
a=0;//     move-exception v9
a=0;// 
a=0;//     .line 237
a=0;//     .local v9, "e":Ljava/lang/Exception;
a=0;//     #v9=(Reference,Ljava/lang/Exception;);
a=0;//     new-instance v17, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v17=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v18, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v18=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct/range {v18 .. v18}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v18=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v19, "Could not create helper instance for class "
a=0;// 
a=0;//     invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     move-object/from16 v1, v18
a=0;// 
a=0;//     invoke-direct {v0, v1, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);v17=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v17
a=0;// 
a=0;//     .line 242
a=0;//     .end local v6    # "className":Ljava/lang/String;
a=0;//     .end local v9    # "e":Ljava/lang/Exception;
a=0;//     :cond_0
a=0;//     #v6=(Uninit);v9=(Uninit);
a=0;//     move-object/from16 v8, p1
a=0;// 
a=0;//     .local v8, "componentClassWalk":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v3=(Conflicted);v7=(Conflicted);v8=(Reference,Ljava/lang/Class;);v10=(Conflicted);v11=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);
a=0;//     if-eqz v8, :cond_5
a=0;// 
a=0;//     .line 244
a=0;//     invoke-virtual {v8}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     .line 245
a=0;//     .local v14, "superType":Ljava/lang/reflect/Type;
a=0;//     #v14=(Reference,Ljava/lang/reflect/Type;);
a=0;//     if-eqz v14, :cond_1
a=0;// 
a=0;//     instance-of v0, v14, Ljava/lang/reflect/ParameterizedType;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     #v17=(Boolean);
a=0;//     if-nez v17, :cond_2
a=0;// 
a=0;//     .line 242
a=0;//     .end local v14    # "superType":Ljava/lang/reflect/Type;
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v17=(Conflicted);
a=0;//     invoke-virtual {v8}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 249
a=0;//     .restart local v14    # "superType":Ljava/lang/reflect/Type;
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v17=(Boolean);
a=0;//     check-cast v14, Ljava/lang/reflect/ParameterizedType;
a=0;// 
a=0;//     .end local v14    # "superType":Ljava/lang/reflect/Type;
a=0;//     invoke-interface {v14}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     .line 251
a=0;//     .local v16, "types":[Ljava/lang/reflect/Type;
a=0;//     #v16=(Reference,[Ljava/lang/reflect/Type;);
a=0;//     if-eqz v16, :cond_1
a=0;// 
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/reflect/Type;);
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     #v17=(Integer);
a=0;//     if-eqz v17, :cond_1
a=0;// 
a=0;//     .line 254
a=0;//     move-object/from16 v3, v16
a=0;// 
a=0;//     .local v3, "arr$":[Ljava/lang/reflect/Type;
a=0;//     #v3=(Reference,[Ljava/lang/reflect/Type;);
a=0;//     array-length v11, v3
a=0;// 
a=0;//     .local v11, "len$":I
a=0;//     #v11=(Integer);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .local v10, "i$":I
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v10=(Integer);
a=0;//     if-ge v10, v11, :cond_1
a=0;// 
a=0;//     aget-object v15, v3, v10
a=0;// 
a=0;//     .line 256
a=0;//     .local v15, "type":Ljava/lang/reflect/Type;
a=0;//     #v15=(Null);
a=0;//     instance-of v0, v15, Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     #v17=(Boolean);
a=0;//     if-nez v17, :cond_4
a=0;// 
a=0;//     .line 254
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);
a=0;//     add-int/lit8 v10, v10, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Boolean);
a=0;//     move-object v7, v15
a=0;// 
a=0;//     .line 259
a=0;//     #v7=(Null);
a=0;//     check-cast v7, Ljava/lang/Class;
a=0;// 
a=0;//     .line 260
a=0;//     .local v7, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     #v7=(Reference,Ljava/lang/Class;);
a=0;//     const-class v17, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;
a=0;// 
a=0;//     #v17=(Reference,Ljava/lang/Class;);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
a=0;// 
a=0;//     move-result v17
a=0;// 
a=0;//     #v17=(Boolean);
a=0;//     if-eqz v17, :cond_3
a=0;// 
a=0;//     .line 262
a=0;//     move-object v5, v7
a=0;// 
a=0;//     .local v5, "castOpenHelperClass":Ljava/lang/Class;, "Ljava/lang/Class<+Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;>;"
a=0;//     #v5=(Reference,Ljava/lang/Class;);
a=0;//     move-object v4, v5
a=0;// 
a=0;//     .line 264
a=0;//     #v4=(Reference,Ljava/lang/Class;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 268
a=0;//     .end local v3    # "arr$":[Ljava/lang/reflect/Type;
a=0;//     .end local v5    # "castOpenHelperClass":Ljava/lang/Class;, "Ljava/lang/Class<+Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;>;"
a=0;//     .end local v7    # "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     .end local v10    # "i$":I
a=0;//     .end local v11    # "len$":I
a=0;//     .end local v15    # "type":Ljava/lang/reflect/Type;
a=0;//     .end local v16    # "types":[Ljava/lang/reflect/Type;
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Uninit);v5=(Uninit);v7=(Conflicted);v10=(Conflicted);v11=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);
a=0;//     new-instance v17, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v17=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v18, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v18=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct/range {v18 .. v18}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v18=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v19, "Could not find OpenHelperClass because none of the generic parameters of class "
a=0;// 
a=0;//     invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     const-string v19, " extends OrmLiteSqliteOpenHelper.  You should use getHelper(Context, Class) instead."
a=0;// 
a=0;//     invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     invoke-direct/range {v17 .. v18}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v17=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v17
a=0;// .end method
a=0;// 
a=0;// .method public static release()V
a=0;//     .locals 0
a=0;//     .annotation runtime Ljava/lang/Deprecated;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 112
a=0;//     invoke-static {}, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->releaseHelper()V
a=0;// 
a=0;//     .line 113
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized releaseHelper()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 127
a=0;//     const-class v1, Lcom/j256/ormlite/android/apptools/OpenHelperManager;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     sget v0, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->instanceCount:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     sput v0, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->instanceCount:I
a=0;// 
a=0;//     .line 128
a=0;//     sget-object v0, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     const-string v2, "releasing helper {}, instance count = {}"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     sget-object v3, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->helper:Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;
a=0;// 
a=0;//     #v3=(Reference,Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;);
a=0;//     sget v4, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->instanceCount:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0, v2, v3, v4}, Lcom/j256/ormlite/logger/Logger;->trace(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 129
a=0;//     sget v0, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->instanceCount:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gtz v0, :cond_1
a=0;// 
a=0;//     .line 130
a=0;//     sget-object v0, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->helper:Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 131
a=0;//     sget-object v0, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     const-string v2, "zero instances, closing helper {}"
a=0;// 
a=0;//     sget-object v3, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->helper:Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3}, Lcom/j256/ormlite/logger/Logger;->trace(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 132
a=0;//     sget-object v0, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->helper:Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->close()V
a=0;// 
a=0;//     .line 133
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->helper:Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;
a=0;// 
a=0;//     .line 134
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     sput-boolean v0, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->wasClosed:Z
a=0;// 
a=0;//     .line 136
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     sget v0, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->instanceCount:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gez v0, :cond_1
a=0;// 
a=0;//     .line 137
a=0;//     sget-object v0, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     const-string v2, "too many calls to release helper, instance count = {}"
a=0;// 
a=0;//     sget v3, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->instanceCount:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0, v2, v3}, Lcom/j256/ormlite/logger/Logger;->error(Ljava/lang/String;Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 140
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 127
a=0;//     :catchall_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized setHelper(Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;)V
a=0;//     .locals 2
a=0;//     .param p0, "helper"    # Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;
a=0;// 
a=0;//     .prologue
a=0;//     .line 64
a=0;//     const-class v0, Lcom/j256/ormlite/android/apptools/OpenHelperManager;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v0
a=0;// 
a=0;//     :try_start_0
a=0;//     sput-object p0, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->helper:Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 65
a=0;//     monitor-exit v0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 64
a=0;//     :catchall_0
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v0
a=0;// 
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized setOpenHelperClass(Ljava/lang/Class;)V
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/Class",
a=0;//             "<+",
a=0;//             "Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     .local p0, "openHelperClass":Ljava/lang/Class;, "Ljava/lang/Class<+Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;>;"
a=0;//     const-class v1, Lcom/j256/ormlite/android/apptools/OpenHelperManager;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 52
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->helperClass:Ljava/lang/Class;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 56
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 54
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Uninit);
a=0;//     invoke-static {p0}, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->innerSetHelperClass(Ljava/lang/Class;)V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 51
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// .end method
}}
