package com.twocloo.com.cn.fragment; class LoginFragment$4 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/fragment/LoginFragment$4;
a=0;// .super Ljava/lang/Object;
a=0;// .source "LoginFragment.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/fragment/LoginFragment;->updateUserInfo()V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
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
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$4;->this$0:Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;//     .line 461
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/fragment/LoginFragment$4;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/fragment/LoginFragment$4;)Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 461
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$4;->this$0:Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/fragment/LoginFragment;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onCancel()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 540
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onComplete(Ljava/lang/Object;)V
a=0;//     .locals 3
a=0;//     .param p1, "response"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 469
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$4;->this$0:Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/fragment/LoginFragment;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$4;->this$0:Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/fragment/LoginFragment;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/fragment/LoginFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "\u6b63\u5728\u767b\u5f55\u4e2d..."
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lcom/twocloo/base/util/ViewUtils;->progressLoading(Landroid/content/Context;Ljava/lang/String;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/com/cn/fragment/LoginFragment;->access$19(Lcom/twocloo/com/cn/fragment/LoginFragment;Landroid/app/ProgressDialog;)V
a=0;// 
a=0;//     .line 470
a=0;//     new-instance v0, Lcom/twocloo/com/cn/fragment/LoginFragment$4$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/fragment/LoginFragment$4$1;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/twocloo/com/cn/fragment/LoginFragment$4$1;-><init>(Lcom/twocloo/com/cn/fragment/LoginFragment$4;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 535
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/fragment/LoginFragment$4$1;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/fragment/LoginFragment$4$1;->start()V
a=0;// 
a=0;//     .line 536
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onError(Lcom/tencent/tauth/UiError;)V
a=0;//     .locals 0
a=0;//     .param p1, "e"    # Lcom/tencent/tauth/UiError;
a=0;// 
a=0;//     .prologue
a=0;//     .line 465
a=0;//     return-void
a=0;// .end method
}}
