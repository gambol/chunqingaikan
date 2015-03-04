package com.twocloo.com.cn.fragment; class ImageFragment$1 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/fragment/ImageFragment$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ImageFragment.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/fragment/ImageFragment;->onActivityCreated(Landroid/os/Bundle;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/fragment/ImageFragment;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/fragment/ImageFragment;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/fragment/ImageFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/ImageFragment;
a=0;// 
a=0;//     .line 54
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/fragment/ImageFragment$1;);
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
a=0;//     .line 57
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/ImageFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/ImageFragment;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/fragment/ImageFragment;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/fragment/ImageFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-class v2, Lcom/twocloo/com/cn/activitys/GeneralActivity;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 58
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "url"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/fragment/ImageFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/ImageFragment;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/fragment/ImageFragment;->access$0(Lcom/twocloo/com/cn/fragment/ImageFragment;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 59
a=0;//     const-string v1, "title"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/fragment/ImageFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/ImageFragment;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/fragment/ImageFragment;->access$1(Lcom/twocloo/com/cn/fragment/ImageFragment;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 60
a=0;//     const-string v1, "from"
a=0;// 
a=0;//     const-string v2, "active"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 61
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/ImageFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/ImageFragment;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/twocloo/com/cn/fragment/ImageFragment;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 62
a=0;//     return-void
a=0;// .end method
}}
