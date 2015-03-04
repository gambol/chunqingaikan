package com.twocloo.base.alipay; class Alipay { void a() { int a;
a=0;// .class public Lcom/twocloo/base/alipay/Alipay;
a=0;// .super Ljava/lang/Object;
a=0;// .source "Alipay.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final PAY_BIND_FAIL:Ljava/lang/String; = "4005"
a=0;// 
a=0;// .field public static final PAY_CACEL:Ljava/lang/String; = "6001"
a=0;// 
a=0;// .field public static final PAY_DATA_FORMAT_ERROR:Ljava/lang/String; = "4001"
a=0;// 
a=0;// .field public static final PAY_DENY:Ljava/lang/String; = "4003"
a=0;// 
a=0;// .field public static final PAY_FAIL:Ljava/lang/String; = "4006"
a=0;// 
a=0;// .field public static final PAY_NET_ERROR:Ljava/lang/String; = "6002"
a=0;// 
a=0;// .field public static final PAY_REBIND:Ljava/lang/String; = "4010"
a=0;// 
a=0;// .field public static final PAY_SUCCESS:Ljava/lang/String; = "9000"
a=0;// 
a=0;// .field public static final PAY_SYS_ERROR:Ljava/lang/String; = "4000"
a=0;// 
a=0;// .field public static final PAY_UNBIND:Ljava/lang/String; = "4004"
a=0;// 
a=0;// .field public static final PAY_UPDATE:Ljava/lang/String; = "6000"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private act:Landroid/app/Activity;
a=0;// 
a=0;// .field private mHandler:Landroid/os/Handler;
a=0;// 
a=0;// .field private mProgress:Landroid/app/ProgressDialog;
a=0;// 
a=0;// .field private positiveListener:Landroid/content/DialogInterface$OnClickListener;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/app/Activity;Landroid/content/DialogInterface$OnClickListener;)V
a=0;//     .locals 1
a=0;//     .param p1, "act"    # Landroid/app/Activity;
a=0;//     .param p2, "positiveListener"    # Landroid/content/DialogInterface$OnClickListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 34
a=0;//     #p0=(Reference,Lcom/twocloo/base/alipay/Alipay;);
a=0;//     new-instance v0, Lcom/twocloo/base/alipay/Alipay$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/base/alipay/Alipay$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/base/alipay/Alipay$1;-><init>(Lcom/twocloo/base/alipay/Alipay;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/alipay/Alipay$1;);
a=0;//     iput-object v0, p0, Lcom/twocloo/base/alipay/Alipay;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 85
a=0;//     iput-object p1, p0, Lcom/twocloo/base/alipay/Alipay;->act:Landroid/app/Activity;
a=0;// 
a=0;//     .line 86
a=0;//     iput-object p2, p0, Lcom/twocloo/base/alipay/Alipay;->positiveListener:Landroid/content/DialogInterface$OnClickListener;
a=0;// 
a=0;//     .line 87
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/base/alipay/Alipay;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 118
a=0;//     invoke-direct {p0}, Lcom/twocloo/base/alipay/Alipay;->closeProgress()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/base/alipay/Alipay;)Landroid/app/Activity;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     iget-object v0, p0, Lcom/twocloo/base/alipay/Alipay;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/base/alipay/Alipay;)Landroid/content/DialogInterface$OnClickListener;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     iget-object v0, p0, Lcom/twocloo/base/alipay/Alipay;->positiveListener:Landroid/content/DialogInterface$OnClickListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/DialogInterface$OnClickListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private closeProgress()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 120
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/twocloo/base/alipay/Alipay;->mProgress:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/ProgressDialog;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 121
a=0;//     iget-object v1, p0, Lcom/twocloo/base/alipay/Alipay;->mProgress:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/app/ProgressDialog;->dismiss()V
a=0;// 
a=0;//     .line 122
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-object v1, p0, Lcom/twocloo/base/alipay/Alipay;->mProgress:Landroid/app/ProgressDialog;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 127
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ujava/lang/Object;);
a=0;//     return-void
a=0;// 
a=0;//     .line 124
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 125
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private getSignType(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 3
a=0;//     .param p1, "type"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 113
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "sign_type=\""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "\""
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 114
a=0;//     .local v0, "getSignType":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public checkIsInstall()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 131
a=0;//     new-instance v1, Lcom/twocloo/base/alipay/MobileSecurePayHelper;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/base/alipay/MobileSecurePayHelper;);
a=0;//     iget-object v2, p0, Lcom/twocloo/base/alipay/Alipay;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/Activity;);
a=0;//     invoke-direct {v1, v2}, Lcom/twocloo/base/alipay/MobileSecurePayHelper;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 132
a=0;//     .local v1, "mspHelper":Lcom/twocloo/base/alipay/MobileSecurePayHelper;
a=0;//     #v1=(Reference,Lcom/twocloo/base/alipay/MobileSecurePayHelper;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/base/alipay/MobileSecurePayHelper;->detectMobile_sp()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 134
a=0;//     .local v0, "isMobile_spExist":Z
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public pay(Ljava/lang/String;)V
a=0;//     .locals 7
a=0;//     .param p1, "info"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     .line 97
a=0;//     #v6=(One);
a=0;//     new-instance v1, Lcom/twocloo/base/alipay/MobileSecurePayer;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/base/alipay/MobileSecurePayer;);
a=0;//     invoke-direct {v1}, Lcom/twocloo/base/alipay/MobileSecurePayer;-><init>()V
a=0;// 
a=0;//     .line 98
a=0;//     .local v1, "msp":Lcom/twocloo/base/alipay/MobileSecurePayer;
a=0;//     #v1=(Reference,Lcom/twocloo/base/alipay/MobileSecurePayer;);
a=0;//     iget-object v2, p0, Lcom/twocloo/base/alipay/Alipay;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Handler;);
a=0;//     iget-object v3, p0, Lcom/twocloo/base/alipay/Alipay;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/Activity;);
a=0;//     invoke-virtual {v1, p1, v2, v6, v3}, Lcom/twocloo/base/alipay/MobileSecurePayer;->pay(Ljava/lang/String;Landroid/os/Handler;ILandroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 100
a=0;//     .local v0, "bRet":Z
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 102
a=0;//     invoke-direct {p0}, Lcom/twocloo/base/alipay/Alipay;->closeProgress()V
a=0;// 
a=0;//     .line 103
a=0;//     iget-object v2, p0, Lcom/twocloo/base/alipay/Alipay;->act:Landroid/app/Activity;
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const-string v4, "\u6b63\u5728\u652f\u4ed8"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-static {v2, v3, v4, v5, v6}, Lcom/twocloo/base/alipay/BaseHelper;->showProgress(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZZ)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/base/alipay/Alipay;->mProgress:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 105
a=0;//     :cond_0
a=0;//     #v3=(Reference,Landroid/app/Activity;);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public pay(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 3
a=0;//     .param p1, "orderInfo"    # Ljava/lang/String;
a=0;//     .param p2, "strsign"    # Ljava/lang/String;
a=0;//     .param p3, "signType"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 90
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "&sign="
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "\""
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "\""
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "&"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0, p3}, Lcom/twocloo/base/alipay/Alipay;->getSignType(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 92
a=0;//     .local v0, "info":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/base/alipay/Alipay;->pay(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 93
a=0;//     return-void
a=0;// .end method
}}
