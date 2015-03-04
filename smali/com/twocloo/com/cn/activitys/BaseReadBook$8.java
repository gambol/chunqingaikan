package com.twocloo.com.cn.activitys; class BaseReadBook$8 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/BaseReadBook$8;
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
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$8;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     .line 385
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/BaseReadBook$8;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 3
a=0;//     .param p1, "arg0"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 390
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$8;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/BaseReadBook;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/utils/CommonUtils;->isNetWorkAvailable(Landroid/app/Activity;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 391
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$8;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/BaseReadBook;);
a=0;//     const-class v2, Lcom/twocloo/com/cn/activitys/PinglunActivity;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 392
a=0;//     .local v0, "pinglunIntent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "articleId"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$8;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/twocloo/com/cn/activitys/BaseReadBook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 393
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$8;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/twocloo/com/cn/activitys/BaseReadBook;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 395
a=0;//     .end local v0    # "pinglunIntent":Landroid/content/Intent;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
