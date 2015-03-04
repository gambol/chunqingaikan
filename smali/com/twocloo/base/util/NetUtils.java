package com.twocloo.base.util; class NetUtils { void a() { int a;
a=0;// .class public Lcom/twocloo/base/util/NetUtils;
a=0;// .super Ljava/lang/Object;
a=0;// .source "NetUtils.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 20
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/base/util/NetUtils;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static checkNet()Lcom/twocloo/base/common/NetType;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 23
a=0;//     invoke-static {}, Lcom/twocloo/base/common/CommonApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Application;);
a=0;//     invoke-static {v0}, Lcom/twocloo/base/util/NetUtils;->checkNet(Landroid/content/Context;)Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized checkNet(Landroid/content/Context;)Lcom/twocloo/base/common/NetType;
a=0;//     .locals 8
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     .line 32
a=0;//     #v7=(One);
a=0;//     const-class v5, Lcom/twocloo/base/util/NetUtils;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v5
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v3, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 35
a=0;//     .local v3, "netType":Lcom/twocloo/base/common/NetType;
a=0;//     :try_start_1
a=0;//     #v3=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     const-string v4, "connectivity"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/net/ConnectivityManager;
a=0;// 
a=0;//     .line 36
a=0;//     .local v0, "connectivity":Landroid/net/ConnectivityManager;
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 38
a=0;//     invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 41
a=0;//     .local v2, "info":Landroid/net/NetworkInfo;
a=0;//     #v2=(Reference,Landroid/net/NetworkInfo;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/net/NetworkInfo;->isConnected()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/net/NetworkInfo;->getState()Landroid/net/NetworkInfo$State;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/net/NetworkInfo$State;);
a=0;//     sget-object v6, Landroid/net/NetworkInfo$State;->CONNECTED:Landroid/net/NetworkInfo$State;
a=0;// 
a=0;//     #v6=(Reference,Landroid/net/NetworkInfo$State;);
a=0;//     if-ne v4, v6, :cond_0
a=0;// 
a=0;//     .line 44
a=0;//     invoke-virtual {v2}, Landroid/net/NetworkInfo;->getType()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ne v7, v4, :cond_1
a=0;// 
a=0;//     .line 45
a=0;//     sget-object v3, Lcom/twocloo/base/common/NetType;->TYPE_WIFI:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     .line 79
a=0;//     :goto_0
a=0;//     #v6=(Conflicted);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "\u5f53\u524d\u7f51\u7edc\u7c7b\u578b|"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/base/common/NetType;->getDesc()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v6, "|"
a=0;// 
a=0;//     invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/net/NetworkInfo;->getType()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v6, "|"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/net/NetworkInfo;->getSubtype()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 87
a=0;//     .end local v0    # "connectivity":Landroid/net/ConnectivityManager;
a=0;//     .end local v2    # "info":Landroid/net/NetworkInfo;
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v6=(Conflicted);
a=0;//     monitor-exit v5
a=0;// 
a=0;//     return-object v3
a=0;// 
a=0;//     .line 46
a=0;//     .restart local v0    # "connectivity":Landroid/net/ConnectivityManager;
a=0;//     .restart local v2    # "info":Landroid/net/NetworkInfo;
a=0;//     :cond_1
a=0;//     :try_start_2
a=0;//     #v0=(Reference,Landroid/net/ConnectivityManager;);v1=(Uninit);v2=(Reference,Landroid/net/NetworkInfo;);v4=(Integer);v6=(Reference,Landroid/net/NetworkInfo$State;);
a=0;//     invoke-virtual {v2}, Landroid/net/NetworkInfo;->getType()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     if-nez v4, :cond_5
a=0;// 
a=0;//     .line 65
a=0;//     invoke-virtual {v2}, Landroid/net/NetworkInfo;->getSubtype()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     if-eq v7, v4, :cond_2
a=0;// 
a=0;//     .line 66
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v2}, Landroid/net/NetworkInfo;->getSubtype()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-eq v4, v6, :cond_2
a=0;// 
a=0;//     .line 67
a=0;//     const/4 v4, 0x4
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/net/NetworkInfo;->getSubtype()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     if-ne v4, v6, :cond_3
a=0;// 
a=0;//     .line 69
a=0;//     :cond_2
a=0;//     #v4=(Integer);v6=(Conflicted);
a=0;//     sget-object v3, Lcom/twocloo/base/common/NetType;->TYPE_2G:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     .line 70
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v4=(PosByte);v6=(Integer);
a=0;//     const/16 v4, 0xd
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/net/NetworkInfo;->getSubtype()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     if-ne v4, v6, :cond_4
a=0;// 
a=0;//     .line 71
a=0;//     sget-object v3, Lcom/twocloo/base/common/NetType;->TYPE_4G:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     .line 72
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 73
a=0;//     :cond_4
a=0;//     sget-object v3, Lcom/twocloo/base/common/NetType;->TYPE_3G_OR_OTHERS:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     .line 75
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 76
a=0;//     :cond_5
a=0;//     #v4=(Integer);v6=(Reference,Landroid/net/NetworkInfo$State;);
a=0;//     sget-object v3, Lcom/twocloo/base/common/NetType;->TYPE_UNKNOWN:Lcom/twocloo/base/common/NetType;
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 83
a=0;//     .end local v0    # "connectivity":Landroid/net/ConnectivityManager;
a=0;//     .end local v2    # "info":Landroid/net/NetworkInfo;
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 84
a=0;//     .local v1, "e":Ljava/lang/Throwable;
a=0;//     :try_start_3
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v1}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 32
a=0;//     .end local v1    # "e":Ljava/lang/Throwable;
a=0;//     .end local v3    # "netType":Lcom/twocloo/base/common/NetType;
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v5
a=0;// 
a=0;//     throw v4
a=0;// .end method
a=0;// 
a=0;// .method public static getMobileType(Landroid/content/Context;)Lcom/twocloo/base/common/OperatorType;
a=0;//     .locals 3
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 95
a=0;//     const-string v2, "phone"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/telephony/TelephonyManager;
a=0;// 
a=0;//     .line 96
a=0;//     .local v1, "iPhoneManager":Landroid/telephony/TelephonyManager;
a=0;//     invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getSimOperator()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 98
a=0;//     .local v0, "iNumeric":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_3
a=0;// 
a=0;//     .line 100
a=0;//     const-string v2, "46000"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     const-string v2, "46002"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     const-string v2, "46007"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 101
a=0;//     :cond_0
a=0;//     sget-object v2, Lcom/twocloo/base/common/OperatorType;->CMCC:Lcom/twocloo/base/common/OperatorType;
a=0;// 
a=0;//     .line 111
a=0;//     :goto_0
a=0;//     #v2=(Reference,Lcom/twocloo/base/common/OperatorType;);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 103
a=0;//     :cond_1
a=0;//     #v2=(Boolean);
a=0;//     const-string v2, "46001"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 104
a=0;//     sget-object v2, Lcom/twocloo/base/common/OperatorType;->CU:Lcom/twocloo/base/common/OperatorType;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/base/common/OperatorType;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 106
a=0;//     :cond_2
a=0;//     #v2=(Boolean);
a=0;//     const-string v2, "46003"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 107
a=0;//     sget-object v2, Lcom/twocloo/base/common/OperatorType;->CT:Lcom/twocloo/base/common/OperatorType;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/base/common/OperatorType;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 111
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);
a=0;//     sget-object v2, Lcom/twocloo/base/common/OperatorType;->OTHER:Lcom/twocloo/base/common/OperatorType;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/base/common/OperatorType;);
a=0;//     goto :goto_0
a=0;// .end method
}}
