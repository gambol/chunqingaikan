package com.twocloo.com.cn.activitys; class NovelDetailedActivity$7 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$7;
a=0;// .super Ljava/lang/Object;
a=0;// .source "NovelDetailedActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->initData()V
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
a=0;// .field private final synthetic val$book:Lcom/twocloo/com/cn/beans/LikeMoreBookBean;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;Lcom/twocloo/com/cn/beans/LikeMoreBookBean;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$7;->this$0:Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$7;->val$book:Lcom/twocloo/com/cn/beans/LikeMoreBookBean;
a=0;// 
a=0;//     .line 677
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$7;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 4
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 681
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$7;->this$0:Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-class v3, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 682
a=0;//     .local v1, "intent":Landroid/content/Intent;
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     new-instance v0, Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     .line 683
a=0;//     .local v0, "bundle":Landroid/os/Bundle;
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v2, "Articleid"
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$7;->val$book:Lcom/twocloo/com/cn/beans/LikeMoreBookBean;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/LikeMoreBookBean;->getAid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 684
a=0;//     const-string v2, "flag"
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 685
a=0;//     const-string v2, "newbook"
a=0;// 
a=0;//     invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 686
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$7;->this$0:Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 688
a=0;//     return-void
a=0;// .end method
}}
