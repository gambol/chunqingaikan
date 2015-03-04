package com.twocloo.com.cn.activitys; class BaseReadBook$7 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/BaseReadBook$7;
a=0;// .super Ljava/lang/Object;
a=0;// .source "BaseReadBook.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/activitys/BaseReadBook;->initEvent()V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/BaseReadBook;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$7;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     .line 376
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/BaseReadBook$7;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 4
a=0;//     .param p1, "arg0"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 379
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$7;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BaseReadBook;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/activitys/BaseReadBook;->doGone()V
a=0;// 
a=0;//     .line 380
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$7;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->isNetWorkAvailable(Landroid/app/Activity;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 381
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$7;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BaseReadBook;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$7;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/BaseReadBook;);
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/activitys/BaseReadBook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "all"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v2, v3}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->BatchSubscription(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 382
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
