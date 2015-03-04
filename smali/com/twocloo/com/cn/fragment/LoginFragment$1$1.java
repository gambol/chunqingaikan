package com.twocloo.com.cn.fragment; class LoginFragment$1$1 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/fragment/LoginFragment$1$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "LoginFragment.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/fragment/LoginFragment$1;->handleMessage(Landroid/os/Message;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$1:Lcom/twocloo/com/cn/fragment/LoginFragment$1;
a=0;// 
a=0;// .field private final synthetic val$fileName:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/fragment/LoginFragment$1;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$1$1;->this$1:Lcom/twocloo/com/cn/fragment/LoginFragment$1;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$1$1;->val$fileName:Ljava/lang/String;
a=0;// 
a=0;//     .line 143
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/fragment/LoginFragment$1$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/fragment/LoginFragment$1$1;)Lcom/twocloo/com/cn/fragment/LoginFragment$1;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 143
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$1$1;->this$1:Lcom/twocloo/com/cn/fragment/LoginFragment$1;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/fragment/LoginFragment$1;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 147
a=0;//     :try_start_0
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$1$1;->this$1:Lcom/twocloo/com/cn/fragment/LoginFragment$1;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/fragment/LoginFragment$1;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/fragment/LoginFragment$1;->access$0(Lcom/twocloo/com/cn/fragment/LoginFragment$1;)Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/fragment/LoginFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$1$1;->this$1:Lcom/twocloo/com/cn/fragment/LoginFragment$1;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/fragment/LoginFragment$1;);
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/fragment/LoginFragment$1;->access$0(Lcom/twocloo/com/cn/fragment/LoginFragment$1;)Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/fragment/LoginFragment;->access$2(Lcom/twocloo/com/cn/fragment/LoginFragment;)Lcom/twocloo/com/cn/beans/UserCenterNewbean;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/UserCenterNewbean;->getLogoUrl()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3}, Lcom/twocloo/com/cn/common/Util;->getDrawableFromCache(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 148
a=0;//     .local v0, "d":Landroid/graphics/drawable/Drawable;
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 149
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$1$1;->this$1:Lcom/twocloo/com/cn/fragment/LoginFragment$1;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/fragment/LoginFragment$1;->access$0(Lcom/twocloo/com/cn/fragment/LoginFragment$1;)Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/fragment/LoginFragment;->access$10(Lcom/twocloo/com/cn/fragment/LoginFragment;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     new-instance v3, Lcom/twocloo/com/cn/fragment/LoginFragment$1$1$1;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/fragment/LoginFragment$1$1$1;);
a=0;//     invoke-direct {v3, p0}, Lcom/twocloo/com/cn/fragment/LoginFragment$1$1$1;-><init>(Lcom/twocloo/com/cn/fragment/LoginFragment$1$1;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/fragment/LoginFragment$1$1$1;);
a=0;//     invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 174
a=0;//     .end local v0    # "d":Landroid/graphics/drawable/Drawable;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 156
a=0;//     .restart local v0    # "d":Landroid/graphics/drawable/Drawable;
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);v1=(Uninit);v2=(Reference,Landroid/support/v4/app/FragmentActivity;);v3=(Reference,Ljava/lang/String;);v4=(Uninit);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$1$1;->this$1:Lcom/twocloo/com/cn/fragment/LoginFragment$1;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/fragment/LoginFragment$1;->access$0(Lcom/twocloo/com/cn/fragment/LoginFragment$1;)Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/fragment/LoginFragment;->access$10(Lcom/twocloo/com/cn/fragment/LoginFragment;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     new-instance v3, Lcom/twocloo/com/cn/fragment/LoginFragment$1$1$2;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/fragment/LoginFragment$1$1$2;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$1$1;->val$fileName:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, p0, v0, v4}, Lcom/twocloo/com/cn/fragment/LoginFragment$1$1$2;-><init>(Lcom/twocloo/com/cn/fragment/LoginFragment$1$1;Landroid/graphics/drawable/Drawable;Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/fragment/LoginFragment$1$1$2;);
a=0;//     invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 171
a=0;//     .end local v0    # "d":Landroid/graphics/drawable/Drawable;
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 172
a=0;//     .local v1, "e":Ljava/io/IOException;
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
