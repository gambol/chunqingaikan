package com.twocloo.base.alipay; class MobileSecurePayer { void a() { int a;
a=0;// .class public Lcom/twocloo/base/alipay/MobileSecurePayer;
a=0;// .super Ljava/lang/Object;
a=0;// .source "MobileSecurePayer.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static TAG:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private context:Landroid/content/Context;
a=0;// 
a=0;// .field private lock:Ljava/lang/Integer;
a=0;// 
a=0;// .field private mAlixPay:Lcom/alipay/android/app/IAlixPay;
a=0;// 
a=0;// .field private mAlixPayConnection:Landroid/content/ServiceConnection;
a=0;// 
a=0;// .field private mCallback:Lcom/alipay/android/app/IRemoteServiceCallback;
a=0;// 
a=0;// .field private mbPaying:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     const-string v0, "MobileSecurePayer"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Lcom/twocloo/base/alipay/MobileSecurePayer;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 28
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 31
a=0;//     #p0=(Reference,Lcom/twocloo/base/alipay/MobileSecurePayer;);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     iput-object v0, p0, Lcom/twocloo/base/alipay/MobileSecurePayer;->lock:Ljava/lang/Integer;
a=0;// 
a=0;//     .line 32
a=0;//     iput-object v2, p0, Lcom/twocloo/base/alipay/MobileSecurePayer;->mAlixPay:Lcom/alipay/android/app/IAlixPay;
a=0;// 
a=0;//     .line 33
a=0;//     iput-boolean v1, p0, Lcom/twocloo/base/alipay/MobileSecurePayer;->mbPaying:Z
a=0;// 
a=0;//     .line 35
a=0;//     iput-object v2, p0, Lcom/twocloo/base/alipay/MobileSecurePayer;->context:Landroid/content/Context;
a=0;// 
a=0;//     .line 38
a=0;//     new-instance v0, Lcom/twocloo/base/alipay/MobileSecurePayer$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/base/alipay/MobileSecurePayer$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/base/alipay/MobileSecurePayer$1;-><init>(Lcom/twocloo/base/alipay/MobileSecurePayer;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/alipay/MobileSecurePayer$1;);
a=0;//     iput-object v0, p0, Lcom/twocloo/base/alipay/MobileSecurePayer;->mAlixPayConnection:Landroid/content/ServiceConnection;
a=0;// 
a=0;//     .line 157
a=0;//     new-instance v0, Lcom/twocloo/base/alipay/MobileSecurePayer$2;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/base/alipay/MobileSecurePayer$2;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/base/alipay/MobileSecurePayer$2;-><init>(Lcom/twocloo/base/alipay/MobileSecurePayer;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/alipay/MobileSecurePayer$2;);
a=0;//     iput-object v0, p0, Lcom/twocloo/base/alipay/MobileSecurePayer;->mCallback:Lcom/alipay/android/app/IRemoteServiceCallback;
a=0;// 
a=0;//     .line 28
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/base/alipay/MobileSecurePayer;)Ljava/lang/Integer;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     iget-object v0, p0, Lcom/twocloo/base/alipay/MobileSecurePayer;->lock:Ljava/lang/Integer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/base/alipay/MobileSecurePayer;Lcom/alipay/android/app/IAlixPay;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 32
a=0;//     iput-object p1, p0, Lcom/twocloo/base/alipay/MobileSecurePayer;->mAlixPay:Lcom/alipay/android/app/IAlixPay;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/base/alipay/MobileSecurePayer;)Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     iget-object v0, p0, Lcom/twocloo/base/alipay/MobileSecurePayer;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/twocloo/base/alipay/MobileSecurePayer;)Lcom/alipay/android/app/IAlixPay;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 32
a=0;//     iget-object v0, p0, Lcom/twocloo/base/alipay/MobileSecurePayer;->mAlixPay:Lcom/alipay/android/app/IAlixPay;
a=0;// 
a=0;//     #v0=(Reference,Lcom/alipay/android/app/IAlixPay;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$4(Lcom/twocloo/base/alipay/MobileSecurePayer;)Lcom/alipay/android/app/IRemoteServiceCallback;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 157
a=0;//     iget-object v0, p0, Lcom/twocloo/base/alipay/MobileSecurePayer;->mCallback:Lcom/alipay/android/app/IRemoteServiceCallback;
a=0;// 
a=0;//     #v0=(Reference,Lcom/alipay/android/app/IRemoteServiceCallback;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$5()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     sget-object v0, Lcom/twocloo/base/alipay/MobileSecurePayer;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$6(Lcom/twocloo/base/alipay/MobileSecurePayer;Z)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     iput-boolean p1, p0, Lcom/twocloo/base/alipay/MobileSecurePayer;->mbPaying:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$7(Lcom/twocloo/base/alipay/MobileSecurePayer;)Landroid/content/ServiceConnection;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     iget-object v0, p0, Lcom/twocloo/base/alipay/MobileSecurePayer;->mAlixPayConnection:Landroid/content/ServiceConnection;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/ServiceConnection;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public pay(Ljava/lang/String;Landroid/os/Handler;ILandroid/content/Context;)Z
a=0;//     .locals 10
a=0;//     .param p1, "strOrderInfo"    # Ljava/lang/String;
a=0;//     .param p2, "callback"    # Landroid/os/Handler;
a=0;//     .param p3, "myWhat"    # I
a=0;//     .param p4, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     .line 69
a=0;//     #v8=(One);
a=0;//     iget-boolean v0, p0, Lcom/twocloo/base/alipay/MobileSecurePayer;->mbPaying:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 70
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 150
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 71
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v9=(Uninit);
a=0;//     iput-boolean v8, p0, Lcom/twocloo/base/alipay/MobileSecurePayer;->mbPaying:Z
a=0;// 
a=0;//     .line 74
a=0;//     iput-object p4, p0, Lcom/twocloo/base/alipay/MobileSecurePayer;->context:Landroid/content/Context;
a=0;// 
a=0;//     .line 78
a=0;//     iget-object v0, p0, Lcom/twocloo/base/alipay/MobileSecurePayer;->mAlixPay:Lcom/alipay/android/app/IAlixPay;
a=0;// 
a=0;//     #v0=(Reference,Lcom/alipay/android/app/IAlixPay;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 86
a=0;//     const-string v0, "com.eg.android.AlipayGphone"
a=0;// 
a=0;//     invoke-static {p4, v0}, Lcom/twocloo/base/util/PhoneUtils;->getPackageInfo(Landroid/content/Context;Ljava/lang/String;)Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 88
a=0;//     .local v7, "packageInfo":Landroid/content/pm/PackageInfo;
a=0;//     #v7=(Reference,Landroid/content/pm/PackageInfo;);
a=0;//     if-eqz v7, :cond_2
a=0;// 
a=0;//     iget v0, v7, Landroid/content/pm/PackageInfo;->versionCode:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x25
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_2
a=0;// 
a=0;//     .line 89
a=0;//     new-instance v6, Landroid/content/Intent;
a=0;// 
a=0;//     #v6=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v0, "com.eg.android.AlipayGphone.IAlixPay"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 90
a=0;//     .local v6, "intent":Landroid/content/Intent;
a=0;//     #v6=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {p4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/base/alipay/MobileSecurePayer;->mAlixPayConnection:Landroid/content/ServiceConnection;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/ServiceConnection;);
a=0;//     invoke-virtual {v0, v6, v1, v8}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
a=0;// 
a=0;//     .line 100
a=0;//     .end local v6    # "intent":Landroid/content/Intent;
a=0;//     .end local v7    # "packageInfo":Landroid/content/pm/PackageInfo;
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     new-instance v9, Ljava/lang/Thread;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/Thread;);
a=0;//     new-instance v0, Lcom/twocloo/base/alipay/MobileSecurePayer$3;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/base/alipay/MobileSecurePayer$3;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/base/alipay/MobileSecurePayer;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object v3, p4
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     move v4, p3
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move-object v5, p2
a=0;// 
a=0;//     #v5=(Reference,Landroid/os/Handler;);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/twocloo/base/alipay/MobileSecurePayer$3;-><init>(Lcom/twocloo/base/alipay/MobileSecurePayer;Ljava/lang/String;Landroid/content/Context;ILandroid/os/Handler;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/alipay/MobileSecurePayer$3;);
a=0;//     invoke-direct {v9, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 148
a=0;//     #v9=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v9}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     move v0, v8
a=0;// 
a=0;//     .line 150
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 92
a=0;//     .restart local v7    # "packageInfo":Landroid/content/pm/PackageInfo;
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Reference,Landroid/content/pm/PackageInfo;);v9=(Uninit);
a=0;//     new-instance v6, Landroid/content/Intent;
a=0;// 
a=0;//     #v6=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v0, "com.alipay.android.app.IAlixPay"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 93
a=0;//     .restart local v6    # "intent":Landroid/content/Intent;
a=0;//     #v6=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {p4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/base/alipay/MobileSecurePayer;->mAlixPayConnection:Landroid/content/ServiceConnection;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/ServiceConnection;);
a=0;//     invoke-virtual {v0, v6, v1, v8}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
