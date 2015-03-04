package com.tencent.connect.auth; class AuthDialog$JsListener { void a() { int a;
a=0;// .class Lcom/tencent/connect/auth/AuthDialog$JsListener;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/tencent/connect/auth/AuthDialog;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "JsListener"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/tencent/connect/auth/AuthDialog;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Lcom/tencent/connect/auth/AuthDialog;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 498
a=0;//     iput-object p1, p0, Lcom/tencent/connect/auth/AuthDialog$JsListener;->a:Lcom/tencent/connect/auth/AuthDialog;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/connect/auth/AuthDialog$JsListener;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Lcom/tencent/connect/auth/AuthDialog;Lcom/tencent/connect/auth/AuthDialog$1;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 498
a=0;//     invoke-direct {p0, p1}, Lcom/tencent/connect/auth/AuthDialog$JsListener;-><init>(Lcom/tencent/connect/auth/AuthDialog;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/connect/auth/AuthDialog$JsListener;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onCancel(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 512
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthDialog$JsListener;->a:Lcom/tencent/connect/auth/AuthDialog;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/AuthDialog;);
a=0;//     invoke-static {v0}, Lcom/tencent/connect/auth/AuthDialog;->f(Lcom/tencent/connect/auth/AuthDialog;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     .line 513
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthDialog$JsListener;->a:Lcom/tencent/connect/auth/AuthDialog;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/connect/auth/AuthDialog;->dismiss()V
a=0;// 
a=0;//     .line 514
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onCancelLogin()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 502
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Lcom/tencent/connect/auth/AuthDialog$JsListener;->onCancel(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 503
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onLoad(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 523
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthDialog$JsListener;->a:Lcom/tencent/connect/auth/AuthDialog;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/AuthDialog;);
a=0;//     invoke-static {v0}, Lcom/tencent/connect/auth/AuthDialog;->f(Lcom/tencent/connect/auth/AuthDialog;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     .line 524
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public showMsg(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 518
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthDialog$JsListener;->a:Lcom/tencent/connect/auth/AuthDialog;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/AuthDialog;);
a=0;//     invoke-static {v0}, Lcom/tencent/connect/auth/AuthDialog;->f(Lcom/tencent/connect/auth/AuthDialog;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     .line 519
a=0;//     return-void
a=0;// .end method
}}
