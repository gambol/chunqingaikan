package com.twocloo.com.cn.view; class DialogView { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/view/DialogView;
a=0;// .super Ljava/lang/Object;
a=0;// .source "DialogView.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private act:Landroid/app/Activity;
a=0;// 
a=0;// .field private pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/app/Activity;)V
a=0;//     .locals 0
a=0;//     .param p1, "act"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 14
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 15
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/view/DialogView;);
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/view/DialogView;->act:Landroid/app/Activity;
a=0;// 
a=0;//     .line 16
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getDiscount(F)F
a=0;//     .locals 2
a=0;//     .param p1, "d"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     const/high16 v1, 0x42c80000    # 100.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     cmpg-float v1, p1, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-gez v1, :cond_0
a=0;// 
a=0;//     .line 22
a=0;//     .end local p1    # "d":F
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);
a=0;//     return p1
a=0;// 
a=0;//     .line 21
a=0;//     .restart local p1    # "d":F
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Byte);
a=0;//     float-to-int v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     div-int/lit8 v0, v1, 0x64
a=0;// 
a=0;//     .line 22
a=0;//     .local v0, "m":I
a=0;//     #v0=(Integer);
a=0;//     mul-int/lit8 v1, v0, 0x64
a=0;// 
a=0;//     int-to-float p1, v1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
