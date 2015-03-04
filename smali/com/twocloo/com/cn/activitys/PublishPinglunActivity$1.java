package com.twocloo.com.cn.activitys; class PublishPinglunActivity$1 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/PublishPinglunActivity$1;
a=0;// .super Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;// .source "PublishPinglunActivity.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Lcom/twocloo/com/cn/singlebook/DataCallBack",
a=0;//         "<",
a=0;//         "Ljava/lang/Boolean;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;
a=0;// 
a=0;//     .line 139
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/singlebook/DataCallBack;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/PublishPinglunActivity$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public callBack(Ljava/lang/Boolean;)V
a=0;//     .locals 3
a=0;//     .param p1, "t"    # Ljava/lang/Boolean;
a=0;// 
a=0;//     .prologue
a=0;//     .line 142
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;);
a=0;//     const-class v2, Lcom/twocloo/com/cn/activitys/PinglunActivity;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 143
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "articleId"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;->access$0(Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 144
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 145
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;->finish()V
a=0;// 
a=0;//     .line 146
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic callBack(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p1, Ljava/lang/Boolean;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity$1;->callBack(Ljava/lang/Boolean;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
