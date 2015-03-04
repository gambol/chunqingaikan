package com.twocloo.com.cn.activitys; class NovelDetailedActivity$8 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$8;
a=0;// .super Ljava/lang/Object;
a=0;// .source "NovelDetailedActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->onClick(Landroid/view/View;)V
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
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$8;->this$0:Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;
a=0;// 
a=0;//     .line 912
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$8;);
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
a=0;//     .line 916
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$8;->this$0:Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->access$63(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Landroid/app/Dialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/Dialog;->cancel()V
a=0;// 
a=0;//     .line 917
a=0;//     invoke-static {}, Lcom/twocloo/base/util/NetUtils;->checkNet()Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 918
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$8;->this$0:Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$8;->this$0:Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$string;->network_err:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v0, v1, v2}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 922
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
