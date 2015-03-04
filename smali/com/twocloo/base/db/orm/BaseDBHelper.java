package com.twocloo.base.db.orm; class BaseDBHelper { void a() { int a;
a=0;// .class public Lcom/twocloo/base/db/orm/BaseDBHelper;
a=0;// .super Lcom/twocloo/base/db/orm/DBHelper;
a=0;// .source "BaseDBHelper.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static volatile instance:Lcom/twocloo/base/db/orm/BaseDBHelper;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected final tables:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/Class",
a=0;//             "<+",
a=0;//             "Lcom/twocloo/base/db/orm/TableAble;",
a=0;//             ">;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/base/db/orm/DBHelper;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 23
a=0;//     #p0=(Reference,Lcom/twocloo/base/db/orm/BaseDBHelper;);
a=0;//     new-instance v0, Ljava/util/LinkedList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/LinkedList;);
a=0;//     invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/LinkedList;);
a=0;//     iput-object v0, p0, Lcom/twocloo/base/db/orm/BaseDBHelper;->tables:Ljava/util/List;
a=0;// 
a=0;//     .line 20
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getInstance()Lcom/twocloo/base/db/orm/BaseDBHelper;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     sget-object v0, Lcom/twocloo/base/db/orm/BaseDBHelper;->instance:Lcom/twocloo/base/db/orm/BaseDBHelper;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/db/orm/BaseDBHelper;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 28
a=0;//     const-class v1, Lcom/twocloo/base/db/orm/BaseDBHelper;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 29
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/twocloo/base/db/orm/BaseDBHelper;->instance:Lcom/twocloo/base/db/orm/BaseDBHelper;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 30
a=0;//     new-instance v0, Lcom/twocloo/base/db/orm/BaseDBHelper;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/base/db/orm/BaseDBHelper;);
a=0;//     invoke-static {}, Lcom/twocloo/base/common/CommonApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/Application;);
a=0;//     invoke-direct {v0, v2}, Lcom/twocloo/base/db/orm/BaseDBHelper;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/db/orm/BaseDBHelper;);
a=0;//     sput-object v0, Lcom/twocloo/base/db/orm/BaseDBHelper;->instance:Lcom/twocloo/base/db/orm/BaseDBHelper;
a=0;// 
a=0;//     .line 28
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 34
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcom/twocloo/base/db/orm/BaseDBHelper;->instance:Lcom/twocloo/base/db/orm/BaseDBHelper;
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 28
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/Class;);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public tables()Ljava/util/List;
a=0;//     .locals 1
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
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     iget-object v0, p0, Lcom/twocloo/base/db/orm/BaseDBHelper;->tables:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     return-object v0
a=0;// .end method
}}
