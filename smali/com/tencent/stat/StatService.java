package com.tencent.stat; class StatService { void a() { int a;
a=0;// .class public Lcom/tencent/stat/StatService;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:Landroid/os/Handler;
a=0;// 
a=0;// .field private static volatile b:Ljava/util/Map;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Lcom/tencent/stat/a/c;",
a=0;//             "Ljava/lang/Long;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private static volatile c:J
a=0;// 
a=0;// .field private static volatile d:J
a=0;// 
a=0;// .field private static volatile e:I
a=0;// 
a=0;// .field private static volatile f:Ljava/lang/String;
a=0;// 
a=0;// .field private static volatile g:Ljava/lang/String;
a=0;// 
a=0;// .field private static h:Ljava/util/Map;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Long;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private static i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;// .field private static j:Ljava/lang/Thread$UncaughtExceptionHandler;
a=0;// 
a=0;// .field private static volatile k:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 3
a=0;// 
a=0;//     const-wide/16 v1, 0x0
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/ConcurrentHashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/ConcurrentHashMap;);
a=0;//     sput-object v0, Lcom/tencent/stat/StatService;->b:Ljava/util/Map;
a=0;// 
a=0;//     sput-wide v1, Lcom/tencent/stat/StatService;->c:J
a=0;// 
a=0;//     sput-wide v1, Lcom/tencent/stat/StatService;->d:J
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput v0, Lcom/tencent/stat/StatService;->e:I
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Lcom/tencent/stat/StatService;->f:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     sput-object v0, Lcom/tencent/stat/StatService;->g:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/ConcurrentHashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/ConcurrentHashMap;);
a=0;//     sput-object v0, Lcom/tencent/stat/StatService;->h:Ljava/util/Map;
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/common/k;->b()Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/tencent/stat/StatService;->j:Ljava/lang/Thread$UncaughtExceptionHandler;
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     sput-boolean v0, Lcom/tencent/stat/StatService;->k:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/stat/StatService;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static a(Landroid/content/Context;Z)I
a=0;//     .locals 9
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     if-eqz p1, :cond_7
a=0;// 
a=0;//     sget-wide v5, Lcom/tencent/stat/StatService;->c:J
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     sub-long v5, v3, v5
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->getSessionTimoutMillis()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v7, v0
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     cmp-long v0, v5, v7
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-ltz v0, :cond_7
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     sput-wide v3, Lcom/tencent/stat/StatService;->c:J
a=0;// 
a=0;//     sget-wide v5, Lcom/tencent/stat/StatService;->d:J
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     const-wide/16 v7, 0x0
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     cmp-long v5, v5, v7
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-nez v5, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/common/k;->c()J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     #v5=(LongLo);
a=0;//     sput-wide v5, Lcom/tencent/stat/StatService;->d:J
a=0;// 
a=0;//     :cond_0
a=0;//     #v5=(Conflicted);
a=0;//     sget-wide v5, Lcom/tencent/stat/StatService;->d:J
a=0;// 
a=0;//     #v5=(LongLo);
a=0;//     cmp-long v3, v3, v5
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-ltz v3, :cond_2
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/common/k;->c()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);
a=0;//     sput-wide v3, Lcom/tencent/stat/StatService;->d:J
a=0;// 
a=0;//     invoke-static {p0}, Lcom/tencent/stat/n;->a(Landroid/content/Context;)Lcom/tencent/stat/n;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/n;);
a=0;//     invoke-virtual {v0, p0}, Lcom/tencent/stat/n;->b(Landroid/content/Context;)Lcom/tencent/stat/DeviceInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/stat/DeviceInfo;->getUserType()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq v0, v1, :cond_1
a=0;// 
a=0;//     invoke-static {p0}, Lcom/tencent/stat/n;->a(Landroid/content/Context;)Lcom/tencent/stat/n;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/n;);
a=0;//     invoke-virtual {v0, p0}, Lcom/tencent/stat/n;->b(Landroid/content/Context;)Lcom/tencent/stat/DeviceInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/DeviceInfo;->b(I)V
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     invoke-static {v2}, Lcom/tencent/stat/StatConfig;->b(I)V
a=0;// 
a=0;//     invoke-static {p0}, Lcom/tencent/stat/StatMid;->a(Landroid/content/Context;)Lcom/tencent/stat/DeviceInfo;
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v3=(Conflicted);
a=0;//     sget-boolean v3, Lcom/tencent/stat/StatService;->k:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_6
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->e()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->getMaxDaySessionNumbers()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_5
a=0;// 
a=0;//     invoke-static {p0}, Lcom/tencent/stat/common/k;->F(Landroid/content/Context;)V
a=0;// 
a=0;//     invoke-static {p0}, Lcom/tencent/stat/StatService;->d(Landroid/content/Context;)V
a=0;// 
a=0;//     :cond_3
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     sget-boolean v0, Lcom/tencent/stat/StatService;->k:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     invoke-static {p0}, Lcom/tencent/stat/common/f;->b(Landroid/content/Context;)V
a=0;// 
a=0;//     invoke-static {p0}, Lcom/tencent/stat/StatService;->testSpeed(Landroid/content/Context;)V
a=0;// 
a=0;//     invoke-static {p0}, Lcom/tencent/stat/StatService;->e(Landroid/content/Context;)V
a=0;// 
a=0;//     sput-boolean v2, Lcom/tencent/stat/StatService;->k:Z
a=0;// 
a=0;//     :cond_4
a=0;//     sget v0, Lcom/tencent/stat/StatService;->e:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_5
a=0;//     #v1=(Integer);
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     const-string v1, "Exceed StatConfig.getMaxDaySessionNumbers()."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Boolean);v1=(One);
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Conflicted);v1=(One);v3=(LongLo);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static a()Lorg/json/JSONObject;
a=0;//     .locals 4
a=0;// 
a=0;//     new-instance v1, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     new-instance v0, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     sget-object v2, Lcom/tencent/stat/StatConfig;->b:Lcom/tencent/stat/b;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/stat/b;);
a=0;//     iget v2, v2, Lcom/tencent/stat/b;->d:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     const-string v2, "v"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     sget-object v3, Lcom/tencent/stat/StatConfig;->b:Lcom/tencent/stat/b;
a=0;// 
a=0;//     #v3=(Reference,Lcom/tencent/stat/b;);
a=0;//     iget v3, v3, Lcom/tencent/stat/b;->d:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     sget-object v2, Lcom/tencent/stat/StatConfig;->b:Lcom/tencent/stat/b;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/stat/b;);
a=0;//     iget v2, v2, Lcom/tencent/stat/b;->a:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     new-instance v0, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     sget-object v2, Lcom/tencent/stat/StatConfig;->a:Lcom/tencent/stat/b;
a=0;// 
a=0;//     iget v2, v2, Lcom/tencent/stat/b;->d:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     const-string v2, "v"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     sget-object v3, Lcom/tencent/stat/StatConfig;->a:Lcom/tencent/stat/b;
a=0;// 
a=0;//     #v3=(Reference,Lcom/tencent/stat/b;);
a=0;//     iget v3, v3, Lcom/tencent/stat/b;->d:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     sget-object v2, Lcom/tencent/stat/StatConfig;->a:Lcom/tencent/stat/b;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/stat/b;);
a=0;//     iget v2, v2, Lcom/tencent/stat/b;->a:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     return-object v1
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONException;);
a=0;//     sget-object v2, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v2, v0}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Exception;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static declared-synchronized a(Landroid/content/Context;)V
a=0;//     .locals 3
a=0;// 
a=0;//     const-class v1, Lcom/tencent/stat/StatService;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);v2=(Uninit);
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-static {p0}, Lcom/tencent/stat/StatService;->b(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {p0}, Lcom/tencent/stat/common/f;->a(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     const-string v2, "ooh, Compatibility problem was found in this device!"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     const-string v2, "If you are on debug mode, please delete apk and try again."
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v0}, Lcom/tencent/stat/StatConfig;->setEnableStatService(Z)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v0=(Boolean);v2=(Uninit);
a=0;//     new-instance v0, Landroid/os/HandlerThread;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/HandlerThread;);
a=0;//     const-string v2, "StatService"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/HandlerThread;);
a=0;//     invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V
a=0;// 
a=0;//     new-instance v2, Landroid/os/Handler;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/os/Handler;);
a=0;//     invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Handler;);
a=0;//     sput-object v2, Lcom/tencent/stat/StatService;->a:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-static {p0}, Lcom/tencent/stat/n;->a(Landroid/content/Context;)Lcom/tencent/stat/n;
a=0;// 
a=0;//     invoke-static {p0}, Lcom/tencent/stat/d;->a(Landroid/content/Context;)V
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/d;->b()Lcom/tencent/stat/d;
a=0;// 
a=0;//     invoke-static {p0}, Lcom/tencent/stat/StatConfig;->getDeviceInfo(Landroid/content/Context;)Lcom/tencent/stat/DeviceInfo;
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/tencent/stat/StatService;->j:Ljava/lang/Thread$UncaughtExceptionHandler;
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->isAutoExceptionCaught()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     new-instance v2, Lcom/tencent/stat/g;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/tencent/stat/g;);
a=0;//     invoke-direct {v2, v0}, Lcom/tencent/stat/g;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/stat/g;);
a=0;//     invoke-static {v2}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V
a=0;// 
a=0;//     :goto_1
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->getStatSendStrategy()Lcom/tencent/stat/StatReportStrategy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v2, Lcom/tencent/stat/StatReportStrategy;->APP_LAUNCH:Lcom/tencent/stat/StatReportStrategy;
a=0;// 
a=0;//     if-ne v0, v2, :cond_3
a=0;// 
a=0;//     invoke-static {p0}, Lcom/tencent/stat/common/k;->h(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-static {p0}, Lcom/tencent/stat/n;->a(Landroid/content/Context;)Lcom/tencent/stat/n;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/n;);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     invoke-virtual {v0, v2}, Lcom/tencent/stat/n;->a(I)V
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     const-string v2, "Init MTA StatService success."
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Lcom/tencent/stat/common/StatLogger;->d(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Boolean);
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     const-string v2, "MTA SDK AutoExceptionCaught is disable"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lcom/tencent/stat/common/StatLogger;->warn(Ljava/lang/Object;)V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method static a(Landroid/content/Context;Ljava/lang/Throwable;)V
a=0;//     .locals 4
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->isEnableStatService()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     if-nez p0, :cond_2
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     const-string v1, "The Context of StatService.reportSdkSelfException() can not be null!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     sget-object v1, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "reportSdkSelfException error: "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     new-instance v0, Lcom/tencent/stat/a/d;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/stat/a/d;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {p0, v1}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Z)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0x63
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-direct {v0, p0, v1, v2, p1}, Lcom/tencent/stat/a/d;-><init>(Landroid/content/Context;IILjava/lang/Throwable;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/a/d;);
a=0;//     invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v2, Lcom/tencent/stat/k;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/tencent/stat/k;);
a=0;//     invoke-direct {v2, v0}, Lcom/tencent/stat/k;-><init>(Lcom/tencent/stat/a/e;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/stat/k;);
a=0;//     invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static a(Landroid/content/Context;Ljava/util/Map;)V
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/content/Context;",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "*>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->isEnableStatService()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     if-nez p0, :cond_2
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     const-string v1, "The Context of StatService.sendAdditionEvent() can not be null!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     :try_start_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     new-instance v0, Lcom/tencent/stat/a/a;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/stat/a/a;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {p0, v1}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Z)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {v0, p0, v1, p1}, Lcom/tencent/stat/a/a;-><init>(Landroid/content/Context;ILjava/util/Map;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/a/a;);
a=0;//     invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v2, Lcom/tencent/stat/k;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/tencent/stat/k;);
a=0;//     invoke-direct {v2, v0}, Lcom/tencent/stat/k;-><init>(Lcom/tencent/stat/a/e;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/stat/k;);
a=0;//     invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     sget-object v1, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static a(Ljava/lang/String;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b()Lcom/tencent/stat/common/StatLogger;
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static b(Landroid/content/Context;)Z
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sget-object v1, Lcom/tencent/stat/StatConfig;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-static {p0, v1, v2, v3}, Lcom/tencent/stat/common/p;->a(Landroid/content/Context;Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     const-string v3, "1.6.2"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3}, Lcom/tencent/stat/common/k;->b(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     cmp-long v1, v3, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-gtz v1, :cond_0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/stat/StatConfig;->setEnableStatService(Z)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Null);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static c(Landroid/content/Context;)Landroid/os/Handler;
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-static {p0}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;)V
a=0;// 
a=0;//     :cond_0
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->a:Landroid/os/Handler;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c()Ljava/lang/Thread$UncaughtExceptionHandler;
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->j:Ljava/lang/Thread$UncaughtExceptionHandler;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Thread$UncaughtExceptionHandler;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static commitEvents(Landroid/content/Context;I)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->isEnableStatService()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     const-string v1, "The Context of StatService.commitEvents() can not be null!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lt p1, v0, :cond_2
a=0;// 
a=0;//     if-nez p1, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     const-string v1, "The maxNumber of StatService.commitEvents() should be -1 or bigger than 0."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     :try_start_0
a=0;//     #v0=(Byte);v1=(Uninit);
a=0;//     invoke-static {p0}, Lcom/tencent/stat/n;->a(Landroid/content/Context;)Lcom/tencent/stat/n;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/n;);
a=0;//     invoke-virtual {v0, p1}, Lcom/tencent/stat/n;->a(I)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     sget-object v1, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static d(Landroid/content/Context;)V
a=0;//     .locals 5
a=0;// 
a=0;//     invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     const-string v1, "start new session."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->d(Ljava/lang/Object;)V
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/common/k;->a()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sput v0, Lcom/tencent/stat/StatService;->e:I
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v0}, Lcom/tencent/stat/StatConfig;->a(I)V
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->d()V
a=0;// 
a=0;//     invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     new-instance v1, Lcom/tencent/stat/k;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/stat/k;);
a=0;//     new-instance v2, Lcom/tencent/stat/a/k;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/tencent/stat/a/k;);
a=0;//     sget v3, Lcom/tencent/stat/StatService;->e:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {}, Lcom/tencent/stat/StatService;->a()Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v2, p0, v3, v4}, Lcom/tencent/stat/a/k;-><init>(Landroid/content/Context;ILorg/json/JSONObject;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/stat/a/k;);
a=0;//     invoke-direct {v1, v2}, Lcom/tencent/stat/k;-><init>(Lcom/tencent/stat/a/e;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/k;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static e(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->isEnableStatService()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     if-nez p0, :cond_2
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     const-string v1, "The Context of StatService.reportNativeCrash() can not be null!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     :try_start_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Lcom/tencent/stat/i;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/stat/i;);
a=0;//     invoke-direct {v1, p0}, Lcom/tencent/stat/i;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/i;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     sget-object v1, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static onPause(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->isEnableStatService()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     const-string v1, "The Context of StatService.onPause() can not be null!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     invoke-static {p0}, Lcom/tencent/stat/common/k;->k(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v0}, Lcom/tencent/stat/StatService;->trackEndPage(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static onResume(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->isEnableStatService()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     const-string v1, "The Context of StatService.onResume() can not be null!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     invoke-static {p0}, Lcom/tencent/stat/common/k;->k(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v0}, Lcom/tencent/stat/StatService;->trackBeginPage(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static reportAppMonitorStat(Landroid/content/Context;Lcom/tencent/stat/StatAppMonitor;)V
a=0;//     .locals 3
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->isEnableStatService()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     if-nez p0, :cond_2
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     const-string v1, "The Context of StatService.reportAppMonitorStat() can not be null!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     if-nez p1, :cond_3
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     const-string v1, "The StatAppMonitor of StatService.reportAppMonitorStat() can not be null!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     invoke-virtual {p1}, Lcom/tencent/stat/StatAppMonitor;->getInterfaceName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     const-string v1, "The interfaceName of StatAppMonitor on StatService.reportAppMonitorStat() can not be null!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     :try_start_0
a=0;//     #v1=(Uninit);
a=0;//     new-instance v0, Lcom/tencent/stat/a/h;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/stat/a/h;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {p0, v1}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Z)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {v0, p0, v1, p1}, Lcom/tencent/stat/a/h;-><init>(Landroid/content/Context;ILcom/tencent/stat/StatAppMonitor;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/a/h;);
a=0;//     invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v2, Lcom/tencent/stat/k;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/tencent/stat/k;);
a=0;//     invoke-direct {v2, v0}, Lcom/tencent/stat/k;-><init>(Lcom/tencent/stat/a/e;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/stat/k;);
a=0;//     invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     sget-object v1, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static reportError(Landroid/content/Context;Ljava/lang/String;)V
a=0;//     .locals 6
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->isEnableStatService()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     if-nez p0, :cond_2
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     const-string v1, "The Context of StatService.reportError() can not be null!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     invoke-static {p1}, Lcom/tencent/stat/StatService;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     const-string v1, "Error message in StatService.reportError() is empty."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     :try_start_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     new-instance v0, Lcom/tencent/stat/a/d;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/stat/a/d;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {p0, v1}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Z)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->getMaxReportEventLength()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     move-object v3, p1
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/tencent/stat/a/d;-><init>(Landroid/content/Context;ILjava/lang/String;II)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/a/d;);
a=0;//     invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v2, Lcom/tencent/stat/k;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/tencent/stat/k;);
a=0;//     invoke-direct {v2, v0}, Lcom/tencent/stat/k;-><init>(Lcom/tencent/stat/a/e;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/stat/k;);
a=0;//     invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     sget-object v1, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static reportException(Landroid/content/Context;Ljava/lang/Throwable;)V
a=0;//     .locals 3
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->isEnableStatService()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     if-nez p0, :cond_2
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     const-string v1, "The Context of StatService.reportException() can not be null!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     if-nez p1, :cond_3
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     const-string v1, "The Throwable error message of StatService.reportException() can not be null!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     new-instance v0, Lcom/tencent/stat/a/d;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/stat/a/d;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {p0, v1}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Z)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-direct {v0, p0, v1, v2, p1}, Lcom/tencent/stat/a/d;-><init>(Landroid/content/Context;IILjava/lang/Throwable;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/a/d;);
a=0;//     invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v2, Lcom/tencent/stat/k;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/tencent/stat/k;);
a=0;//     invoke-direct {v2, v0}, Lcom/tencent/stat/k;-><init>(Lcom/tencent/stat/a/e;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/stat/k;);
a=0;//     invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static reportGameUser(Landroid/content/Context;Lcom/tencent/stat/StatGameUser;)V
a=0;//     .locals 3
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->isEnableStatService()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     if-nez p0, :cond_2
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     const-string v1, "The Context of StatService.reportGameUser() can not be null!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     if-nez p1, :cond_3
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     const-string v1, "The gameUser of StatService.reportGameUser() can not be null!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     invoke-virtual {p1}, Lcom/tencent/stat/StatGameUser;->getAccount()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/tencent/stat/StatGameUser;->getAccount()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_5
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     const-string v1, "The account of gameUser on StatService.reportGameUser() can not be null or empty!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     :try_start_0
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     new-instance v0, Lcom/tencent/stat/a/g;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/stat/a/g;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {p0, v1}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Z)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {v0, p0, v1, p1}, Lcom/tencent/stat/a/g;-><init>(Landroid/content/Context;ILcom/tencent/stat/StatGameUser;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/a/g;);
a=0;//     invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v2, Lcom/tencent/stat/k;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/tencent/stat/k;);
a=0;//     invoke-direct {v2, v0}, Lcom/tencent/stat/k;-><init>(Lcom/tencent/stat/a/e;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/stat/k;);
a=0;//     invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     sget-object v1, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static reportQQ(Landroid/content/Context;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     const-string p1, ""
a=0;// 
a=0;//     :cond_0
a=0;//     sget-object v0, Lcom/tencent/stat/StatConfig;->d:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     new-instance v0, Ljava/lang/String;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-direct {v0, p1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Lcom/tencent/stat/StatConfig;->d:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0, v0}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Ljava/util/Map;)V
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static setEnvAttributes(Landroid/content/Context;Ljava/util/Map;)V
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/content/Context;",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-interface {p1}, Ljava/util/Map;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x200
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     if-le v0, v1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     const-string v1, "The map in setEnvAttributes can\'t be null or its size can\'t exceed 512."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Integer);v1=(PosShort);
a=0;//     invoke-static {p0, p1}, Lcom/tencent/stat/common/a;->a(Landroid/content/Context;Ljava/util/Map;)V
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONException;);
a=0;//     sget-object v1, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Exception;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static startNewSession(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->isEnableStatService()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     const-string v1, "The Context of StatService.startNewSession() can not be null!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     invoke-static {}, Lcom/tencent/stat/StatService;->stopSession()V
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-static {p0, v0}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Z)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Boolean);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     sget-object v1, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static startStatService(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->isEnableStatService()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     sget-object v1, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     const-string v2, "MTA StatService is disable."
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     const-string v1, "1.6.2"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     sget-object v2, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "MTA SDK version, current: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, " ,required: "
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lcom/tencent/stat/common/StatLogger;->d(Ljava/lang/Object;)V
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     if-eqz p0, :cond_1
a=0;// 
a=0;//     if-nez p2, :cond_2
a=0;// 
a=0;//     :cond_1
a=0;//     const-string v1, "Context or mtaSdkVersion in StatService.startStatService() is null, please check it!"
a=0;// 
a=0;//     sget-object v2, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/stat/StatConfig;->setEnableStatService(Z)V
a=0;// 
a=0;//     new-instance v0, Lcom/tencent/stat/MtaSDkException;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/stat/MtaSDkException;);
a=0;//     invoke-direct {v0, v1}, Lcom/tencent/stat/MtaSDkException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/MtaSDkException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Null);
a=0;//     invoke-static {v1}, Lcom/tencent/stat/common/k;->b(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-static {p2}, Lcom/tencent/stat/common/k;->b(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     cmp-long v2, v2, v4
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-gez v2, :cond_3
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "MTA SDK version conflicted, current: "
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
a=0;//     const-string v2, ",required: "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ". please delete the current SDK and download the latest one. official website: http://mta.qq.com/ or http://mta.oa.com/"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget-object v2, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/stat/StatConfig;->setEnableStatService(Z)V
a=0;// 
a=0;//     new-instance v0, Lcom/tencent/stat/MtaSDkException;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/stat/MtaSDkException;);
a=0;//     invoke-direct {v0, v1}, Lcom/tencent/stat/MtaSDkException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/MtaSDkException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_3
a=0;//     :try_start_0
a=0;//     #v0=(Null);v2=(Byte);v3=(LongHi);
a=0;//     invoke-static {p0}, Lcom/tencent/stat/StatConfig;->getInstallChannel(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_5
a=0;// 
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);
a=0;//     const-string v1, "-"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Lcom/tencent/stat/StatConfig;->setInstallChannel(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_5
a=0;//     #v1=(Conflicted);
a=0;//     if-eqz p1, :cond_6
a=0;// 
a=0;//     invoke-static {p0, p1}, Lcom/tencent/stat/StatConfig;->setAppKey(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_6
a=0;//     invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {p0, v1}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Z)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     sget-object v2, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v2, v1}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static stopSession()V
a=0;//     .locals 2
a=0;// 
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     sput-wide v0, Lcom/tencent/stat/StatService;->c:J
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static testSpeed(Landroid/content/Context;)V
a=0;//     .locals 3
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->isEnableStatService()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     if-nez p0, :cond_2
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     const-string v1, "The Context of StatService.testSpeed() can not be null!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     :try_start_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Lcom/tencent/stat/j;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/stat/j;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-direct {v1, p0, v2}, Lcom/tencent/stat/j;-><init>(Landroid/content/Context;Ljava/util/Map;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/j;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     sget-object v1, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static testSpeed(Landroid/content/Context;Ljava/util/Map;)V
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/content/Context;",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Integer;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->isEnableStatService()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     if-nez p0, :cond_2
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     const-string v1, "The Context of StatService.testSpeed() can not be null!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     if-eqz p1, :cond_3
a=0;// 
a=0;//     invoke-interface {p1}, Ljava/util/Map;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     :cond_3
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     const-string v1, "The domainMap of StatService.testSpeed() can not be null or empty!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     :try_start_0
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Lcom/tencent/stat/j;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/stat/j;);
a=0;//     invoke-direct {v1, p0, p1}, Lcom/tencent/stat/j;-><init>(Landroid/content/Context;Ljava/util/Map;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/j;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     sget-object v1, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static trackBeginPage(Landroid/content/Context;Ljava/lang/String;)V
a=0;//     .locals 5
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->isEnableStatService()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     if-eqz p0, :cond_1
a=0;// 
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     :cond_1
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     const-string v1, "The Context or pageName of StatService.trackBeginPage() can not be null or empty!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     :try_start_0
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     sget-object v1, Lcom/tencent/stat/StatService;->h:Ljava/util/Map;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Map;);
a=0;//     monitor-enter v1
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :try_start_1
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->h:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v0}, Ljava/util/Map;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->getMaxParallelTimmingEvents()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lt v0, v2, :cond_3
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "The number of page events exceeds the maximum value "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->getMaxParallelTimmingEvents()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     :try_start_2
a=0;//     throw v0
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     sget-object v1, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     :try_start_3
a=0;//     #v0=(Integer);v2=(Integer);v3=(Uninit);v4=(Uninit);
a=0;//     sput-object p1, Lcom/tencent/stat/StatService;->f:Ljava/lang/String;
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->h:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     sget-object v2, Lcom/tencent/stat/StatService;->f:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Duplicate PageID : "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sget-object v3, Lcom/tencent/stat/StatService;->f:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ", onResume() repeated?"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v3=(Uninit);
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->h:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     sget-object v2, Lcom/tencent/stat/StatService;->f:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Long;);
a=0;//     invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     monitor-exit v1
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :try_start_4
a=0;//     #v0=(One);
a=0;//     invoke-static {p0, v0}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Z)I
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static varargs trackCustomBeginEvent(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/String;)V
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
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     const-string v1, "The Context of StatService.trackCustomBeginEvent() can not be null!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     invoke-static {p1}, Lcom/tencent/stat/StatService;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     const-string v1, "The event_id of StatService.trackCustomBeginEvent() can not be null or empty."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     :try_start_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     new-instance v0, Lcom/tencent/stat/a/c;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/stat/a/c;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {v0, p1, p2, v1}, Lcom/tencent/stat/a/c;-><init>(Ljava/lang/String;[Ljava/lang/String;Ljava/util/Properties;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/a/c;);
a=0;//     sget-object v1, Lcom/tencent/stat/StatService;->b:Ljava/util/Map;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     sget-object v1, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Duplicate CustomEvent key: "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/stat/a/c;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, ", trackCustomBeginEvent() repeated?"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
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
a=0;//     sget-object v1, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     :try_start_1
a=0;//     #v1=(Boolean);v2=(Uninit);v3=(Uninit);
a=0;//     sget-object v1, Lcom/tencent/stat/StatService;->b:Ljava/util/Map;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v1}, Ljava/util/Map;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->getMaxParallelTimmingEvents()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-gt v1, v2, :cond_4
a=0;// 
a=0;//     sget-object v1, Lcom/tencent/stat/StatService;->b:Ljava/util/Map;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Map;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Long;);
a=0;//     invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v1=(Integer);v2=(Integer);v3=(Uninit);
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "The number of timedEvent exceeds the maximum value "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->getMaxParallelTimmingEvents()I
a=0;// 
a=0;//     move-result v2
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
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static trackCustomBeginKVEvent(Landroid/content/Context;Ljava/lang/String;Ljava/util/Properties;)V
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
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     const-string v1, "The Context of StatService.trackCustomBeginEvent() can not be null!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     invoke-static {p1}, Lcom/tencent/stat/StatService;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     const-string v1, "The event_id of StatService.trackCustomBeginEvent() can not be null or empty."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     :try_start_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     new-instance v0, Lcom/tencent/stat/a/c;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/stat/a/c;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {v0, p1, v1, p2}, Lcom/tencent/stat/a/c;-><init>(Ljava/lang/String;[Ljava/lang/String;Ljava/util/Properties;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/a/c;);
a=0;//     sget-object v1, Lcom/tencent/stat/StatService;->b:Ljava/util/Map;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     sget-object v1, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Duplicate CustomEvent key: "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/stat/a/c;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, ", trackCustomBeginKVEvent() repeated?"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
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
a=0;//     sget-object v1, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     :try_start_1
a=0;//     #v1=(Boolean);v2=(Uninit);v3=(Uninit);
a=0;//     sget-object v1, Lcom/tencent/stat/StatService;->b:Ljava/util/Map;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v1}, Ljava/util/Map;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->getMaxParallelTimmingEvents()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-gt v1, v2, :cond_4
a=0;// 
a=0;//     sget-object v1, Lcom/tencent/stat/StatService;->b:Ljava/util/Map;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Map;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Long;);
a=0;//     invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v1=(Integer);v2=(Integer);v3=(Uninit);
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "The number of timedEvent exceeds the maximum value "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->getMaxParallelTimmingEvents()I
a=0;// 
a=0;//     move-result v2
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
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static varargs trackCustomEndEvent(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/String;)V
a=0;//     .locals 7
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->isEnableStatService()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     if-nez p0, :cond_2
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     const-string v1, "The Context of StatService.trackCustomEndEvent() can not be null!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     invoke-static {p1}, Lcom/tencent/stat/StatService;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     const-string v1, "The event_id of StatService.trackCustomEndEvent() can not be null or empty."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     :try_start_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     new-instance v1, Lcom/tencent/stat/a/c;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/stat/a/c;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {v1, p1, p2, v0}, Lcom/tencent/stat/a/c;-><init>(Ljava/lang/String;[Ljava/lang/String;Ljava/util/Properties;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/a/c;);
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->b:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Long;
a=0;// 
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     new-instance v2, Lcom/tencent/stat/a/b;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/tencent/stat/a/b;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {p0, v1}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Z)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {v2, p0, v1, p1}, Lcom/tencent/stat/a/b;-><init>(Landroid/content/Context;ILjava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/stat/a/b;);
a=0;//     invoke-virtual {v2, p2}, Lcom/tencent/stat/a/b;->a([Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     sub-long v0, v3, v0
a=0;// 
a=0;//     const-wide/16 v3, 0x3e8
a=0;// 
a=0;//     div-long/2addr v0, v3
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Long;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     const-wide/16 v5, 0x0
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     cmp-long v1, v3, v5
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-nez v1, :cond_4
a=0;// 
a=0;//     const-wide/16 v0, 0x1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Long;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     invoke-virtual {v2, v0, v1}, Lcom/tencent/stat/a/b;->a(J)V
a=0;// 
a=0;//     invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Lcom/tencent/stat/k;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/stat/k;);
a=0;//     invoke-direct {v1, v2}, Lcom/tencent/stat/k;-><init>(Lcom/tencent/stat/a/e;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/k;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     sget-object v1, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     :try_start_1
a=0;//     #v1=(Byte);v2=(Reference,Lcom/tencent/stat/a/b;);v3=(LongLo);v4=(LongHi);v5=(LongLo);v6=(LongHi);
a=0;//     invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Reference,Ljava/lang/Long;);v1=(Reference,Lcom/tencent/stat/a/c;);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "No start time found for custom event: "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/tencent/stat/a/c;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ", lost trackCustomBeginEvent()?"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static trackCustomEndKVEvent(Landroid/content/Context;Ljava/lang/String;Ljava/util/Properties;)V
a=0;//     .locals 7
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->isEnableStatService()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     if-nez p0, :cond_2
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     const-string v1, "The Context of StatService.trackCustomEndEvent() can not be null!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     invoke-static {p1}, Lcom/tencent/stat/StatService;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     const-string v1, "The event_id of StatService.trackCustomEndEvent() can not be null or empty."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     :try_start_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     new-instance v1, Lcom/tencent/stat/a/c;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/stat/a/c;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {v1, p1, v0, p2}, Lcom/tencent/stat/a/c;-><init>(Ljava/lang/String;[Ljava/lang/String;Ljava/util/Properties;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/a/c;);
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->b:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Long;
a=0;// 
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     new-instance v2, Lcom/tencent/stat/a/b;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/tencent/stat/a/b;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {p0, v1}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Z)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {v2, p0, v1, p1}, Lcom/tencent/stat/a/b;-><init>(Landroid/content/Context;ILjava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/stat/a/b;);
a=0;//     invoke-virtual {v2, p2}, Lcom/tencent/stat/a/b;->a(Ljava/util/Properties;)V
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     sub-long v0, v3, v0
a=0;// 
a=0;//     const-wide/16 v3, 0x3e8
a=0;// 
a=0;//     div-long/2addr v0, v3
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Long;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     const-wide/16 v5, 0x0
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     cmp-long v1, v3, v5
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-nez v1, :cond_4
a=0;// 
a=0;//     const-wide/16 v0, 0x1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Long;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     invoke-virtual {v2, v0, v1}, Lcom/tencent/stat/a/b;->a(J)V
a=0;// 
a=0;//     invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Lcom/tencent/stat/k;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/stat/k;);
a=0;//     invoke-direct {v1, v2}, Lcom/tencent/stat/k;-><init>(Lcom/tencent/stat/a/e;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/k;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     sget-object v1, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     :try_start_1
a=0;//     #v1=(Byte);v2=(Reference,Lcom/tencent/stat/a/b;);v3=(LongLo);v4=(LongHi);v5=(LongLo);v6=(LongHi);
a=0;//     invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Reference,Ljava/lang/Long;);v1=(Reference,Lcom/tencent/stat/a/c;);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "No start time found for custom event: "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/tencent/stat/a/c;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ", lost trackCustomBeginKVEvent()?"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static varargs trackCustomEvent(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->isEnableStatService()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     if-nez p0, :cond_2
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     const-string v1, "The Context of StatService.trackCustomEvent() can not be null!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     invoke-static {p1}, Lcom/tencent/stat/StatService;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     const-string v1, "The event_id of StatService.trackCustomEvent() can not be null or empty."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     :try_start_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     new-instance v0, Lcom/tencent/stat/a/b;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/stat/a/b;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {p0, v1}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Z)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {v0, p0, v1, p1}, Lcom/tencent/stat/a/b;-><init>(Landroid/content/Context;ILjava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/a/b;);
a=0;//     invoke-virtual {v0, p2}, Lcom/tencent/stat/a/b;->a([Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v2, Lcom/tencent/stat/k;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/tencent/stat/k;);
a=0;//     invoke-direct {v2, v0}, Lcom/tencent/stat/k;-><init>(Lcom/tencent/stat/a/e;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/stat/k;);
a=0;//     invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     sget-object v1, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static trackCustomKVEvent(Landroid/content/Context;Ljava/lang/String;Ljava/util/Properties;)V
a=0;//     .locals 3
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->isEnableStatService()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     if-nez p0, :cond_2
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     const-string v1, "The Context of StatService.trackCustomEvent() can not be null!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     invoke-static {p1}, Lcom/tencent/stat/StatService;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     const-string v1, "The event_id of StatService.trackCustomEvent() can not be null or empty."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     :try_start_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     new-instance v0, Lcom/tencent/stat/a/b;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/stat/a/b;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {p0, v1}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Z)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {v0, p0, v1, p1}, Lcom/tencent/stat/a/b;-><init>(Landroid/content/Context;ILjava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/a/b;);
a=0;//     invoke-virtual {v0, p2}, Lcom/tencent/stat/a/b;->a(Ljava/util/Properties;)V
a=0;// 
a=0;//     invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v2, Lcom/tencent/stat/k;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/tencent/stat/k;);
a=0;//     invoke-direct {v2, v0}, Lcom/tencent/stat/k;-><init>(Lcom/tencent/stat/a/e;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/stat/k;);
a=0;//     invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     sget-object v1, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static trackEndPage(Landroid/content/Context;Ljava/lang/String;)V
a=0;//     .locals 6
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->isEnableStatService()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     if-eqz p0, :cond_1
a=0;// 
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     :cond_1
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     const-string v1, "The Context or pageName of StatService.trackEndPage() can not be null or empty!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     :try_start_0
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     sget-object v1, Lcom/tencent/stat/StatService;->h:Ljava/util/Map;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Map;);
a=0;//     monitor-enter v1
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :try_start_1
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->h:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Long;
a=0;// 
a=0;//     monitor-exit v1
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     :try_start_2
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     sub-long v0, v1, v3
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-wide/16 v2, 0x3e8
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     div-long/2addr v0, v2
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Long;);
a=0;//     invoke-virtual {v5}, Ljava/lang/Long;->longValue()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     cmp-long v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gtz v0, :cond_3
a=0;// 
a=0;//     const-wide/16 v0, 0x1
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);
a=0;//     sget-object v2, Lcom/tencent/stat/StatService;->g:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_4
a=0;// 
a=0;//     const-string v2, "-"
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     new-instance v0, Lcom/tencent/stat/a/j;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/stat/a/j;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {p0, v1}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Z)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     move-object v3, p1
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/tencent/stat/a/j;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Long;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/a/j;);
a=0;//     sget-object v1, Lcom/tencent/stat/StatService;->f:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_5
a=0;// 
a=0;//     sget-object v1, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     const-string v2, "Invalid invocation since previous onResume on diff page."
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/tencent/stat/common/StatLogger;->warn(Ljava/lang/Object;)V
a=0;// 
a=0;//     :cond_5
a=0;//     #v1=(Conflicted);
a=0;//     invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     new-instance v2, Lcom/tencent/stat/k;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/tencent/stat/k;);
a=0;//     invoke-direct {v2, v0}, Lcom/tencent/stat/k;-><init>(Lcom/tencent/stat/a/e;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/stat/k;);
a=0;//     invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     :cond_6
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     sput-object p1, Lcom/tencent/stat/StatService;->g:Ljava/lang/String;
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     sget-object v1, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_3
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     :try_start_4
a=0;//     throw v0
a=0;// 
a=0;//     :cond_7
a=0;//     sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Starttime for PageID:"
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
a=0;//     const-string v2, " not found, lost onResume()?"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
}}
