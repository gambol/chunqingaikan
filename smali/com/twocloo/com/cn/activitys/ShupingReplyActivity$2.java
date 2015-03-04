package com.twocloo.com.cn.activitys; class ShupingReplyActivity$2 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$2;
a=0;// .super Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;// .source "ShupingReplyActivity.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
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
a=0;//         "Ljava/lang/String;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     .line 345
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/singlebook/DataCallBack;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public bridge synthetic callBack(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p1, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$2;->callBack(Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public callBack(Ljava/lang/String;)V
a=0;//     .locals 8
a=0;//     .param p1, "t"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v3, 0x8
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 349
a=0;//     #v2=(Null);
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 350
a=0;//     const-string v0, "one"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 351
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->access$10(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Lcom/twocloo/com/cn/task/ReplyTask;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/task/ReplyTask;->spif:Lcom/twocloo/com/cn/beans/Shupinginfo;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/Shupinginfo;->getSPlist()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->access$11(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;Ljava/util/ArrayList;)V
a=0;// 
a=0;//     .line 352
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->access$12(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 353
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->access$13(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Landroid/widget/ListView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/ListView;->setVisibility(I)V
a=0;// 
a=0;//     .line 354
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->access$14(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 377
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Reference,Ljava/util/ArrayList;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 357
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Reference,Ljava/util/ArrayList;);v2=(Null);v3=(PosByte);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->access$13(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Landroid/widget/ListView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/ListView;->setVisibility(I)V
a=0;// 
a=0;//     .line 358
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->access$14(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 359
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->access$10(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Lcom/twocloo/com/cn/task/ReplyTask;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/task/ReplyTask;->spif:Lcom/twocloo/com/cn/beans/Shupinginfo;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/Shupinginfo;->getTotal_page_number()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_2
a=0;// 
a=0;//     .line 360
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->access$15(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V
a=0;// 
a=0;//     .line 361
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->access$13(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Landroid/widget/ListView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->access$15(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ListView;->removeFooterView(Landroid/view/View;)Z
a=0;// 
a=0;//     .line 363
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;);
a=0;//     new-instance v0, Lcom/twocloo/com/cn/adapters/ReplyAdapter;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/adapters/ReplyAdapter;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->access$12(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;);
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->access$16(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;);
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->access$17(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;);
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->access$6(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;);
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->access$18(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct/range {v0 .. v6}, Lcom/twocloo/com/cn/adapters/ReplyAdapter;-><init>(Landroid/app/Activity;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Handler;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/adapters/ReplyAdapter;);
a=0;//     invoke-static {v7, v0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->access$19(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;Lcom/twocloo/com/cn/adapters/ReplyAdapter;)V
a=0;// 
a=0;//     .line 364
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->access$13(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Landroid/widget/ListView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->access$20(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Lcom/twocloo/com/cn/adapters/ReplyAdapter;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 365
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Null);v3=(PosByte);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     const-string v0, "more"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 366
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->access$12(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->access$10(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Lcom/twocloo/com/cn/task/ReplyTask;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/task/ReplyTask;->spif:Lcom/twocloo/com/cn/beans/Shupinginfo;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/Shupinginfo;->getSPlist()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     .line 367
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->access$10(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Lcom/twocloo/com/cn/task/ReplyTask;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/task/ReplyTask;->spif:Lcom/twocloo/com/cn/beans/Shupinginfo;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/Shupinginfo;->getSPlist()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xa
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ge v0, v1, :cond_4
a=0;// 
a=0;//     .line 368
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->access$15(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V
a=0;// 
a=0;//     .line 374
a=0;//     :goto_1
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->access$20(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Lcom/twocloo/com/cn/adapters/ReplyAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/adapters/ReplyAdapter;->notifyDataSetChanged()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 371
a=0;//     :cond_4
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->access$15(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
