package com.ffcs.inapppaylib.util; class DeviceUtil { void a() { int a;
a=0;// .class public Lcom/ffcs/inapppaylib/util/DeviceUtil;
a=0;// .super Ljava/lang/Object;
a=0;// .source "DeviceUtil.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 6
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/ffcs/inapppaylib/util/DeviceUtil;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getIMSI(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 2
a=0;//     .param p0, "contex"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 9
a=0;//     const-string v1, "phone"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/telephony/TelephonyManager;
a=0;// 
a=0;//     .line 10
a=0;//     .local v0, "tm":Landroid/telephony/TelephonyManager;
a=0;//     invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getSubscriberId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// .end method
}}
