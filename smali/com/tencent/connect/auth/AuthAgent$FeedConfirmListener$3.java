package com.tencent.connect.auth; class AuthAgent$FeedConfirmListener$3 { void a() { int a;
a=0;// .class Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener$3;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ProGuard"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/content/DialogInterface$OnCancelListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->a(Ljava/lang/String;Lcom/tencent/tauth/IUiListener;Ljava/lang/Object;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;// .field final synthetic b:Ljava/lang/Object;
a=0;// 
a=0;// .field final synthetic c:Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;Lcom/tencent/tauth/IUiListener;Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 715
a=0;//     iput-object p1, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener$3;->c:Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener$3;->a:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     iput-object p3, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener$3;->b:Ljava/lang/Object;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener$3;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onCancel(Landroid/content/DialogInterface;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 719
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener$3;->a:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 720
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener$3;->a:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener$3;->b:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v0, v1}, Lcom/tencent/tauth/IUiListener;->onComplete(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 722
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
