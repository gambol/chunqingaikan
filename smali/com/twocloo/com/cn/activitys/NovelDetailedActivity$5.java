package com.twocloo.com.cn.activitys; class NovelDetailedActivity$5 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$5;
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
a=0;// .field private final synthetic val$n:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$5;->this$0:Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;
a=0;// 
a=0;//     iput p2, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$5;->val$n:I
a=0;// 
a=0;//     .line 511
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$5;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 8
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 515
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$5;->this$0:Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->access$31(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget v5, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$5;->val$n:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/twocloo/com/cn/beans/Shuping_maininfo;
a=0;// 
a=0;//     .line 516
a=0;//     .local v1, "info":Lcom/twocloo/com/cn/beans/Shuping_maininfo;
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$5;->this$0:Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/http/HttpComm;->isNetworkAvalible(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     .line 517
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$5;->this$0:Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$5;->this$0:Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     invoke-virtual {v5}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     sget v6, Lcom/twocloo/com/cn/R$string;->network_err:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-static {v4, v5, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 535
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v6=(Reference,Ljava/lang/String;);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 520
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Boolean);v5=(Integer);v6=(Uninit);v7=(Uninit);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$5;->this$0:Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/utils/MySharedPreferences;->getMySharedPreferences(Landroid/content/Context;)Lcom/twocloo/com/cn/utils/MySharedPreferences;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 521
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "supportTotalCount"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->getPid()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->getUpcount()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 520
a=0;//     invoke-virtual {v4, v5, v6}, Lcom/twocloo/com/cn/utils/MySharedPreferences;->getValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 522
a=0;//     .local v3, "supportcount":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Landroid/content/Intent;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$5;->this$0:Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;
a=0;// 
a=0;//     const-class v5, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     invoke-direct {v2, v4, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 523
a=0;//     .local v2, "intent":Landroid/content/Intent;
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     new-instance v0, Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     .line 524
a=0;//     .local v0, "bundle":Landroid/os/Bundle;
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v4, "author"
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->getAuthor()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v0, v4, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 525
a=0;//     const-string v4, "time"
a=0;// 
a=0;//     const-string v5, ""
a=0;// 
a=0;//     invoke-virtual {v0, v4, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 526
a=0;//     const-string v4, "content"
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v0, v4, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 527
a=0;//     const-string v4, "aid"
a=0;// 
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$5;->this$0:Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;
a=0;// 
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->access$47(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v0, v4, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 528
a=0;//     const-string v4, "tid"
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->getTid()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v0, v4, v5}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 529
a=0;//     const-string v4, "pid"
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->getPid()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     invoke-virtual {v0, v4, v5}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 530
a=0;//     const-string v4, "replies"
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->getReplies()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     invoke-virtual {v0, v4, v5}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 531
a=0;//     const-string v5, "supportcount"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     sget-boolean v4, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->isFromCityOrReadpage:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->getUpcount()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     :goto_1
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v0, v5, v4}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 532
a=0;//     const-string v4, "icon"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->getLogo()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v0, v4, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 533
a=0;//     const-string v4, "replytopicinfo"
a=0;// 
a=0;//     invoke-virtual {v2, v4, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 534
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$5;->this$0:Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;
a=0;// 
a=0;//     invoke-virtual {v4, v2}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 531
a=0;//     :cond_1
a=0;//     #v4=(Boolean);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     goto :goto_1
a=0;// .end method
}}
