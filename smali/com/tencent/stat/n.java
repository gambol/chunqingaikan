package com.tencent.stat; class n { void a() { int a;
a=0;// .class public Lcom/tencent/stat/n;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static e:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;// .field private static f:Lcom/tencent/stat/n;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:Landroid/os/Handler;
a=0;// 
a=0;// .field volatile b:I
a=0;// 
a=0;// .field c:Lcom/tencent/stat/DeviceInfo;
a=0;// 
a=0;// .field private d:Lcom/tencent/stat/w;
a=0;// 
a=0;// .field private g:Ljava/util/HashMap;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/common/k;->b()Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     sput-object v0, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/tencent/stat/n;->f:Lcom/tencent/stat/n;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/stat/n;);
a=0;//     iput-object v1, p0, Lcom/tencent/stat/n;->a:Landroid/os/Handler;
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/tencent/stat/n;->b:I
a=0;// 
a=0;//     iput-object v1, p0, Lcom/tencent/stat/n;->c:Lcom/tencent/stat/DeviceInfo;
a=0;// 
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Lcom/tencent/stat/n;->g:Ljava/util/HashMap;
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v0, Landroid/os/HandlerThread;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/HandlerThread;);
a=0;//     const-string v1, "StatStore"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/HandlerThread;);
a=0;//     invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V
a=0;// 
a=0;//     sget-object v1, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Launch store thread:"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/tencent/stat/common/StatLogger;->w(Ljava/lang/Object;)V
a=0;// 
a=0;//     new-instance v1, Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/os/Handler;);
a=0;//     invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     iput-object v1, p0, Lcom/tencent/stat/n;->a:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Lcom/tencent/stat/w;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/stat/w;);
a=0;//     invoke-direct {v1, v0}, Lcom/tencent/stat/w;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/w;);
a=0;//     iput-object v1, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/tencent/stat/w;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/tencent/stat/w;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/tencent/stat/n;->b(Landroid/content/Context;)Lcom/tencent/stat/DeviceInfo;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/tencent/stat/n;->c()V
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/tencent/stat/n;->f()V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/stat/n;->a:Landroid/os/Handler;
a=0;// 
a=0;//     new-instance v1, Lcom/tencent/stat/o;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/stat/o;);
a=0;//     invoke-direct {v1, p0}, Lcom/tencent/stat/o;-><init>(Lcom/tencent/stat/n;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/o;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     sget-object v1, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized a(Landroid/content/Context;)Lcom/tencent/stat/n;
a=0;//     .locals 2
a=0;// 
a=0;//     const-class v1, Lcom/tencent/stat/n;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/tencent/stat/n;->f:Lcom/tencent/stat/n;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/n;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lcom/tencent/stat/n;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/stat/n;);
a=0;//     invoke-direct {v0, p0}, Lcom/tencent/stat/n;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/n;);
a=0;//     sput-object v0, Lcom/tencent/stat/n;->f:Lcom/tencent/stat/n;
a=0;// 
a=0;//     :cond_0
a=0;//     sget-object v0, Lcom/tencent/stat/n;->f:Lcom/tencent/stat/n;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// 
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
a=0;// .method static synthetic a(Lcom/tencent/stat/n;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/tencent/stat/n;->e()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/tencent/stat/n;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lcom/tencent/stat/n;->b(I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/tencent/stat/n;Lcom/tencent/stat/a/e;Lcom/tencent/stat/c;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0, p1, p2}, Lcom/tencent/stat/n;->b(Lcom/tencent/stat/a/e;Lcom/tencent/stat/c;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/tencent/stat/n;Lcom/tencent/stat/b;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lcom/tencent/stat/n;->b(Lcom/tencent/stat/b;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/tencent/stat/n;Ljava/util/List;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lcom/tencent/stat/n;->b(Ljava/util/List;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/tencent/stat/n;Ljava/util/List;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0, p1, p2}, Lcom/tencent/stat/n;->b(Ljava/util/List;I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static b()Lcom/tencent/stat/n;
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/n;->f:Lcom/tencent/stat/n;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/n;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcom/tencent/stat/n;)Lcom/tencent/stat/w;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/w;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private declared-synchronized b(I)V
a=0;//     .locals 5
a=0;// 
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget v0, p0, Lcom/tencent/stat/n;->b:I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     if-gtz p1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     sget-object v0, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Load "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget v2, p0, Lcom/tencent/stat/n;->b:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " unsent events"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->i(Ljava/lang/Object;)V
a=0;// 
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eq p1, v0, :cond_2
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->a()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-le p1, v0, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->a()I
a=0;// 
a=0;//     move-result p1
a=0;// 
a=0;//     :cond_3
a=0;//     iget v0, p0, Lcom/tencent/stat/n;->b:I
a=0;// 
a=0;//     sub-int/2addr v0, p1
a=0;// 
a=0;//     iput v0, p0, Lcom/tencent/stat/n;->b:I
a=0;// 
a=0;//     invoke-direct {p0, v2, p1}, Lcom/tencent/stat/n;->c(Ljava/util/List;I)V
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Peek "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, " unsent events."
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Lcom/tencent/stat/common/StatLogger;->i(Ljava/lang/Object;)V
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/List;->isEmpty()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v2, v0}, Lcom/tencent/stat/n;->b(Ljava/util/List;I)V
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/tencent/stat/x;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/tencent/stat/x;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_2
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     sget-object v1, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :cond_4
a=0;//     :try_start_3
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/util/ArrayList;);v2=(Reference,Ljava/util/ArrayList;);v3=(Reference,Ljava/util/Iterator;);v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/tencent/stat/d;->b()Lcom/tencent/stat/d;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/d;);
a=0;//     new-instance v3, Lcom/tencent/stat/u;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/tencent/stat/u;);
a=0;//     invoke-direct {v3, p0, v2, p1}, Lcom/tencent/stat/u;-><init>(Lcom/tencent/stat/n;Ljava/util/List;I)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/tencent/stat/u;);
a=0;//     invoke-virtual {v0, v1, v3}, Lcom/tencent/stat/d;->b(Ljava/util/List;Lcom/tencent/stat/c;)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_0
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private declared-synchronized b(Lcom/tencent/stat/a/e;Lcom/tencent/stat/c;)V
a=0;//     .locals 6
a=0;// 
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->getMaxStoreEventCount()I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_1
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gtz v0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     iget-object v0, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/w;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/stat/w;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V
a=0;// 
a=0;//     iget v0, p0, Lcom/tencent/stat/n;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->getMaxStoreEventCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-le v0, v1, :cond_1
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     const-string v1, "Too many events stored in db."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->warn(Ljava/lang/Object;)V
a=0;// 
a=0;//     iget v0, p0, Lcom/tencent/stat/n;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/tencent/stat/w;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "events"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "event_id in (select event_id from events where timestamp in (select min(timestamp) from events) limit 1)"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v1, v2, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-int/2addr v0, v1
a=0;// 
a=0;//     iput v0, p0, Lcom/tencent/stat/n;->b:I
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     new-instance v0, Landroid/content/ContentValues;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/ContentValues;);
a=0;//     invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/ContentValues;);
a=0;//     invoke-virtual {p1}, Lcom/tencent/stat/a/e;->d()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Lcom/tencent/stat/common/k;->c(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "content"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v2, "send_count"
a=0;// 
a=0;//     const-string v3, "0"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v2, "status"
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v2, "timestamp"
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/tencent/stat/a/e;->b()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Long;);
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V
a=0;// 
a=0;//     iget-object v2, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/tencent/stat/w;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "events"
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v2, v3, v4, v0}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const-wide/16 v4, -0x1
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     cmp-long v0, v2, v4
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Failed to store event:"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     :try_start_2
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/stat/w;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     :try_start_3
a=0;//     #v0=(Byte);v2=(LongLo);v3=(LongHi);
a=0;//     iget v0, p0, Lcom/tencent/stat/n;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     iput v0, p0, Lcom/tencent/stat/n;->b:I
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/w;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/stat/w;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
a=0;// 
a=0;//     if-eqz p2, :cond_2
a=0;// 
a=0;//     invoke-interface {p2}, Lcom/tencent/stat/c;->a()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_1
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_4
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     sget-object v1, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     :try_start_5
a=0;//     iget-object v0, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/stat/w;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_2
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_1
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catch_2
a=0;//     move-exception v0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_6
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     iget-object v1, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/w;);
a=0;//     invoke-virtual {v1}, Lcom/tencent/stat/w;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
a=0;//     :try_end_6
a=0;//     .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_3
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_1
a=0;// 
a=0;//     :goto_2
a=0;//     :try_start_7
a=0;//     throw v0
a=0;//     :try_end_7
a=0;//     .catchall {:try_start_7 .. :try_end_7} :catchall_1
a=0;// 
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :catch_3
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private declared-synchronized b(Lcom/tencent/stat/b;)V
a=0;//     .locals 13
a=0;// 
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {p1}, Lcom/tencent/stat/b;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v11}, Lcom/tencent/stat/common/k;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v12, Landroid/content/ContentValues;
a=0;// 
a=0;//     #v12=(UninitRef,Landroid/content/ContentValues;);
a=0;//     invoke-direct {v12}, Landroid/content/ContentValues;-><init>()V
a=0;// 
a=0;//     #v12=(Reference,Landroid/content/ContentValues;);
a=0;//     const-string v1, "content"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p1, Lcom/tencent/stat/b;->b:Lorg/json/JSONObject;
a=0;// 
a=0;//     #v2=(Reference,Lorg/json/JSONObject;);
a=0;//     invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v12, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v1, "md5sum"
a=0;// 
a=0;//     invoke-virtual {v12, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     iput-object v0, p1, Lcom/tencent/stat/b;->c:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "version"
a=0;// 
a=0;//     iget v1, p1, Lcom/tencent/stat/b;->d:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v12, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/stat/w;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "config"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
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
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_1
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Conflicted);v2=(Integer);
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-interface {v1, v0}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v2, p1, Lcom/tencent/stat/b;->a:I
a=0;// 
a=0;//     if-ne v0, v2, :cond_0
a=0;// 
a=0;//     move v0, v9
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     if-ne v9, v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/w;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/stat/w;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, "config"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "type=?"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     new-array v4, v4, [Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     iget v6, p1, Lcom/tencent/stat/b;->a:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-static {v6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     aput-object v6, v4, v5
a=0;// 
a=0;//     invoke-virtual {v0, v2, v12, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v2, v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(LongLo);v3=(LongHi);
a=0;//     const-wide/16 v4, -0x1
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     cmp-long v0, v2, v4
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Failed to store cfg:"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_2
a=0;// 
a=0;//     :goto_2
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     :try_start_2
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->close()V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_3
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_2
a=0;//     :try_start_3
a=0;//     #v0=(Boolean);v2=(Integer);v3=(Null);v4=(Null);v5=(Null);v6=(Null);v7=(Null);v11=(Reference,Ljava/lang/String;);v12=(Reference,Landroid/content/ContentValues;);
a=0;//     const-string v0, "type"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget v2, p1, Lcom/tencent/stat/b;->a:I
a=0;// 
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v12, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/stat/w;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, "config"
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3, v12}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Byte);v4=(LongLo);v5=(LongHi);v6=(Reference,Ljava/lang/String;);
a=0;//     sget-object v0, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Sucessed to store cfg:"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lcom/tencent/stat/common/StatLogger;->d(Ljava/lang/Object;)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_0
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_2
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :goto_4
a=0;//     :try_start_4
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);v7=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     sget-object v2, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v2, v0}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_2
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     :try_start_5
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->close()V
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_0
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catchall_0
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v8
a=0;// 
a=0;//     :goto_5
a=0;//     #v1=(Reference,Landroid/database/Cursor;);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     :try_start_6
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     :cond_4
a=0;//     throw v0
a=0;//     :try_end_6
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_0
a=0;// 
a=0;//     :catchall_2
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_5
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v8
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Boolean);v1=(Reference,Landroid/database/Cursor;);v2=(Integer);v3=(Null);v4=(Null);v5=(Null);v6=(Null);v7=(Null);v11=(Reference,Ljava/lang/String;);v12=(Reference,Landroid/content/ContentValues;);
a=0;//     move v0, v10
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private declared-synchronized b(Ljava/util/List;)V
a=0;//     .locals 10
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/tencent/stat/x;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Delete "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {p1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " sent events in thread:"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->i(Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     :try_start_1
a=0;//     iget-object v0, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/stat/w;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V
a=0;// 
a=0;//     invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/tencent/stat/x;
a=0;// 
a=0;//     iget v2, p0, Lcom/tencent/stat/n;->b:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget-object v3, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;
a=0;// 
a=0;//     #v3=(Reference,Lcom/tencent/stat/w;);
a=0;//     invoke-virtual {v3}, Lcom/tencent/stat/w;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "events"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "event_id = ?"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     new-array v6, v6, [Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     iget-wide v8, v0, Lcom/tencent/stat/x;->a:J
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     invoke-static {v8, v9}, Ljava/lang/Long;->toString(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     aput-object v0, v6, v7
a=0;// 
a=0;//     invoke-virtual {v3, v4, v5, v6}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sub-int v0, v2, v0
a=0;// 
a=0;//     iput v0, p0, Lcom/tencent/stat/n;->b:I
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_2
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     sget-object v1, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     :try_start_3
a=0;//     iget-object v0, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/stat/w;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
a=0;//     :try_end_3
a=0;//     .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_2
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     :try_start_4
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/util/Iterator;);
a=0;//     iget-object v0, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/w;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/stat/w;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/stat/w;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "events"
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/database/DatabaseUtils;->queryNumEntries(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     long-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/tencent/stat/n;->b:I
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_0
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_1
a=0;// 
a=0;//     :try_start_5
a=0;//     iget-object v0, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/w;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/stat/w;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
a=0;//     :try_end_5
a=0;//     .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_1
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_6
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteException;);
a=0;//     sget-object v1, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Exception;)V
a=0;//     :try_end_6
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :catch_2
a=0;//     #v1=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_7
a=0;//     sget-object v1, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Exception;)V
a=0;//     :try_end_7
a=0;//     .catchall {:try_start_7 .. :try_end_7} :catchall_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_8
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     iget-object v1, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/w;);
a=0;//     invoke-virtual {v1}, Lcom/tencent/stat/w;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
a=0;//     :try_end_8
a=0;//     .catch Landroid/database/sqlite/SQLiteException; {:try_start_8 .. :try_end_8} :catch_3
a=0;//     .catchall {:try_start_8 .. :try_end_8} :catchall_0
a=0;// 
a=0;//     :goto_2
a=0;//     :try_start_9
a=0;//     throw v0
a=0;// 
a=0;//     :catch_3
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/database/sqlite/SQLiteException;);
a=0;//     sget-object v2, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v2, v1}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Exception;)V
a=0;//     :try_end_9
a=0;//     .catchall {:try_start_9 .. :try_end_9} :catchall_0
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private declared-synchronized b(Ljava/util/List;I)V
a=0;//     .locals 11
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/tencent/stat/x;",
a=0;//             ">;I)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Update "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {p1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " sending events to status:"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " in thread:"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->i(Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_1
a=0;// 
a=0;//     :try_start_1
a=0;//     new-instance v1, Landroid/content/ContentValues;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/ContentValues;);
a=0;//     invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/ContentValues;);
a=0;//     const-string v0, "status"
a=0;// 
a=0;//     invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/stat/w;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V
a=0;// 
a=0;//     invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/tencent/stat/x;
a=0;// 
a=0;//     iget v3, v0, Lcom/tencent/stat/x;->d:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->getMaxSendRetryCount()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-le v3, v4, :cond_1
a=0;// 
a=0;//     iget v3, p0, Lcom/tencent/stat/n;->b:I
a=0;// 
a=0;//     iget-object v4, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;
a=0;// 
a=0;//     #v4=(Reference,Lcom/tencent/stat/w;);
a=0;//     invoke-virtual {v4}, Lcom/tencent/stat/w;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "events"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "event_id=?"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     new-array v7, v7, [Ljava/lang/String;
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     iget-wide v9, v0, Lcom/tencent/stat/x;->a:J
a=0;// 
a=0;//     #v9=(LongLo);v10=(LongHi);
a=0;//     invoke-static {v9, v10}, Ljava/lang/Long;->toString(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     aput-object v0, v7, v8
a=0;// 
a=0;//     invoke-virtual {v4, v5, v6, v7}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sub-int v0, v3, v0
a=0;// 
a=0;//     iput v0, p0, Lcom/tencent/stat/n;->b:I
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_2
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     sget-object v1, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     :try_start_3
a=0;//     iget-object v0, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/stat/w;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
a=0;//     :try_end_3
a=0;//     .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_2
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_1
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_4
a=0;//     #v1=(Reference,Landroid/content/ContentValues;);v3=(Integer);v4=(Integer);
a=0;//     const-string v3, "send_count"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget v4, v0, Lcom/tencent/stat/x;->d:I
a=0;// 
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v1, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
a=0;// 
a=0;//     sget-object v3, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "Update event:"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-wide v5, v0, Lcom/tencent/stat/x;->a:J
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, " for content:"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Lcom/tencent/stat/common/StatLogger;->i(Ljava/lang/Object;)V
a=0;// 
a=0;//     iget-object v3, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/tencent/stat/w;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "events"
a=0;// 
a=0;//     const-string v5, "event_id=?"
a=0;// 
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     new-array v6, v6, [Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     iget-wide v8, v0, Lcom/tencent/stat/x;->a:J
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     invoke-static {v8, v9}, Ljava/lang/Long;->toString(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     aput-object v0, v6, v7
a=0;// 
a=0;//     invoke-virtual {v3, v4, v1, v5, v6}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gtz v0, :cond_0
a=0;// 
a=0;//     sget-object v3, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "Failed to update db, error code:"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_0
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_5
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     iget-object v1, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/w;);
a=0;//     invoke-virtual {v1}, Lcom/tencent/stat/w;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
a=0;//     :try_end_5
a=0;//     .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_3
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_1
a=0;// 
a=0;//     :goto_2
a=0;//     :try_start_6
a=0;//     throw v0
a=0;//     :try_end_6
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_1
a=0;// 
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :cond_2
a=0;//     :try_start_7
a=0;//     #v0=(Boolean);v1=(Reference,Landroid/content/ContentValues;);v2=(Reference,Ljava/util/Iterator;);
a=0;//     iget-object v0, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/w;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/stat/w;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/stat/w;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "events"
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/database/DatabaseUtils;->queryNumEntries(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     long-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/tencent/stat/n;->b:I
a=0;//     :try_end_7
a=0;//     .catch Ljava/lang/Throwable; {:try_start_7 .. :try_end_7} :catch_0
a=0;//     .catchall {:try_start_7 .. :try_end_7} :catchall_0
a=0;// 
a=0;//     :try_start_8
a=0;//     iget-object v0, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/w;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/stat/w;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
a=0;//     :try_end_8
a=0;//     .catch Landroid/database/sqlite/SQLiteException; {:try_start_8 .. :try_end_8} :catch_1
a=0;//     .catchall {:try_start_8 .. :try_end_8} :catchall_1
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_9
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteException;);
a=0;//     sget-object v1, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Exception;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :catch_2
a=0;//     move-exception v0
a=0;// 
a=0;//     sget-object v1, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Exception;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :catch_3
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/database/sqlite/SQLiteException;);
a=0;//     sget-object v2, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Exception;)V
a=0;//     :try_end_9
a=0;//     .catchall {:try_start_9 .. :try_end_9} :catchall_1
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private c(Ljava/util/List;I)V
a=0;//     .locals 10
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/tencent/stat/x;",
a=0;//             ">;I)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v9=(Null);
a=0;//     iget-object v0, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/w;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/stat/w;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "events"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const-string v3, "status=?"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     new-array v4, v4, [Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     invoke-static {v6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     aput-object v6, v4, v5
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const-string v7, "event_id"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v0 .. v8}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     :goto_0
a=0;//     :try_start_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Integer);v6=(Reference,Landroid/database/Cursor;);
a=0;//     invoke-interface {v6}, Landroid/database/Cursor;->moveToNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-interface {v6, v0}, Landroid/database/Cursor;->getLong(I)J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/tencent/stat/common/k;->d(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-interface {v6, v0}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     invoke-interface {v6, v0}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     new-instance v0, Lcom/tencent/stat/x;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/stat/x;);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/tencent/stat/x;-><init>(JLjava/lang/String;II)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/x;);
a=0;//     invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v6
a=0;// 
a=0;//     :goto_1
a=0;//     :try_start_2
a=0;//     #v1=(Reference,Landroid/database/Cursor;);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     sget-object v2, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v2, v0}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_2
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v3=(Reference,Ljava/lang/String;);v5=(Integer);v6=(Reference,Landroid/database/Cursor;);v7=(Reference,Ljava/lang/String;);v8=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     invoke-interface {v6}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :goto_3
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);v9=(Reference,Landroid/database/Cursor;);
a=0;//     if-eqz v9, :cond_2
a=0;// 
a=0;//     invoke-interface {v9}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     :cond_2
a=0;//     throw v0
a=0;// 
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);v3=(Reference,Ljava/lang/String;);v5=(Integer);v6=(Reference,Landroid/database/Cursor;);v7=(Reference,Ljava/lang/String;);v8=(Reference,Ljava/lang/String;);v9=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v9, v6
a=0;// 
a=0;//     #v9=(Reference,Landroid/database/Cursor;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catchall_2
a=0;//     #v1=(Reference,Landroid/database/Cursor;);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v9, v1
a=0;// 
a=0;//     #v9=(Reference,Landroid/database/Cursor;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v9=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v9
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic d()Lcom/tencent/stat/common/StatLogger;
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private e()V
a=0;//     .locals 8
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v0, Landroid/content/ContentValues;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/ContentValues;);
a=0;//     invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/ContentValues;);
a=0;//     const-string v1, "status"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/tencent/stat/w;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "events"
a=0;// 
a=0;//     const-string v3, "status=?"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     new-array v4, v4, [Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const-wide/16 v6, 0x2
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     invoke-static {v6, v7}, Ljava/lang/Long;->toString(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     aput-object v6, v4, v5
a=0;// 
a=0;//     invoke-virtual {v1, v2, v0, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/stat/w;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "events"
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/database/DatabaseUtils;->queryNumEntries(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     long-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/tencent/stat/n;->b:I
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Total "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget v2, p0, Lcom/tencent/stat/n;->b:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " unsent events."
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->i(Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     sget-object v1, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private f()V
a=0;//     .locals 9
a=0;// 
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v8=(Null);
a=0;//     iget-object v0, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/w;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/stat/w;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "keyvalues"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
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
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     :try_start_1
a=0;//     #v2=(Reference,Ljava/lang/String;);v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/stat/n;->g:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-interface {v1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :goto_1
a=0;//     :try_start_2
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     sget-object v2, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v2, v0}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v3=(Reference,Ljava/lang/String;);v4=(Null);v5=(Null);v6=(Null);v7=(Null);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v8
a=0;// 
a=0;//     :goto_3
a=0;//     #v1=(Reference,Landroid/database/Cursor;);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     :cond_2
a=0;//     throw v0
a=0;// 
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v8
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a()I
a=0;//     .locals 1
a=0;// 
a=0;//     iget v0, p0, Lcom/tencent/stat/n;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method a(I)V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/stat/n;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     new-instance v1, Lcom/tencent/stat/v;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/stat/v;);
a=0;//     invoke-direct {v1, p0, p1}, Lcom/tencent/stat/v;-><init>(Lcom/tencent/stat/n;I)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/v;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method a(Lcom/tencent/stat/a/e;Lcom/tencent/stat/c;)V
a=0;//     .locals 4
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->isEnableStatService()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Thread;->getId()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iget-object v2, p0, Lcom/tencent/stat/n;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v2}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/Thread;->getId()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     invoke-direct {p0, p1, p2}, Lcom/tencent/stat/n;->b(Lcom/tencent/stat/a/e;Lcom/tencent/stat/c;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     sget-object v1, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v0=(Byte);v1=(LongHi);v2=(LongLo);v3=(LongHi);
a=0;//     iget-object v0, p0, Lcom/tencent/stat/n;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     new-instance v1, Lcom/tencent/stat/r;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/stat/r;);
a=0;//     invoke-direct {v1, p0, p1, p2}, Lcom/tencent/stat/r;-><init>(Lcom/tencent/stat/n;Lcom/tencent/stat/a/e;Lcom/tencent/stat/c;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/r;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method a(Lcom/tencent/stat/b;)V
a=0;//     .locals 2
a=0;// 
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/tencent/stat/n;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     new-instance v1, Lcom/tencent/stat/s;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/stat/s;);
a=0;//     invoke-direct {v1, p0, p1}, Lcom/tencent/stat/s;-><init>(Lcom/tencent/stat/n;Lcom/tencent/stat/b;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/s;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method a(Ljava/util/List;)V
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/tencent/stat/x;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Thread;->getId()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iget-object v2, p0, Lcom/tencent/stat/n;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v2}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/Thread;->getId()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lcom/tencent/stat/n;->b(Ljava/util/List;)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Byte);v1=(LongHi);v2=(LongLo);v3=(LongHi);
a=0;//     iget-object v0, p0, Lcom/tencent/stat/n;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     new-instance v1, Lcom/tencent/stat/q;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/stat/q;);
a=0;//     invoke-direct {v1, p0, p1}, Lcom/tencent/stat/q;-><init>(Lcom/tencent/stat/n;Ljava/util/List;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/q;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;//     :try_end_0
a=0;//     .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/sqlite/SQLiteException;);
a=0;//     sget-object v1, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Exception;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method a(Ljava/util/List;I)V
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/tencent/stat/x;",
a=0;//             ">;I)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Thread;->getId()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iget-object v2, p0, Lcom/tencent/stat/n;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v2}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/Thread;->getId()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-direct {p0, p1, p2}, Lcom/tencent/stat/n;->b(Ljava/util/List;I)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Byte);v1=(LongHi);v2=(LongLo);v3=(LongHi);
a=0;//     iget-object v0, p0, Lcom/tencent/stat/n;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     new-instance v1, Lcom/tencent/stat/p;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/stat/p;);
a=0;//     invoke-direct {v1, p0, p1, p2}, Lcom/tencent/stat/p;-><init>(Lcom/tencent/stat/n;Ljava/util/List;I)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/p;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     sget-object v1, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized b(Landroid/content/Context;)Lcom/tencent/stat/DeviceInfo;
a=0;//     .locals 17
a=0;// 
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/n;);
a=0;//     iget-object v1, v0, Lcom/tencent/stat/n;->c:Lcom/tencent/stat/DeviceInfo;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/DeviceInfo;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/tencent/stat/n;->c:Lcom/tencent/stat/DeviceInfo;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-object v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v10=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/tencent/stat/w;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "user"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
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
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     invoke-virtual/range {v1 .. v9}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/database/Cursor;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :try_start_2
a=0;//     #v1=(Null);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     invoke-interface {v4}, Landroid/database/Cursor;->moveToNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     invoke-interface {v4, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v9}, Lcom/tencent/stat/common/k;->d(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-interface {v4, v1}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-interface {v4, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     invoke-interface {v4, v1}, Landroid/database/Cursor;->getLong(I)J
a=0;// 
a=0;//     move-result-wide v10
a=0;// 
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v12
a=0;// 
a=0;//     #v12=(LongLo);v13=(LongHi);
a=0;//     const-wide/16 v14, 0x3e8
a=0;// 
a=0;//     #v14=(LongLo);v15=(LongHi);
a=0;//     div-long/2addr v12, v14
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-eq v8, v1, :cond_f
a=0;// 
a=0;//     const-wide/16 v14, 0x3e8
a=0;// 
a=0;//     mul-long/2addr v10, v14
a=0;// 
a=0;//     invoke-static {v10, v11}, Lcom/tencent/stat/common/k;->a(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-wide/16 v10, 0x3e8
a=0;// 
a=0;//     mul-long/2addr v10, v12
a=0;// 
a=0;//     invoke-static {v10, v11}, Lcom/tencent/stat/common/k;->a(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_f
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Integer);
a=0;//     invoke-static/range {p1 .. p1}, Lcom/tencent/stat/common/k;->r(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_e
a=0;// 
a=0;//     or-int/lit8 v1, v1, 0x2
a=0;// 
a=0;//     move v7, v1
a=0;// 
a=0;//     :goto_2
a=0;//     #v7=(Integer);
a=0;//     const-string v1, ","
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     if-eqz v10, :cond_7
a=0;// 
a=0;//     array-length v1, v10
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_7
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     aget-object v2, v10, v1
a=0;// 
a=0;//     #v2=(Null);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v11, 0xb
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     if-ge v1, v11, :cond_d
a=0;// 
a=0;//     :cond_1
a=0;//     #v11=(Conflicted);
a=0;//     invoke-static/range {p1 .. p1}, Lcom/tencent/stat/common/k;->l(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_c
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     const/16 v14, 0xa
a=0;// 
a=0;//     #v14=(PosByte);
a=0;//     if-le v11, v14, :cond_c
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     :goto_3
a=0;//     #v2=(Boolean);v11=(Conflicted);v14=(Conflicted);
a=0;//     move-object v3, v6
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v6, v1
a=0;// 
a=0;//     :goto_4
a=0;//     #v1=(Conflicted);v16=(Conflicted);
a=0;//     if-eqz v10, :cond_8
a=0;// 
a=0;//     array-length v1, v10
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v11, 0x2
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     if-lt v1, v11, :cond_8
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     aget-object v1, v10, v1
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v10, ","
a=0;// 
a=0;//     invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_5
a=0;//     #v1=(Reference,Ljava/lang/String;);v10=(Conflicted);v11=(Conflicted);
a=0;//     new-instance v10, Lcom/tencent/stat/DeviceInfo;
a=0;// 
a=0;//     #v10=(UninitRef,Lcom/tencent/stat/DeviceInfo;);
a=0;//     invoke-direct {v10, v6, v1, v7}, Lcom/tencent/stat/DeviceInfo;-><init>(Ljava/lang/String;Ljava/lang/String;I)V
a=0;// 
a=0;//     #v10=(Reference,Lcom/tencent/stat/DeviceInfo;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v10, v0, Lcom/tencent/stat/n;->c:Lcom/tencent/stat/DeviceInfo;
a=0;// 
a=0;//     new-instance v1, Landroid/content/ContentValues;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/ContentValues;);
a=0;//     invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/ContentValues;);
a=0;//     invoke-static {v3}, Lcom/tencent/stat/common/k;->c(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v6, "uid"
a=0;// 
a=0;//     invoke-virtual {v1, v6, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v3, "user_type"
a=0;// 
a=0;//     invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v1, v3, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
a=0;// 
a=0;//     const-string v3, "app_ver"
a=0;// 
a=0;//     invoke-static/range {p1 .. p1}, Lcom/tencent/stat/common/k;->r(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v1, v3, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v3, "ts"
a=0;// 
a=0;//     invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v1, v3, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V
a=0;// 
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/stat/w;);
a=0;//     invoke-virtual {v2}, Lcom/tencent/stat/w;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "user"
a=0;// 
a=0;//     const-string v6, "uid=?"
a=0;// 
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     new-array v10, v10, [Ljava/lang/String;
a=0;// 
a=0;//     #v10=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     aput-object v9, v10, v11
a=0;// 
a=0;//     invoke-virtual {v2, v3, v1, v6, v10}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
a=0;// 
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);v11=(Conflicted);
a=0;//     if-eq v7, v8, :cond_b
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/stat/w;);
a=0;//     invoke-virtual {v2}, Lcom/tencent/stat/w;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "user"
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {v2, v3, v6, v1}, Landroid/database/sqlite/SQLiteDatabase;->replace(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
a=0;// 
a=0;//     move v1, v5
a=0;// 
a=0;//     :cond_4
a=0;//     :goto_6
a=0;//     #v1=(Boolean);v2=(Conflicted);v5=(Boolean);v6=(Reference,Ujava/lang/Object;);v12=(Conflicted);v13=(Conflicted);v15=(Conflicted);
a=0;//     if-nez v1, :cond_5
a=0;// 
a=0;//     invoke-static/range {p1 .. p1}, Lcom/tencent/stat/common/k;->b(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {p1 .. p1}, Lcom/tencent/stat/common/k;->c(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-eqz v3, :cond_a
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_a
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v5, ","
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_7
a=0;//     #v5=(Conflicted);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     const-wide/16 v8, 0x3e8
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     div-long/2addr v6, v8
a=0;// 
a=0;//     invoke-static/range {p1 .. p1}, Lcom/tencent/stat/common/k;->r(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     new-instance v9, Landroid/content/ContentValues;
a=0;// 
a=0;//     #v9=(UninitRef,Landroid/content/ContentValues;);
a=0;//     invoke-direct {v9}, Landroid/content/ContentValues;-><init>()V
a=0;// 
a=0;//     #v9=(Reference,Landroid/content/ContentValues;);
a=0;//     invoke-static {v1}, Lcom/tencent/stat/common/k;->c(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v10, "uid"
a=0;// 
a=0;//     invoke-virtual {v9, v10, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v1, "user_type"
a=0;// 
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v9, v1, v10}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
a=0;// 
a=0;//     const-string v1, "app_ver"
a=0;// 
a=0;//     invoke-virtual {v9, v1, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v1, "ts"
a=0;// 
a=0;//     invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Long;);
a=0;//     invoke-virtual {v9, v1, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/tencent/stat/w;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v6, "user"
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v1, v6, v7, v9}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
a=0;// 
a=0;//     new-instance v1, Lcom/tencent/stat/DeviceInfo;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/stat/DeviceInfo;);
a=0;//     invoke-direct {v1, v2, v3, v5}, Lcom/tencent/stat/DeviceInfo;-><init>(Ljava/lang/String;Ljava/lang/String;I)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/DeviceInfo;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v1, v0, Lcom/tencent/stat/n;->c:Lcom/tencent/stat/DeviceInfo;
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_2
a=0;// 
a=0;//     :cond_5
a=0;//     #v1=(Conflicted);v2=(Conflicted);v5=(Boolean);v7=(Integer);v8=(Conflicted);
a=0;//     if-eqz v4, :cond_6
a=0;// 
a=0;//     :try_start_3
a=0;//     invoke-interface {v4}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     :cond_6
a=0;//     :goto_8
a=0;//     #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/tencent/stat/n;->c:Lcom/tencent/stat/DeviceInfo;
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/DeviceInfo;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_7
a=0;//     :try_start_4
a=0;//     #v1=(Conflicted);v2=(Boolean);v3=(Null);v4=(Reference,Landroid/database/Cursor;);v5=(One);v6=(Reference,Ljava/lang/String;);v7=(Integer);v8=(Integer);v9=(Reference,Ljava/lang/String;);v10=(Reference,[Ljava/lang/String;);v11=(LongHi);v12=(LongLo);v13=(LongHi);v14=(LongLo);v15=(LongHi);v16=(Uninit);
a=0;//     invoke-static/range {p1 .. p1}, Lcom/tencent/stat/common/k;->b(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     move-object v6, v2
a=0;// 
a=0;//     move/from16 v16, v3
a=0;// 
a=0;//     #v16=(One);
a=0;//     move-object v3, v2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move/from16 v2, v16
a=0;// 
a=0;//     #v2=(One);
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     :cond_8
a=0;//     #v2=(Boolean);v11=(Conflicted);v14=(Conflicted);v16=(Conflicted);
a=0;//     invoke-static/range {p1 .. p1}, Lcom/tencent/stat/common/k;->c(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     if-lez v10, :cond_2
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ","
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_1
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_2
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Null);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     move-object v2, v10
a=0;// 
a=0;//     :goto_9
a=0;//     :try_start_5
a=0;//     #v2=(Reference,Landroid/database/Cursor;);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);
a=0;//     sget-object v3, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v3=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v3, v1}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_3
a=0;// 
a=0;//     if-eqz v2, :cond_6
a=0;// 
a=0;//     :try_start_6
a=0;//     invoke-interface {v2}, Landroid/database/Cursor;->close()V
a=0;//     :try_end_6
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_0
a=0;// 
a=0;//     goto :goto_8
a=0;// 
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v1
a=0;// 
a=0;//     :catchall_1
a=0;//     #v10=(Null);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     move-object v4, v10
a=0;// 
a=0;//     :goto_a
a=0;//     #v4=(Reference,Landroid/database/Cursor;);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);
a=0;//     if-eqz v4, :cond_9
a=0;// 
a=0;//     :try_start_7
a=0;//     invoke-interface {v4}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     :cond_9
a=0;//     throw v1
a=0;//     :try_end_7
a=0;//     .catchall {:try_start_7 .. :try_end_7} :catchall_0
a=0;// 
a=0;//     :catchall_2
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_a
a=0;// 
a=0;//     :catchall_3
a=0;//     #v2=(Reference,Landroid/database/Cursor;);v4=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     move-object v4, v2
a=0;// 
a=0;//     #v4=(Reference,Landroid/database/Cursor;);
a=0;//     goto :goto_a
a=0;// 
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v2, v4
a=0;// 
a=0;//     #v2=(Reference,Landroid/database/Cursor;);
a=0;//     goto :goto_9
a=0;// 
a=0;//     :cond_a
a=0;//     #v1=(Integer);v3=(Reference,Ljava/lang/String;);v5=(Boolean);v6=(Reference,Ujava/lang/Object;);v7=(Integer);v8=(Integer);v9=(Reference,Ljava/lang/String;);v10=(Reference,Ljava/lang/Object;);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_7
a=0;// 
a=0;//     :cond_b
a=0;//     #v2=(Conflicted);v5=(One);v12=(LongLo);v13=(LongHi);v15=(LongHi);
a=0;//     move v1, v5
a=0;// 
a=0;//     #v1=(One);
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     :cond_c
a=0;//     #v1=(Reference,Ljava/lang/String;);v2=(Null);v3=(Null);v16=(Uninit);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move v2, v3
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :cond_d
a=0;//     #v1=(Integer);v11=(PosByte);v14=(LongLo);
a=0;//     move-object/from16 v16, v2
a=0;// 
a=0;//     #v16=(Null);
a=0;//     move v2, v3
a=0;// 
a=0;//     move-object v3, v6
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v6, v16
a=0;// 
a=0;//     #v6=(Null);
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     :cond_e
a=0;//     #v2=(Boolean);v6=(Reference,Ljava/lang/String;);v7=(Null);v10=(LongLo);v11=(LongHi);v16=(Uninit);
a=0;//     move v7, v1
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :cond_f
a=0;//     #v1=(Boolean);v2=(Reference,Ljava/lang/String;);v7=(Null);
a=0;//     move v1, v8
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     goto/16 :goto_1
a=0;// .end method
a=0;// 
a=0;// .method c()V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/stat/n;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     new-instance v1, Lcom/tencent/stat/t;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/stat/t;);
a=0;//     invoke-direct {v1, p0}, Lcom/tencent/stat/t;-><init>(Lcom/tencent/stat/n;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/t;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
