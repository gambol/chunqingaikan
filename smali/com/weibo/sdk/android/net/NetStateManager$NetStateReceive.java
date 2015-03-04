package com.weibo.sdk.android.net; class NetStateManager$NetStateReceive { void a() { int a;
a=0;// .class public Lcom/weibo/sdk/android/net/NetStateManager$NetStateReceive;
a=0;// .super Landroid/content/BroadcastReceiver;
a=0;// .source "NetStateManager.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/weibo/sdk/android/net/NetStateManager;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x1
a=0;//     name = "NetStateReceive"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/weibo/sdk/android/net/NetStateManager;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/weibo/sdk/android/net/NetStateManager;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     iput-object p1, p0, Lcom/weibo/sdk/android/net/NetStateManager$NetStateReceive;->this$0:Lcom/weibo/sdk/android/net/NetStateManager;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/weibo/sdk/android/net/NetStateManager$NetStateReceive;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
a=0;//     .locals 4
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "intent"    # Landroid/content/Intent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     invoke-static {p1}, Lcom/weibo/sdk/android/net/NetStateManager;->access$0(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 32
a=0;//     const-string v2, "android.net.conn.CONNECTIVITY_CHANGE"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 34
a=0;//     const-string v2, "wifi"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 33
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/net/wifi/WifiManager;
a=0;// 
a=0;//     .line 35
a=0;//     .local v1, "wifiManager":Landroid/net/wifi/WifiManager;
a=0;//     invoke-virtual {v1}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 36
a=0;//     .local v0, "info":Landroid/net/wifi/WifiInfo;
a=0;//     #v0=(Reference,Landroid/net/wifi/WifiInfo;);
a=0;//     invoke-virtual {v1}, Landroid/net/wifi/WifiManager;->isWifiEnabled()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     invoke-virtual {v0}, Landroid/net/wifi/WifiInfo;->getNetworkId()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v2, v3, :cond_1
a=0;// 
a=0;//     .line 37
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     sget-object v2, Lcom/weibo/sdk/android/net/NetStateManager$NetState;->Mobile:Lcom/weibo/sdk/android/net/NetStateManager$NetState;
a=0;// 
a=0;//     #v2=(Reference,Lcom/weibo/sdk/android/net/NetStateManager$NetState;);
a=0;//     sput-object v2, Lcom/weibo/sdk/android/net/NetStateManager;->CUR_NETSTATE:Lcom/weibo/sdk/android/net/NetStateManager$NetState;
a=0;// 
a=0;//     .line 40
a=0;//     .end local v0    # "info":Landroid/net/wifi/WifiInfo;
a=0;//     .end local v1    # "wifiManager":Landroid/net/wifi/WifiManager;
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
