package com.twocloo.com.cn.activitys; class NovelDetailedActivity$3 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$3;
a=0;// .super Ljava/lang/Object;
a=0;// .source "NovelDetailedActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->initPinglun()V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;
a=0;// 
a=0;// .field private final synthetic val$data:Ljava/lang/String;
a=0;// 
a=0;// .field private final synthetic val$info:Lcom/twocloo/com/cn/beans/Shuping_maininfo;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;Lcom/twocloo/com/cn/beans/Shuping_maininfo;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$3;->this$0:Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$3;->val$info:Lcom/twocloo/com/cn/beans/Shuping_maininfo;
a=0;// 
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$3;->val$data:Ljava/lang/String;
a=0;// 
a=0;//     .line 459
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$3;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 7
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 461
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$3;->this$0:Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/http/HttpComm;->isNetworkAvalible(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 462
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$3;->this$0:Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$3;->this$0:Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     sget v5, Lcom/twocloo/com/cn/R$string;->network_err:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-static {v3, v4, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 480
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v5=(Reference,Ljava/lang/String;);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 465
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Boolean);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$3;->this$0:Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/utils/MySharedPreferences;->getMySharedPreferences(Landroid/content/Context;)Lcom/twocloo/com/cn/utils/MySharedPreferences;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 466
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "supportTotalCount"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$3;->val$info:Lcom/twocloo/com/cn/beans/Shuping_maininfo;
a=0;// 
a=0;//     invoke-virtual {v5}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->getPid()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$3;->val$info:Lcom/twocloo/com/cn/beans/Shuping_maininfo;
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/beans/Shuping_maininfo;);
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->getUpcount()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 465
a=0;//     invoke-virtual {v3, v4, v5}, Lcom/twocloo/com/cn/utils/MySharedPreferences;->getValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 467
a=0;//     .local v2, "supportcount":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$3;->this$0:Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-class v4, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     invoke-direct {v1, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 468
a=0;//     .local v1, "intent":Landroid/content/Intent;
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     new-instance v0, Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     .line 469
a=0;//     .local v0, "bundle":Landroid/os/Bundle;
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v3, "author"
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$3;->val$info:Lcom/twocloo/com/cn/beans/Shuping_maininfo;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->getAuthor()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0, v3, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 470
a=0;//     const-string v3, "time"
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$3;->val$data:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v3, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 471
a=0;//     const-string v3, "content"
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$3;->val$info:Lcom/twocloo/com/cn/beans/Shuping_maininfo;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0, v3, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 472
a=0;//     const-string v3, "aid"
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$3;->this$0:Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->access$47(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0, v3, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 473
a=0;//     const-string v3, "tid"
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$3;->val$info:Lcom/twocloo/com/cn/beans/Shuping_maininfo;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->getTid()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v0, v3, v4}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 474
a=0;//     const-string v3, "pid"
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$3;->val$info:Lcom/twocloo/com/cn/beans/Shuping_maininfo;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/beans/Shuping_maininfo;);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->getPid()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v0, v3, v4}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 475
a=0;//     const-string v3, "replies"
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$3;->val$info:Lcom/twocloo/com/cn/beans/Shuping_maininfo;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/beans/Shuping_maininfo;);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->getReplies()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v0, v3, v4}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 476
a=0;//     const-string v4, "supportcount"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     sget-boolean v3, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->isFromCityOrReadpage:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$3;->val$info:Lcom/twocloo/com/cn/beans/Shuping_maininfo;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/beans/Shuping_maininfo;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->getUpcount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     :goto_1
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 477
a=0;//     const-string v3, "icon"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$3;->val$info:Lcom/twocloo/com/cn/beans/Shuping_maininfo;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->getLogo()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0, v3, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 478
a=0;//     const-string v3, "replytopicinfo"
a=0;// 
a=0;//     invoke-virtual {v1, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 479
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$3;->this$0:Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 476
a=0;//     :cond_1
a=0;//     #v3=(Boolean);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     goto :goto_1
a=0;// .end method
}}
