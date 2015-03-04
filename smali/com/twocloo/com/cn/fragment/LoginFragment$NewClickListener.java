package com.twocloo.com.cn.fragment; class LoginFragment$NewClickListener { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/fragment/LoginFragment$NewClickListener;
a=0;// .super Ljava/lang/Object;
a=0;// .source "LoginFragment.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = "NewClickListener"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/fragment/LoginFragment;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 443
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$NewClickListener;->this$0:Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/fragment/LoginFragment$NewClickListener;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 3
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 447
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 448
a=0;//     .local v1, "context":Landroid/content/Context;
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 449
a=0;//     .local v0, "cls":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     #v0=(Null);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 450
a=0;//     new-instance v2, Landroid/content/Intent;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v2, v1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 451
a=0;//     .local v2, "intent":Landroid/content/Intent;
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 453
a=0;//     .end local v2    # "intent":Landroid/content/Intent;
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
