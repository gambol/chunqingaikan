package com.twocloo.com.cn.activitys; class ShupingReplyActivity$3 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$3;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ShupingReplyActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/widget/AbsListView$OnScrollListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->onCreate(Landroid/os/Bundle;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
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
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$3;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     .line 127
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$3;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onScroll(Landroid/widget/AbsListView;III)V
a=0;//     .locals 0
a=0;//     .param p1, "view"    # Landroid/widget/AbsListView;
a=0;//     .param p2, "firstVisibleItem"    # I
a=0;//     .param p3, "visibleItemCount"    # I
a=0;//     .param p4, "totalItemCount"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 140
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
a=0;//     .locals 2
a=0;//     .param p1, "view"    # Landroid/widget/AbsListView;
a=0;//     .param p2, "scrollState"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 130
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/widget/AbsListView;->getLastVisiblePosition()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/widget/AbsListView;->getCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 132
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$3;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->access$10(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Lcom/twocloo/com/cn/task/ReplyTask;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$3;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->access$10(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Lcom/twocloo/com/cn/task/ReplyTask;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/task/ReplyTask;->spif:Lcom/twocloo/com/cn/beans/Shupinginfo;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$3;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
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
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 133
a=0;//     invoke-virtual {p1}, Landroid/widget/AbsListView;->getCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$3;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->access$10(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Lcom/twocloo/com/cn/task/ReplyTask;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/task/ReplyTask;->spif:Lcom/twocloo/com/cn/beans/Shupinginfo;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/Shupinginfo;->getTotal_number()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     .line 134
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$3;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->access$21(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)V
a=0;// 
a=0;//     .line 137
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
