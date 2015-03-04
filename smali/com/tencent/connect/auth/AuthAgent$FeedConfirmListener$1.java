package com.tencent.connect.auth; class AuthAgent$FeedConfirmListener$1 { void a() { int a;
a=0;// .class Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener$1;
a=0;// .super Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener$ButtonListener;
a=0;// .source "ProGuard"
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
a=0;// .method constructor <init>(Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;Landroid/app/Dialog;Lcom/tencent/tauth/IUiListener;Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 679
a=0;//     iput-object p1, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener$1;->c:Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;
a=0;// 
a=0;//     iput-object p3, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener$1;->a:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     iput-object p4, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener$1;->b:Ljava/lang/Object;
a=0;// 
a=0;//     invoke-direct {p0, p1, p2}, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener$ButtonListener;-><init>(Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;Landroid/app/Dialog;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 683
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener$1;->c:Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->a()V
a=0;// 
a=0;//     .line 684
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener$1;->d:Landroid/app/Dialog;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener$1;->d:Landroid/app/Dialog;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 685
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener$1;->d:Landroid/app/Dialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Dialog;);
a=0;//     invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V
a=0;// 
a=0;//     .line 687
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener$1;->a:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 688
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener$1;->a:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener$1;->b:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v0, v1}, Lcom/tencent/tauth/IUiListener;->onComplete(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 690
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
