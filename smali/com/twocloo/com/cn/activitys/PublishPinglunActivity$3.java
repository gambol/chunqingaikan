package com.twocloo.com.cn.activitys; class PublishPinglunActivity$3 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/PublishPinglunActivity$3;
a=0;// .super Ljava/lang/Object;
a=0;// .source "PublishPinglunActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/widget/CompoundButton$OnCheckedChangeListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;->onCreate(Landroid/os/Bundle;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
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
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity$3;->this$0:Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;
a=0;// 
a=0;//     .line 90
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/PublishPinglunActivity$3;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
a=0;//     .locals 6
a=0;//     .param p1, "buttonView"    # Landroid/widget/CompoundButton;
a=0;//     .param p2, "isChecked"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 94
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 95
a=0;//     new-instance v0, Lcom/twocloo/com/cn/task/TuijianTask2;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/task/TuijianTask2;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity$3;->this$0:Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;);
a=0;//     const-string v2, "http://app.2cloo.com/user-rec?articleid=%s&token=%s"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/User;->getToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 96
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity$3;->this$0:Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;);
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;->access$0(Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 95
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/twocloo/com/cn/task/TuijianTask2;-><init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/task/TuijianTask2;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Void;
a=0;// 
a=0;//     .line 96
a=0;//     #v1=(Reference,[Ljava/lang/Void;);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/task/TuijianTask2;->execute([Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 98
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
