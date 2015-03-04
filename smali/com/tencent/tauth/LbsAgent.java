package com.tencent.tauth; class LbsAgent { void a() { int a;
a=0;// .class public Lcom/tencent/tauth/LbsAgent;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/tencent/tauth/LbsAgent$OnGetLocationListener;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final SOSO_VERIFY_CODE:Ljava/lang/String; = "WQMPF-XMH66-ISQXP-OIGMM-BNL7M"
a=0;// 
a=0;// .field private static final SOSO_VERIFY_NAME:Ljava/lang/String; = "OpenSdk"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private sosoListener:Lcom/tencent/tauth/SosoLocationListener;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 18
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 19
a=0;//     #p0=(Reference,Lcom/tencent/tauth/LbsAgent;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public removeUpdate()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     invoke-static {}, Lcom/tencent/a/a/a/a;->a()Lcom/tencent/a/a/a/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/a/a/a/a;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/a/a/a/a;->b()V
a=0;// 
a=0;//     .line 32
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/tencent/tauth/LbsAgent;->sosoListener:Lcom/tencent/tauth/SosoLocationListener;
a=0;// 
a=0;//     .line 33
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public requestLocationUpdate(Landroid/content/Context;Lcom/tencent/tauth/LbsAgent$OnGetLocationListener;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     new-instance v0, Lcom/tencent/tauth/SosoLocationListener;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/tauth/SosoLocationListener;);
a=0;//     invoke-direct {v0, p2}, Lcom/tencent/tauth/SosoLocationListener;-><init>(Lcom/tencent/tauth/LbsAgent$OnGetLocationListener;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/tauth/SosoLocationListener;);
a=0;//     iput-object v0, p0, Lcom/tencent/tauth/LbsAgent;->sosoListener:Lcom/tencent/tauth/SosoLocationListener;
a=0;// 
a=0;//     .line 27
a=0;//     invoke-static {}, Lcom/tencent/a/a/a/a;->a()Lcom/tencent/a/a/a/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/tauth/LbsAgent;->sosoListener:Lcom/tencent/tauth/SosoLocationListener;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/tauth/SosoLocationListener;);
a=0;//     invoke-virtual {v0, p1, v1}, Lcom/tencent/a/a/a/a;->a(Landroid/content/Context;Lcom/tencent/a/a/a/b;)Z
a=0;// 
a=0;//     .line 28
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public verifyRegCode()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     invoke-static {}, Lcom/tencent/a/a/a/a;->a()Lcom/tencent/a/a/a/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/a/a/a/a;);
a=0;//     const-string v1, "OpenSdk"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "WQMPF-XMH66-ISQXP-OIGMM-BNL7M"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/tencent/a/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
}}
