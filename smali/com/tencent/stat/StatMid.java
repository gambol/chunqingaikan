package com.tencent.stat; class StatMid { void a() { int a;
a=0;// .class public Lcom/tencent/stat/StatMid;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;// .field private static b:Lcom/tencent/stat/DeviceInfo;
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
a=0;//     sput-object v0, Lcom/tencent/stat/StatMid;->a:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/tencent/stat/StatMid;->b:Lcom/tencent/stat/DeviceInfo;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/stat/StatMid;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static declared-synchronized a(Landroid/content/Context;)Lcom/tencent/stat/DeviceInfo;
a=0;//     .locals 7
a=0;// 
a=0;//     const-class v1, Lcom/tencent/stat/StatMid;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {p0}, Lcom/tencent/stat/a;->a(Landroid/content/Context;)Lcom/tencent/stat/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/a;);
a=0;//     const-string v2, "__MTA_DEVICE_INFO__"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0, v2, v3}, Lcom/tencent/stat/a;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lcom/tencent/stat/StatMid;->a(Ljava/lang/String;)Lcom/tencent/stat/DeviceInfo;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sget-object v3, Lcom/tencent/stat/StatMid;->a:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v3=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "get device info from internal storage:"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Lcom/tencent/stat/common/StatLogger;->d(Ljava/lang/Object;)V
a=0;// 
a=0;//     const-string v3, "__MTA_DEVICE_INFO__"
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v0, v3, v4}, Lcom/tencent/stat/a;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Lcom/tencent/stat/StatMid;->a(Ljava/lang/String;)Lcom/tencent/stat/DeviceInfo;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     sget-object v4, Lcom/tencent/stat/StatMid;->a:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v4=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "get device info from setting.system:"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Lcom/tencent/stat/common/StatLogger;->d(Ljava/lang/Object;)V
a=0;// 
a=0;//     const-string v4, "__MTA_DEVICE_INFO__"
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v0, v4, v5}, Lcom/tencent/stat/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/stat/StatMid;->a(Ljava/lang/String;)Lcom/tencent/stat/DeviceInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v4, Lcom/tencent/stat/StatMid;->a:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "get device info from SharedPreference:"
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Lcom/tencent/stat/common/StatLogger;->d(Ljava/lang/Object;)V
a=0;// 
a=0;//     invoke-static {v0, v3, v2}, Lcom/tencent/stat/StatMid;->a(Lcom/tencent/stat/DeviceInfo;Lcom/tencent/stat/DeviceInfo;Lcom/tencent/stat/DeviceInfo;)Lcom/tencent/stat/DeviceInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/tencent/stat/StatMid;->b:Lcom/tencent/stat/DeviceInfo;
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/StatMid;->b:Lcom/tencent/stat/DeviceInfo;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lcom/tencent/stat/DeviceInfo;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/stat/DeviceInfo;);
a=0;//     invoke-direct {v0}, Lcom/tencent/stat/DeviceInfo;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/DeviceInfo;);
a=0;//     sput-object v0, Lcom/tencent/stat/StatMid;->b:Lcom/tencent/stat/DeviceInfo;
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-static {p0}, Lcom/tencent/stat/n;->a(Landroid/content/Context;)Lcom/tencent/stat/n;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Lcom/tencent/stat/n;->b(Landroid/content/Context;)Lcom/tencent/stat/DeviceInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     sget-object v2, Lcom/tencent/stat/StatMid;->b:Lcom/tencent/stat/DeviceInfo;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/stat/DeviceInfo;->getImei()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lcom/tencent/stat/DeviceInfo;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     sget-object v2, Lcom/tencent/stat/StatMid;->b:Lcom/tencent/stat/DeviceInfo;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/stat/DeviceInfo;->getMac()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lcom/tencent/stat/DeviceInfo;->e(Ljava/lang/String;)V
a=0;// 
a=0;//     sget-object v2, Lcom/tencent/stat/StatMid;->b:Lcom/tencent/stat/DeviceInfo;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/stat/DeviceInfo;->getUserType()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v2, v0}, Lcom/tencent/stat/DeviceInfo;->b(I)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     :try_start_1
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     sget-object v0, Lcom/tencent/stat/StatMid;->b:Lcom/tencent/stat/DeviceInfo;
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/DeviceInfo;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_2
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     sget-object v2, Lcom/tencent/stat/StatMid;->a:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v2, v0}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
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
a=0;// .end method
a=0;// 
a=0;// .method static a(Lcom/tencent/stat/DeviceInfo;Lcom/tencent/stat/DeviceInfo;)Lcom/tencent/stat/DeviceInfo;
a=0;//     .locals 1
a=0;// 
a=0;//     if-eqz p0, :cond_2
a=0;// 
a=0;//     if-eqz p1, :cond_2
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/tencent/stat/DeviceInfo;->a(Lcom/tencent/stat/DeviceInfo;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ltz v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     move-object p0, p1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Uninit);
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     if-eqz p1, :cond_3
a=0;// 
a=0;//     move-object p0, p1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     const/4 p0, 0x0
a=0;// 
a=0;//     #p0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static a(Lcom/tencent/stat/DeviceInfo;Lcom/tencent/stat/DeviceInfo;Lcom/tencent/stat/DeviceInfo;)Lcom/tencent/stat/DeviceInfo;
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-static {p0, p1}, Lcom/tencent/stat/StatMid;->a(Lcom/tencent/stat/DeviceInfo;Lcom/tencent/stat/DeviceInfo;)Lcom/tencent/stat/DeviceInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/DeviceInfo;);
a=0;//     invoke-static {p1, p2}, Lcom/tencent/stat/StatMid;->a(Lcom/tencent/stat/DeviceInfo;Lcom/tencent/stat/DeviceInfo;)Lcom/tencent/stat/DeviceInfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/DeviceInfo;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/stat/StatMid;->a(Lcom/tencent/stat/DeviceInfo;Lcom/tencent/stat/DeviceInfo;)Lcom/tencent/stat/DeviceInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static a(Ljava/lang/String;)Lcom/tencent/stat/DeviceInfo;
a=0;//     .locals 1
a=0;// 
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     invoke-static {p0}, Lcom/tencent/stat/common/k;->d(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/tencent/stat/DeviceInfo;->a(Ljava/lang/String;)Lcom/tencent/stat/DeviceInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getDeviceInfo(Landroid/content/Context;)Lcom/tencent/stat/DeviceInfo;
a=0;//     .locals 2
a=0;// 
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/StatMid;->a:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     const-string v1, "Context for StatConfig.getDeviceInfo is null."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     sget-object v0, Lcom/tencent/stat/StatMid;->b:Lcom/tencent/stat/DeviceInfo;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/DeviceInfo;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     invoke-static {p0}, Lcom/tencent/stat/StatMid;->a(Landroid/content/Context;)Lcom/tencent/stat/DeviceInfo;
a=0;// 
a=0;//     :cond_1
a=0;//     sget-object v0, Lcom/tencent/stat/StatMid;->b:Lcom/tencent/stat/DeviceInfo;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getMid(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/StatMid;->b:Lcom/tencent/stat/DeviceInfo;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/DeviceInfo;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-static {p0}, Lcom/tencent/stat/StatMid;->getDeviceInfo(Landroid/content/Context;)Lcom/tencent/stat/DeviceInfo;
a=0;// 
a=0;//     :cond_0
a=0;//     sget-object v0, Lcom/tencent/stat/StatMid;->b:Lcom/tencent/stat/DeviceInfo;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/stat/DeviceInfo;->getMid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static updateDeviceInfo(Landroid/content/Context;Ljava/lang/String;)V
a=0;//     .locals 4
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {p0}, Lcom/tencent/stat/StatMid;->getDeviceInfo(Landroid/content/Context;)Lcom/tencent/stat/DeviceInfo;
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/StatMid;->b:Lcom/tencent/stat/DeviceInfo;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/DeviceInfo;);
a=0;//     invoke-virtual {v0, p1}, Lcom/tencent/stat/DeviceInfo;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/StatMid;->b:Lcom/tencent/stat/DeviceInfo;
a=0;// 
a=0;//     sget-object v1, Lcom/tencent/stat/StatMid;->b:Lcom/tencent/stat/DeviceInfo;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/DeviceInfo;);
a=0;//     invoke-virtual {v1}, Lcom/tencent/stat/DeviceInfo;->a()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/DeviceInfo;->a(I)V
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/StatMid;->b:Lcom/tencent/stat/DeviceInfo;
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/tencent/stat/DeviceInfo;->a(J)V
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/StatMid;->b:Lcom/tencent/stat/DeviceInfo;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/stat/DeviceInfo;->c()Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Lcom/tencent/stat/StatMid;->a:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "save DeviceInfo:"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/tencent/stat/common/StatLogger;->d(Ljava/lang/Object;)V
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/stat/common/k;->c(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "\n"
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {p0}, Lcom/tencent/stat/a;->a(Landroid/content/Context;)Lcom/tencent/stat/a;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "__MTA_DEVICE_INFO__"
a=0;// 
a=0;//     invoke-virtual {v1, v2, v0}, Lcom/tencent/stat/a;->c(Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     const-string v2, "__MTA_DEVICE_INFO__"
a=0;// 
a=0;//     invoke-virtual {v1, v2, v0}, Lcom/tencent/stat/a;->e(Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     const-string v2, "__MTA_DEVICE_INFO__"
a=0;// 
a=0;//     invoke-virtual {v1, v2, v0}, Lcom/tencent/stat/a;->a(Ljava/lang/String;Ljava/lang/String;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     sget-object v1, Lcom/tencent/stat/StatMid;->a:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
