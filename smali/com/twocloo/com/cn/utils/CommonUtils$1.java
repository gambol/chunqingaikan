package com.twocloo.com.cn.utils; class CommonUtils$1 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/utils/CommonUtils$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "CommonUtils.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/content/DialogInterface$OnClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/utils/CommonUtils;->dialogWaitUp(Landroid/app/Activity;Ljava/lang/String;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final synthetic val$act:Landroid/app/Activity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/app/Activity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/utils/CommonUtils$1;->val$act:Landroid/app/Activity;
a=0;// 
a=0;//     .line 812
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/utils/CommonUtils$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/content/DialogInterface;I)V
a=0;//     .locals 3
a=0;//     .param p1, "dialog"    # Landroid/content/DialogInterface;
a=0;//     .param p2, "which"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 815
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/utils/CommonUtils$1;->val$act:Landroid/app/Activity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     const-class v2, Lcom/twocloo/com/cn/fragment/MainGroupFragment;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 816
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const/high16 v1, 0x4000000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 817
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/utils/CommonUtils$1;->val$act:Landroid/app/Activity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     invoke-virtual {v1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 818
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/utils/CommonUtils$1;->val$act:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/app/Activity;->finish()V
a=0;// 
a=0;//     .line 819
a=0;//     return-void
a=0;// .end method
}}
